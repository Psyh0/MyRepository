package it.pupok.task2.entityTheArray;

import it.pupok.task2.interfaceForEntity.IInterfaceForEntity;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class EntityTheArray
 * @param <T>
 * implements interface IMyFirstInterface
 */
public class EntityTheArray <T> extends ArrayList<T> implements IInterfaceForEntity <T> {

    /**Specified array*/
    private ArrayList<T> specifiedArray = new ArrayList<T>();

    /**
     * Getter
     * @return return this.specifiedArray
     */
    @Override
    public ArrayList<T> getArray() {
        return this.specifiedArray;
    }

    /**
     * Setter
     * @param n incoming arg
     */
    @Override
    public void setArray(final T ... n) {
        Collections.addAll(specifiedArray, n);
    }
}