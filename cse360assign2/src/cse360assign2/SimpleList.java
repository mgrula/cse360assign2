/* Name: Meredith Grula
   Class ID: 390
   Assignment 2: This program creates an array of size 10, and allows you to add, remove, search,
 			print to string and find out the length of the array*/
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
		if (list[list.length - 1] != 0)
		{
			list = Arrays.copyOf(list, (list.length + (list.length / 2))); // increases array by 50%
		}
		
		for (int i = list.length - 1; i > 0; i--)
		{
			list[i] = list[i - 1];
		}
		
		list[0] = newInt;
		count++;
	}
	
	// If the parameter is in the list, then remove it
	public void remove(int parameter)
	{
		for (int i = 0; i < list.length; i++)
		{
			if (list[i] == parameter)
			{
				for (int j = i; j < list.length - 1; j++)
				{
					list[j] = list[j + 1];	
				}
				count--;
				break;
			}
		}
		
		//decrease size of array if more than 25% of the array is empty
		int emptyCount = 0;
		for (int i = 0; i < list.length - 1; i++)
		{
			if (list[i] == 0)
			{
				emptyCount++;
			}
		}
		
		if (emptyCount > (list.length * 0.25))
		{
			list = Arrays.copyOf(list, (list.length - (int)Math.floor(list.length * 0.25)));
		}
	}
	
	//append the parameter to the end of the list
	public void append(int parameter)
	{
		
		//increases size of array by 50% if array is full
		if (list[list.length - 1] != 0)
		{
			list = Arrays.copyOf(list, (list.length + (list.length / 2))); // increases array by 50%
		}
		
		for (int i = 0; i < list.length; i++)
		{
			if (list[i] == 0)
			{
				list[i] = parameter;
				count++;
				break;
			}
	
		}
	}
	
	//return first element in list
	public int first()
	{
		return list[0];
	}
	
	//return current number of possible locations in the list
	public int size()
	{
		int size = 0;
		for (int i = 0; i < list.length; i++)
		{
			if (list[i] != 0)
			{
				size++;
			}
		}
		
		return size;
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
