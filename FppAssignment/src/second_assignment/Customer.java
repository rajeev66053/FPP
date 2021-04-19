package second_assignment;

public class Customer {
	
		private final String firstName;
		private final String lastName;
		private final String socSecurityNum;
		private Address billingAddress;
		private Address shippingAddress;
	
		public Customer(String firstName,String lastName,String socSecurityNum) { 
			this.firstName=firstName;
			this.lastName=lastName;
			this.socSecurityNum=socSecurityNum;
		}
		
		public String getFirstName() {
			 return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public String getSosSecurityNum() {
			return socSecurityNum;
		}
		
		public Address getBillingAddress() {
			 return billingAddress;
		}
		
		public void setBillingAddress(Address billingAddress) {
			this.billingAddress=billingAddress;
		}
		
		public Address getShippingAddress() {
			return shippingAddress;
		}
		
		public void setShippingAddress(Address shippingAddress) {
			this.shippingAddress=shippingAddress;
		}
		
		@Override
		public String toString() {
			return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
			+ "]";
		}
}
