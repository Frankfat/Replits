package Replits;
import java.util.*;
public class Average_119 {
	public static void main(String[] args) {
		/*
		 Example: 
input: 80 88 88 84 82 78 60 68
output: 78.5
		 */
		 Scanner scan = new Scanner(System.in);
			int k = 0;
			double total = 0;
			double avgTemp = 0;
			double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
					scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
			for (int i = 0; i < temps.length; i++) {
				total+=temps[i];
				k++;
				avgTemp = total/k;
				
			}
			System.out.println(avgTemp);
	}

}
