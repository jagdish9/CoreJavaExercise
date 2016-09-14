package com.java.dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class GoldSilverBronze
{
	private String country;
	private String gold;
	private String silver;
	private String bronze;
	
	GoldSilverBronze(String country, String gold, String silver, String bronze)
	{
		this.country = country;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	
	public String getName()
	{
		return country;
	}
	public String getGold()
	{
		return gold;
	}
	public String getSilver()
	{
		return silver;
	}
	public String getBronze()
	{
		return bronze;
	}
}

class Checker implements Comparator<GoldSilverBronze>
{
	public int compare(GoldSilverBronze o1, GoldSilverBronze o2)
	{
		if(o2.getGold().equals(o1.getGold()))
		{
			if(o2.getSilver().equals(o1.getSilver()))
			{
				if(o2.getBronze().equals(o1.getBronze()))
					return o1.getName().compareTo(o2.getName());
				else
					return o2.getBronze().compareTo(o1.getBronze());
			}
			else
			{
				return o2.getSilver().compareTo(o1.getSilver());
			}
		}
		else
		{
			return o2.getGold().compareTo(o1.getGold());
		}
		
	}
}
public class OlympicEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		String[][] str = new String[N][3];
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				str[i][j] = scan.next();
			}
			scan.nextLine();
		}
		
		Set<String> set_01 = new LinkedHashSet<String>();
			for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				set_01.add(str[i][j]);
			}
			System.out.println();
		}  
			
	    String[][] str_02 = new String[set_01.size()][4];
	    
	    Iterator<String> it_01 = set_01.iterator();
	    
	    int gsb = 0, k = 0;
    	int index_01 = 0, index_02 = 0;
    	
	    while(it_01.hasNext())
	    {
	    	String value = it_01.next();
	    	str_02[index_01][index_02] = value;
	    	int inx = 0;
	    	while(inx < 3)
	    	{
	    	for(int j = 0; j < N; j++)
				{
					if(value.equals(str[j][k]))
					{
						gsb++;
					}
			     }
	    	inx++;
	    	index_02++;
	    	str_02[index_01][index_02] = Integer.toString(gsb);
	    	gsb = 0;
	    	k++;
	      }
	    	k = 0;
	    	index_01++;
	    	index_02 = 0;
	    }
	    
	   for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print(str_02[i][j]+" ");
			}
			System.out.println();
		} 
	   List<GoldSilverBronze> ls = new ArrayList<GoldSilverBronze>();
	   int rd = 0, t = 0;
	   int round = 0;
	   while(round < 6)
	   {
		   ls.add(new GoldSilverBronze(str_02[rd][t],str_02[rd][t+1], 
				   str_02[rd][t+2], str_02[rd][t+3]));
		   rd++;
		   round++;
		   t =  0;
	   }
	   Checker check = new Checker();
	   System.out.println();
	   Collections.sort(ls, check);
	   Iterator<GoldSilverBronze> it_03 = ls.iterator();
	   while(it_03.hasNext())
	   {
		   GoldSilverBronze obj_01 = it_03.next();
		   System.out.println(obj_01.getName()+" "+obj_01.getGold()
				   +" "+obj_01.getSilver()+" "+obj_01.getBronze());
	   }
		scan.close();
	}

}
