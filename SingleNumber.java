import java.util.Scanner;
public class SingleNumber{
void single(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[]= new int[n];
for(int i=0; i<a.length; i++){
a[i] = sc.nextInt();
}
for(int i=1;i<a.length;i++){
    int count =0;
for(int j=1;j<a.length;i++){
if(a[i]==a[j]){
count++;
}
}
if(count==1){
System.out.println(a[i]);
}
else{
    System.out.println("Invalid input");
}
}
}
public static void main(String [] args){
SingleNumber sn = new SingleNumber();
sn.single();
}
}