import java.util.*;
class PalindromSentenceOrNot {
public String isPalinSent(String s){
StringBuilder p = new StringBuilder();
char c;
boolean found = false;
for (int i = 0; i < s.length(); i++) {
c = s.charAt(i);
if (Character.isLetterOrDigit(c)) {
p.append(Character.toLowerCase(c));
}
}
int left = 0;
int right = p.length()-1;

while (left < right) {
if (p.charAt(left) != p.charAt(right)) {
found = false;
System.out.println(found);
return String.valueOf(found);
}
left++;
right--;
}
found = true;
System.out.println(found);
return String.valueOf(found);
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter String: ");
String s = sc.nextLine();
PalindromSentenceOrNot ps = new PalindromSentenceOrNot();
ps.isPalinSent(s);
}
}