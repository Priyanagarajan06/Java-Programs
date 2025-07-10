import java.util.Scanner;
public class SubArray{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[] = new int[n];
void array(){
for(int i =0; i<n;i++){
a[i] = sc.nextInt();
}
int j=0;
int l=0;
for(int i=0; i<n; i++){
for(j=i; j<n; j++){
for(l=i; l<j; l++){
System.out.print(a[l]);
}
System.out.println(a[j]+" ");
}
System.out.println();
}
}
public static void main(String [] args){
SubArray sa = new SubArray();
sa.array();
}
}