import java.util.Scanner;
public class Consonants{
int count=0;
public int str(String s){
for(int i=0; i<s.length(); i++){
char c= s.charAt(i);
if(c == 'A' ||  c== 'a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u' || c == ' '){
continue;
}
count++;
}
return count;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter String:");
String s = sc.nextLine();
Consonants cs = new Consonants();
cs.str(s);
System.out.println("Consonants count:" + cs.count);
}
}