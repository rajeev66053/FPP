package tenth_assignment1;

public class CustomerAccount {
	 private String Cus_name;
	 private String Acc_No;
	 private double Balance;
	 
	 public CustomerAccount(String cusName,String accNo,double balance) {
		 this.Cus_name=cusName;
		 this.Acc_No=accNo;
		 this.Balance=balance;
	 }

	public boolean deposit (double amount) {
		 if(amount>0) {
			 Balance+=amount;
			 return true;
		 }
		 return false;
	 }
	 
	 public boolean withdraw(double amount) {
		 if(amount<Balance) {
			 Balance-=amount;
			 return true;
		 }
		 return false;
	 }
	 
	 public double getBalance() {
		 return Balance;
	 }

}
