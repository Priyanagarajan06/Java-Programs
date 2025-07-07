import java.util.Scanner;
public class SmartSensor{
void smart(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[]= new int[n];
int mode = sc.nextInt();
int sum =0;
for(int i =0; i<a.length; i++){
a[i] = sc.nextInt();
}
if(mode==1){
for(int i=2;i<=Math.sqrt(a[i]);i++){
if(a[i]%i!=0){
sum +=a[i];
}
}
}
System.out.println(sum);
}
public static void main(String [] args){
SmartSensor ss = new SmartSensor();
ss.smart();
}
}