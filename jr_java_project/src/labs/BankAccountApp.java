package labs;

public class BankAccountApp {
    public static void main(String[] args) {
    	BankAccount acc1= new BankAccount("123456783",1000);
    	BankAccount acc2= new BankAccount("123456783",200);
    	BankAccount acc3= new BankAccount("123456783",300);
        acc1.setName("jim");
        System.out.println("User Name: "+acc1.getName());
        acc1.makeDeposit(500);
        acc1.payBille(200);
        System.out.println(acc1.toString());
        
        
    }
}
   class BankAccount implements IInterest{
	  private static int ID=1001;
	  private String accountNumer; // ID +random 2 digit number
	  private static final int routingNumber=004546;
	  private String name;
	  private String SSN;
	  private double balance;
	  
	   //constructors
	  public BankAccount(String SSN,double initDeposit) {
		  balance= initDeposit;
		  //System.out.println("new account created");
	      ++ID;
	      this.SSN=SSN;
	      //System.out.println(ID);
	      setAccountNumber();
	  }
	  private void setAccountNumber() {
		  int random= (int)( Math.random()*100);
		  accountNumer= ID+random+SSN.substring(0,1);
		  System.out.println("your account number: "+  accountNumer);
	  }
	  public void setName(String name) {
		  this.name=name;
	  }
	  public String getName() {
		 return name;
	  }
	  public void payBille(double amount) {
		  balance=balance-amount;
		  System.out.println("paying bill");
		  showBalance();
	  }
	  public void makeDeposit(double amount) {
		  balance= balance+amount;
		  System.out.println("making deposit");
		  showBalance();
	  }
	  public void showBalance() {
		  System.out.println("The balance is : Rs."+balance);
	  }
	  public void accrue() {
		  balance= balance*rate;
		  showBalance();
	  }
	  @Override
	  public String toString() {
		  return "[Name: "+name+"]\n[Account Number:"+accountNumer+"]\n"+ "[Routing Number"+ routingNumber+"]\n"+"[Balance "+balance+"]";
	  }
   }
  