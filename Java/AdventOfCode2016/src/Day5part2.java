import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Day5part2 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String doorID = "ffykfhsq";
		MessageDigest md5 =  MessageDigest.getInstance("MD5");
		int i = 0;
		String test = "";
		StringBuffer pass = new StringBuffer();
		pass.setLength(8);
		System.out.println(pass);
		do {
			test = doorID + i;
			md5.reset();
			md5.update(test.getBytes());
			byte[] digest = md5.digest();
			BigInteger bigInt = new BigInteger(1,digest);
			String hashtext = bigInt.toString(16);
			while(hashtext.length() < 32 ){
				hashtext = "0"+hashtext;
			}
			if (hashtext.startsWith("00000")) {
				try {
					int pos = Integer.parseInt(hashtext.substring(5,6));
					if (pos < 8 && pass.charAt(pos) == (char)0) pass.setCharAt(pos, hashtext.charAt(6));
				} catch (NumberFormatException e) {
					//
				}
				System.out.println(pass);
			}
			i++;
		} while (pass.indexOf((char)0 + "") != -1);
		System.out.println(pass);
	}
	

}
