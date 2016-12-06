package com.java.singleton.pattern;

public enum EnumSingleton {
  INSTANCE;
  
  public void distributePresent()
  {
	  System.out.println("Distribute Present");
  }
  
  public static void main(String[] args)
  {
	  EnumSingleton es = EnumSingleton.INSTANCE;
	  es.distributePresent();
	 // EnumSingleton m = new EnumSingleton();
  }
}
