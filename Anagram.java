class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
        return false;
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Array.sort(ch1);
        Array.sort(ch2);
        return false;
    }
}