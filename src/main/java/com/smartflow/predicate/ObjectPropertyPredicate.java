package com.smartflow.predicate;

@FunctionalInterface
public interface ObjectPropertyPredicate<T>{
    /**
     * 把属性当参数传递到方法中，由方法去处理这个属性的值做什么。
     * 传参使用: o -> o.propertyName
     * 接收参数方法内使用:
     *  参数：ObjectPropertyPredicate<FreeReportDataVO> express
     *  Predicate<Object> press = (obj) -> express.getProperty(obj).toString().startsWith("测试");
     *  express.getProperty(obj)
     * @param o
     * @return
     */
    Object getProperty(T o);
}
