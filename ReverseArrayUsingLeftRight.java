import java.util.Scanner;
class ReverseArrayUsingLeftRight {
public void reverseArray(int arr[]) {
int left =0, right = arr.length-1;
while(left<right){
 int temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;
left++;
right--;
}
for(int i=0; i<arr.length; i++){
System.out.print(arr[i]+" ");
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter size:");
int n = sc.nextInt();
int arr[] = new int [n];
System.out.println("Enter arr:");
for(int i=0; i<arr.length; i++){
arr[i] = sc.nextInt();
}
ReverseArrayUsingLeftRight lr = new ReverseArrayUsingLeftRight();
lr.reverseArray(arr);
}
}