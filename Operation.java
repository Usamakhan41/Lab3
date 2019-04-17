import java.util.*;
class Operation{
	public static void main(String [] args){
System.out.println("Enter First number");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
System.out.println("Enter Second number");
int y=sc.nextInt();
System.out.println("Enter Third number");
int z=sc.nextInt();
long l=x+y; 
System.out.println("The addition is:"+l);
long lh=x/y;
System.out.println("The division is:"+lh);
long li=x-y;
System.out.println("The subtraction is:"+li);
long la=x%y;
System.out.println("The remainder is:"+la);
	}
}