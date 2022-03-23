package org.example;



public class Sort {

    /**
     * note to self
     * yiu are buikding a list based on two ara lists
     * comparing 2 numbers from each aray list numbers while moving thruow both indexes(the numberd place in a array list)
     * <p>
     * <p>
     * <p>
     * Should take in an array of two ints and changes it
     * to arrray with the numbers from smallest to largest.
     *
     * @param nums - a array
     */


    public static void sortTwo(int[] nums) {
        if (nums[0]<nums[1]) {

            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }
        if (nums[0]>nums[1]) {

            int temp = nums[1];
            nums[1] = nums[0];
            nums[0] = temp;
        }
    }

    /**
     * This function should take the two arrays and merge them into the inputArray.
     * The result should be in order from smallest to largest, with all the numbers from both arrays included.
     *
     * @param inputArray - The original array that will come back changed.
     * @param array1     - A sorted list of numbers that is the size of half the length of the inputArray
     * @param array2     - A sorted list of numbers that is the size of half the length of the inputArray
     */
    public static void merge(int[] inputArray, int[] array1, int[] array2) {
        //int indexes of lists
    //int i,j,k =0
    // i for array1 index
    // j for array2 index
    // k inputArray index
        //array1[x]
        int i=0;
       int j=0;
       int k=0;
while (i < array1.length && j < array2.length){

    if(array1[i]<array2[j]){
        inputArray[k] = array1[i];
        i++;
        k++;
    }
    if(array1[i]>array2[j]) {
        inputArray[k] = array2[j];
        j++;
        k++;
    }
}
// cycal through longest array till k is fulled
        while(array1.length > array2.length && k < inputArray.length){
            inputArray[k] = array1[i];
            i++;
            k++;
        }
        while(array1.length < array2.length && k < inputArray.length){
            inputArray[k] = array2[j];
            j++;
            k++;
        }


//after the while loop breacs insert j or i (depending on which array was bigger) into the input array
    }
}


//int indexes of lists
//int i,j,k =0
// i for array1 index
// j for array2 index
// k inputArray index

// while (the indexes of list1 and list2 has not fully passed through ther lists.)
//{
//compare the i and j index of lists
//if (i > j)
//{
//put j into the main array
//}
// else
//put j into main array
//}


//while room in array 1 add more nummbers
//clean out array1


//while room in array 2 add more
//clean out array2




//ints



//for mesing if ints from both array list are less then or eqal to place them






// swapper code
//int temp = 0;
//int[0] = temp;
//int[0] = int[1];
// int[1] = temp;







//scraped code
//        int i=0;
//        int j=0;
//        int k=0;
//        for (i=0; array1.length; i++ ){
//            for (j=0; array2.length; j++ ){
//                if (array1.charAt(i) < array2.charAt(j)){
//                    int inputArray += array1.charAt(i);
//                }
//                else{
//                    int inputArray += array2.charAt(j);
//                }
//            }
//        }
//
//    }
//}