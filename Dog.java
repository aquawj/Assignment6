package assignment6;

public class Dog extends Pet implements Boardable{
	private String size;
	public int startMonth,startDay,startYear;
	public int endMonth,endDay,endYear;
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
	}
	public void setBoardEnd(int month, int day, int year){
		endMonth=month;
		endDay=day;
		endYear=year;
	}
	public boolean boarding(int month, int day, int year){
		boolean m=(month>=startMonth)&&(month<=endMonth);
		boolean d=(day>=startDay)&&(day<=endDay);
		boolean y=(year>=startYear)&&(year<=endYear);
		return (m&d&y)?true:false;
	}
}
