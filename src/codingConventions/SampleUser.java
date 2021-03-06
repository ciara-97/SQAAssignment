package codingConventions;
/**
 * This class defines a user and what variables need to 
 * be defined for a user. 
 * 
 * @author ciara
 */

public class SampleUser {

	private String firstName;
	private String surname;
	
	public SampleUser() {
		
	}
	
	/*
	 * Constructor with details for a user.
	 */
	public SampleUser(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
	}

	//Getter Method for first name
	public String getFirstName() {
		return firstName;
	}

	//Setter Method for first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//Getter Method for surname
	public String getSurname() {
		return surname;
	}

	//Setter Method for surname
	public void setSurname(String surname) {
		this.surname = surname;
	}

	//toString method for a User that displays all their details
	public String toString() {
		return "SampleUser [firstName=" + firstName + ", surname=" + surname + "]";
	}
	
	
	
}
