import java.util.Scanner;
public class DigitalSecureDataTrans{
void datatrans(){
Scanner sc = new Scanner(System.in);
char base = sc.next().charAt(0);
int key = sc.nextInt();
char sum =0;
sum = (char)(base + key);
System.out.println(sum);
}
public static void main(String [] args){
DigitalSecureDataTrans dsdt = new DigitalSecureDataTrans();
dsdt.datatrans();
}
}