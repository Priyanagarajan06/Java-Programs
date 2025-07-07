import java.util.Scanner;
public class Pattern{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
void PyraminTriangle(){
for(int i=1; i<=n; i++){
for(int j=n; j>=i; j--){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("* ");
}
System.out.println();
}
}
public static void main(String [] args){
Pattern p = new Pattern();
p.PyraminTriangle();
}
}