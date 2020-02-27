// Name: Meredith Grula
// Class ID: 390
// Assignment 1: This program creates an array of size 10, and allows you to add, remove, search,
// 			print to string and find out the length of the array
package cse360assign2;

import java.util.*;

public class SimpleList {
	
	int[] list = new int[10];
	int count;
	
	// create an array to hold 10 integers and set count to 0
	public SimpleList()
	{
		count = 0;
	}
	
	// Add parameter to the list at the beginning and move all other integers over
	public void add(int newInt)
	{
		
		for (int i = 9; i > 0; i--)
		{
			list[i] = list[i - 1];
		}
		
		list[0] = newInt;
		count++;
	}
	
	// If the parameter is in the list, then remove it
	public void remove(int parameter)
	{
		for (int i = 0; i < 10; i++)
		{
			if (list[i] == parameter)
			{
				for (int j = i; j < 9; j++)
				{
					list[j] = list[j + 1];	
				}
				count--;
				break;
			}
		}
	}
	
	//return the number of elements in a list
	public int count()
	{
		return count;
	}
	
	// return the list as a string
	public String toString()
	{
		String result = Arrays.toString(list);		
		return result;
	}
	
	//return the location of the parameter in the list
	public int search(int parameter)
	{
		for (int i = 0; i < 10; i++)
		{
			if (list[i] == parameter)
			{
				return i;
			}
		}
		
		return -1;
	}

}
