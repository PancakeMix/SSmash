package com.smashdev.ssmash;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
	
	public Board() {
		
		int[][] solution;
		
		List<List<Integer>> possNums = new ArrayList<List<Integer>>(27);
		List<Integer> R1 = new ArrayList<Integer>();
		List<Integer> R2 = new ArrayList<Integer>();
		List<Integer> R3 = new ArrayList<Integer>();
		List<Integer> R4 = new ArrayList<Integer>();
		List<Integer> R5 = new ArrayList<Integer>();
		List<Integer> R6 = new ArrayList<Integer>();
		List<Integer> R7 = new ArrayList<Integer>();
		List<Integer> R8 = new ArrayList<Integer>();
		List<Integer> R9 = new ArrayList<Integer>();
		
		List<Integer> C1 = new ArrayList<Integer>();
		List<Integer> C2 = new ArrayList<Integer>();
		List<Integer> C3 = new ArrayList<Integer>();
		List<Integer> C4 = new ArrayList<Integer>();
		List<Integer> C5 = new ArrayList<Integer>();
		List<Integer> C6 = new ArrayList<Integer>();
		List<Integer> C7 = new ArrayList<Integer>();
		List<Integer> C8 = new ArrayList<Integer>();
		List<Integer> C9 = new ArrayList<Integer>();
		
		List<Integer> G1 = new ArrayList<Integer>();
		List<Integer> G2 = new ArrayList<Integer>();
		List<Integer> G3 = new ArrayList<Integer>();
		List<Integer> G4 = new ArrayList<Integer>();
		List<Integer> G5 = new ArrayList<Integer>();
		List<Integer> G6 = new ArrayList<Integer>();
		List<Integer> G7 = new ArrayList<Integer>();
		List<Integer> G8 = new ArrayList<Integer>();
		List<Integer> G9 = new ArrayList<Integer>();
		
		possNums.set(0, R1);
		possNums.set(1, R2);
		possNums.set(2, R3);
		possNums.set(3, R4);
		possNums.set(4, R5);
		possNums.set(5, R6);
		possNums.set(6, R7);
		possNums.set(7, R8);
		possNums.set(8, R9);
		
		possNums.set(9, C1);
		possNums.set(10, C2);
		possNums.set(11, C3);
		possNums.set(12, C4);
		possNums.set(13, C5);
		possNums.set(14, C6);
		possNums.set(15, C7);
		possNums.set(16, C8);
		possNums.set(17, C9);
		
		possNums.set(18, G1);
		possNums.set(19, G2);
		possNums.set(20, G3);
		possNums.set(21, G4);
		possNums.set(22, G5);
		possNums.set(23, G6);
		possNums.set(24, G7);
		possNums.set(25, G8);
		possNums.set(26, G9);
		
		populatePossNums(possNums);
		shufflePossNums(possNums);
	}
	
	public void populatePossNums(List<List<Integer>> pPossNums) {
		for (int i = 0; i <= 8; i++) {
			List<Integer> tempList = pPossNums.get(i);
			tempList.add(i,i + 1);
		}
		for (int i = 9; i <= 17; i++) {
			List<Integer> tempList = pPossNums.get(i);
			tempList.add(i,i + 1);
		}
		for (int i = 18; i <= 26; i++) {
			List<Integer> tempList = pPossNums.get(i);
			tempList.add(i,i + 1);
		}
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
	
	public static void shufflePossNums(List<List<Integer>> sPossNums) {
		for (int i = 0; i <= 26; i++) {
			shuffleList(sPossNums.get(i));
		}	
	}
	
	private int[][] generateSolution(int[][] game, int index) {
		for (int i = 0 ; i <= 8 ; i++) {
			for (int j = 0 ; j <= 8 ; j++) {
				generateNextNumber();
			}
		}
	}
	
	private int generateNextNumber(int[][] board, int x, int y) {
		
	}

}
