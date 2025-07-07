import java.util.Scanner;
public class ArrayRotationAnti{
void rotate(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[] = new int[n];
for(int i=0; i<n; i++){
a[i] = sc.nextInt();
}
int m = sc.nextInt();
int c = a.length-m;
for(int i=c; i<a.length; i++){
System.out.println(a[i]);
}
for(int i=0; i<c; i++){
System.out.println(a[i]);
}
}
public static void main(String [] args){
ArrayRotationAnti ar = new ArrayRotationAnti();
ar.rotate();
}
}