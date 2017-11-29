import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

// benchmark performance of several different collections
public class Benchmark {

	// benchmark time to put and get values from an ArrayList Collection
	private static void testArrayList(String word, int times) throws IOException {
	    long startTime, endTime;

	    // instantiate a ArrayListWords object
		ArrayListWords a = new ArrayListWords();

		// fill the ArrayList with dictionary words
		startTime = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("words.txt");
		Scanner scnr = new Scanner(fis);

		int index = 0;
		while (scnr.hasNextLine()) {
		    a.put(scnr.nextLine(), index++);
		}

		endTime = System.currentTimeMillis();
		System.out.printf("  %d msec to add %d words\n", (endTime - startTime), index);

		// search for word in ArrayList
		startTime = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			int v = a.get(word);
		}

		endTime = System.currentTimeMillis();
		System.out.printf("    %d msec to find \"%s\" %.1e times\n", (endTime - startTime), word, (double)times);
	}

	// benchmark time to put and get values from a HashMap Collection
	private static void testHashMap(String word, int times) throws IOException {
	    long startTime, endTime;

	    // instantiate a HashMapWords object
		HashMapWords h = new HashMapWords();

		// fill the HashMap with dictionary words
		startTime = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("words.txt");
		Scanner scnr = new Scanner(fis);

		int index = 0;
		while (scnr.hasNextLine()) {
		    h.put(scnr.nextLine(), index++);
		}

		endTime = System.currentTimeMillis();
		System.out.printf("  %d msec to add %d words\n", (endTime - startTime), index);

		// search for word in HashMap
		startTime = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			int v = h.get(word);
		}

		endTime = System.currentTimeMillis();
		System.out.printf("    %d msec to find \"%s\" %.1e times\n", (endTime - startTime), word, (double)times);
	}

	// main testbench method
	public static void main(String [] args) throws IOException {
		System.out.println("Testing ArrayList...");
	    testArrayList("Aaron", (int)1e4);
	    testArrayList("harmless", (int)1e4);
	    testArrayList("zygote", (int)1e4);

		System.out.println("\nTesting HashMap...");
	    testHashMap("Aaron", (int)1e8);
	    testHashMap("harmless", (int)1e8);
	    testHashMap("zygote", (int)1e8);
	}

}
