import java.util.Scanner;
class Marksheet{
public static void main(String args[]){
System.out.println("Enter first subject obtained marks");
Scanner s=new Scanner (System.in);
int x=s.nextInt();
System.out.println("Enter second subject obtained marks");
int y=s.nextInt();
System.out.println("Enter third subject obtained marks");
int z=s.nextInt();
int total=x+y+z;

System.out.println(total+"out of 300" );
int per=x+y+z/300*100;
System.out.println("Your percentage is"+per+"%");
if (per>90){
System.out.println("A Grade");

}
else if (per>=80){
System.out.println("B Grade");

}
 else if (per>=70){System.out.println("C grade");}
else if (per>=60){System.out.println("D grade");
}
 else {System.out.println("Fail");

}
}






}
