import java.time.LocalDateTime;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager=new NeroCustomerManager();
		Customer customer=new Customer(1, "ilyas", "aktas", LocalDateTime.now(), "123232");
		try {
			baseCustomerManager.Save(customer );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
