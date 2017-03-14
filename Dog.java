package assignment6;

import java.util.Calendar;

public class Dog extends Pet implements Boardable{
	private String size;
	public int startMonth,startDay,startYear;
	public int endMonth,endDay,endYear;
	Calendar c_start=Calendar.getInstance();
	Calendar c_end=Calendar.getInstance();
	Calendar c_board=Calendar.getInstance();
	
	public Dog (String name, String ownerName, String color, String size){
		super(name,ownerName,color);
		this.size=size;
	}
	public String getSize(){
		return size;
	}
	public String toString(){
		return this.getClass().getSimpleName()+":\n"+super.toString()+"\nSize: "+getSize();	
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
		Dog d=new Dog("Spot","Susan","White","Medium");
		d.setSex(2);
		System.out.println(d.toString());
		d.setBoardStart(5,13,2016);
		d.setBoardEnd(13,30, 2000);//wrong input
		d.setBoardEnd(12,8,2017);
		System.out.println(d.boarding(9,27,2016));
		System.out.println(d.boarding(1,21,2017));
		System.out.println(d.boarding(1,32,2017));//wrong input
	}
}
