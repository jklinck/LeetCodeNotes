import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class ArrayLists{
	public static void main(String[] args) {

		// creates an ArrayList of ArrayLists
		List<List<Integer>> list = new ArrayList<>();
		// adds a new ArrayList of [1,2] in the outer list

	    list.add(new ArrayList<>(Arrays.asList(1,2)));

	    
	    // an outer list is also referred to as container, parent, wrapper or master list
	    
	}
}