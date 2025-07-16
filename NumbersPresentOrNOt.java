import java.util.Scanner;
public class NumbersPresentOrNOt{
public void num(String s){
boolean found = false;
int n = 0;
System.out.println("Number is Present:");
for(int i=0; i<s.length(); i++){
char c = s.charAt(i);
if(c >= '0' && c<='9'){
System.out.print((c - '0')+" ");
found = true;
}
}
if(!found){
System.out.println("Number is not Present:");
}
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter String:");
String s = sc.nextLine();
NumbersPresentOrNOt np = new NumbersPresentOrNOt();
np.num(s);
}
}