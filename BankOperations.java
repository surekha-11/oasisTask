import java.util.*;
public class BankOperations
{
    static int balance = 10000;
    static int prev,amount;
    static void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************************\nEnter Amount to be withdrawn:\n*********************************************");
        int amount = sc.nextInt();
        if(amount > balance)
            System.out.println("**************************************\nSorry insufficient balance\n**************************************");
        else{
        balance -= amount;
        prev = amount;
        System.out.println("take your money and \n collect your cash");
        } 
     }
     static void checkBalance(){
	   System.out.println("***************************");
         System.out.println("your balance is:"+balance);
	   System.out.println("***************************");
     }
     static void deposite(){
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************************\nEnter Amount to be deposited:\n****************************************");
        int amount = sc.nextInt();
        balance += amount;
        prev = amount;
     }
     static void history(){
         System.out.println("******************************************\nprevious transaction:"+ prev+"\n******************************************");
     }
     static Boolean checkDetails(String name,String password){
         return name.equals("jyothi") && password.equals("surekha_11");
     }
     static void transfer(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Name of the person:");
         String name = sc.nextLine();
         System.out.println("Enter Account number");
         String accnumber = sc.nextLine();
         System.out.println("*****************************************\nEnter amount to be transfered\n*****************************************");
         int tranfAmount = sc.nextInt();
         if(tranfamount > balance)
            System.out.println("*******************************************\nSorry insufficient balance\n********************************************");
        else{
         int customerBalance = 5000;
         balance -= tranfAmount;
         customerBalance += tranfAmount;
	   System.out.println("****************************************\ntransfer Successful\n****************************************");
        }
     }
     public final static void clrscr()  {
try{  
try  
{  
final String os = System.getProperty("os.name");  
if (os.contains("Windows"))  
{  
Runtime.getRuntime().exec("cls");  
}  
else  
{  
Runtime.getRuntime().exec("clear");  
}  
}  
catch (final Exception e)  
{  
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}  
}catch(final Exception es){
}
} 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int option;
		int attempt = 3;
		while(attempt > 0){
		System.out.println("Enter your Username :");
	    String name = sc.nextLine();
	    System.out.println("Enter your  Password:");
	    String password = sc.nextLine();
	    clrscr();
	    if (checkDetails(name , password)){
	    do{
	    System.out.println("choose option : \n 1 for Withdrawal \n 2 for Deposite \n 3 for CheckBalance \n 4 for History \n 5 for transfer \n 6 for exit");
	    option = sc.nextInt();
	    clrscr();
	    switch(option){
	       case 1 : withdrawMoney();
	                break;
	       case 2 : deposite();
	                break;
	       case 3 : checkBalance();
	                break;
	       case 4 : history();
	                break;
	       case 5 : transfer();
	                break;
	       case 6 : System.exit(0);
	    }
	 if (option != 3){
	   System.out.println("do you want to check your balance \n yes \n no");
        sc.nextLine();
        String check = sc.nextLine();
	  clrscr();
        if(check.equals("yes"))
         checkBalance();
			}
          }while (option != 6) ;      
	    }
	    else if(attempt > 0){
	        System.out.println("sorry enter correct credentials");
	        attempt --;
	    }
	    else 
	    {
	        System.out.println("too many attempts");
	    }
	}
	}
}