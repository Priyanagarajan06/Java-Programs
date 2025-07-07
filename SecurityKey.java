import java.util.Scanner;
public class SecurityKey{
void securitykey(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
n = n%10;
n/=10;
for(int i =0; i<=n; i++){
System.out.print(n);
}
}
public static void main(String [] args){
SecurityKey sk = new SecurityKey();
sk.securitykey();
}
}