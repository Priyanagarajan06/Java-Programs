class Parent{
int length;
int breadth;
Parent(int length, int breadth){
this.length= length;
this.breadth= breadth;
}
void display(){
System.out.println(length);
System.out.println(breadth);
}
}
public class Rectangle{
public static void main(String [] args){
Parent p = new Parent(10,20);
p.display();
}
}