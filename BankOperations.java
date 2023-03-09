import java.util.*;
public class BankOperations
{
    static int balance = 10000;
    static int prev,amount;
    static void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        int amount = sc.nextInt();
        balance -= amount;
        prev = amount;
        System.out.println("take your money and \n collect your cash");
        System.out.println("do you want to check your balance \n yes \n no");
        sc.nextLine();
        String check = sc.nextLine();
        if(check.equals("yes"))
         checkBalance();
     }
     static void checkBalance(){
         System.out.println("your balance is:"+balance);
     }
     static void deposite(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        int amount = sc.nextInt();
        balance += amount;
        prev = amount;
        System.out.println("do you want to check your balance \n yes \n no");
        sc.nextLine();
        String check = sc.nextLine();
        if(check.equals("yes"))
         checkBalance();
     }
     static void history(){
         System.out.println("previous transaction:"+ prev);
     }
     static Boolean checkDetails(String name,String password){
         return name.equals("jyothi") && password.equals("surekha_11");
     }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int option,attempt = 3;
		System.out.println("Enter your Username :");
	    String name = sc.nextLine();
	    System.out.println("Enter your  Password:");
	    String password = sc.nextLine();
	    if (checkDetails(name , password)){
	    do{
	    System.out.println("choose option : \n 1 for Withdrawal \n 2 for Deposite \n 3 for CheckBalance \n");
	    option = sc.nextInt();
	    switch(option){
	       case 1 : withdrawMoney();
	                break;
	       case 2 : deposite();
	                break;
	       case 3 : checkBalance();
	                break;
	       case 4 : history();
	                break;
	   
	        case 5 : System.exit(0);
	    }
	    }while (option != 5) ;      
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
