import java.util.Scanner;
class PanagramCode{
	static int size = 26;
	static boolean isLetter(char ch)
	{
		if (!Character.isLetter(ch))
			return false;
		return true;
	}
	static boolean allLetter(String str,int len)
	{
		str = str.toLowerCase();
		boolean[] present = new boolean[size];
		for (int i = 0; i < len; i++) {
			if (isLetter(str.charAt(i))) {
				int letter = str.charAt(i) - 'a';
				present[letter] = true;
			}
		}
		for (int i = 0; i < size; i++) {
			if (!present[i])
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
	    Scanner sc  = new Scanner(System.in);
	    String st = sc.next();
	    int l = st.length();
		if (allLetter(st, l))
			System.out.println("Not A Panagram");
		else
			System.out.println("It's A Panagram");
	}
}
