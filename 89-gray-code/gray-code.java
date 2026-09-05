import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        // Total number of elements in an n-bit sequence is 2^n
        int numElements = 1 << n; 
        
        for (int i = 0; i < numElements; i++) {
            // Bitwise formula to convert binary to Gray code
            result.add(i ^ (i >> 1));
        }
        
        return result;
    }
}
