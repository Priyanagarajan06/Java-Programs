import java.util.Scanner;
class PrintArray {
public void printArray(String[] arr){
for(String n : arr){
System.out.println("\n"+n);
}
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter array size:");
int m = sc.nextInt();
String arr[] = new String[m];
System.out.println("Enter String:");
for(int i=0; i<arr.length; i++){
arr[i] = sc.next();
}
PrintArray pa = new PrintArray();
pa.printArray(arr);
}
}