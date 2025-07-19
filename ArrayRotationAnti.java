import java.util.Scanner;
public class ArrayRotationAnti{
void rotate(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size:");
int n = sc.nextInt();
int a[] = new int[n];
System.out.println("Enter array:");
for(int i=0; i<n; i++){
a[i] = sc.nextInt();
}
System.out.println("Enter rotation count:");
int m = sc.nextInt();
int c = a.length-m;
for(int i=c; i<a.length; i++){
System.out.print(a[i]+" ");
}
for(int i=0; i<c; i++){
System.out.print(a[i]+" ");
}
}
public static void main(String [] args){
ArrayRotationAnti ar = new ArrayRotationAnti();
ar.rotate();
}
}