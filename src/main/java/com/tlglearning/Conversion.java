package com.tlglearning;

public class Conversion {



    public static void main(String[] args) throws Exception {


        parse("245", 8);



    }

    public static int convertToDecimal(String binary){
        int value=0;

        int index=0;
        for(char c : binary.toCharArray()){
            value = (value<< 1)+c-'0';
            //value += value +c-'0';

        }

        return value;



    }

    /**
     *
     * @param representation
     * @param radix
     * @return
     * @throws IllegalArgumentException If @code radix <2 || radix >10</2>
     */


    //parse("1011", 2);
    public static int parse(String representation, int radix) throws Exception {
        if(radix<2 || radix>10 ){
            throw new IllegalArgumentException("Radix out of bounds");
        }

        int value=0;
        char[] rep = representation.toCharArray();
        for(int i =0; i<rep.length; i++){
            value = (value*radix)+rep[i]-'0';

        }
        System.out.println(value);
        return value;
    }


}
