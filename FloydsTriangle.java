import java.util.Scanner;
public class FloydsTriangle{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a= 1;
void triangle(){
for(int i=1; i<=n; i++){
for(int j=1; j<=i; j++){
System.out.print(a+" ");
a++;
}
System.out.println();
}
}
public static void main(String [] args){
FloydsTriangle ft = new FloydsTriangle();
ft.triangle();
}
}