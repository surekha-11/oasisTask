import java.util.Scanner;
class guessNumber{
static void guessingNumberGame(){
		int attempt,score,number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:\n");
		String name = sc.nextLine();
		System.out.println("\n*************************************\n");
		System.out.println("hello  "+name +"\n");
		System.out.println("WELCOME TO NUMBER GUESSING GAME \n");
		System.out.println("************************************\n");
		int k = 5,range = 100;
		char ch='Y';
		while(ch != 'N'){
		attempt = 0;
		score = range;
		number = (int)(range * Math.random());
		for(int i = 0 ; i < k; i++){ 
		System.out.println("Guess  a Number in between 1 to "+ range + ":");
		int guess = sc.nextInt();
		if(number == guess){
			System.out.println("Congratulations!\n");
			System.out.println("your score is :" + score+"\n");
			break;
		}
		else if(number > guess){
			System.out.println("number is too small\n");
			attempt++;
			score -= 10 ;
			}
		else{
			System.out.println("number is too big\n");
			attempt++;
			score -= 10 ;
			}
		}
		if (attempt == k) {
			System.out.println("sorry! "+name+" you failed the game\n");
			System.out.println("number is:"+number+"\n");
			k = 5;
			}
		else{
			k += 2;
			range *= 2;
		}
		System.out.println("do you want to continue enter Y / N \n");
		ch=sc.next().charAt(0);
		}
		}
public static void main(String args[]){
	guessingNumberGame();
	}
}