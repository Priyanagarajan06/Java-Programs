import java.util.Scanner;
public class LargestElement{
void large(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[] = new int [n];
int max1 =a[0];
int max2 =a[0];
int max3 =a[0];
for(int i=0; i<n; i++){
a[i] = sc.nextInt();
}
for(int m : a){
if(m>max1){
max1 =m;
}
}
System.out.println(max1);
for(int p : a){
if((p<max1)&&(p>max2)){
max2 =p;
}
}
System.out.println(max2);
for(int q : a){
if((q<max2)&&(q>max3)){
max3 =q;
}
}
System.out.println(max3);
} 
public static void main(String [] args){
LargestElement le = new LargestElement();
le.large();
}
}