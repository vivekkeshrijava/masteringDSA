package bigO;

// This is an example of O(A + B) complexity

public class ListWithOofAplusB
 {
    public static void main(String[] args) {
        System.out.println(printItems(10, 5));
    }

    public static int printItems(int a, int b) {
     for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
        for (int j = 0; j < b; j++) {
            System.out.println(j);
        }
        return a + b;
    }
    
}
