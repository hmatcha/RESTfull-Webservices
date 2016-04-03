
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.los.java.domain.Broker;
import com.los.java.domain.BrokerServiceImpl;


public class BrokerUnitTest {
	
	@Autowired
	private BrokerServiceImpl service;

	@Test
	@Transactional
	public void main()
	{
		

		Broker broker = new Broker();
		broker.setbFirstName("Bhaskar");
		broker.setbLastName("Uppuluri");
		broker.setbAddress("1066 louise st");
		broker.setbCity("Ypsilanti");
		broker.setbState("MI");
		broker.setbZip("48197");
		broker.setbUserName("buppuluri");
		broker.setbPassword("bhaskar113");
		
		service.insertBroker(broker);
		
		List<Broker> brokers = service.displayBrokers();
		for(Broker b:brokers)
		{
			System.out.println("Broker First Name = "+b.getbFirstName());
			System.out.println("Broker Last Name = "+b.getbLastName());
		}
	}

}
