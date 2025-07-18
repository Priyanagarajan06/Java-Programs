import java.util.Scanner;
class DecrementArrayElements{
public static int[] decrement(int[] arr){
int a[] =new int [arr.length];
for(int i=0; i<arr.length; i++){
a[i] = arr[i]-1;
System.out.print(a[i]+" ");
}
return a;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter array size:");
int n = sc.nextInt();
int arr[] = new int [n];
System.out.println("Enter array:");
for(int i=0; i<arr.length; i++){
arr[i] = sc.nextInt();
}
DecrementArrayElements da = new DecrementArrayElements();
da.decrement(arr);
}
}