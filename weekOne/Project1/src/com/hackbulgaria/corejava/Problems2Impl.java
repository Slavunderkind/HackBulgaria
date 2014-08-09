package com.hackbulgaria.corejava;

public class Problems2Impl implements Problems2 {

    public static void main(String[] args) {
        Problems2Impl some = new Problems2Impl();
        // System.out.println(some.isOdd(0));

        // System.out.println(some.min(1, 2, 3, 4, 5, 6));
        // System.out.println(some.pow(2, 42));
        System.out.println(some.isPalindrome(2222222));
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean canBalance(int[] array) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String copyEveryChar(String input, int k) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String decodeURL(String input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long doubleFac(int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float getAverage(int[] array) {
        float result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }

        // TODO Auto-generated method stub
        return result / array.length;
    }

    @Override
    public long getLargestPalindrome(long N) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getOddOccurrence(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getPalindromeLength(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long getSmallestMultiple(int upperBound) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[] histogram(short[][] image) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        }

        return true;
    }

    @Override
    public boolean isPalindrome(int number) {
        int digits = 0;
        while (number != 0) {
            number /= 10;
            digits++;
        }
        System.out.println(digits);
        while (number > 9) {
            if (number % 10 == number / pow(10, digits - 1)) {
                number /= 10;
            }
            System.out.println(number);
        }
        return false;
    }

    @Override
    public boolean isPalindrome(String argument) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0 || number == 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public long kthFac(int k, int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int kthMin(int k, int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maxSpan(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int min(int... array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }

        }
        return minimum;
    }

    @Override
    public long pow(int a, int b) {
        long result = a;
        if (b == 0) {
            result = 1;
        }
        for (int i = 1; i < b; i++) {
            result = result * a;

        }
        // TODO Auto-generated method stub
        return result;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseEveryWord(String arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sumOfNumbers(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

}
