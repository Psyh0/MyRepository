package it.pupok.task2.interfaceForInverter;

import it.pupok.task2.my_exception.MyFirstException;

import java.util.ArrayList;

/**
 * Interface for to describe signature of the inverterForArray class InverterOfArrays
 */
public interface IInterfaceForInverter {

    /**
     *
     * @param inputArray incoming arg
     * @param <T> list/element type
     * @throws MyFirstException my wrapper for NullPointerException
     */
    <T> void inverterForArray(ArrayList<T> inputArray) throws MyFirstException;

}