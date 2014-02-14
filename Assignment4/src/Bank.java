// Assignment #: 4
// Name: Josh Mazion
// StudentID: 1206722721
// Lecture: MWF 10:30am
// Description: The Bank Class gathers and prints out information about the users bank.

public class Bank {
	
	private String bankName;
	private int bankID;
	private Address bankAddress;
	
	public Bank(){	 //constructor
		String bankName = "?";
		int bankID = 0;
		bankAddress = new Address();		
	}
	public String getBankName(){	 // This method returns the bankName string.
		return bankName;
    }
    public int getBankID(){	// This method returns the bankID string.
    	return bankID;
    }
    public Address getBankAddress(){	//This method returns the bankAddress object.
    	return bankAddress;
    }
    public void setBankName(String BankName){	//sets the string given to the method to bankName.
       bankName = BankName;
    }
    public void setBankID(int anID){	// This method sets the user inputed bank id to the string bankID.
       bankID = anID;
    }
    public void setBankAddress(String aCity, String aState){   // This method calls the setCity, setState methods in the Address class.
       bankAddress.setCity(aCity);
       bankAddress.setState(aState);
    }
    
    public String toString(){
    	return String.format("\nBank name:\t\t%s\nBank ID:\t\t%d\nBank address:\t\t%s\n\n", bankName , bankID, bankAddress);        
    }
}
