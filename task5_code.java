import java.io.*;
import java.util.*;


class Task5 {
    
	public static int addn(final String numbers) {
    int ans = 0;
    String[] array = numbers.split(",");
    List negativeNumbers = new ArrayList();
    for (String str : array) {
        if (!str.trim().isEmpty()) {
            int n = Integer.parseInt(str.trim());
            if (n < 0) {
                negativeNumbers.add(n);
            }
            ans += n;
        }
    }
    if (negativeNumbers.size() > 0) {
        throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
    }
    return ans;     
}
  /*public static void main(String[] args) 
    { 
        int res=addn("1,-2,3,4,-5");
        System.out.print(res);
       
    } */

}