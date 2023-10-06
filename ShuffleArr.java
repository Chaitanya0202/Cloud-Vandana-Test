import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArr {
    public static void main(String[] args) {
		//created ArrayList
        List<Integer> arrList = new ArrayList<>();
		//Added Elements
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);

	
        // Shuffled the ArrayList 
			// used collections utility class 
        Collections.shuffle(arrList);

        // Convert the shuffled ArrayList back to an array if needed
        Integer[] shuffledArray = arrList.toArray(new Integer[0]);

        // Printing the shuffled array
        for (Integer value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}
