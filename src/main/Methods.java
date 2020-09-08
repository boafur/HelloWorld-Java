package main;

public class Methods {
	
	public String removeLastChar(String str) {
        return removeLastChars(str, 1);
    }

    public String removeLastChars(String str, int chars) {
        return str.substring(0, str.length() - chars);
    }
	
	public void wait(int ms) {
		try {
			Thread.sleep(ms);
			}
	    catch(InterruptedException ex) {
	    	Thread.currentThread().interrupt();
	        }
	}

}
