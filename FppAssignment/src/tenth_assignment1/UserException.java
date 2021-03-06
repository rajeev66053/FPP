package tenth_assignment1;

import java.util.Scanner;

public class UserException extends Exception {
	
	public UserException() {
		super(); 
	}
	public UserException(String msg) {
		super(msg); 
	}

	public static void main(String[] args) throws UserException{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name:");
		String customerName=sc.nextLine();
		System.out.println("Enter customer account number:");
		String accountNumber=sc.nextLine();
		System.out.println("Enter customer current balance amount:");
		double balance=sc.nextDouble();
		
		int choice = 0;
		
		
		CustomerAccount ca=new CustomerAccount(customerName,accountNumber,balance);		
		
		do {
			System.out.println("Enter  1 to deposit, 2 to withdraw , 3 to check balance or 4 to exit.");
			choice=sc.nextInt();
			
			switch(choice) {

			case 1:	System.out.println("Enter deposit amount.");
					double depositAmount=sc.nextDouble();
					boolean deposit=ca.deposit(depositAmount);
					if(!deposit) {
						throw new UserException("Deposit amount cannot be negative");
					}
					System.out.println("Deposit success of amount :"+depositAmount);
					
					break;
			case 2:	System.out.println("Enter withdraw amount.");
					double withdrawAmount=sc.nextDouble();
					boolean withdrawn=ca.withdraw(withdrawAmount);
					if(!withdrawn) {
						throw new UserException("You cannot withdraw more than balance.Your current balance is:"+ca.getBalance());
					}
					
					break;
			case 3:	double currentBalance=ca.getBalance();
					if(currentBalance <100) {
						throw new UserException("Your current balance is:"+currentBalance);
					}
					System.out.println("Your current balance is:"+currentBalance);
					break;
			case 4:	System.out.println("Thank you for using system.");
					break;
			default:System.out.println("Invalid choice.Please try again. ");
					break;
			}

		}while(choice>0&&choice<=3);
		
	}

}
