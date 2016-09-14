package com.java.dynamic;

import java.util.*;

class GoldSilverBronze01
{
	private String country;
	private String gold;
	private String silver;
	private String bronze;
	
	GoldSilverBronze01(String country, String gold, String silver, String bronze)
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

class Checker01 implements Comparator<GoldSilverBronze01>
{
	public int compare(GoldSilverBronze01 o1, GoldSilverBronze01 o2)
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
public class OlympicEvents01 {

	public static void main(String[] args) {

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
	    
	   List<GoldSilverBronze01> ls = new ArrayList<GoldSilverBronze01>();
	   int rd = 0, t = 0;
	   int round = 0;
	   while(round < 6)
	   {
		   ls.add(new GoldSilverBronze01(str_02[rd][t],str_02[rd][t+1], 
				   str_02[rd][t+2], str_02[rd][t+3]));
		   rd++;
		   round++;
		   t =  0;
	   }
	   Checker01 check = new Checker01();
	   Collections.sort(ls, check);
	   Iterator<GoldSilverBronze01> it_03 = ls.iterator();
	   while(it_03.hasNext())
	   {
		   GoldSilverBronze01 obj_01 = it_03.next();
		   System.out.println(obj_01.getName()+" "+obj_01.getGold()
				   +" "+obj_01.getSilver()+" "+obj_01.getBronze());
	   }
		scan.close();
	}

}
