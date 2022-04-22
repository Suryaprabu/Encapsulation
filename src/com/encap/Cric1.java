package com.encap;

import java.util.ArrayList;
import java.util.List;

public class Cric1 {
	public static void main(String[] args) {
		List<Cricket> c=new ArrayList();
		Cricket c1=new Cricket();
		c1.setPlayername("Dhoni");
		c1.setScore(70);
		c1.setWic(0);
		Cricket c2=new Cricket();
		c2.setPlayername("Rohit");
		c2.setScore(115);
		c2.setWic(1);
		Cricket c3=new Cricket();
		c3.setPlayername("Jadeja");
		c3.setScore(32);
		c3.setWic(3);
		c.add(c1);
		c.add(c2);
		c.add(c3);
		for(int i=0;i<c.size();i++)
		{
			System.out.println(c.get(i).getPlayername());
			System.out.println(c.get(i).getScore());
			System.out.println(c.get(i).getWic());
		}
	}

}
