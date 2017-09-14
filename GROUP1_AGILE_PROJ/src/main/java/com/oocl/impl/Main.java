package com.oocl.impl;

import java.util.ArrayList;
import java.util.Scanner;

import com.oocl.model.WeekDays;

public class Main {
	 ArrayList <WeekDays> wd = new ArrayList <WeekDays>() ;

	public static void main(String[] args) {
		
//		WeekDays wd = new WeekDays();
		Main m = new Main();
		Scanner scan = new Scanner(System.in);
		m.initWeekDays();
		int day;
		int slot;

		while (true) {
			System.out.println();
			m.printMenu();
			switch (scan.nextInt()) {
			case 1:
				m.printWeek();
				day = scan.nextInt();
				m.printSlots(m.wd.get(day));
				break;
			case 2:
				m.printWeek();
				day = scan.nextInt();
				m.printSlots(m.wd.get(day));
				System.out.println("Please select desired available slot: ");
				slot = scan.nextInt();
				m.reserveSlot(day, slot);
				m.printSlots(m.wd.get(day));
				break;

			default:
				System.out.println("Program Ended");
				System.exit(0);
			}
		}
		
		
		
		
		
	}
	
	public void reserveSlot(int day, int slot) {
		
		if (wd.get(day).getTimeSlot().getSlot(slot)) {
			
			wd.get(day).getTimeSlot().setFalse(slot);
			System.out.println("Slot " + slot + " on day " + day + " has been reserved");
			
		} else {
			System.out.println("Cannot reserve. Slot already taken");
		}
		
	}
	
	public void printMenu() {
		System.out.println("Tennis Reservation:"
				+ "\n1 - View Schedules"
				+ "\n2 - Reserve Slot");
	}
	
	public void printWeek(){
		System.out.println("Please choose day:"
				+ "\n0 - Monday"
				+ "\n1 - Tuesday"
				+ "\n2 - Wednesday"
				+ "\n3 - Thursday"
				+ "\n4 - Friday"
				+ "\n5 - Saturday"
				+ "\n6 - Sunday"
				+ "\n7 - Back");
	}
	
	public void printSlots(WeekDays day) {
		
		for (int i = 0; i < day.getTimeSlot().getSlots().length; i++) {
			System.out.print("Slot " + i + " is ");
			if (day.getTimeSlot().getSlot(i)) {
				System.out.print("available\n");
			} else {
				System.out.print("not available\n");
			}
		}
		
	}
	
	public void initWeekDays(){
		
		for(int i = 0; i < 7; i++) {
			
			wd.add(new WeekDays());
			
		}
		
	}
	
}
