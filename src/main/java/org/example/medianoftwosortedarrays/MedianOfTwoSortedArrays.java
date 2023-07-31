package org.example.medianoftwosortedarrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> numbers = new ArrayList<>();

        for (int num : nums1) {
            numbers.add(num);
        }
        for (int num : nums2) {
            numbers.add(num);
        }

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        if (isEven(sortedNumbers.size())) {
            int middle = sortedNumbers.get(sortedNumbers.size() / 2);
            int beforeMiddle = sortedNumbers.get(sortedNumbers.size() / 2 - 1);
            return (double) (beforeMiddle + middle) / 2.0;
        }

        return sortedNumbers.get(sortedNumbers.size() / 2);
    }

    private static boolean isEven(int number) {
        return (number & 1) == 0;
    }
}