import java.util.Scanner;
public class Print23to57EvenNo{
void even(){
for(int i=24; i<57; i++){
if(i%2==0){
System.out.println(i);
}
}
}
public static void main(String [] args){
Print23to57EvenNo en = new Print23to57EvenNo();
en.even();
}
}