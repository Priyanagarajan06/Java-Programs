import java.util.Scanner;
public class EnergyRate{
void energy(){
Scanner sc = new Scanner(System.in);
int n []= new int[3];
for(int i=0; i<3; i++){
n [i] = sc.nextInt();
}
int a =n[0];
int b =a*n[1];
int c =b*n[2];
int d [] ={a,b,c};
for(int i=0; i<d.length;i++){
System.out.print(d[i]+" ");
}
}
public static void main(String [] args){
EnergyRate er = new EnergyRate();
er.energy();
}
}