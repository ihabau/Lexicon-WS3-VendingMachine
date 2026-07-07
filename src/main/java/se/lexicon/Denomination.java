package se.lexicon;
import java.util.*;

import java.util.Arrays;

public enum Denomination {

    ONE(1),TWO(2), FIVE(5),TEN(10),TWENTY(20), FIFTY(50);
    private final int values;

    //ACCEPTED_VALUES (1, 2, 5, 10, 20, 50);

    Denomination(int value) {
        this.values = value;
    }

    public boolean isValidCoin(int value) {

        for (Denomination d : Denomination.values()) {
            if (d.values == value) {
                return true;
            }
        }
        System.out.println( "insert " + getValue() + " coin's.");
        return false;
    }



    public int getValue() {
       return values;
        //might be meaningless
    }



}
