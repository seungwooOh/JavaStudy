package com.koreait.first.starcraft;

public class StarcraftTest {

	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Firebat f1 = new Firebat();
		Medic md = new Medic();
		SCV scv = new SCV();
		
		m1.attack(m2);
		f1.attack(m2);
		
		m1.attack(scv);
		f1.attack(scv);
		
		m2.attack(m1);
		f1.attack(m1);
		
		System.out.println("---- 마린");
		m1.showMyHp();
		md.heal(m1);
		m1.showMyHp();
		
		System.out.println("---- SCV");
		scv.showMyHp();
		md.heal(scv);
		scv.showMyHp();
		
		
	}

}
