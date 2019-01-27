import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.igajurel.repository.CustomerRepositoryInterface;
import com.igajurel.repository.HibernateCustomerRepositoryImpl;
import com.igajurel.service.CustomerServiceImpl;
import com.igajurel.service.CustomerServiceInterface;

/**
 * 
 */

/**
 * @author i20432
 *
 */
@Configuration
@ComponentScan({"com.igajurel"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
//	@Bean(name="customerServiceInterfaceBean")
//	public CustomerServiceInterface getCustomerServiceInterface() {
//		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepositoryInterface());
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		//service.setCustomerRepositoryInterface(getCustomerRepositoryInterface());
//		return service;
//	}
	
	//@Bean(name="customerReposityInterfaceBean")
	//public CustomerRepositoryInterface getCustomerRepositoryInterface() {
	//	return new HibernateCustomerRepositoryImpl();
	//}
	

}
