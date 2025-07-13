import java.util.Scanner;
public class Synonym{
public void syn(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Word:");
String word = sc.nextLine();
if(word.equals("Clever")){
System.out.println("Options:");
System.out.println("1. Intelligent");
System.out.println("2. Mad");
System.out.println("Choose option:");
int option = sc.nextInt();
if(option ==1){
System.out.println("Correct");
}
else if(option ==2){
System.out.println("worng");
}
}
}
public static void main(String [] args){
Synonym sy = new Synonym();
sy.syn();
}
}