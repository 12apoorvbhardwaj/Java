import java.util.Scanner;
import java.util.Arrays;
class HelloWorld {

    public static boolean isAnagram(String s1, String s2)
    {
        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();
        if(c1.length != c2.length)
            return false;
        else
        {
            Arrays.sort(c1);
            Arrays.sort(c2);
            String a  = new String (c1);
            String b =  new String (c2);
            if(a.equals(b))
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(isAnagram(s1, s2))
            System.out.println(" Anagram ");
        else
            System.out.println(" Not a Anagram ");
        sc.close(); 
    }
}
