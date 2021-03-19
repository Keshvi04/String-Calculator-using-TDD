import java.io.*;
import java.util.*;

class Task1 {
	public static final int add( String numbers) { 
        String[] array = numbers.split(",");
        int ans=0;
        if (array.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String str : array) {
                if (!str.isEmpty()) {
                    Integer.parseInt(str);
                }
            }
        
            for (String str : array) {
                if (!str.trim().isEmpty()) {            // After refactoring
                    ans += Integer.parseInt(str);
                }
            }
            return ans;
        }        
    }
    public static void main(String[] args) { 
        int res=add("");
        System.out.print(res);
        
    }
}