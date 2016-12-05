import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day3part2 {

	public static void main(String[] args) throws FileNotFoundException {
		String input = new Scanner(new File("src/day3in")).useDelimiter("\\Z").next();
		String[] inputLines = input.split("\\s+");
		int possibleCount = 0;
		
		for (int i = 0; i + 6 < inputLines.length; i++) {
			int a = Integer.parseInt(inputLines[i]);
			int b = Integer.parseInt(inputLines[i + 3]);
			int c = Integer.parseInt(inputLines[i + 6]);
			if ((i-2) % 9 == 0) i+=6; // at every third triangle skips the next 2 lines
			if (a + b > c && a + c > b && b + c > a) possibleCount++;
		}
		
		System.out.println(possibleCount);
	}
}
