
public class TestString {
	public static void main (String [] args) {
		String str = "abcdefg";
		System.out.println(str.charAt(3));
		if(str instanceof String) {
			System.out.print("ok");
		}
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("n"));
		String str1 = str.substring(0, 2);
		String str2 = str.replace("b", "^");
		System.out.println(str2);
		String str5 = "aa,bb,cc,dd";
		String [] rs = str5.split(",");
		for(String s : rs) {
			System.out.println(s );
		}

	}
}
