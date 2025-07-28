import java.util.Scanner;
class ZerosAreAddInLast {
public void pushZerosToEnd(int[] arr) {
int count =0;
for(int i=0; i<arr.length; i++){
if(arr[i]!=0){
arr[count] = arr[i];
count++;
}
}
while(count<arr.length){
arr[count] =0;
count ++;
}
for(int i = 0; i < arr.length; i++) {
System.out.print(arr[i] + " ");
}
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size:");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter arr:");
for(int i=0; i<arr.length; i++){
arr[i] = sc.nextInt();
}
ZerosAreAddInLast za = new ZerosAreAddInLast();
za.pushZerosToEnd(arr);
}
}