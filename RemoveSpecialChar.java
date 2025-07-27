import java.io.*;
import java.util.*;
public class RemoveSpecialChar{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter String: ");
String s = sc.nextLine();
s = s.replaceAll("[^a-zA-Z]"," ");
String []word = s.trim().split("\\s+");
System.out.println("String count: "+word.length);
for(int i=0; i<word.length; i++){
System.out.println(word[i]);
}
}
}