package cse360assign3;

public class Calculator {
	
	private int total;
	private String returnString = 0 + "";	//global returnString added for the getHistory function
	
	public Calculator(){
		total = 0;	//not needed. included for clarity
	}
	
	/**
	 * returns the correct total
	 * @param none
	 */
	public int getTotal(){
		return total;
	}
	
	/**
	 * adds the parameter value to the total
	 * @param value
	 */
	public void add(int value){
		returnString += " + " + value;
		total = value + total;
	}
	
	/**
	 * subtracts the parameter value from the total
	 * @param value
	 */
	public void subtract(int value){
		returnString += " - " + value;
		total = total - value;
	}
	
	/**
	 * multiplies the total by the parameter value 
	 * @param value
	 */
	public void multiply(int value){
		returnString += " * " + value;
		total = total * value;
	}
	
	/**
	 * divides the total by the parameter value 
	 * @param value
	 */
	public void divide(int value){
		returnString += " / " + value;
		if(value == 0)
			total = 0;
		else
			total = total/value;
	}
	
	/**
	 * returns 0 along with any calculator input afterwards
	 * @param none
	 */
	public String getHistory(){
		
		return returnString;
	}
	
}
