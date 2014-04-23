package com.wang.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestResourceBundle {
	
	  public static void main(String[] args) {
//          Locale locale1 = new Locale("zh", "CN");
//          ResourceBundle resb1 = ResourceBundle.getBundle("myres", locale1);
//          System.out.println(resb1.getString("aaa"));
//
//          ResourceBundle resb2 = ResourceBundle.getBundle("myres", Locale.getDefault());
//          System.out.println(resb1.getString("ccc"));
//
//          Locale locale3 = new Locale("en", "US");
//          ResourceBundle resb3 = ResourceBundle.getBundle("myres", locale3);
//          System.out.println(resb3.getString("aaa"));
//          
//          System.out.println(Locale.getDefault());
		  
		  ResourceBundle resb=ResourceBundle.getBundle("myres");
		  
		  System.out.println(resb.getString("ccc"));
		  
		  
		  
		  
		  
          
  } 
}
