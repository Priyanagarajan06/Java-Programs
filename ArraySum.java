import java.util.Scanner;
class ArraySum{
public static int arraySum(int[] arr){
int result= 0;
for(int i=0; i<arr.length; i++){
result += arr[i];
}
System.out.println(result);
return result;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size:");
int n = sc.nextInt();
int arr[] = new int [n];
System.out.println("Enter array:");
for(int i=0; i<arr.length; i++){
arr[i] = sc.nextInt();
}
ArraySum as= new ArraySum();
as.arraySum(arr);
}
}