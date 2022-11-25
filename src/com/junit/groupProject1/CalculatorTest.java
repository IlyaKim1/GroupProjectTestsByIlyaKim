package com.junit.groupProject1;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator c = new Calculator();

//  ======================================================================================================
//                                               MODULO TESTS
//  ======================================================================================================

    @Test
    public void moduloTenByTwo(){
        Assert.assertEquals(0,c.mod(10, 2));
        System.out.println("Modulo -> 10 by 2: Test Passed");
        // The 0 here is the expected output,
        // And we will get actual result by calling the method from the Main class which is c.mod(10, 2)
        // The test will pass if the expected output matches the output we got using our method
    }

    @Test
    public void moduloTwelveByFive(){
        Assert.assertEquals(2, c.mod(12, 5));
        System.out.println("Modulo -> 12 by 5: Test Passed");
    }

    @Test
    public void moduloFailTestZeroByZero(){
        Assert.assertEquals(0, c.mod(0, 0));
        // This test is supposed to fail, because we cannot use modulo with 0 in Java
        // So it should output an error if the user enters these parameters
    }

    @Test
    public void moduloFourByTwenty(){
        Assert.assertEquals(4, c.mod(4, 20));
        System.out.println("Modulo -> 4 by 20: Test Passed");
    }

//  ======================================================================================================
//                                              EXPONENT TESTS
//  ======================================================================================================

    @Test
    public void exponentsTwoInThirdPower(){
        Assert.assertEquals(8, c.exp(2, 3));
        System.out.println("Exponents -> 2 to the power of 3: Test Passed");
    }

    @Test
    public void exponentsTwoToThePowerOfZero(){
        Assert.assertEquals(1, c.exp(2, 0));
        System.out.println("Exponents -> 2 to the power of 0: Test Passed");
        // When raising any number to the power of zero we will get 1 as the output by Math rules
        // Don't get confused
    }

    @Test
    public void exponentsNegativeNumberToThePowerOfZero(){
        Assert.assertEquals(-1, c.exp(-2, 0));
        System.out.println("Exponents -> NEGATIVE 2 to the power of 0: Test Passed");
        // Same rule from the previous test applies here
        // But when we're raising a NEGATIVE number to the power of Zero, we should get -1
    }

    @Test
    public void exponentsRaisingNumberToNegativePower() {
        Assert.assertEquals(1, c.exp(2, -3));
        System.out.println("Exponents -> 2 to the power of NEGATIVE 3: Test Passed");
        // The output in math here would be in decimals(0.125)
        // But we're using ints, so it gives us 1
    }

    @Test
    public void exponentsNegativeNumberToPositive(){
        Assert.assertEquals(-16, c.exp(-2, 4));
        System.out.println("Exponents -> NEGATIVE 2 to the power of 3: Test Passed");
        // The answer here is the same as if we were using positive ints, but negative
    }

    @Test
    public void negativeNumberToThePowerOfNegativeNumber(){
        Assert.assertEquals(-1, c.exp(-2, -4));
        // The output in math here would be in decimals(-0.0625)
        // But we're using ints, so it gives us -1
    }


}
