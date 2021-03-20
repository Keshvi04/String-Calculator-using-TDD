package com.wordpress.technologyconversations.tddtest;
 
import org.junit.Test;
import com.wordpress.technologyconversations.tdd.StringCalculator;

import java.io.*;

class Task6 {
    
    public class StringCalculatorTest{
    
       @Test
            public final void func1() {             //when numbers are greater than 1000.
            Assert.assertEquals(1+500+1000+4, StringCalculator8.add("1,500,1000,4,1259,4200"));
        }
    }
}