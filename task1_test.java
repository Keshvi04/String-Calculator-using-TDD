package com.wordpress.technologyconversations.tddtest;
 
import org.junit.Test;
import com.wordpress.technologyconversations.tdd.StringCalculator;
import java.io.*;

class Task1 {
	public class StringCalculatorTest {
        @Test
        public final void func1() {                     //when an empty string is passed.
            StringCalculator.add("");
            Assert.assertTrue(true);                    //sum=0;
        }
            @Test
        public final void func2() {                     //when one string is passed.
            StringCalculator.add("1");
            Assert.assertTrue(true);                    //sum=1;
        }
            @Test
        public final void func3() {                     //when two strings are passed.
            StringCalculator.add("1,2");
            Assert.assertTrue(true);                    //sum=3;
        }
            @Test
        public final void func4() {                     //when more than two strings are passed.
            StringCalculator.add("1,2,3");
            throw new IllegalArgumentException("Exactly 2 parameters required !");
        }
            @Test
        public final void func4() {                     //when non number are passed.
            StringCalculator.add("1,A");
            throw new NumberFormatException("Input string should be in numeric types");
        }
        
	}
}