package com.smartflow.util;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.swing.text.html.Option;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

public class MapUtil {
    private static final String HASH_MAP_NAME = "java.util.HashMap";
    private static final String HASH_MAP_NODE_NAME = "java.util.HashMap$Node";
    private static final String TABLE_NAME = "table";

    public static<T> T getInstance(Object o, Class<T> clazz){
        Assert.notNull(o, "传入的对象不能为空");
        Assert.notNull(clazz, "需要生成的对象类型不能为null");
        //获取所有的字段
//        Field[] targetFieldArr = FieldReflectUtil.getAllFields(o.getClass());
        Field[] targetFieldArr = o.getClass().getDeclaredFields();
        //记录反射获取到的所有map数据
        IdentityHashMap<Object, Object> resultMap = new IdentityHashMap<>();
        List<Object> keyList = new ArrayList<>();
        List<Object> valueList = new ArrayList<>();
        //过滤属性
        Field[] fields = filterFieldArr(targetFieldArr);
        for (Field field : fields) {
            if(!field.isAccessible()){
                field.setAccessible(true);
            }
            try{
                Object var = field.get(o);
                if(var instanceof Map){
                    Map<Object, Object> map = (Map)var;
                    //获取到HashMap中的table字段（Field）
                    Class<?> hashMapClass = Class.forName(HASH_MAP_NAME);
                    //获取到hashMap中内部的node的字节码
                    Class<?> hashMapNodeClass = Class.forName(HASH_MAP_NODE_NAME);
                    Field tableField = null;
//                    Field[] allFields = FieldReflectUtil.getAllFields(hashMapClass);
                    Field[] allFields = hashMapClass.getDeclaredFields();
                    for (Field var1 : allFields){
                        if(Optional.ofNullable(var1).isPresent() && var1.getName().equals(TABLE_NAME)){
                            tableField = var1;
                        }
                    }
                    //反射操作获取到Map中的数据
                    if(Optional.ofNullable(tableField).isPresent()){
                        if(!tableField.isAccessible()){
                            tableField.setAccessible(true);
                        }
                        //获取hashmap中的transient Entry[] table
                        Object[] nodeArr = (Object[]) tableField.get(map);
                        Optional.ofNullable(nodeArr).ifPresent(arr -> {
                            Arrays.stream(arr).filter(var3 -> Optional.ofNullable(var3).isPresent()).forEach(node ->{
                                try{
                                    Field keyField = hashMapNodeClass.getDeclaredField("key");//获取node类里面的key属性
                                    Field valueField = hashMapNodeClass.getDeclaredField("value");//获取node类里面的value属性
                                    Field nextField = hashMapNodeClass.getDeclaredField("next");//获取node类里面的next属性

                                    nextField.setAccessible(true);
                                    keyField.setAccessible(true);
                                    valueField.setAccessible(true);

                                    Optional.ofNullable(node).ifPresent( x -> {
                                        try{
                                            System.out.println("反射获取到的node节点数据:" + "-----key:" + keyField.get(node).toString() + "----value:" + valueField.get(node).toString());
                                            resultMap.put(keyField.get(node), valueField.get(node));
                                            keyList.add(keyField.get(node));
                                            valueList.add(valueField.get(node));
                                        }catch (Exception e){
                                            e.printStackTrace();
                                        }
                                    });
                                }catch (Exception e){
                                    e.printStackTrace();
                                }
                            });
                        });

                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        resultMap.entrySet().stream().forEach(var -> {
            System.out.println("key:" + var.getKey() + "-----,value:" + var.getValue());
        });
        valueList.stream().forEach(x -> {
            System.out.println(x.toString());
        });
        return null;
    }

    /**
     * 过滤字段数组
     * @param arr
     * @return
     */
    public static Field[] filterFieldArr(Field[] arr){
        Assert.notNull(arr, "待处理数组不能为null");
        List<Field> list = Arrays.stream(arr).filter(x -> Optional.ofNullable(x).isPresent()
                            && !Modifier.isAbstract(x.getModifiers())
                            && !Modifier.isNative(x.getModifiers())
                            && !Modifier.isStatic(x.getModifiers())
                            && !Modifier.isFinal(x.getModifiers()))
                            .collect(Collectors.toList());
        int length = CollectionUtils.isEmpty(list) ? 0 : list.size();
        Field[] var = new Field[length];
        return list.toArray(var);
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>() {{
            for (int i = 0; i < 4; i++) {
                put(String.valueOf("aaa" + i), String.valueOf("aaa" + i));

            }
        }};

        Map<String, String> map1 = new HashMap<String, String>() {{
            for (int i = 10; i < 20; i++) {
                put(String.valueOf(i), String.valueOf(i));
            }
        }};
//        AAAA aaaa = new AAAA();
//        aaaa.setClassMap(map);
//        aaaa.setNameMap(map);
//        getInstance(aaaa,AAAA.class);
    }


    public static void getMap(Object parameter) {
        try {
            HashMap<String, Object> hashMap = new HashMap<>();
            Class clsHashMap$Node = null;
            clsHashMap$Node = Class.forName("java.util.HashMap$Node");//通过反射得到hashmap里面的内部类node
            Field[] fields = parameter.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.getName() == "table") {            //遍历属性，当时table属性时候
                    Object[] node = (Object[]) field.get(parameter);   //得到table属性值
                    for (Object object : node) {  //遍历
                        if (object != null) {    //有可能table数组有node为空，因为hash值特性
                            try {
                                iteration(object, clsHashMap$Node, hashMap);   //递归
                            } catch (NoSuchFieldException | SecurityException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void iteration(Object object,Class clsHashMap$Node,HashMap<String,Object> hashmap) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {

        Field key = clsHashMap$Node.getDeclaredField("key");     //获取node类里面的key属性
        Field value = clsHashMap$Node.getDeclaredField("value");  //获取node类里面value属性
        Field next = clsHashMap$Node.getDeclaredField("next");   //获取node类里面next属性

        key.setAccessible(true);
        value.setAccessible(true);
        next.setAccessible(true);

        //得到三个属性的属性值
        String strkey = key.get(object).toString();
        Object objValue = value.get(object);
        Object objNext = next.get(object);
        //判断next是否为空，不为空则递归
        if(objNext==null)
        {

            hashmap.put(strkey, objValue);
        }else{
            iteration(objNext, clsHashMap$Node, hashmap);
        }
    }
}
