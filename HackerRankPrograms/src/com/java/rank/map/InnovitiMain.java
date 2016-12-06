package com.java.rank.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

class IdSubjectMarks
{
	private int id;
	private String subjt;
	private int marks;
	
	public IdSubjectMarks(int id, String subjt, int marks)
	{
		this.id = id;
		this.subjt = subjt;
		this.marks = marks;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getSubject()
	{
		return subjt;
	}
	
	public int getMarks()
	{
		return marks;
	}
}
public class InnovitiMain {

	private static Map<String, Integer> processData(List<String> array)
	{
		List<IdSubjectMarks> _lis = new ArrayList<IdSubjectMarks>();
		Map<String, Integer> _map_1 = new HashMap<String, Integer>();
		
		Iterator<String> _it = array.iterator();
		while(_it.hasNext())
		{
			//String[] _str = ((String)_it.next()).split("|");
			StringTokenizer _stkn = new StringTokenizer(((String)_it.next()), "|");
			//_lis.add(new IdSubjectMarks(Integer.parseInt(_str[0]), _str[1], 
					//Integer.parseInt(_str[2])));
			
			 while (_stkn.hasMoreTokens()) {
		         _lis.add(new IdSubjectMarks(Integer.parseInt(_stkn.nextToken()),
		        		 _stkn.nextToken(), Integer.parseInt(_stkn.nextToken())));
		     }
		}
		
		int _max = 0;
		Iterator<IdSubjectMarks> _it_1 = _lis.iterator();
		while(_it_1.hasNext())
		{
			IdSubjectMarks _val = _it_1.next();
			_map_1.put(_val.getSubject(), _val.getId());	
			if(_val.getMarks() > _max)
			{
				_max = _val.getMarks();
               _map_1.put(_val.getSubject(), _val.getId());				
			}
		}
		return _map_1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		List<String> _ls = new ArrayList<String>();
		int T = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < T; i++)
		{
			_ls.add(scan.nextLine().trim());
		}
		
		Map<String, Integer> _map = processData(_ls);
		Iterator<Map.Entry<String, Integer>> _it = _map.entrySet().iterator();
		while(_it.hasNext())
		{
			Map.Entry<String, Integer> _mentry = (Map.Entry<String, Integer>)_it.next();
			System.out.println(_mentry.getKey()+" "+_mentry.getValue());
		}
		scan.close();
	}

}

/*
 *
 Input:
 6
22|DataStructres|62
26|English|71
23|DataStructres|70
24|English|56
25|DataStructres|79
27|English|75

output:
DataStructres 25
English 27
*/
