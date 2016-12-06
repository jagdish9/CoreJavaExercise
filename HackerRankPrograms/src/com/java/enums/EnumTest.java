package com.java.enums;

enum Day
{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
	FRIDAY, SATURDAY
}
public class EnumTest {

	Day day;
	
	public EnumTest(Day day)
	{
		this.day =  day;
	}
	
	public void tellItLikeItIs()
	{
		switch(day)
		{
		case MONDAY:
			System.out.println("Moday is better");
			break;
			
		case WEDNESDAY:
			System.out.println("Wednesday is better");
			break;
			
		case THURSDAY:
			System.out.println("Thursday is better");
			break;
			
		case SUNDAY: case SATURDAY :
			System.out.println("Weekends are better");
			break;
			
		default:
			System.out.println("Mid day is better");
			break;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnumTest et = new EnumTest(Day.MONDAY);
		et.tellItLikeItIs();
		
		EnumTest et1 = new EnumTest(Day.SUNDAY);
		et1.tellItLikeItIs();
		
		EnumTest et2 = new EnumTest(Day.TUESDAY);
		et2.tellItLikeItIs();
		
	}

}
