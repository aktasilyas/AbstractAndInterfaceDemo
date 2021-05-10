package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class SturbuckCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService customerCheckService;
	
	 public SturbuckCustomerManager(ICustomerCheckService customerCheckService ) {
		this.customerCheckService=customerCheckService;
	}
	@Override
	public void Save(Customer customer) throws Exception {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			
			super.Save(customer);	
		}else {
			throw new Exception("not a valid person");
		}
		

	}
	
	

}
