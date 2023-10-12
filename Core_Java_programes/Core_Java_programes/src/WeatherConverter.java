import java.util.Scanner;

public class WeatherConverter {

	public static void main(String[] args) {
		double fahrenheit;
		double celsius;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("choose type of tempreture degree to convert\n 1.fahrenheit to celsius ");
		int ch = sc.nextInt();
		
		 switch(ch) {
		 case 1: 
			System.out.println("Enter fahrenheit tempreture");
			fahrenheit = sc.nextDouble();
			celsius = (fahrenheit - 32)*5/9;
			System.out.println("celsues tempreture is " +  celsius);
			break;
			
		 case 2: 
		 System.out.println("Enter celuis tempreture");
		 celsius = sc.nextDouble();
		 fahrenheit = ((9*celsius)/5) +32;
		 System.out.println("fahrenheit tempreture is " + fahrenheit);
		 break;
		 
		 default:
			 System.out.println("please choose a valide choice");
		 
		 }
		
		

	}

}
