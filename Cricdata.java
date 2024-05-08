package CricdataAssignment24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Cricdata {

	public static void main(String[] args) throws FileNotFoundException {
	
		String fname = "cricdata1.csv";
		List<String> batsman = new ArrayList<>();
		List<Integer> score = new ArrayList<>();
		List<String> players = new ArrayList<>();
		List<Integer> total_run  = new ArrayList<>();
		File f1 = new File(fname);
		Scanner sc1 = new Scanner(f1);
		sc1.nextLine();
		while(sc1.hasNext())
		{
			String arr[] = sc1.nextLine().split(",");
			String name = arr[5];
			batsman.add(name);
			int run = Integer.parseInt(arr[8]);
			score.add(run);
			
		}
		Set<String> set1 = new HashSet<>();
		set1.addAll(batsman);
		players.addAll(set1);
		System.out.println(players);
		for(int j=0; j<players.size(); j++) {
			int total = 0;
			String name1 = players.get(j);
			for(int i=0;  i<score.size(); i++) {
				if(batsman.get(i).equals(name1))
				{
					total = total + score.get(i);
				}
			}
			total_run.add(total);
		}
		for(int i=0; i<batsman.size(); i++)
		{
			
		}
		
		
		System.out.println(total_run);
		

	}
	

}
