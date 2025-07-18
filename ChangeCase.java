import java.util.Scanner;
class ChangeCase{
public static void changeCase(String s){
String res ="";
String res1 = "";
if(s == null || s.isEmpty()){
System.out.println("");
System.out.println("");
return ;
}
res = s.toUpperCase();
res1 = s.substring(0,1).toUpperCase( )+s.substring(1);
System.out.println(res1);
System.out.println(res);
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter string:");
String s = sc.nextLine();
ChangeCase cc = new ChangeCase();
cc.changeCase(s);
}
}