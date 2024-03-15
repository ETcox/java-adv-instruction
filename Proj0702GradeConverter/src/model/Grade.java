package model;

public class Grade {

	
	 private int number;
	 private String letter;   
	 
	 
	    public Grade() {
	        this.number = 0;
	    }
	    
	    public Grade(int number) {
	        this.number = number;
	    }
	    
	    public void setNumber(int number) {
	        this.number = number;
	    }
	    
	    public int getNumber() {
	        return number;
	    }
	    
	    public String getLetter() {
	        
	        if (number >= 88) {
	            letter = "A";
	        } else if (number >= 80) {
	            letter = "B";
	        } else if (number >= 67) {
	            letter = "C";
	        } else if (number >= 60) {
	            letter = "D";
	        } else {
	            letter = "F";
	        }
	        
	        return letter;
	    }
	
	
	
	
	
}
