import java.util.Scanner;
public class DetailsFemaleMale{
void cond(){
Scanner sc = new Scanner(System.in);
String name= sc.nextLine();
int age= sc.nextInt();
if(name.equals("Female")){
if((age<=1)||(age<=58)){
System.out.println("8.2%");
}
else if((age<=59)||(age<=100)){
System.out.println("9.2%");
}

}
else if(name.equals("Male")){
if((age<=1)||(age<=58)){
System.out.println("8.4%");
}
else if((age<=59)||(age<=100)){
System.out.println("10.5%");
}
}
}
public static void main(String [] args){
DetailsFemaleMale dfm = new DetailsFemaleMale();
dfm.cond();
}
}