package com.java.rank.map;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;

class Tournament3 {
	
    public static void main(String args[] ) throws Exception {
     
     Scanner scan = new Scanner(System.in);
     int N = scan.nextInt();
	 scan.nextLine();
     List<String> _ls = new ArrayList<String>();
	 String[] _str = new String[N];
	 for(int i = 0; i < N; i++)
     {
     	_str[i] = scan.nextLine();
     }
	 
	 for(int k = 0; k < N; k++)
     {
     	String[] _splt = _str[k].split(" ");
		int len = _splt.length;
		for(int j = 0; j < len; j++)
		{
		  _ls.add(_splt[j]);
		}
     }
	 
     int _count = 0;
     Set<String> _set = new HashSet<String>(_ls);
	 //System.out.println(_set);
     Map<String, Integer> _map =  new HashMap<String, Integer>();
     for(String _temp : _set)
     {
     	_count = Collections.frequency(_ls, _temp);
     	_map.put(_temp, _count);
     }
     
     int _max = 0;
     Iterator<Map.Entry<String, Integer>> _it = _map.entrySet().iterator();
     while(_it.hasNext())
     {
     	Map.Entry<String, Integer> _mentry = (Map.Entry<String, Integer>)_it.next();
		int _val =  _mentry.getValue();
		System.out.println(_mentry.getKey() +" "+_mentry.getValue());
		if(_val > _max)
		  {
		    _max = _val;
		  } 
     }
	 
	 Set<String> _set_2 = new TreeSet<String>();
	 
	 Iterator<Map.Entry<String, Integer>> _it_2 = _map.entrySet().iterator();
		while(_it_2.hasNext())
		{
		  Map.Entry<String, Integer> _mentry_2 = (Map.Entry<String, Integer>)_it_2.next();
		  int _val_2 = _mentry_2.getValue();
		  if(_val_2 == _max)
		  {
		    _set_2.add(_mentry_2.getKey());
		  }
		}
		
		System.out.println(_set_2.size());
		Iterator<String> _it_3 =  _set_2.iterator();
		while(_it_3.hasNext())
		{
		  System.out.println(_it_3.next());
		}
		
     scan.close();
    }
}

