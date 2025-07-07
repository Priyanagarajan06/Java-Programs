import java.util.Scanner;
public class MaxEnergy{
void maxenergy(){
Scanner sc = new Scanner(System.in);
int numOfChem = sc.nextInt();
int sum =0;
int energy[] = new int[numOfChem];
for(int i=0; i<numOfChem; i++){
energy[i]=sc.nextInt();
}
for(int i=0; i< numOfChem; i++){
sum +=energy[i];
}
System.out.println(sum);
}
public static void main(String [] args){
MaxEnergy me = new MaxEnergy();
me.maxenergy();
}
}