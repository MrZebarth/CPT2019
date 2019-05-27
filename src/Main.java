import java.io.IOException;

public class Main {
	static Story s;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//MAIN PROGRAM
		//Create a Character
		//Create a Story class. Read in the story and save it.
		s=new Story();
		//Start in Chapter 1
		C1();
	}
	
	public static void C1() {
		s.printText(1);
	}
	
	

}
