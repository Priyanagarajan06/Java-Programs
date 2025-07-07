import java.util.Scanner;
public class UpperLowerCase{
void alpha(){
Scanner sc = new Scanner(System.in);
char c = sc.nextLine().charAt(0);
if(Character.isLowerCase(c)){
System.out.println(Character.toUpperCase(c));
}
else if(Character.isUpperCase(c)){
System.out.println(Character.toLowerCase(c));
}
}
public static void main(String [] args){
UpperLowerCase ul = new UpperLowerCase();
ul.alpha();
}
}