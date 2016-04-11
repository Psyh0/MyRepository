package it.pupok.task2.inverterOfArrays;

import it.pupok.task2.interfaceForInverter.IInterfaceForInverter;
import it.pupok.task2.my_exception.MyFirstException;

import java.util.ArrayList;

/**
 * InverterOfArrays Generic class
 * Provides reversing for arrays of Integer
 */
public class InverterOfArrays implements IInterfaceForInverter {

    /**
     * Reverse int array
     * @param inputArray incoming param
     * @throws MyFirstException my wrapper for NullPointerException
     */
    @Override
    public <T> void inverterForArray(final ArrayList<T> inputArray) throws MyFirstException {
        try {
            for (int i = 0; i < inputArray.size() / 2; i++) {
                T intermediateValue = inputArray.get(i);
                inputArray.set(i, (inputArray.get(inputArray.size() - i - 1)));
                inputArray.set((inputArray.size() - i - 1), intermediateValue);
            }
        } catch (NullPointerException n) {
            throw new MyFirstException(n);
        }
    }
}
