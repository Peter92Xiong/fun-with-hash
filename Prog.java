import java.lang.Integer;

public class Prog {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Please execute: java Prog <n> <p>");
			System.out.println("n is the input size, and p is the program number.");
			System.exit(0);
		}

		int n = Integer.parseInt(args[0]);
		int p = Integer.parseInt(args[1]);

		switch (p) {
		case 1:
			prog1(n);
			break;
		case 2:
			prog2(n);
			break;
		case 3:
			prog3(n);
			break;
		case 4:
			prog4(n);
			break;
		default:
			System.out.println("Invalid program number. Only 1-4.");
		}
	}

	private static void prog1(int n) 
	{
		// TODO: Code to generate n keys that all get hashed to the same index using
		// hash1.
		HashFunctions hash = new HashFunctions(n);
		int a = 0;
		int allt = 0;

		for (int i = 0; i < n; i++) //to go through all the amount placed
		{
			a = hash.hash1(allt); //a is now the hash of 0
			allt = allt + n;  //allt is now 0 + the size   bc of the mod in the hash funtion we add n bc n is the size
			if (a == 0) //if 0 % 10 is 0 then print out bc the hash funtion is mod by the size 
			{
				System.out.println(allt);
			}
		}
	}

	private static void prog2(int n) 
	{
		// TODO: Code to generate n keys that all get hashed to the same index using
		// hash2.
		HashFunctions hash = new HashFunctions(n);//this hashfunction should only look at...
		int a = 0;

		for (int i = 0; i < n; i++) 
		{
			a = hash.hash2(i);
			if (a == 0) 
			{
				System.out.println(i);
			}
		}
	}

	private static void prog3(int n)
	{
		// TODO: Code to generate n keys that all get hashed to the same index using
		// hash3.
		HashFunctions hash = new HashFunctions(n);
		int a = 0;
		int notN = 0;
		int length = n * n;

		for (int i = 0; i < length; i++) 
		{
			a = hash.hash3(i);
			if (a == 3 && notN != n) 
			{
				System.out.println(i);
				notN++;
			}
		}
	}

	private static void prog4(int n) 
	{
		// TODO: Code to generate n keys that all get hashed to the same index using
		// hash4.
		HashFunctions hash = new HashFunctions(n);
		int a = 0;
		int notN = 0;
		int length = n * n;
		

		for (int i = 0; i < length; i++)
		{
			a = hash.hash4(i);

			if (a == 1 && notN != n) 
			{
				System.out.println(i);
				notN++;
			}
		}
	}
}
