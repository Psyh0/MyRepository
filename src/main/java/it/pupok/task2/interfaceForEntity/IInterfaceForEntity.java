package it.pupok.task2.interfaceForEntity;

import java.util.ArrayList;

/**
 * Interface for to describe signature of the setter and getter class EntityTheArray
 * @param <T>
 */
public interface IInterfaceForEntity <T> {

    /**
     * Getter
     * @return return this.specifiedArray
     */
    ArrayList<T> getArray();

    /**
     * Setter
     * @param n incoming arg
     */
    void setArray(T ... n);
}