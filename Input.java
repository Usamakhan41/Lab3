import java.util.Scanner;
class Input
{
	public static void main(String[] args){
		char ch;
		System.out.println("Enter any character");
		Scanner s=new Scanner(System.in);
	ch=s.next().charAt(0);
switch(ch){
	case 'a':
	System.out.println("Its a vowel letter");
	break;
	case 'e':
	System.out.println("Its a vowel letter");
	break;
	case 'i':
	System.out.println("Its a vowel letter");
	break;
	case 'o':
	System.out.println("Its a vowel letter");
	break;
	case 'u':
	System.out.println("Its a vowel letter");
	break;
	default:
	System.out.println("Its a consonant letter");
	
}	
	
	}
}