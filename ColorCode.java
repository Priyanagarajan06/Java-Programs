import java.util.Scanner;
public class ColorCode{
Scanner sc = new Scanner(System.in);
char c = sc.nextLine().charAt(0);
void name(){
switch(c){
case 'R':
System.out.println("Red");
break;
case 'B':
System.out.println("Blue");
break;
case 'G':
System.out.println("Green");
break;
case 'O':
System.out.println("Orange");
break;
case 'Y':
System.out.println("Yellow");
break;
case 'W':
System.out.println("White");
break;
default:
System.out.println("Invalid code");
break;
}
}
public static void main(String [] args){
ColorCode cc = new ColorCode();
cc.name();
}
}