package com.codingraja;

/**
 * Created By CL Verma on 10/31/20
 */

import java.util.*;

public class CheckAdditionOfGivenNumber {

    public boolean isAdditionAvailable(int arr[],  int k)
    {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(hashSet.contains(k-arr[i]))
                return true;
            hashSet.add(arr[i]);
        }

        return false;
    }
}
