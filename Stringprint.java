package janani;
import java.util.Scanner;
public class Stringprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,str1;
		int l,n;
		System.out.println("enter the string and number");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		n=sc.nextInt();
		l=str.length();
		str1=str.substring(l-n);
		System.out.println(str1);

	}

}
