import java.util.Scanner;
public class OddEvenArrange{
void arrange(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int temp = n;
int count =0;
while(temp>0){
count++;
temp/=10;
}
int digit [] = new int[count];
temp =n;
for(int i =count-1; i>=0; i--){
digit[i] = temp%10;
temp/=10;
}
for(int i=0; i<count;i++){
if(digit[i]%2==0){
System.out.println(digit[i]);
}
}
for(int i =0; i<count; i++){
if(digit[i]%2!=0){
System.out.println(digit[i]);
}
}

}
public static void main(String [] args){
OddEvenArrange oea = new OddEvenArrange();
oea.arrange();
}
}