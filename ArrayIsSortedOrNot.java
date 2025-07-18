import java.util.Scanner;
import java.util.Arrays;
class ArrayIsSortedOrNot{
public boolean isSorted(int[] arr){
int a []= Arrays.copyOf(arr,arr.length);
Arrays.sort(a);
boolean found = true;
for(int i=0; i<arr.length; i++){
if(arr[i]!=a[i]){
found = false;
break;
}
}
System.out.println(found);
return found;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size:");
int n = sc.nextInt();
System.out.println("Enter array:");
int arr[] = new int[n];
for(int i=0; i<arr.length; i++){
arr[i]= sc.nextInt();
}
ArrayIsSortedOrNot as = new ArrayIsSortedOrNot();
as.isSorted(arr);
}
}