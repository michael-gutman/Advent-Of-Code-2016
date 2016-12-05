public class Day1 {

	public static void main(String[] args) {
		String input = "R5, R4, R2, L3, R1, R1, L4, L5, R3, L1, L1, R4, L2, R1, R4, R4, L2, L2, R4, L4, R1, R3, L3, L1, L2, R1, R5, L5, L1, L1, R3, R5, L1, R4, L5, R5, R1, L185, R4, L1, R51, R3, L2, R78, R1, L4, R188, R1, L5, R5, R2, R3, L5, R3, R4, L1, R2, R2, L4, L4, L5, R5, R4, L4, R2, L5, R2, L1, L4, R4, L4, R2, L3, L4, R2, L3, R3, R2, L2, L3, R4, R3, R1, L4, L2, L5, R4, R4, L1, R1, L5, L1, R3, R1, L2, R1, R1, R3, L4, L1, L3, R2, R4, R2, L2, R1, L5, R3, L3, R3, L1, R4, L3, L3, R4, L2, L1, L3, R2, R3, L2, L1, R4, L3, L5, L2, L4, R1, L4, L4, R3, R5, L4, L1, L1, R4, L2, R5, R1, R1, R2, R1, R5, L1, L3, L5, R2";
		//String input = "R5, L5, R5, R3";
		String[] inputArr = input.split(", ");
		int dir = 1;
		int ydis = 0;
		int xdis = 0;
		int dis;
		char turn = ' ';
		for (int i=0;i<inputArr.length;i++){
			dis = Character.getNumericValue(inputArr[i].charAt(1));
			turn = inputArr[i].charAt(0);
			switch(turn) {
			case 'R':
				switch(dir) {
				case 1:
					dir = 2;
					xdis += dis;
					break;
				case 2:
					dir = -1;
					ydis -= dis;
					break;
				case -1:
					dir = -2;
					xdis -= dis;
					break;
				case -2:
					dir = 1;
					ydis += dis;
					break;
				}
				break;
			case 'L':
				switch(dir) {
				case 1:
					dir = -2;
					xdis -= dis;
					break;
				case 2:
					dir = 1;
					ydis += dis;
					break;
				case -1:
					dir = 2;
					xdis += dis;
					break;
				case -2:
					dir = -1;
					ydis -= dis;
					break;
				}
				break;
			}
		}

		System.out.println(xdis +", " + ydis);
		System.out.println(Math.abs(xdis)+Math.abs(ydis));
	}
}

