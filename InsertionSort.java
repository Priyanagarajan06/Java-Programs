import java.util.Scanner;
public class InsertionSort{
void sorting(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[] = new int[n];
for(int i=0; i<n; i++){
a [i] = sc.nextInt();
}
int temp=0;
for(int i=1; i<a.length; i++){
for(int j=0; j<i; j++){
if(a[i]<a[j]){
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
for(int i=0; i<a.length; i++){
System.out.println(a[i]);
}
}
public static void main(String [] args){
InsertionSort is = new InsertionSort();
is.sorting();
}
}