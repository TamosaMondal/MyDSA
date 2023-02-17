package com.company;

import java.util.Collections;
import java.util.List;

public class Leetcode {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int count = 0;
        for (int i = 0; i < candies.length; i++) {
            count++;
        }
        int count1 = count;
        for (int i = 0; i < candies.length; i++) {
            if ((count1 + extraCandies) >= candies[i]) {
                return Collections.singletonList(true);
            } else {
                return Collections.singletonList(false);
            }
        }
        return null;
    }
    public static void main(String[] args) {

    }
}
