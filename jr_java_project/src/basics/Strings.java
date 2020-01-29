package basics;

public class Strings {
	public static void main(String[] args) {
		String booktitle;
		String wordchoice="rings";
		booktitle="the lord of the rings";
        if (booktitle.contains(wordchoice)) {
        	System.out.println("the book contains the word"+wordchoice);
        	
        }
        String browser= "chrome";
        if(browser.equalsIgnoreCase("chrome")) {
        	System.out.println("the browser is chrome");
        	
        }
        String firstName= "tim";
        String lastname= "short";
        String SSN = "984162168";
        System.out.println(firstName.substring(0,1));
        System.out.println(lastname.substring(0, 1));
	}

}
