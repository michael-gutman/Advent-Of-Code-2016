import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Day5 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String doorID = "abc";
		MessageDigest md5 =  MessageDigest.getInstance("MD5");
		int i = 0;
		String test = "";
		String pass = "";

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
			if (hashtext.startsWith("00000")) 
			{
				pass += hashtext.substring(5, 6);
			}
			i++;
		} while (pass.length() < 8);
		System.out.println(pass);
	}

}
