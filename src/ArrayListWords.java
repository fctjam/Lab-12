import java.util.ArrayList;

/* Ashley Pugh
   CSC220-05
   Lab 12
   November 28, 2017 */

public class ArrayListWords implements CollectionWords {

	private ArrayList<WordRecord> aList;
	
	// add a (name, value) pair to the collection
    public void put(String name, int value) 
    {
    	aList.add(new WordRecord(name, value));
    }

	// return the value associated with name in the Collection
	// if name is not found, return null
    public Integer get(String name) {
    	for (int i = 0; i < aList.size(); i++) {
    		WordRecord wordRec = aList.get(i);
    		if (wordRec.getName().equals(name)) {
    			return wordRec.getValue();
    		}
    	}
    	return null;
    }

}

