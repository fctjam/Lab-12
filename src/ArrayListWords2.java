import java.util.ArrayList;

/* Ashley Pugh
   CSC220-05
   Lab 12
   November 28, 2017 */

public class ArrayListWords2 implements CollectionWords {

	private ArrayList<WordRecord> aList;
	
	// add a (name, value) pair to the collection
    public void put(String name, int value) 
    {
    	aList.add(new WordRecord(name, value));
    }

	// return the value associated with name in the Collection
	// if name is not found, return null
    public Integer get(String name) {

    }

}

main() {
	ArrayListWords2 arrList = new ArrayListWords2;
	
	arrList.put("NJ", 1000000);
	arrLyst.pur("NY", 1230000);
	arrList.put("TX", 230000);
	
	// get the population of NJ
	System.out.prinln(arrList.get("NY));
}
/*
	
	aList -> {("NJ", 1000000),("NY", 1230000),("TX", 230000)}
	
*/