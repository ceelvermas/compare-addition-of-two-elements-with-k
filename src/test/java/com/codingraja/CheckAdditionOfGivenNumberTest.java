package com.codingraja;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created By CL Verma on 10/31/20
 */
public class CheckAdditionOfGivenNumberTest {

    @Test
    public void success() {
        int arr[] = { 10, 15, 3, 7 };
        int k = 17;
        CheckAdditionOfGivenNumber additionOfGivenNumber = new CheckAdditionOfGivenNumber();
        assertEquals(true, additionOfGivenNumber.isAdditionAvailable(arr, k));
    }

    @Test
    public void fail() {
        int arr[] = { 10, 15, 3, 7 };
        int k = 19;
        CheckAdditionOfGivenNumber additionOfGivenNumber = new CheckAdditionOfGivenNumber();
        assertEquals(false, additionOfGivenNumber.isAdditionAvailable(arr, k));
    }
}
