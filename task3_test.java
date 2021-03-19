package com.wordpress.technologyconversations.tddtest;
 
import org.junit.Test;
import com.wordpress.technologyconversations.tdd.StringCalculator;

import java.io.*;

class Task3 {
	public class StringCalculatorTest {
    
    @Test
    public final void func1() {             //when there are new lines between numbers.
    Assert.assertEquals(1+2+3, StringCalculator.add("1\n2,3"));
}
	}
}