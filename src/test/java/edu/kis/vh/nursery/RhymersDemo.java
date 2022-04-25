package edu.kis.vh.nursery;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	public static final int INT = 3;
	public static final int BOUND = 20;

	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();
		
		defaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
				factory.GetFIFORhymer(), factory.GetHanoiRhymer()};
		
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < INT; j++)
				rhymers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[INT].countIn(rn.nextInt(BOUND));
		
		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[INT]).reportRejected());
		
	}
	
}