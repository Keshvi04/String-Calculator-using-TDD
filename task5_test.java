package com.wordpress.technologyconversations.tddtest;
 
import org.junit.Test;
import com.wordpress.technologyconversations.tdd.StringCalculator;
import java.io.*;

class Task5 {
    
	public class StringCalculatorTest {
         
        @Test
        public final void func1() {
            RuntimeException exception = null;
            try {
                StringCalculator.add("3,-6,15,-18,46,33");
            } catch (RuntimeException e) {
                exception = e;
            }
            Assert.assertNotNull(exception);
            Assert.assertEquals("Negatives not allowed: [-2, -5]", exception.getMessage());
    }
	}
}
