package com.hackbulgaria.corejava;

public class Problems2Impl implements Problems2 {

    public static void main(String[] args) {
        Problems2Impl some = new Problems2Impl();
        // System.out.println(some.isOdd(0));

        // System.out.println(some.min(1, 2, 3, 4, 5, 6));
        // System.out.println(some.pow(2, 42));
        // System.out.println(some.getPalindromeLength("abc*cba"));
        // System.out.println(some.getPalindromeLength("taz*zad"));
        // System.out.println(some.getPalindromeLength("asdf*fdso"));
        // System.out.println(some.isOdd(9864));
        // System.out.println(some.copyEveryChar("milen", 3));
        // System.out.println(some.isPalindrome(5505055));
        System.out.println(some.isPalindrome(19191));

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
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int counter = 0;

            while (counter < k) {
                output.append(input.charAt(i));
                counter++;
            }

        }
        return output.toString();
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
        StringBuilder beforeStar = new StringBuilder();
        StringBuilder afterStar = new StringBuilder();
        int starIndex = input.indexOf('*');
        int k = 0;
        int counter = 0;

        for (int i = 0; i < starIndex; i++) {
            beforeStar.append(input.charAt(i));
        }
        for (int j = starIndex + 1; j < input.length(); j++) {
            afterStar.append(input.charAt(j));
        }
        int end = beforeStar.length();
        afterStar.reverse();
        while (k < end) {
            if (beforeStar.charAt(k) == afterStar.charAt(k)) {
                counter++;
            } else {
                counter = 0;
            }
            k++;

        }

        return counter;
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
        int num = number;
        boolean result = false;
        while (num != 0) {
            num /= 10;
            digits++;
        }
        // System.out.println(digits);
        while (digits > 1) {
            digits--;
            System.out.println(number);
            if ((number % 10) == (number / pow(10, digits))) {
                result = true;
                System.out.println(number);
            } else {
                return false;
            }
            number /= 10;
           // System.out.println(result);
        }
        // System.out.println(number);

        return result;
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
