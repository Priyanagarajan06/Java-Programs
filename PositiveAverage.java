import java.util.Scanner;
class PositiveAverage{
public static double posAverage(int[] arr){
int s = 0;
int count =0;
for(int i=0; i<arr.length; i++){
if(arr[i]>=0){
count++;
s += arr[i];
}
}
if(count ==0 ){ return 0;}
else{
System.out.println((double) s/count);
return (double) s/count;
}
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size:");
int n = sc.nextInt();
int arr[] = new int [n];
System.out.println("Enter array:");
for(int i=0; i<arr.length; i++){
arr[i] = sc.nextInt();
}
PositiveAverage pa = new PositiveAverage();
pa.posAverage(arr);
}
}