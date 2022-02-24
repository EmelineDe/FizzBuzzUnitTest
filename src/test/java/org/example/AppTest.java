package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testDoFizzBuzz_NumberDivisibleBy3_ShouldReturnFizz(){

        //Arrange
        int nombre = 9;
        String outputExpected = "Fizz";
        FizzBuzz fb = new FizzBuzz();

        //Act
        String result = fb.doFizzBuzz(nombre);

        //Assert
        Assert.assertEquals(outputExpected, result);

    }

    @Test
    public void testDoFizzBuzz_NumberDivisibleBy5_ShouldReturnBuzz(){

        //Arrange
        int nombre = 25;
        String outputExpected = "Buzz";
        FizzBuzz fb = new FizzBuzz();

        //Act
        String result = fb.doFizzBuzz(nombre);

        //Assert
        Assert.assertEquals(outputExpected, result);

    }

    @Test
    public void testDoFizzBuzz_NumberDivisibleBy5And3_ShouldReturnFizzBuzz(){

        //Arrange
        int nombre = 15;
        String outputExpected = "FizzBuzz";
        FizzBuzz fb = new FizzBuzz();

        //Act
        String result = fb.doFizzBuzz(nombre);

        //Assert
        Assert.assertEquals(outputExpected, result);

    }

    @Test
    public void testDoFizzBuzz_NumberNotDivisibleBy5And3_ShouldReturnNumberIntString(){

        //Arrange
        int nombre = 2;
        String outputExpected = "2";
        FizzBuzz fb = new FizzBuzz();

        //Act
        String result = fb.doFizzBuzz(nombre);

        //Assert
        Assert.assertEquals(outputExpected, result);

    }
}
