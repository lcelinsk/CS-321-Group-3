/*
* CS 321 Section 004
* Group 3
*/
public class Attorney{
	//Class Attributes
	private String fullName = "";
	private String BarID = "";
	private String state = "";
	
	//Constructor for Attorney class
	public Attorney(){}
	
	//equals method
	public boolean equals(Attorney other){
		return this.BarID.equals(other.BarID);
	}

	//Getter methods for the Attorney class
	public String getFullName(){
		return this.fullName;
	}
	
	public String getBarID(){
		return this.BarID;
	}
	
	public String getState(){
		return this.state;
	}
	
	//Setter methods for Attorney class
	public void setFullName(String fullName){
		this.fullName = fullName;
	}
	
	public void setBarID(String BarID){
		this.BarID = BarID;
	}
	
	public void setState(String state){
		this.state = state;
	}
}
