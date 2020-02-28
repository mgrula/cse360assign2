/* Name: Meredith Grula
  Class ID: 390
  Assignment 2: This is the test class for the SimpleList class*/
package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	//checks that the constructor exists
	@Test
	void testSimpleList() {
		SimpleList newList = new SimpleList();
		assertNotNull(newList);
	}
	
	//tests that the constructor initializes count to 0
	@Test
	void testSimpleListCount()
	{
		SimpleList newList = new SimpleList();
		assertEquals(0, newList.count);
	}
	
	//tests the add function for the first value
	@Test
	void testAdd() {
		SimpleList newList = new SimpleList();
		newList.add(10);
		assertEquals(10, newList.list[0]);
	}
	
	//checks the add function when adding more than 1 value
	@Test
	void testAddForMoreThan1() {
		SimpleList newList = new SimpleList();
		newList.add(10);
		newList.add(11);
		newList.add(56);
		newList.add(4);
		assertEquals(10, newList.list[3]);
	}
	
	//tests that remove function works as expected
	@Test
	public void testRemove()
	{
		SimpleList newList = new SimpleList();
		newList.add(7);
		newList.add(5);
		newList.remove(7);
		
		assertNotEquals(7, newList.list[1]);
	}
	
	//tests that the remove function only removes specified value
	@Test
	public void testRemoveLeavesPreviousValue()
	{
		SimpleList newList = new SimpleList();
		newList.add(7);
		newList.add(5);
		newList.remove(7);
		
		assertEquals(5, newList.list[0]);
	}
	
	//tests that the count value is correct
	@Test
	public void testCount()
	{
		SimpleList newList = new SimpleList();
		newList.add(5);
		newList.add(8);
		newList.add(6);
		
		assertEquals(3, newList.count);
	}
	
	//tests that the count value is correct
	@Test
	public void testCount2()
	{
		SimpleList newList = new SimpleList();
		newList.add(5);
		newList.add(8);
		newList.add(6);
		newList.add(5);
		newList.add(9);
		
		assertNotEquals(3, newList.count);
	}
	
	//tests that to string method produces proper output
	@Test
	public void testToString()
	{
		SimpleList newList = new SimpleList();
		newList.add(8);
		newList.add(5);
		newList.add(7);
		
		String testString = newList.toString();
		assertEquals("[7, 5, 8, 0, 0, 0, 0, 0, 0, 0]", testString);
	}
	
	@Test
	public void testToString2()
	{
		SimpleList newList = new SimpleList();
		newList.add(9);
		newList.add(3);
		newList.add(4);
		
		String testString = newList.toString();
		assertEquals("[4, 3, 9, 0, 0, 0, 0, 0, 0, 0]", testString);
	}
	
	//tests that the search function produces the correct result
	@Test
	public void testSearch()
	{
		SimpleList newList = new SimpleList();
		newList.add(8);
		newList.add(7);
		newList.add(5);
		
		int result = newList.search(8);
		assertEquals(2, result);
	}
	
	//tests that the search function will find the first value in the array
	@Test
	public void testSearchforFirstValue()
	{
		SimpleList newList = new SimpleList();
		newList.add(5);
		newList.add(8);
		newList.add(4);
		
		int result = newList.search(4);
		assertEquals(0, result);
	}
	
	//assignment 2 tests
	
	//tests that the list length increases by 50% if the list is full
	@Test
	public void testAddIncreasesBy50PercentIfListIsFull()
	{
		SimpleList newList = new SimpleList();
		for (int i = 0; i <= newList.list.length; i++)
		{
			newList.add(i);
		}
		newList.add(11);
		assertEquals(15, newList.list.length);
	}
	
	//tests that the list decreases by 25% if more than 25% is empty when remove is called
	@Test
	public void testRemoveDecreasesListLength()
	{
		SimpleList newList = new SimpleList();
		newList.add(1);
		newList.add(2);
		newList.remove(2);
		assertEquals(8, newList.list.length);
	}
	
	//tests that append adds value to end of list instead of beginning 
	@Test
	public void testAppend()
	{
		SimpleList newList = new SimpleList();
		newList.add(3);
		newList.add(4);
		newList.append(2);
		assertEquals(2, newList.list[2]);
	}
	
	//tests that append will add to beginning of list if the list is empty
	@Test
	public void testAppendToEmptyList()
	{
		SimpleList newList = new SimpleList();
		newList.append(1);
		assertEquals(1, newList.list[0]);
	}
	
	//tests that first returns the first value of the list
	@Test
	public void testFirst()
	{
		SimpleList newList = new SimpleList();
		newList.add(1);
		newList.add(2);
		newList.add(3);
		assertEquals(3, newList.first());
	}
	
	//tests that first returns 0 if list is empty
	@Test
	public void testFirstEmptyList()
	{
		SimpleList newList = new SimpleList();
		assertEquals(0, newList.first());
	}
	
	//tests that size returns the size of the list
	@Test
	public void testSize()
	{
		SimpleList newList = new SimpleList();
		newList.add(1);
		newList.add(2);
		newList.add(3);
		assertEquals(3,  newList.size());
	}
	
	//tests that size returns 0 if list is empty
	@Test
	public void testSizeEmptyList()
	{
		SimpleList newList = new SimpleList();
		assertEquals(0, newList.size());
	}
		

}
