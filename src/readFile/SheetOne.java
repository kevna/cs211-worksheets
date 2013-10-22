package readFile;
import java.io.*;


public class SheetOne {
	public static void main(String args[]) {
		try {
			String[] lines = new String[10];
			lines = fileRead("words.txt", 10);
			for (String word : lines) {
				System.out.println(word);
			}
		} catch(IOException e) {
			System.out.println("It's dead jim:\n" + e.getMessage());
		}
	}
	
	public static String[] fileRead(String fileName, int lines) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(fileName));
		String[] content = new String[lines];
		for (int i = 0; i < lines; i++) {
			content[i] = input.readLine();
		}
		input.close();
		return content;
	}
}
