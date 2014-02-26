package com.smashdev.ssmash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Board {
	
	static List<Integer> R1 = new ArrayList<Integer>();
	static List<Integer> R2 = new ArrayList<Integer>();
	static List<Integer> R3 = new ArrayList<Integer>();
	static List<Integer> R4 = new ArrayList<Integer>();
	static List<Integer> R5 = new ArrayList<Integer>();
	static List<Integer> R6 = new ArrayList<Integer>();
	static List<Integer> R7 = new ArrayList<Integer>();
	static List<Integer> R8 = new ArrayList<Integer>();
	static List<Integer> R9 = new ArrayList<Integer>();
	
	static List<Integer> C1 = new ArrayList<Integer>();
	static List<Integer> C2 = new ArrayList<Integer>();
	static List<Integer> C3 = new ArrayList<Integer>();
	static List<Integer> C4 = new ArrayList<Integer>();
	static List<Integer> C5 = new ArrayList<Integer>();
	static List<Integer> C6 = new ArrayList<Integer>();
	static List<Integer> C7 = new ArrayList<Integer>();
	static List<Integer> C8 = new ArrayList<Integer>();
	static List<Integer> C9 = new ArrayList<Integer>();
	
	static List<Integer> G1 = new ArrayList<Integer>();
	static List<Integer> G2 = new ArrayList<Integer>();
	static List<Integer> G3 = new ArrayList<Integer>();
	static List<Integer> G4 = new ArrayList<Integer>();
	static List<Integer> G5 = new ArrayList<Integer>();
	static List<Integer> G6 = new ArrayList<Integer>();
	static List<Integer> G7 = new ArrayList<Integer>();
	static List<Integer> G8 = new ArrayList<Integer>();
	static List<Integer> G9 = new ArrayList<Integer>();
	
	public Board() {
		
		for (int i = 0; i <= 8; i++) {
			R1.add(i, i+1);
			C1.add(i, i+1);
			G1.add(i, i+1);
			R2.add(i, i+1);
			C2.add(i, i+1);
			G2.add(i, i+1);
			R3.add(i, i+1);
			C3.add(i, i+1);
			G3.add(i, i+1);
			R4.add(i, i+1);
			C4.add(i, i+1);
			G4.add(i, i+1);
			R5.add(i, i+1);
			C5.add(i, i+1);
			G5.add(i, i+1);
			R6.add(i, i+1);
			C6.add(i, i+1);
			G6.add(i, i+1);
			R7.add(i, i+1);
			C7.add(i, i+1);
			G7.add(i, i+1);
			R8.add(i, i+1);
			C8.add(i, i+1);
			G8.add(i, i+1);
			R9.add(i, i+1);
			C9.add(i, i+1);
			G9.add(i, i+1);
		}
		
		Collections.shuffle(R1);
		Collections.shuffle(R2);
		Collections.shuffle(R3);
		Collections.shuffle(R4);
		Collections.shuffle(R5);
		Collections.shuffle(R6);
		Collections.shuffle(R7);
		Collections.shuffle(R8);
		Collections.shuffle(R9);
	}
	
	
	public static void shuffleList(List<Integer> nums) {
		int n = nums.size();
		Random random = new Random();
		random.nextInt();
		for (int i = 0; i < n; i++) {
			int change = i + random.nextInt(n - i);
			swap(nums, i, change);
		}
	}

	private static void swap(List<Integer> nums, int i, int change) {
		int helper = nums.get(i);
		nums.set(i, change);
		nums.set(change, helper);
	}
	
	public int getNumber(List<Integer> row, int index) {
		return row.get(index);
	}
	
/*	private int[][] generateSolution(int[][] game, int index) {
		for (int i = 0 ; i <= 8 ; i++) {
			for (int j = 0 ; j <= 8 ; j++) {
				generateNextNumber();
			}
		}
	}
	
	private int generateNextNumber(int[][] board, int x, int y) {
		
	}*/

}
