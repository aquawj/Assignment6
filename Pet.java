package assignment6;

public class Pet {
	private String petName;
	private String ownerName;
	private String color;
	protected String sex;
	public static final String sexM="MALE";
	public static final String sexF="FEMALE";
	public static final String sexS="SPAYED";
	public static final String sexN="NEUTERED";

	public Pet(){
		
	}
	public Pet(String name, String ownerName, String color){
		this.petName=name;
		this.ownerName=ownerName;
		this.color=color;
	} //Constructor 
	public String getPetName(){
		return petName;
	} 
	public String getOwnerName(){
		return ownerName;
	}
	public String getColor(){
		return color;
	} 
	public void setSex(int sexid){
		if(sexid==0) sex=sexM;
		else if(sexid==1) sex=sexF;
		else if(sexid==2) sex=sexS;
		else if(sexid==3) sex=sexN;
		else System.out.println("Wrong input.");
	}
	public String getSex(){
		return sex;
	} // Should return the string equivalent of the gender, e.g the string ¡°MALE¡± etc. 
	public String toString(){
		String str;
		str=getPetName()+" owned by "+getOwnerName()+"\n"+"Color: "+getColor()+"\n"+"Sex: "+getSex();
		return str;
	}
	/*Spot owned by Mary 
	Color: Black and White 
	Sex: Male */
	public static void main(String args[]){
		Pet p=new Pet("Spot","Mary","Black and White");
		p.setSex(0);
		System.out.println(p.toString());
	}

}
