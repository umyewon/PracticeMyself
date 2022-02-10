package chap15.sec04.treeSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// 내림차순
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(Integer score : descendingSet) {
			System.out.println(score + "");
		}
		System.out.println();
		
		// 오름차순
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for(Integer score : ascendingSet) {
			System.out.println(score + "");
		}
		System.out.println();
		
		System.out.println("[descendingIterator 확인]");
		Iterator<Integer> iterator = descendingSet.descendingIterator();
		while(iterator.hasNext()) {
			Integer element = iterator.next();
			System.out.println(element);
		}
		
		NavigableSet<String> animalSet 
		= new TreeSet<>(Arrays.asList("Dog", "Cat", "Tiger", "Lion"));
		/*
		 * Set<String> revAnimalSet = new TreeSet<>(Collections.reverseOrder());
		 * revAnimalSet.addAll(animalSet); for(String animal : revAnimalSet) {
		 * System.out.println(animal); }
		 */
		
		System.out.println();
		for(Iterator<String> iter = animalSet.descendingIterator(); iter.hasNext();){
			System.out.println(iter.next());
		}
		
	}

}
