import java.util.Scanner;
public class SliceFirstAndLastChar{
public static String sliceString(String s){
String s1 = s.substring(1,s.length()-1);
System.out.println(s1);
return s1;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter String:");
String s = sc.nextLine();
SliceFirstAndLastChar ss = new SliceFirstAndLastChar();
ss.sliceString(s);
}
}