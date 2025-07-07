import java.util.Scanner;
public class SumOfAverage{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int temp =n;
int a [] = new int[n];
int sum=0;
void average(){
for(int i=0; i<n; i++){
a[i] = sc.nextInt();
}
for(int m : a){
sum += m;
}
sum/=temp;
System.out.println(sum);
}
public static void main(String [] args){
SumOfAverage sa = new SumOfAverage();
sa.average();
}
}