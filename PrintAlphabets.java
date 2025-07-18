import java.util.Scanner;
class PrintAlphabets{
public static void alphabets(char c1, char c2){
if((c1>=97)&&(c2<=122)){
for(int i=c1;i<=c2; i++){
System.out.print((char)i+" ");
}
}
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter starting char:");
char c1 = sc.nextLine().charAt(0);
System.out.println("Enter ending char:");
char c2 = sc.nextLine().charAt(0);
PrintAlphabets s = new PrintAlphabets();
s.alphabets(c1,c2);
}
}