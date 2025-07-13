import java.util.Scanner;
public class Word{
int count =0;
public String str(String s){
return s;
}
public int letter(String s){
for(int i=0; i<s.length(); i++){
count++;
}
return count;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
Word w = new Word();
w.str(s);
w.letter(s);
System.out.println(s);
System.out.println(w.count);
}
}