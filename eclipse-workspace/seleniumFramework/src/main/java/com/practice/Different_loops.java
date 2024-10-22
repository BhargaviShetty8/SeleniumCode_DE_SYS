package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Different_loops {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("---------------");
		for(int j=10;j>0;j--) {
			System.out.println(j);
		}
		System.out.println("---------------");
		
		int[] num = {1,3,5,8};
		
		for(int a:num) {
			System.out.println(a);
		}
 		
		System.out.println("---------------");
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Jangaon town-I");
		ar.add("Jangaon town-II");
		ar.add("Jangaon rural");
		ar.add("pemberthy");
		 
		System.out.println(ar);
		System.out.println("---------------1");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		
		}
		System.out.println("---------------2");
		ar.forEach(x ->System.out.println(x));
		System.out.println("---------------3");
		for(String s: ar) {
			System.out.println(s);
		}
		System.out.println("---------------4");
		Iterator<String> it =ar.iterator();
		try {
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringBuilder sb = new StringBuilder();
		for(String s:ar) {
			sb.append(s);
		}
		System.out.println(sb.toString());
		
		
	}
}


