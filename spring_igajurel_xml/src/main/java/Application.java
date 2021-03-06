import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.igajurel.service.CustomerServiceImpl;
import com.igajurel.service.CustomerServiceInterface;

/**
 * 
 */

/**
 * @author i20432
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CustomerServiceInterface customerServiceInterface = new CustomerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerServiceInterface customerServiceInterface = appContext.getBean("customerServiceImplBean", CustomerServiceImpl.class);
		
		System.out.println(customerServiceInterface);

		
		CustomerServiceInterface customerServiceInterface2 = appContext.getBean("customerServiceImplBean", CustomerServiceImpl.class);
		
		System.out.println(customerServiceInterface2);

		
		System.out.println(customerServiceInterface.findAllLocal().get(0).getFirstName());
		System.out.println(customerServiceInterface.findAllLocal().get(0).getLastName());
		System.out.println(customerServiceInterface.findAllLocal().get(0).getAge());

		System.out.println(customerServiceInterface.findAllLocal().get(1).getFirstName());
		System.out.println(customerServiceInterface.findAllLocal().get(1).getLastName());
		System.out.println(customerServiceInterface.findAllLocal().get(1).getAge());

	}

}
