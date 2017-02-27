package assignment6;

import java.util.*;

public class Mreview implements Comparable<Mreview> {
	private String title;
	private ArrayList<Integer> ratings;

	public Mreview() {
		this.title = "";
		this.ratings = new ArrayList<Integer>();
	}

	public Mreview(String ttl) {
		this.title = ttl;
		this.ratings = new ArrayList<Integer>();
	}

	public Mreview(String ttl, int firstRating) {
		this.title = ttl;
		this.ratings = new ArrayList<Integer>();
		this.ratings.add(firstRating);
	}

	public String getTitle() {
		return title;
	}

	public void addRating(int r) {
		ratings.add(r);
	}

	public double aveRating() {
		double totalRating = 0f;
		for (int i = 0; i < ratings.size(); i++) {
			totalRating += ratings.get(i);
		}
		return totalRating / ratings.size();
	}

	public int numRatings() {
		return ratings.size();
	}

	public int compareTo(Mreview obj) {
		return this.title.compareTo(obj.title);
	}

	public boolean equals(Mreview obj) {
		return this.title.equals(obj.title);
	}

	public String toString() {
		String toStr;
		toStr = getTitle() + ", average " + aveRating() + " out of " + numRatings() + "ratings.";
		return toStr;
	}
	
	public static void main(String args[]){
		Mreview mr1=new Mreview();
		mr1.title="Sleepless in Seattle";
		Mreview mr2=new Mreview("Kill Bill");
		Mreview mr3=new Mreview("La La Land",4);
		Mreview mr4=new Mreview("Titanic",4);
		mr1.addRating(5);
		mr1.addRating(3);
		mr2.addRating(3);
		mr2.addRating(4);
		mr2.addRating(3);
		mr3.addRating(2);
		mr4.addRating(3);
		System.out.println(mr1.toString());
		System.out.println(mr2.toString());
		System.out.println(mr3.toString());
		System.out.println(mr4.toString());
		System.out.println("Is "+mr3.getTitle()+" ahead of "+mr4.getTitle()+"? "+mr3.compareTo(mr4));
		System.out.println("Is "+mr1.getTitle()+" ahead of "+mr3.getTitle()+"? "+mr1.compareTo(mr3));
		System.out.println("Is "+mr2.getTitle()+" eaques to "+mr4.getTitle()+"? "+mr2.compareTo(mr4));
		
	}
}
