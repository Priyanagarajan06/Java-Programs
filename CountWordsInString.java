import java.util.Scanner;
class CountWordsInString{
public static int countWords(String str){
int count =1;
for(int i=0; i<str.length(); i++){
char c = str.charAt(i);
if(c== ' '){
count++;
}
}
System.out.println(count);
return count;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter String:");
String str = sc.nextLine();
CountWordsInString cs = new CountWordsInString();
cs.countWords(str);
}
}