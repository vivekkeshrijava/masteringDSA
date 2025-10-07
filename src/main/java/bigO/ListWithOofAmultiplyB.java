package bigO;

// This is an example of O(A * B) complexity

public class ListWithOofAmultiplyB
 {
    public static void main(String[] args) {
        System.out.println(printItems(10, 5));
    }

    public static int printItems(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(i+j);
            }  
        }
        return a * b;
    }
    
}
