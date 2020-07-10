package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -6;
		 System.out.println(Integer.toBinaryString(x));
	}
	public static int[] quickSort(int[] array) {
	    // Write your solution here
	    if(array == null || array.length == 0){
	      return array;
	    }
	    helper(array, 0, array.length - 1);
	    return array;
	  }
	public static void helper(int[] array, int left, int right){
	    if(left >= right){
	      return;
	    }
	    int i = left+1;
	    int j = right;
	    int target = array[left];
	    System.out.println("i = "+array[i]);
	    System.out.println("j = "+array[j]);
	    System.out.println("target = "+target);
	    while(i < j){
	      while(i < j && array[j] > target){
	        j--;
	      }
	      while(i < j && array[i] < target){
	        i++;
	      }
	      if(i == j){
	        break;
	      }
	      int temp = array[i];
	      array[i] = array[j];
	      array[j] = temp;
	      System.out.println("arrayi = "+array[i]);
	      System.out.println("arrayj = "+array[j]);
	    }
	    System.out.println("i2 = "+i);
	    int temp = array[left];
	    array[left] = array[i];
	    array[i] = temp;
	    helper(array, left, i-1);
	    helper(array, i+1, right);
	  }
	
}
