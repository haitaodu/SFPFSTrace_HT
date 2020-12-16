package Test;

import com.smartflow.model.CL_TUOP20;
import com.smartflow.service.CL_StationServiceImpl;
import com.smartflow.service.CellService;
import com.smartflow.service.StationServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.security.pkcs11.wrapper.CK_AES_CTR_PARAMS;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ：tao
 * @date ：Created in 2020/9/28 9:48
 */





@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring-config.xml")
@ActiveProfiles("development")
public class dubbo {
    private ClassPathXmlApplicationContext applicationContext =
            new ClassPathXmlApplicationContext
                    ("spring-config.xml");

    @Autowired
    HibernateTemplate hibernateTemplate;



    @Test
    public void test()
    {
        CellService cellService=(CellService) applicationContext.getBean("CellService");
        System.out.println(cellService.getCellListInit());
    }

    @Test
    public void test1()
    {
        StationServiceImpl stationService=(StationServiceImpl) applicationContext.getBean("stationServiceImpl");
        System.out.println(stationService.getStationList
                ("CL_TUOP25",10449).get("PrintStation").toString());
        System.out.println(stationService.getStationList
                ("CL_TUOP25",10449).get("List").toString());
        System.out.println(stationService.getStationList
                ("CL_TUOP25",10449).get("List").toString());
    }

    @Test
    public void test2()
    {
        CL_StationServiceImpl cl_stationService=(CL_StationServiceImpl)
                applicationContext.getBean("CL_StationServiceImpl");
        System.out.println(cl_stationService.getSerialNumber
                ("CL_TUOP20",10449));
    }

    @Test
    public void test3()
    {
      }

}
