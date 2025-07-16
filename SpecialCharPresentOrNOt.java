import java.util.Scanner;
public class SpecialCharPresentOrNOt{
public void num(String s){
boolean found = false;
int n = 0;
for(int i=0; i<s.length(); i++){
char c = s.charAt(i);
if((c >= 32 && c<=47)||(c >= 58 && c<=64)||(c >= 91 && c<=96)||(c >= 123 && c<=126)){
found = true;
System.out.println("Special char is Present: "+ c);
}
}
if(!found){
System.out.println("Special char is not Present");
}
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter String:");
String s = sc.nextLine();
SpecialCharPresentOrNOt scp = new SpecialCharPresentOrNOt();
scp.num(s);
}
}