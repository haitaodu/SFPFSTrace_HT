package Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smartflow.dao.PartSerialNumberDao;
@Component
public class TestForPartSerialNumber {
final
PartSerialNumberDao partSerialNumberDao;

	@Autowired
	public TestForPartSerialNumber(PartSerialNumberDao partSerialNumberDao) {
		this.partSerialNumberDao = partSerialNumberDao;
	}

	public  void  main(String args[])
{
	System.out.println(partSerialNumberDao.getProdcutBySlaveId(340));
	}
}
