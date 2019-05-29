import java.io.*;
public class stuff {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter out=new BufferedWriter(new FileWriter("output.txt"));
		for (int x=0;x<401;x++) {
			String output="public static int c"+x+"(){\n";
			output+="\ts.printText("+x+");\n";
			output+="\tint nextChap=0;\n";
			output+="\treturn nextChap;\n}\n\n";
			out.write(output);
		}
		out.close();

	}

}
