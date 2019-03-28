package coreBasics;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class UsingElseIf {
public static void main(String[] args) {
	
	int carage = 30;
	
	if(carage > 30){
		System.out.println("Car is vintage");
	}else if (carage <30){
		System.out.println("Car needs basic maintenance");
	} else if (carage == 30){
		System.out.println("Car needs custom upgrade");
	}else {
		System.out.println("Car is brand new");
	}
	
	
	
}
}
