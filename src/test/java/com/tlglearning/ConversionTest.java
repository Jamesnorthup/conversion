package com.tlglearning;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
class ConversionTest {

//    @ParameterizedTest
//    @CsvFileSource(resources="parse-valid.csv", numLinesToSkip=1)
//    void parse_valid(String representation,int radix, int expected) throws Exception {
//        assertEquals(expected, Conversion.parse(representation,radix));
//    }

    @Test
    void convertToDecimal() {
        assertEquals(173,Conversion.convertToDecimal("10101101"));
    }

    @Test
    void parse_Equals() throws Exception {
        assertEquals(165,Conversion.parse("245",8));
    }

    @Test
    public void parse_Exception_Radius_Low() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Conversion.parse("245",1);
        });

        String expectedMessage = "Radix out of bounds";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void parse_Exception_Radius_High() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Conversion.parse("245",11);
        });

        String expectedMessage = "Radix out of bounds";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


}