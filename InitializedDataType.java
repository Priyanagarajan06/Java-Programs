import java.util.Scanner;
public class InitializedDataType{
Scanner sc = new Scanner(System.in);
char c =sc.nextLine().charAt(0);
//int n = sc.nextInt();
void datatype(){
if(c>=97&&c<=122){
System.out.println("Alphabhet");
}
else if(c>=65&&c>=90){
System.out.println("Alphabhet");
}
else if(c>=0&&c>=9){
System.out.println("Digit");
}
else{
System.out.println("Special character");
}
}
public static void main(String [] args){
InitializedDataType dt = new InitializedDataType();
dt.datatype();
}
}

