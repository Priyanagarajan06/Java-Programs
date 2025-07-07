import java.util.Scanner;
public class NumCraft {
void numcraft() {
Scanner sc = new Scanner(System.in);
int[] input1 = new int[4];
int[] input2 = new int[4];
int[] input3 = new int[4];
int n1 =sc.nextInt();
int n2 =sc.nextInt();
int n3 = sc.nextInt();
input1[0]= (n1/1000)%10;
input1[1]= (n1/100)%10;
input1[2]= (n1/10)%10;
input1[3]= n1%10;
input2[0]= (n2/1000)%10;
input2[1]= (n2/100)%10;
input2[2]= (n2/10)%10;
input2[3]= n2%10;
input3[0]= (n3/1000)%10;
input3[1]= (n3/100)%10;
input3[2]= (n3/10)%10;
input3[3]= n3%10;
int thousand = Math.min(input1[0], Math.min(input2[0], input3[0]));
int hundreds = Math.max(input1[1], Math.max(input2[1], input3[1]));
int tens = Math.min(input1[2], Math.min(input2[2], input3[2]));
int units = Math.max(input1[3], Math.max(input2[3], input3[3]));
System.out.println(" " + thousand + hundreds + tens + units);
}
public static void main(String[] args){
NumCraft nc = new NumCraft();
nc.numcraft();
}
}
