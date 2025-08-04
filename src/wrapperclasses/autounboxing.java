package wrapperclasses;

public class autounboxing {
	public static void main(String[] args) {
		Integer boxedNum = 100;
		int num = boxedNum;
		System.out.println("Wrapper Integer object: " + boxedNum);
		System.out.println("Auto-unboxed primitive int: " + num);
		
	}

}
