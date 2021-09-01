package ex06.collection.set;

import java.util.TreeSet;

public class TreeSetEx01 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		int[] score = { 88, 77, 66, 55, 44, 64, 90, 50, 30, 80, 100 };
		
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		
		System.out.println(set);
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
		System.out.println("50보다 작은 값 : " + set.tailSet(new Integer(50)));
	}
}
