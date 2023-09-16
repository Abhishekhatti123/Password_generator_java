
import java.util.Random;

class Passwordss{        

    public static String generatePassword (int length) {

    //minimum length of 6
    if (length < 4) {
        length = 6;
    }

    final char[] lowercase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    final char[] uppercase = "ABCDEFGJKLMNPRSTUVWXYZ".toCharArray();
    final char[] numbers = "0123456789".toCharArray();
    final char[] symbols = "^$?!@#%&".toCharArray();
    final char[] allAllowed = "abcdefghijklmnopqrstuvwxyzABCDEFGJKLMNPRSTUVWXYZ0123456789^$?!@#%&".toCharArray();

    //Use cryptographically secure random number generator
    Random random = new Random();

    StringBuilder password = new StringBuilder(); 

    for (int i = 0; i < length-4; i++) {
        password.append(allAllowed[random.nextInt(allAllowed.length)]);
    }

    //Ensure password policy is met by inserting required random chars in random positions
    password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
    password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
    password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
    password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);
    

    return password.toString();

    }

}

public class Password {
	public static void main(String args[]) {
		Passwordss p=new Passwordss();
		String m=p.generatePassword(8);
		System.out.println(m);
	}

}