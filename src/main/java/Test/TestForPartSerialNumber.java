package Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smartflow.dao.PartSerialNumberDao;
@Component
public class TestForPartSerialNumber {
@Autowired
PartSerialNumberDao partSerialNumberDao;
public  void  main(String args[])
{
	System.out.println(partSerialNumberDao.getProdcutBySlaveId(340));
	}
}
