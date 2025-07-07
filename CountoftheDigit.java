import java.util.Scanner;
public class CountoftheDigit{
void repeatation(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[] = new int [n];
for(int i =0; i<=0;i++){
a[i] = sc.nextInt();
}
int temp =n;
int digit = 0;
while(n>0){
int temp = digit;
digit = n%10;
a[digit]++;
temp/=10;
System.out.println(temp);
for(int i =0; i<10;i++){
if(a[i]<0){
System.out.println(a[i]);
}
}
}
public static void main(String [] args){
CountoftheDigit cd = new CountoftheDigit();
cd.repeatation();
}
}