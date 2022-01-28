package Run;


public class arrayRun {

	public static void main(String[] args) {
		
		int[][]scores = {{95, 80}, {92, 96}};
		
		int score = scores[0][0];
		System.out.println(score);
		
		score = scores[0][1];
		System.out.println(score);
		
		score = scores[1][0];
		System.out.println(score);
		
		score = scores[1][1];
		System.out.println(score);
		
		
		String[][] names = {{"È«±æµ¿", "±èÃ¶¼ö", "½ÅÂ¯±¸"}, {"±è¿µÈñ", "ÃÖÀ¯¸®"}};
		
		String name = names[0][0];
		System.out.println(name);
		
		name = names[0][1];
		System.out.println(name);
		
		name = names[0][2];
		System.out.println(name);
		
		name = names[1][0];
		System.out.println(name);
		
		name = names[1][1];
		System.out.println(name);
		
		
		int[] oldArr = {1,2,3};
		int[] newArr = new int[5];
		
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		
		System.out.print("newArr = ");
		for(int i =0; i < newArr.length; i++) {
			System.out.print( newArr[i] +", ");
		}
		
		System.out.println();
		
		
		String[] oldStr = {"java", "array", "copy"};
		String[] newStr = new String[5];
		
		System.arraycopy(oldStr, 0, newStr, 0, oldStr.length);
		
		for(int i = 0; i < newStr.length; i++) {
			System.out.print(newStr[i] +",");
		}
		
		System.out.println();
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < array.length; i++) {
			if(max < array[i] ) {
				max = array[i];
			} 
		}
		System.out.println("max = " + max);

		
		int[][] arrays = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		for(int i = 0; i < arrays.length; i++) {
			for(int j =0; j < arrays[i].length; j++) {
				sum += arrays[i][j];
				count++;
			}
		}
		
		avg = (double) sum / count;
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}

}
