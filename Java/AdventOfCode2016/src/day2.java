import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class day2 {

	public static void main(String[] args) throws FileNotFoundException {
		String input = /*"ULL\nRRDDD\nLURDL\nUUUUD";//*/new Scanner(new File("src/day2in")).useDelimiter("\\Z").next();
		
		String[] moves = input.split("\n");
		int key = 5;
		String code = "";
		for (int i =0; i<moves.length; i++){
			for (int j = 0; j<moves[i].length(); j++){
				char c = moves[i].charAt(j);
				switch (c){
				case 'U':
					if (key - 3 > 0) key -= 3;
					//System.out.println(c + " " + key);
					break;
				case 'D':
					if (key + 3 < 10) key += 3;
					//System.out.println(c + " " + key);
					break;
				case 'L':
					if (key != 1 && key != 4 && key != 7) key -= 1;
					//System.out.println(c + " " + key);
					break;
				case 'R':
					if (key != 3 && key != 6 && key != 9) key += 1;
					//System.out.println(c + " " + key);
					break;
				}
			}
			System.out.println("finally: " + key);
			code += "" + key;
		}
		System.out.println(code);
	}

}
