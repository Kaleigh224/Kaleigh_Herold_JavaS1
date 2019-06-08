package com.company;


public class App {

    public static void main(String[] args) {


    }

    public static int total(int[] sumArr) {
        int sum = 0;
        for(int value : sumArr) {
            sum += value;
        }
        return sum;
    }

    public static int totalOdd(int[] numbers) {
        int oddSum = 0;
        for(int i = 1; i < numbers.length; i+=2) {
            oddSum += numbers[i];
        }
        return oddSum;
    }

    public static int totalEven(int[] nums) {
        int evenSum = 0;
        for(int i = 0; i < nums.length; i+=2) {
            evenSum += nums[i];
        }
        return evenSum;
    }


    public static int secondLargestNumber(int[] numbers){
        int highest;
        int secondHighest;

        if(numbers[0] > numbers[1]) {
            highest = numbers[0];
            secondHighest = numbers[1];
        } else {
            highest = numbers[1];
            secondHighest = numbers[0];
        }
        for(int i = 2; i < numbers.length; i++) {
            if((numbers[i] <= highest) && numbers[i] > secondHighest) {
                secondHighest = numbers[i];
            }
            if(numbers[i] > highest) {
                secondHighest = highest;
                highest = numbers[i];
            }
        }
        return secondHighest;
    }

    public static String[] swapFirstAndLast(String[] swapWords) {
        String firstWord = swapWords[0];
        String lastWord = swapWords[swapWords.length - 1];
        swapWords[0] = lastWord;
        swapWords[swapWords.length - 1] = firstWord;

        return swapWords;
    }

    public static int [] reverse(int[] reverseArr) {
        for(int i = 0; i < reverseArr.length / 2; i++)
        {
            int swap = reverseArr[i];
            reverseArr[i] = reverseArr[reverseArr.length - i - 1];
            reverseArr[reverseArr.length - i - 1] = swap;
        }
        return reverseArr;
    }

    public static String concatenateString(String[] stringWordsArr) {
        String joinedString = "";

        for(int i = 0; i < stringWordsArr.length; i++) {
            joinedString += stringWordsArr[i];

//                    joinedString.concat(stringWordsArr[i]);
        }
        return joinedString;
    }

    public static int[] everyThird(int[] thirds) {
        if(thirds.length < 3) {
            return null;
        }
        int[] thirdNum = new int[thirds.length/3];
        int index = 0;
        for(int i = 2; i < thirds.length; i+=3) {
            thirdNum[index] = thirds[i];
            index++;
        }
        return thirdNum;

    }

    public static int[] lessThanFive(int[] fiveArr) {
        int count = 0;
        for(int i = 0; i < fiveArr.length; i++) {
            if(fiveArr[i] < 5) {
                count++;
            }
        }
        if(count == 0) {
            return null;
        }
        int[] returnUnderFive = new int[count];
        int index = 0;
        for(int j = 0; j < fiveArr.length; j++) {
            if(fiveArr[j] < 5) {
                returnUnderFive[index] = fiveArr[j];
                index++;
            }
        }
        return returnUnderFive;
    }

    public static int [] [] splitAtFive(int[] numbers) {
        int countBelowFive = 0;
        int countAboveFive = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 5) {
                countBelowFive++;
            } else {
                countAboveFive++;
            }
        }

        int [] belowFive = new int[countBelowFive];
        int [] aboveFive = new int[countAboveFive];
        int index1 = 0;
        int index2 = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 5) {
                belowFive[index1] = numbers[i];
                index1++;
            } else {
                aboveFive[index2] = numbers[i];
                index2++;
            }
        }
        int [] [] splitArr = {belowFive, aboveFive};
        return splitArr;
    }

    public static String [] [] evensAndOdds(String[] stringArr) {


        int evenIndexCount = 0;
        int oddIndexCount = 0;
        for(int i = 0; i < stringArr.length; i++) {
            if(i % 2 == 0) {
                evenIndexCount++;
            } else {
                oddIndexCount++;
            }
        }

        String [] evenIndex = new String[evenIndexCount];
        String [] oddIndex = new String[oddIndexCount];
        int index1 = 0;
        int index2 = 0;

        for(int indexEven = 0; indexEven < stringArr.length; indexEven+=2) {
            evenIndex[index1] = stringArr[indexEven];
            index1++;
        }

        for(int indexOdd = 1; indexOdd < stringArr.length; indexOdd+=2) {
            oddIndex[index2] = stringArr[indexOdd];
            index2++;

        }
        String [] [] splitArr = {evenIndex, oddIndex};
        return splitArr;
    }



}
