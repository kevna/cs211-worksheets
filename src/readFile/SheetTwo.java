package readFile;
import java.io.*;

public class SheetTwo {
	public static void main(String args[]) {
		try {
			String[] lines = new String[20];
			lines = SheetOne.fileRead("lines.txt", 20);
			for (int i = 0; i < 20; i++) {
				String[] words = lines[i].split(" ");
				if (words.length >= i) {
					System.out.println(words[i]);
				} else {
					System.out.println(words[words.length - 1]);
				}
			}
		} catch(IOException e) {
			System.out.println("It's dead Jim");
		}
	}
}
