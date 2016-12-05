import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day3 {

	public static void main(String[] args) throws FileNotFoundException {
		String input = new Scanner(new File("src/day3in")).useDelimiter("\\Z").next();
		String[] inputLines = input.split("\n");
		String[][] triangles = new String[inputLines.length][3];
		int possibleCount = 0;
		for (int i = 0; i < inputLines.length; i++) {
			inputLines[i] = inputLines[i].replaceAll("\r", "");
			triangles[i] = inputLines[i].split(" ");
			int a = Integer.parseInt(triangles[i][0]);
			int b = Integer.parseInt(triangles[i][1]);
			int c = Integer.parseInt(triangles[i][2]);
			if (a + b > c && a + c > b && b + c > a) possibleCount++;
		}
		System.out.println(possibleCount);
	}

}
