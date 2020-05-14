package com.printer;

public class Printer {

	
	private int tonerLevel;
	private int numOfPages;
	private boolean isDuplex;
	
	public Printer() {
		this(false);
	}
	
	public Printer(boolean isDuplex) {
		this(100, 0, isDuplex);
		
	}
	
	public Printer(int tonerLevel, int numOfPages, boolean isDuplex) {
		this.tonerLevel = tonerLevel;
		this.numOfPages = numOfPages;
		this.isDuplex = isDuplex;
	}
	
	public void fillToner() {
		if(tonerLevel < 100 ) {
			tonerLevel = 100;
			System.out.println("The toner has been refilled to full capacity.");
		} else {
			System.out.println("The toner is already full.");
		}
	}
	
	public int getTonerLevel() {
		return tonerLevel;
	}
	
	private void removeToner(int pages) {
		if(tonerLevel > 0) {
			tonerLevel = tonerLevel / (int)(pages * .05);
			System.out.println(tonerLevel);
		}
		System.out.println("You have " + getTonerLevel() + "% toner left before its next required refill.");
	}
	
	public void print(int pages) {
		if(isDuplex && tonerLevel > 0) {
			System.out.println("NOTE: [You print on the front and back of the page.]");
			System.out.println("Because you have a duplex, the total pages prints went from " + pages + " pages to " + (pages / 2));
		} else if(tonerLevel > 0) {
			System.out.println("NOTE: [You print only on the front of the page.]");
			System.out.println("You printed a total of " + pages + " pages.");
		} else {
			System.out.println("[It appears to have no more toner, so printing has failed.]");
		}
		removeToner(pages);
	}
}
