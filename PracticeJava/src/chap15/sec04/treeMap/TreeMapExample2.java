package chap15.sec04.treeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "ȫ�浿");
		scores.put(98, "�̵���");
		scores.put(75, "�ڱ��");
		scores.put(95, "�ſ��");
		scores.put(80, "���ڹ�");
		
		// ��������
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer,String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer,String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		
		// ��������
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer,String>> asaccendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer,String> entry : asaccendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
	}

}
