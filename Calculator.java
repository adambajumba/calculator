import java.util.Scanner;

public class Calculator{

	//Addition
	public static void addNumbers(double x, double y){
		double result=x+y;
		System.out.println("The Sum is: " +result);
	}
	//Subtraction
		public static void subtractNumbers(double x, double y){
		double result=x-y;
		System.out.println("The Difference is: " +result);
	}
	//Multiplication
	public static void multiplyNumbers(double x, double y){
		double result=x*y;
		System.out.println("The Product is: " +result);
	}
	//Division
	public static void divideNumbers(double x, double y){
		double result=x/y;
		System.out.println("The Quotient is: " +result);
	}
	//Squareroot
	public static void squarerootNumber(int value1){
		double root=(double)Math.sqrt(value1);
		System.out.println("The Squareroot is: " + root);
	}

	//Power
	public static void powerNumber(double x, double y){
	
		System.out.println("The Power is: " + Math.pow(x, y));
	}

	//Modulus
	public static void modulusNumber(double x, double y){
	
		System.out.println("The Modulus is: " + x%y);
	}

	//Average
	public static void averageNumber(int value1, int value2){
		double avg=(double)(value1+value2)/2;
	
		System.out.println("The Average is: " + avg);
	}
	//main class
	public static void main(String[] args) {


		Scanner in=new Scanner(System.in);
		System.out.println("Please enter select the type of operation you wish to perfom");		
		System.out.println("1 for Addition\n" + "2 for Subtraction\n"  + "3 for Multiplication\n" + "4 for Division\n" + "5 for Squareroot\n" +"6 for Average\n" + "7 for Modulus\n"+ "8 for Power\n");

		int inputChoice=in.nextInt();
		if(inputChoice==1 || inputChoice ==2 || inputChoice==3 || inputChoice==4 || inputChoice==7 || inputChoice==8){
			System.out.println("Please enter the first number");
			double num1=in.nextDouble();
			System.out.println("Please enter the second number");
			double num2=in.nextDouble();
			
			if(inputChoice==1){
				addNumbers(num1, num2);
			}
			if(inputChoice==2){
				subtractNumbers(num1, num2);
			}
			if(inputChoice==3){
				multiplyNumbers(num1, num2);
			}
			if(inputChoice==4){
				divideNumbers(num1, num2);
			}
			if(inputChoice==7){
				modulusNumber(num1, num2);
				
			}
			if(inputChoice==8){
				powerNumber(num1, num2);
			}					
		}
		else
			if(inputChoice==5){
				System.out.println("Please enter an number to find its Squareroot");
				int num=in.nextInt();
				squarerootNumber(num);
			}
		else 
			if(inputChoice==6){
			System.out.println("Please enter the first value");
			int value1=in.nextInt();
			System.out.println("Please enter the second value");
			int value2=in.nextInt();
			averageNumber(value1, value2);
		}		
	}
}