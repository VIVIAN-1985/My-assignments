package week3.day1;

import java.util.Iterator;

import pavandemoday3.forloop;

public class learnstring {

	private static String price;

	public static void main(String[] args) {

		String cName = "TestLeaf";
		String name = "Testleaf@2021";
		String comname=new String ("TestLeaf");
		
		// length
		int length = name.length();
		System.out.println("length of the String :"+length);	
			
		//charat
		char charAt = name.charAt(8);
		System.out.println("print the index value:"+charAt);
		
		// contains - true
		boolean contains = cName.contains("Le");
		System.out.println("checking the charecter in the string:"+contains);
		
		//false
		boolean contains2 = cName.contains("Lf");
		System.out.println("checking the charecter in the string:"+contains);
		
		// equals
	
		if(cName.equals(comname)) {
			System.out.println("equals");
			}
		else
		{
			System.out.println("not equals");
			}
		
		if(cName==comname) {
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
		// if we want to use multiple times "Testleaf", create a object as V with the same memory address
		String V = "TestLeaf";
		if (cName==V) {
		System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
	}
		
	//equalignorecaset - comparing the string charecter but not case sensitive
		
		String date = "Testreaf";
		if(date.equalsIgnoreCase(V)) {
			System.out.println("equal");
		}else
		{
			System.out.println("not equals");
		}
	
		//to charArray
		
		String nameId = "Vivian";
		char[] ch = nameId.toCharArray();		
	for (int i = 0; i<ch.length;i++) {
		System.out.println(ch[i]);
	}
	
	// split method
	//input - Test Leaf
	//output - TestLeaf
	
	String name1 = "Test Leaf";
	String[] split = name1.split(" ");
	for (int j = 0; j < split.length; j++) {
				System.out.print(split[j]);
	}
	
	
	//Replace all
	String name11 = "Test leaf";
	System.out.println();
	String replaceAll = name11.replaceAll("[ ]", "");
	System.out.println("replaceAll method :"+replaceAll);
	
	// Replace
	
	String name111 = "Vivian";
	String replace = name111.replace('V', 'v');
	System.out.println("replace method:"+replace);
	
	//Substring
	String value = "selenium webdriver";
	//index value starts with 0
	String substring = value.substring(12);
	System.out.println(substring);
	
	// lower case and upper case
	
	String comname1 ="VIVIANVINCENT";
	String lowerCase = comname1.toLowerCase();
	System.out.println(lowerCase);
	
	String conname="vivianvincent";
	String upperCase = conname.toUpperCase();
	System.out.println(upperCase);
	
	//parseint method
	
	String value1 ="2000";
	//string into int format
	int parseInt = Integer.parseInt(value1);
	System.out.println(parseInt);
	
	
	
	
	
	}
	}
	
	

