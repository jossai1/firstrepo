public class ATM

{	
	//Integer Accountbal;
	Toolbox myToolbox= new Toolbox();//all methods neeed to be in the class make sure your indentation is in line with the class
	//Integer withdraw; //creating a variable 

    	private int accountbal;
    	private int withdraw;
    	private int deposit;
	private int accountbal1;
        
   	 public int getAccountbal()
        {
        	return accountbal;
    	}
        
    	public void setAccountbal(int newValue) 				
	{
        	accountbal = newValue;
   	 }
       
 
	 public int getAccountbal1()
        {
        	return accountbal1;
    	}
        
    	public void setAccountbal1(int newValue) 				
	{
        	accountbal1 = newValue;
   	 }
       





    	public int getWithdraw() 	
	{
        	return withdraw;
    	}
        
   	 public void setWithdraw(int newValue)
	 {
        	withdraw = newValue;
   	 }



	public int getDeposit()
	 {
        	return deposit;
   	 }
        
    	public void setDeposit(int newValue) 
	{
        	deposit = newValue;
    	}


















	public static void main(String[]args)//main method creating an atm object called go().go() will contain the code for running the atm machine
	{
		ATM myATM = new ATM();
		myATM.go();//inside my method, find atm and go
	
	}

	
	public void go()//definig how the atm works(go method)
	{
		System.out.println("Welcome to online ATM banking");
		System.out.println();
		System.out.println("How much do you want in your account?");
		//Integer Accountbal;

	
		accountbal=myToolbox.readIntegerFromCmd();//reading what the user inputs
		while(true)
		{
		//System.out.println("Your balance is: "+ accountbal);//printing acct bal
		System.out.println();
		System.out.println("**********************");
		System.out.println("MAIN MENU");
		System.out.println("**********************");
		System.out.println("What do you want to do?");
		System.out.println("1 : Withdraw");
		System.out.println("2 : Deposit");
       		System.out.println("3 : Inquire");
		System.out.println("4 : Quit");
		

		Integer Whattodonext;
		Whattodonext=myToolbox.readIntegerFromCmd();
		
		
		if (Whattodonext==1)//conditions go into brackets thenif it is true it will do the next line
		{	
			
			this.Withdrawal();	//this class..this method..Javas this keyword is used to refer the current instance of the method on which it is used.
			
		}
			
		

		if (Whattodonext==3)//conditions go into brackets thenif it is true it will do the next line
		{	
			
			this.Inquire();	//this class..this method..Javas this keyword is used to refer the current instance of the method on which it is used.
			
		}
		
		if (Whattodonext==2)//conditions go into brackets thenif it is true it will do the next line
		{	
			
			this.Deposit();	
			
		}


		if (Whattodonext==4)//conditions go into brackets thenif it is true it will do the next line
		{	
			
			Runtime.getRuntime().halt(0);	
			
		}

		

		}		

	}
		
	public void Withdrawal()//defining the withdrawl section or option(withdrawl method)
	{
		System.out.println("************************");
		System.out.println("Withdrawal");
		System.out.println("************************");
		System.out.println("How much do you want to Withdraw?");
		System.out.println();
		
		withdraw= myToolbox.readIntegerFromCmd();
		if (withdraw>accountbal)
		{
			this.notallowed();
		}

	}//be careful about closing brackets


	public void Inquire()		
	{
		System.out.println("************************");
		//accountbal1= accountbal- withdraw;
		accountbal=accountbal-withdraw;
		System.out.println("Your balance is: " + accountbal);
		System.out.println("************************");

	}

	public void Deposit()		
	{
		System.out.println("************************");
		System.out.println("Your balance is");
		System.out.println("************************");

	}




	public void notallowed()		
	{
		System.out.println("YOU HAVE INSUFFICIENT FUNDS IN YOUR ACCOUNT!");
		System.out.println();
		System.out.println("Please try again");
		this.Withdrawal();
		
	}


}




