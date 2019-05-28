import java.io.*;
import java.util.StringTokenizer;
public class Story implements Chapter{
	private String[] chapters;
	
	public Story() throws IOException {
		chapters=new String[401];
		splitChapters();
	}
	@Override
	public void printText(int chap) {
		// TODO Auto-generated method stub
		System.out.println(chapters[chap]);

	}

	@Override
	public void splitChapters() throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new FileReader("story.txt"));
		
		for (int x=0;x<chapters.length;x++) {
			chapters[x]="";
			String temp;
			while(!(temp=in.readLine()).startsWith("<"))
			chapters[x]+=temp+"\n";
		}
		in.close();
		
	}

}
