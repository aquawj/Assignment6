package assignment6;
import java.util.*;

public class Cat extends Pet implements Boardable {
	
	private String hairLength;
	public int startMonth,startDay,startYear;
	public int endMonth,endDay,endYear;
	Calendar c_start=Calendar.getInstance();
	Calendar c_end=Calendar.getInstance();
	Calendar c_board=Calendar.getInstance();

	
	Cat (String name, String ownerName, String color, String hairLength){
		super(name, ownerName, color);
		this.hairLength=hairLength;
	}
	public String getHairLength(){
		return hairLength;
	}
	public String toString(){
		return this.getClass().getSimpleName()+":\n"+super.toString()+"\nHair: "+getHairLength();	
	} 
	public void setBoardStart(int month, int day, int year){
		startMonth=month;
		startDay=day;
		startYear=year;
		boolean mRange=(startMonth<=12)&&(startMonth>=1);
		boolean dRange=(startDay<=31)&&(startDay>=1);
		boolean yRange=(startYear<=9999)&&(startYear>=1000);
		if((!mRange)||(!dRange)||(!yRange)) {
			System.out.println("Wrong input.");
		}else{
			c_start.set(year, month, day);
			System.out.println("BoardStart: "+startYear+","+startMonth+","+startDay);
		}
	}
	public void setBoardEnd(int month, int day, int year){
		endMonth=month;
		endDay=day;
		endYear=year;
		boolean mRange=(endMonth<=12)&&(endMonth>=1);
		boolean dRange=(endDay<=31)&&(endDay>=1);
		boolean yRange=(endYear<=9999)&&(endYear>=1000);
		if((!mRange)||(!dRange)||(!yRange)) {
			System.out.println("Wrong input.");
		}else{
			c_end.set(year, month, day);
			System.out.println("BoardEnd: "+endYear+","+endMonth+","+endDay);
		}
	}
	public boolean boarding(int month, int day, int year){
		boolean mRange=(month<=12)&&(month>=1);
		boolean dRange=(day<=31)&&(day>=1);
		boolean yRange=(year<=9999)&&(year>=1000);
		if((!mRange)||(!dRange)||(!yRange)) {
			System.out.println("Wrong input.");
			return false;
		}
		else{
		c_board.set(year, month, day);
		long cBoardM=c_board.getTimeInMillis();
		long cStartM=c_start.getTimeInMillis();
		long cEndM=c_end.getTimeInMillis();
		return ((cBoardM<=cEndM)&&(cBoardM>=cStartM))?true:false;
		}
	}
	public static void main(String args[]){
		Cat c=new Cat("Tom","Bob","Black","Short");
		c.setSex(2);
		System.out.println(c.toString());
		c.setBoardStart(10,21,2015);
		c.setBoardEnd(4,1,2016);
		System.out.println(c.boarding(2, 14, 2015));
		System.out.println(c.boarding(2, 14, 2016));
		System.out.println(c.boarding(2, 34, 2016));// wrong input

	}

}
