
import java.io.*;
import java.util.*;


class Task2 {
	public static final int add( String numbers) {
    int ans = 0;
    String[] array = numbers.split(",");
    
    for (String str : array) {
        if (!str.trim().isEmpty()) { // After refactoring
            ans += Integer.parseInt(str);
        }
    }
    return ans;
	}
  /*public static void main(String[] args) 
    { 
        int res=add("1,3,2,5,8,12,45");
        System.out.print(res);
       
    }*/ 

}