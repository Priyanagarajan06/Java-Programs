import java.util.Scanner;
public class MaxDigit{
void maxdigit(){
Scanner sc = new Scanner(System.in);
int a[] = new int [8];
for(int i=0;i<8;i++){
a[i] = sc.nextInt();
}
int max=a[0];
for(int n : a){
if(n>max){
max = n;
}
}
System.out.println(max);
}
public static void main(String[] args){
MaxDigit md = new MaxDigit();
md.maxdigit();
}
}