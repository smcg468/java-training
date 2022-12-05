/*
You are given a string s consisting of lowercase English letters.
A duplicate removal consists of choosing two adjacent and equal letters and removing them.
We repeatedly make duplicate removals on s until we no longer can.
Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".


Example 2:

Input: s = "azxxzy"
Output: "ay"
*/

import InsertPosition.searchInsertPosition;
import ShortestDistance.shortestDistanceToChar;

public class Main {

    public static void main ( String [] args) {

        // Remove Duplicates
        String s = "AABABAAB";
        // System.out.println(RemoveDuplicates.removeDuplicates.RemoveDuplicates.removeDuplicates(s));

        // Max Profit
        int[] prices = {7,2,1,5,3,9,4};
        // System.out.println(MaxProfit.maxProfit.MaxProfit.maxProfit(prices));

        // Reverse Array
        int[] arr = {2, 7 , 11 ,15};
        // ReverseArray.reverseArray.ReverseArray.reverseArray(arr);
        // System.out.println(Arrays.toString(arr));

        // Two Sum
        // int[] nums = {2, 7 ,50, 50,11 ,15};
        // int target = 100;
        // System.out.println(Arrays.toString(TwoSum.twoSum.TwoSum.twoSum(nums,target)));

        //Palindrome.Palindrome
        int x = 1001;
        // System.out.println(Palindrome.Palindrome.Palindrome.Palindrome(x));


        int num = 8271662;
        //System.out.println(LargestNum.LargestNum.largestNum(num));

        int[] nums = {2, 7 ,50, 80};
        int target = 67;
        System.out.println(searchInsertPosition.searchInsert(nums, target));


        String st = "sjdhhfkdl";
        char c = 'c';
        System.out.println(shortestDistanceToChar.shortestDistanceToChar(st, c));

    }

}
