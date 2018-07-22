import java.io.Serializable;

public class serialInterface implements Serializable {
	private int number;
	private char letter;
	
	public serialInterface() {
		number = 0; 
		letter = 'A';
	}
	public serialInterface(int theNumber, char theLetter) {
		number = theNumber;
		letter = theLetter;
	}
	public String toString() {
		return "Number = "+ number + "Letter = "+ letter;
	}
}
