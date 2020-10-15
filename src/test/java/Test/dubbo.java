package Test;

import com.smartflow.service.CL_StationService;
import com.smartflow.service.CellService;
import org.junit.Test;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：tao
 * @date ：Created in 2020/9/28 9:48
 */





public class dubbo {
    private ClassPathXmlApplicationContext applicationContext =
            new ClassPathXmlApplicationContext
                    ("spring-config.xml");

    @Test
    public void test()
    {
        CellService cellService=(CellService) applicationContext.getBean("CellService");
        System.out.println(cellService.getCellListInit());
    }

}
