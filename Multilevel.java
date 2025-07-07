class GrandParent{
String name;
GrandParent(String name){
this.name = name;
}
void show(){
System.out.println(name);
}
}
class Parent extends GrandParent{
int age;
Parent(String name,int age){
super(name);
this.age = age;
}
void show(){
super.show();
//System.out.println(name);
System.out.println(age);
}
}
class Child extends Parent{
String school;
Child(String name, int age,String school){
super(name,age);
this.school = school;
}
void show(){
super.show();
System.out.println(school);
System.out.println(name);
System.out.println(age);
System.out.println(school);
}
}
public class Multilevel{
public static void main(String [] args){
Child c = new Child("Priya",20,"KNCET");
c.show();
}
}