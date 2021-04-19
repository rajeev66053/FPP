package second_assignment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Customer customer1=new Customer("Rajeev","Thapaliya","611944");
		customer1.setBillingAddress(new Address("Iowa","Ackworth","Street1","50001"));
		customer1.setShippingAddress(new Address("Iowa","Ackworth","Street2","50001"));
		
		Customer customer2=new Customer("Sanjeevan","Sigdel","611945");
		customer2.setBillingAddress(new Address("Iowa","Ackworth","Street3","50002"));
		customer2.setShippingAddress(new Address("Iowa","Ackworth","Street4","50002"));
		
		Customer customer3=new Customer("Prabhat","Gyawali","611946");
		customer3.setBillingAddress(new Address("Illinois","Chicago","Street5","60625"));
		customer3.setShippingAddress(new Address("Illinois","Chicago","Street6","60626"));
		

		Customer[] customers= {customer1,customer2,customer3};
		
		for(Customer c:customers) {
			Address billingAdd = c.getBillingAddress();
			if("Chicago".equalsIgnoreCase(billingAdd.getCity())) {
				System.out.println("customer :"+c.toString());
			}
		}

	}

}
