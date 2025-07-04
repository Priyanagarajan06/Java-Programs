import java.util.Scanner;
public class CountTheMisses{
void count(){
Scanner sc = new Scanner(System.in);
String n = sc.nextLine();
int misses =0;
for(int i=0; i<n.length(); i++){
char c = n.charAt(i);
if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
misses++;
}
}
System.out.println(misses);
}
public static void main(String [] args){
CountTheMisses ctm = new CountTheMisses();
ctm.count();
}
}