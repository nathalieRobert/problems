package com.socgen.problems;

public class Solution {

    public static void main(String[] args) {

	String[] firstname = { "nATHALIE", "pHILIPPE", "sTEVEN", "cYRIL", "lOUIS", "dAVID" };

	String[] lastname = {"robert", "amice", "BeaubruN En FaMILLe DIANt", "Da SYLva", "GOLdlewSKi","Dik"};
	
	String[] names = new String [6];
	
	String[] initials = new String[6];
	
	
	for (int i = 0; i < firstname.length; i++) {
//	    System.out.print(firstname[i]+" ==> ");
	    firstname[i] = formatFirstname(firstname[i]);
//	    System.out.println(firstname[i]);
	    
	   // System.out.print(lastname[i] + " ==> ");
	    lastname[i] = formatLastname(lastname[i]);
	   // System.out.println(lastname[i]);
	    
	    
	    names[i] = firstname[i]+ " " + lastname[i];
	    
	    StringBuffer sb = new StringBuffer();
	    sb.append(firstname[i].substring(0, 1).toString());
	    sb.append(".");
	    for (int j = 2; j < firstname.length; j++) {
		sb.append(firstname[i].substring(j, j)+1);
		
		
//		to be finish
		
		//if (firstname[j]) {
//		    
//		}
		
	    }
	    
	    
	    System.out.println(names[i]);
	    
	}

    }

    public static String formatFirstname(String firstname) {

	StringBuffer sb = new StringBuffer();
	sb.append(firstname);
	sb.replace(0, 1, sb.substring(0, 1).toUpperCase());
	sb.replace(1, sb.length(), sb.substring(1, sb.length()).toLowerCase());

	return sb.toString();
    }
    
    public static String formatLastname(String lastname) {
	StringBuffer sb = new StringBuffer();
	sb.append(lastname);
	sb.replace(0, sb.length(), sb.toString().toUpperCase());
	
	return sb.toString();
	
    }
    
    
    

}
