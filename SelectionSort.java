import java.util.Scanner;
public class SelectionSort{
void selection(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[] = new int[n];
for(int i=0; i<n; i++){
a[i] = sc.nextInt();
}
int min =a[0];
for(int m : a){
if(m<min){
min = m;
}
}
System.out.println(min);
for(int i=0; i<n-1;i++){
if(a[i]>min){
int temp = a[i];
a[i]=a[j];
a[j]= temp;
}
}
}
public static void main(String []args){
SelectionSort ss = new SelectionSort();
ss.selection();
}
}