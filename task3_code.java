import java.io.*;

class Task3 {
    
	public static int add(final String numbers) {
     int ans = 0;
    String[] array = numbers.split(",|n"); 
    
    for (String str : array) {
        if (!str.trim().isEmpty()) {
            ans += Integer.parseInt(str.trim());
        }
    }
    return ans;
	
	
	}
}