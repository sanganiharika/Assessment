package exm;

import java.util.Scanner;

public class PangramChecker {
	    public static boolean isPangram(String s) {	       
	        s = s.replaceAll(" ", "").toLowerCase();
	        boolean[] alphabet = new boolean[26];
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (Character.isLetter(c)) {
	                alphabet[c - 'a'] = true;
	            }
	        }

	       
	        for (boolean letterPresent : alphabet) {
	            if (!letterPresent) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("enter the sentance : ");
	        String sentence =s.next();
	        boolean isPangram = isPangram(sentence);        
	        if (isPangram) {
	            System.out.println("The sentence is a pangram.");
	        } else {
	            System.out.println("The sentence is not a pangram.");
	        }
	    }
	}



