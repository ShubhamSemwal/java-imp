

public abstract class Account implements Bank{
	private int actNo;
	private String holder;
	public double balance;

	private static int autogen = INIT_ACNT_NO;

	protected Transaction[] txns;
	protected int idx;

	public Account() {
	}

	public Account(String holder, double balance) {
		this.actNo = autogen++;
		this.holder = holder;
		this.balance = balance;
			//intaantiating Transaction array for account
		txns = new Transaction[10];
			//adding opening account trasaction
		txns[idx ++] = new Transaction("OB",balance,balance);
		
	}

	public void summary() {
		System.out.println("A/c No : " + actNo);
		System.out.println("holder :" + holder);
		System.out.println("balance:" + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		txns[idx ++] = new Transaction("Cr",amount,balance);
	}

	
	public void statement() {
	System.out.println("Statement of A/C: "+ actNo);
	for(int i=0;i<idx;i++)
		System.out.println(txns[i]);
	
	}
	}

