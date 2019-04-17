import java.util.*;
class Billl{
	public static void main(String args[]){
		int unit;
		long bill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number od units: ");
		unit=sc.nextInt();
		if(unit==50){
			bill=10;
			System.out.println("your bill is:"+bill+" rupees");
		}
		else if(unit>50&&unit<100){
			bill=(50*10)+(100-50)*15;
			System.out.println("your bill is:"+bill+" rupees");
		}
		else if(unit>101&&unit<200){
			bill=(50*10)+(100-50)*25+(200-100)*20;
			System.out.println("your bill is:"+bill+"rupees");

		}
		else if(unit>201&&unit<300){
			bill=(50*10)+(100-50)*15+(200-50)*20+(300-200)*25;
			System.out.println("your bill is:"+bill+"rupees");
		}
		else if(unit>301){
			bill=50*10+(100-50)*15+(200-50)*20+(300-200)*25+(400-50)*30;
			System.out.println("your bill is:"+bill+"rupees");
		}
	}

}