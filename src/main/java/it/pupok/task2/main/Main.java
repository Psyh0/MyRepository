package it.pupok.task2.main;

import it.pupok.task2.inverterOfArrays.InverterOfArrays;
import it.pupok.task2.my_exception.MyFirstException;
import it.pupok.task2.entityTheArray.EntityTheArray;

/**
 * Main Class
 * Entry point
 */
final class Main {

    /**
     * Default constructor
     * Utility classes should not have a public or default constructor
     */
    private Main(){

    }

    /**
     * main method
     * @param args incoming arguments
     * @throws java.lang.NullPointerException
     * @throws MyFirstException my wrapper for NullPointerException
     */
    public static void main(final String [] args) throws MyFirstException {

        try {
            EntityTheArray<Integer> arrayOfInteger = new EntityTheArray<Integer>();

            EntityTheArray<String> arrayOfString = new EntityTheArray<String>();

            arrayOfInteger.setArray(0, 1, 2);
            arrayOfString.setArray("a", "b", "c");

            InverterOfArrays inverter = new InverterOfArrays();

            System.out.println("Целочисленный массив: " + arrayOfInteger.getArray());
            inverter.inverterForArray(arrayOfInteger.getArray());
            System.out.println("Инвертированный целочисленный массив: " + arrayOfInteger.getArray());


            System.out.println("Массив строк: " + arrayOfString.getArray());
            inverter.inverterForArray(arrayOfString.getArray());
            System.out.println("Инвертированный массив строк: " + arrayOfString.getArray());

        } catch (NullPointerException n) {
            throw new MyFirstException(n);
        }
    }
}