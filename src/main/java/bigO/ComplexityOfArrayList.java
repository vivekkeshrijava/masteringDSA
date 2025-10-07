package bigO;

import java.util.List;

// This is an example of O(A * B) complexity

public class ComplexityOfArrayList
 {
    public static void main(String[] args) {
        List<Integer> listOfItems = List.of(1,2,3,4,5,6,7,8,9,10);
        
        // O(1) operation
        listOfItems.add(20);
        listOfItems.remove(10);

        // O(n) operation
        listOfItems.add(5, 5);
        listOfItems.remove(5);

    
    }

    
}
