import java.util.*;
public class AddOneInArray{
public int[] plusOne(int[] digits) {
for(int i =digits.length-1; i>=0; i--){
if(digits[i] < 9){
digits[i] += 1;
return digits;
}
digits[i] =0;
}
int res[] = new int[digits.length +1];
res[0] = 1;
return res;
}
public static void main(String [] args){
AddOneInArray ao = new AddOneInArray();
Scanner sc = new Scanner(System.in);
System.out.println("Enter array size: ");
int n = sc.nextInt();
System.out.println("Enter numbers: ");
int digits[] = new int[n];
for(int i=0; i<n; i++){
digits[i] = sc.nextInt();
}
int result [] = ao.plusOne(digits);
System.out.println(Arrays.toString(result));
}
}