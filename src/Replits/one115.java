package Replits;

import java.util.*;

public class one115 {
	public static void main(String[] args) {
		/*
		 * Given the array words, it will print the word with the largest length. Assume
		 * that there are no 2 words with longest length
		 * 
		 * Example: words -> ["aaa", "bbbbb", "whasstupppp", "longg" ,
		 * "jaaaaavvaaaaaaaaaa"] prints jaaaaavvaaaaaaaaaa
		 */

		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		String Longer = "";
		int max = 0;
		
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		
		for (int i = 0; i < words.length; i++) {
			if(words[i].length()>max) {
				max = words[i].length();
				Longer = words[i];
				
			}
			
		}
		System.out.println(Longer);

	}

}
