package strings;

public class multiplestrings {
	public static void main(String[] args)
	{
	        String str = " HelloWorld ";
	        String str2 = "helloworld";
	        String str3 = "banana";
	        int num = 123;

	        System.out.println("Length: " + str.length());
	        System.out.println("charAt(1): " + str.charAt(1));
	        System.out.println("substring(1): " + str.substring(1));
	        System.out.println("substring(1, 6): " + str.substring(1, 6));
	        System.out.println("equals: " + str.equals(str2));
	        System.out.println("equalsIgnoreCase: " + str.trim().equalsIgnoreCase(str2));
	        System.out.println("compareTo: " + str.compareTo(str2));
	        System.out.println("compareToIgnoreCase: " + str.trim().compareToIgnoreCase(str2));
	        System.out.println("contains 'World': " + str.contains("World"));
	        System.out.println("startsWith ' He': " + str.startsWith(" He"));
	        System.out.println("endsWith 'ld ': " + str.endsWith("ld "));
	        System.out.println("indexOf 'o': " + str.indexOf("o"));
	        System.out.println("lastIndexOf 'o': " + str.lastIndexOf("o"));
	        System.out.println("trim: '" + str.trim() + "'");
	        System.out.println("replace 'l' with 'x': " + str.replace('l', 'x'));
	        System.out.println("replaceAll vowels: " + str.replaceAll("[aeiouAEIOU]", "*"));
	        System.out.println("replaceFirst 'l': " + str.replaceFirst("l", "L"));
	        System.out.println("toLowerCase: " + str.toLowerCase());
	        System.out.println("toUpperCase: " + str.toUpperCase());
	        char[] chars = str.toCharArray();
	        System.out.println("toCharArray[0]: " + chars[0]);
	        System.out.println("isEmpty: " + "".isEmpty());
	        System.out.println("valueOf: " + String.valueOf(num));
		
	}

}
