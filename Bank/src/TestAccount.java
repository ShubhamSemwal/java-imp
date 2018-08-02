

public class TestAccount {

	public static void main(String[] args) {
		
		Bank c=AccountFactory.openAccount("savings","Polo");
		c.summary();
	
		c.deposit(2000);
	
		c.deposit(3000);
		
		c.withdraw(4000);
		
		c.withdraw(6000);
		
		
		
        c.statement();
         
	}

}
