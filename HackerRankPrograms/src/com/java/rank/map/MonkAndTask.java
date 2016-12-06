package com.java.rank.map;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;

class MonkAndTask {

    private static Map<Integer, Integer> sortByValue(Map<Integer, Integer> unSortedMap)
	{
	  final List<Map.Entry<Integer, Integer>> _ls = new ArrayList<Map.Entry<Integer, Integer>>(unSortedMap.entrySet());
	  Collections.sort(_ls, new Comparator<Map.Entry<Integer, Integer>>()
	  {
		  public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
		   {
		     //return (o1.getValue().compareTo(o2.getValue()));
			 int _val_1 = o1.getValue();
			 int _val_2 = o2.getValue();
			 boolean _flag_1 = true;
			 boolean _flag_2 = true;
			 int _avl_1 = 0;
			 int _avl_2 = 0;
			 if(_val_1 > _val_2)
			   return 1;
			 else if(_val_1 == _val_2)
			 {
			   ListIterator<Map.Entry<Integer, Integer>> _it_01 = _ls.listIterator();
			   while(_it_01.hasNext() && _flag_1 == true)
			   {
			   Map.Entry<Integer, Integer> _mentry_1 = (Map.Entry<Integer, Integer>)_it_01.next();
			     if(o1.getKey() == _mentry_1.getKey())
				 {
				  _flag_1 = false;
				 }
			   }
			   while(_it_01.hasPrevious())
			   {
				   Map.Entry<Integer, Integer> _mentry_1_prev = (Map.Entry<Integer, Integer>)_it_01.previous();
			     _avl_1++;
			   }
			   
			   ListIterator<Map.Entry<Integer, Integer>> _it_02 = _ls.listIterator();
			   while(_it_02.hasNext() && _flag_2 == true)
			   {
			    Map.Entry<Integer, Integer> _mentry_2 = (Map.Entry<Integer, Integer>)_it_02.next();
			     if(o2.getKey() == _mentry_2.getKey())
				 {
				  _flag_2 = false;
				 }
			   }
			   while(_it_02.hasPrevious())
			   {
				  Map.Entry<Integer, Integer> _mentry_2_prev = (Map.Entry<Integer, Integer>)_it_02.previous();
			     _avl_2++;
			   }
			    if(_avl_1 > _avl_2)
				 return 1;
				else
				 return -1;
			 }
			  else
			   return -1;
		   }
		  });
	  
	  Map<Integer, Integer> _map_2 = new LinkedHashMap<Integer, Integer>();
	  for(Map.Entry<Integer, Integer> _entry : _ls)
	  {
	    _map_2.put(_entry.getKey(), _entry.getValue());
	  }
	  
	  return _map_2;
	}
    public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
		for(int l = 0; l < T; l++)
		{
         int N = scan.nextInt();
         scan.nextLine();
         int[] arN = new int[N];
         for(int i = 0; i < N; i++)
         {
        	arN[i] = scan.nextInt();
         }
		 
		 String[] _str = new String[N];
		 for(int j = 0; j < N; j++)
		 {
		   _str[j] = Integer.toBinaryString(arN[j]);
		 }
		 
		 Map<Integer, Integer> _map = new HashMap<Integer, Integer>();
		 for(int k = 0; k < N; k++)
		 {
		   String _str_2 = _str[k];
		   int count = 0;
		   for(int x = 0; x < _str_2.length(); x++)
		   {
		     if(Integer.parseInt(String.valueOf(_str_2.charAt(x))) == 1)
			 {
			   count++;
			 }
		   }
		   
		 //  for(int y = 0; y < N; y++)
		  // {
		     _map.put(arN[k], count);
		  // }
		 }
		 Map<Integer, Integer> _map_ = sortByValue(_map);
		 Iterator<Map.Entry<Integer, Integer>> _it_ = _map_.entrySet().iterator();
		 while(_it_.hasNext())
		 {
		   Map.Entry<Integer, Integer> _nxt_ = (Map.Entry<Integer, Integer>)_it_.next();
		   System.out.print(_nxt_.getKey()+" ");
		 }
        }
        scan.close();
    }
}

