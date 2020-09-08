package main;

public class HelloWorld {

	public static void main(String[] args) {
		Methods m = new Methods();
		String message = "Hello world!";
		char[] chars = message.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
			m.wait(250);
			
		}
		for (int j = 0; j < chars.length; j++) {
			String bc = "\b \b";
			System.out.print(bc);
			m.wait(250);
		}
		System.out.println("\uD83C\uDF54");
		m.wait(25);

	}

}
