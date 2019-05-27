import java.io.IOException;

public interface Chapter{

	//Print the appropriate text base
	public void printText(int chap);
	
	//Read in the text file, split up the chapters into an Array
	public void splitChapters() throws IOException;
}
