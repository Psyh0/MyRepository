package it.pupok.task2.my_exception;

/**
 * MyFirstException class
 */
public class MyFirstException extends Exception {

    /**
     * Constructor
     * @param e incoming param
     */
    public MyFirstException(final NullPointerException e) {
        initCause(e);
    }
}