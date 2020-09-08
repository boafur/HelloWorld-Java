package main;

public class Methods {
	
	public void wait(int ms) {
		try {
			Thread.sleep(ms);
			}
	    catch(InterruptedException ex) {
	    	Thread.currentThread().interrupt();
	        }
	}

}
