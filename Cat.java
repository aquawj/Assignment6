package assignment6;

public class Cat extends Pet implements Boardable {
	
	private String hairLength;
	public int startMonth,startDay,startYear;
	public int endMonth,endDay,endYear;
	
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
		}
	}
	public boolean boarding(int month, int day, int year){
		boolean m1=(month>=startMonth)||(month<=endMonth);
		boolean m2=(month>=startMonth)&&(month<=endMonth);
		boolean d1=(day>=startDay)&&(day<=endDay);
		boolean d2=(day>=startDay)&&(day<=endDay);
		boolean y=(year>=startYear)&&(year<=endYear);
		if(startYear==endYear){
			if (year!=startYear) return false;
			else return true;
			
		}
		else if(startYear<endYear){
			return false;
		}
		else return false;
	}
	public static void main(String args[]){
		Pet c=new Cat("Tom","Bob","Black","Short");
		c.setSex(2);
		System.out.println(c.toString());
	
	}

}
