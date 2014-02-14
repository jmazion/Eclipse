// Assignment #: 4
// Name: Josh Mazion
// StudentID: 1206722721
// Lecture: MWF 10:30am
// Description: The Address class stores, sets, and prints the banks address in city,state format.

public class Address {
	
	private String city;
	private String state;
	
	public Address(){
		String city = "?";
		String state = "?";
	}
	
	
	public String getCity(){	// This method returns the city string.
		return city;
	}
    public String getState(){	// This method returns the state string.
    	return state;
    }
    public void setCity(String aCity){	//This method sets the user inputs City to the string 'city'.
    	city = aCity; 	
    } 
    public void setState(String aState){	//This method sets the user inputed state to the string 'state'.
    	state = aState;
    }
    
    public String toString(){    // This toString method prints out the city ans state inputed in City,State format.
    	return String.format("%s,%s", city , state);  	
    }
}
