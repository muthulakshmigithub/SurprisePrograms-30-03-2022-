import java.util.Random;
import java.util.Scanner;
	public class Game {
	    public static void main(String[] args) {
	        GameMethods ob = new GameMethods();
	        ob.output();
	    }
	}
	class GameMethods{
	    int min = 0;
	    int max = 9;
	    Scanner get= new Scanner(System.in);
	    Random random = new Random();
	    int operand1 = random.nextInt(1, 10);
	    int operand2 = random.nextInt(1, 10);
	    int operand3 = random.nextInt(1, 10);
	    int operand4 = random.nextInt(1, 10);
	    char operator,operator2,operator3, operator4;

	    void output(){
	        sum = process();
	        System.out.println("answer  :"+sum);
	       
	    }

	    char charReturn(){
	        int randomperator = random.nextInt(1, 4);
	        switch (randomperator) {
	            case 1:
	                operator = '+';
	                return operator;
	            case 2:
	                operator = '-';
	                return operator;
	            case 3:
	                operator = '*';
	                return operator;
	            case 4:
	                operator = '/';
	                return operator;
	        }
	        return 0;
	    }
	    int sum ;
	    int temp;
	    int  process(){
	        sum = operand1;
	         for(int i=1;i<4;i++) {
	                switch (i) {
	                    case 1:
	                        temp=operand2;
	                        break;
	                    case 2:
	                        temp = operand3;
	                        break;
	                    case 3:
	                        temp = operand4;
	                        break;
	                }
	             char a=charReturn();
	             System.out.println("printing character"+a);

	                    switch (a) {

	                        case '+':
	                            sum = sum +temp;
	                            break;
	                        case '-':
	                            sum = sum - temp;
	                            break;
	                        case '*':
	                            sum = sum * temp;
	                            break;
	                        case '/':
	                            sum = sum/temp;
	                            break;
	                    }
	             System.out.println("sum value:"+sum);
	                }

	        System.out.println(operand1);
	        System.out.println(operand2);
	        System.out.println(operand3);
	        System.out.println(operand4);
	         return sum;
	            }

	}
