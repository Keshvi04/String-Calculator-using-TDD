import java.io.*;
import java.util.*;


class Task6 {
    
    public static int addn( String numbers) {
        int ans = 0;
        String[] array = numbers.split(",");
        List negativeNumbers = new ArrayList();
        for (String str : array) {
                if (!str.trim().isEmpty()) {
                        int n = Integer.parseInt(str.trim());
                        if (n < 0) {
                                negativeNumbers.add(n);
                        } else if (n <= 1000) {
                                ans += n;
                        }
                }
        }
        if (negativeNumbers.size() > 0) {
                throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
        }
        return ans;    
    }
  /*public static void main(String[] args) 
    { 
        int res=addn("1,500,1000,4,1259,4000");
        System.out.print(res);
       
    } */

}