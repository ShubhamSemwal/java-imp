

public class Current extends Account {
	protected double overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.overdraft = OVERDRAFT_AMT;
	}
    
	
	public void deposit(double amount) {
		if(amount+overdraft<=OVERDRAFT_AMT)
		{	
			overdraft+=amount;
		}
		else {
			balance+=(amount-(OVERDRAFT_AMT-overdraft));
			overdraft=OVERDRAFT_AMT;
		}
	}
	public double getOverdraft() {
		return overdraft;
	}
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		}
		else if (amount > balance) {
			overdraft = overdraft - (amount - balance);
			balance = MIN_CUR_BAL;
		}
		else if(balance==MIN_CUR_BAL && amount>overdraft) {
			System.out.println("Insufficient funds");

	}
}
	
	

}
