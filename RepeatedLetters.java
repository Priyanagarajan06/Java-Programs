import java.util.Scanner;
public class RepeatedLetters{
public String str(String s){
char res =' ';
boolean found = false;
for(int i=0; i<s.length(); i++){
char c = s.charAt(i);
for(int j=i+1; j<s.length(); j++){
char e = s.charAt(j);
if(c==e){
res = c;
found = true;
break;
}
}
if(found){
System.out.println("Repeated:"+res);
}
}
if(!found){
System.out.println("No Repeated char");
}
return s;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter String:");
String s = sc.nextLine();
RepeatedLetters rl = new RepeatedLetters();
rl.str(s);
}
}





