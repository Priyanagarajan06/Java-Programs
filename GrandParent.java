public class GrandParent{
String name;
String GParent(String name){
this.name = name;
}
void show(){
System.out.println(name);
}
}
class Parent extends GrandParent{
int age;
int Parent(int age){
this.age = age;
}
void show(){
System.out.println(age);
}
}
class Child extends Parent{
String school;
String Child(String school){
this.school = school;
}
void show(){
Super();
System.out.println(school);
}
}
public class Multilevel{
public static void main(String [] args){
Child c = new Child("Priya",20,"KNCET");
}
}