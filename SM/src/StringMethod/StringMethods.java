package StringMethod;

import java.io.*;
import java.util.*;

public class StringMethods {

	 String str1;
     char[] ch1;

	public StringMethods(String name) {
		this.str1 = name;
		this.ch1 = name.toCharArray();
	}

	public static void main(String[] args) {

		StringMethods obj = new StringMethods("karthi+keyan");

		System.out.println(obj.length());
		System.out.println(obj.characterat(3));
		System.out.println(obj.concat("java"));
		System.out.println(obj.contains("karthi+keyan"));
		System.out.println(obj.startswith("kar"));
		System.out.println(obj.equals("KARTHIKEYAN"));
		System.out.println(obj.substring(2, 4));
		System.out.println(obj.replace(0, 't'));
		System.out.println(obj.endswith("keyan"));
		System.out.println(obj.isempty());
		System.out.println(obj.equalignorecase("karthikeYAN"));
		System.out.println(obj.trim());
		System.out.println(obj.uppercase());
		System.out.println(obj.lowercase());
		System.out.println(obj.chararray());
		System.out.println(obj.compareTo("karthi"));
		System.out.println(obj.compareIgnoreTo("karthi"));
	}

public int length() {
		int i = 0;
		for (char c : ch1) {
			i++;
		}
		return i;
	}

public char characterat(int a) {

		for (int i = 0; i < ch1.length; i++) {
			if (i + 1 == a) {
				return (ch1[i]);
			}
		}
		return ' ';
	}

public String concat(String str2) {

		return (str1 + str2);
	}

	public boolean contains(String str2) {//
        int n=str2.length();
		boolean flag = false;
		for(int i=0;i<str1.length();i++) 
		{
			if(i+n-1<str1.length()  && str1.substring(i,i+n).equals(str1)) {
				flag=true;
		}
				}
			
		return (flag);

	}

	public boolean startswith(String str2) 
	{
		char[] ch2 = str2.toCharArray();
		boolean flag = false;
		for (int i = 0; i < str2.length(); i++) {
			if (ch1[i] == ch2[i]) {
				flag = true;
			}
			else {
				return false;
			}
		}

		return flag;
	}

	public boolean equals(String str2) {//

		if (str1 == null && str2 == null) {
			return false;
		} 
		if(str1.length() != str2.length()) {
			return false;}

			for (int i = 0; i < str1.length(); i++) {

				if (str1.charAt(i) != str2.charAt(i)) {
					return false;}
			}
			
		
			return true;

	}

	public String substring(int n1, int n2) {
		String newstr = "";
		for (int i = n1; i < n2; i++)
			newstr = newstr + String.valueOf(str1.charAt(i));
		return (newstr);

	}

	public String replace(int pos, char rep) {

		String result = str1.substring(0, pos) + rep + str1.substring(pos + 1);
		return result;

	}

	public boolean endswith(String str2) {//
		char ch2[] = str2.toCharArray();
		int a = ch1.length - ch2.length;
		boolean flag = false;
		for (int i = a; i < str2.length() + a; i++) {
			if (ch1[i] == ch2[i - a]) {
				flag = true;

			}
			else {
				return false;
			}}
		return (flag);
	}

	public boolean isempty() {
		boolean flag = false;
		if (str1 == "") {
			return true;
		} else {
			return flag;
		}

	}

	public boolean equalignorecase(String str2) {//
    String a=str1.toLowerCase();
    String b=str2.toLowerCase();
		if (a== null && b == null) {
			return false;
		} 
		if(a.length() != b.length()) {
			return false;}

			for (int i = 0; i < a.length(); i++) {

				if (a.charAt(i) != b.charAt(i)) {
					return false;}
			}
			
		
			return true;
	}

	public String trim() {
        
		int f = 0;
		int l = 0;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ' ') {
				f = i;
				break;
			} }
	    for(int i=ch1.length-1;i>0;i--) {
	    	if(ch1[i]!=' ') {
	    		l=i;
	    		break;
	    	}
	    }
		
		return (str1.substring(f,l+1));
	}
		
		

	public String uppercase() {
		String str = "";
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] >= 'a' && ch1[i] <= 'z') {
				str = str + (char) (ch1[i] - 32);
			} else
				str = str + ch1[i];
		}
		return str;
	}

public String lowercase() {
		String str = "";
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] >= 'A' && ch1[i] <= 'Z') {
				str = str + (char) (ch1[i] + 32);
			} else
				str = str + ch1[i];
		}
		return str;

	}
	
public char[] chararray() {
	
char ch[]=new char[str1.length()];
for(int i=0;i<ch.length;i++) {
	ch[i]=str1.charAt(i);
}
return ch;
	
}	
	
public int compareTo(String str2) {
	char a[]=str2.toCharArray();
	int le=ch1.length;
	int le1=a.length;
	int l=le>le1?le1:le;
	for(int i=0;i<l;i++) {
		if(ch1[i]<a[i]) {
			return -1;
		}
		else if(ch1[i]>a[i]) {
			return 1;
		}
	}
	if(le==le1) {
		return 0;
	}
	else
		return le1>le?1: -1;
}

public int compareIgnoreTo(String str2) {
	String str=str1.toLowerCase();
	char a[]=str1.toCharArray();
	String str1=str2.toLowerCase();
	char b[]=str1.toCharArray();
	int le=a.length;
	int le1=b.length;
	int l=le>le1?le1:le;
	for(int i=0;i<l;i++) {
		if(a[i]<b[i]) {
			return -1;
		}
		else if(a[i]>b[i]) {
			return 1;
		}
	}
	if(le==le1) {
		return 0;
	}
	else
		return le1>le?1: -1;
}	
	
}
	


 