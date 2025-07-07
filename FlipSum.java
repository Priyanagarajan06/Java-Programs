import java.util.Scanner;
public class FlipSum{
void flipsum(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int Result =0;
int op = sc.nextInt();
//if(op==1 || op==2){
if(op==1){
Result = (n+1)/2;
}
if(op==2){
Result = (n+1/2)^2;
}
//}
System.out.println(Result);
}
public static void main(String [] args){
FlipSum fs = new FlipSum();
fs.flipsum();
}
}