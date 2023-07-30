package one.digitalinnovation.dp;

import one.digitalinnovation.dp.facade.Facade;
import one.digitalinnovation.dp.singleton.SingletonEager;
import one.digitalinnovation.dp.singleton.SingletonLazy;
import one.digitalinnovation.dp.singleton.SingletonLazyHolder;
import one.digitalinnovation.dp.strategy.Behavior;
import one.digitalinnovation.dp.strategy.AggressiveBehavior;
import one.digitalinnovation.dp.strategy.DefensiveBehavior;
import one.digitalinnovation.dp.strategy.NormalBehavior;
import one.digitalinnovation.dp.strategy.Robot;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Behavior defensive = new DefensiveBehavior();
		Behavior normal = new NormalBehavior();
		Behavior aggressive = new AggressiveBehavior();
		
		Robot robot = new Robot();
		robot.setBehavior(normal);
		robot.move();
		robot.move();
		robot.setBehavior(defensive);
		robot.move();
		robot.setBehavior(agrressive);
		robot.move();
		robot.move();
		robot.move();
		
		// Facade
		
		Facade facade = new Facade();
		facade.moveClient("Ana", "59874216");
	}

}
