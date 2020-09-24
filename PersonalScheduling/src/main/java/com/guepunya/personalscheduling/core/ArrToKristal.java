package com.guepunya.personalscheduling.core;

/**
 *
 * @author Hello Willy Sianturi!
 */
public class ArrToKristal {
    String[][] data;

    public ArrToKristal(String[][] data) {
        this.data = data;
    }
    
    public Kristal setToKristal(){
        Kristal k = new Kristal(data);
        return k;
    }
}
