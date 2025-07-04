import java.util.Scanner;
public class AlphabeticalOrder{
char c1,c2;
void character(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter c1:");
c1 = sc.nextLine().charAt(0);
System.out.println("Enter c2:");
c2 = sc.nextLine().charAt(0);
if(c1<c2){
System.out.println(c1+","+c2);
}
else{
System.out.println(c2+","+c1);
}
}
public static void main(String [] args){
AlphabeticalOrder ao = new AlphabeticalOrder();
ao.character();
}
}
