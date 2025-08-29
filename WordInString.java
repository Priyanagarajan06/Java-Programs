import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class WordInString{
public static List<Integer> findWordsContaining(String[] words, char x) {
List<Integer> res = new ArrayList<>();
int index =0;

for(String s : words){
if(s.indexOf(x) != -1){
res.add(index);
}
index++;
}
return res;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of word: ");
int n = sc.nextInt();
sc.nextLine();

String[] words = new String [n];
System.out.println("Enter words: ");
for(int i=0; i<n; i++){
words[i] = sc.nextLine();
}

System.out.println("Enter the character to search: ");
char x = sc.nextLine().charAt(0);
List<Integer> res = findWordsContaining(words,x);
System.out.println("Index: "+ res);
}
}