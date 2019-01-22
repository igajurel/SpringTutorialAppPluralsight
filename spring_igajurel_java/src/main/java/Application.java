import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerServiceInterface customerServiceInterface = appContext.getBean("customerServiceInterfaceBean",CustomerServiceInterface.class);
				
		System.out.println(customerServiceInterface.findAllLocal().get(0).getFirstName());
		System.out.println(customerServiceInterface.findAllLocal().get(0).getLastName());
		System.out.println(customerServiceInterface.findAllLocal().get(0).getAge());

		System.out.println(customerServiceInterface.findAllLocal().get(1).getFirstName());
		System.out.println(customerServiceInterface.findAllLocal().get(1).getLastName());
		System.out.println(customerServiceInterface.findAllLocal().get(1).getAge());

	}

}
