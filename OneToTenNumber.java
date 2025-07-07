import java.util.Scanner;
public class OneToTenNumber{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
void number(){
for(int i=1;i<=n;i++){
System.out.print(i+"	");
}
}
public static void main(String [] args){
OneToTenNumber ottn = new OneToTenNumber();
ottn.number();
}
}