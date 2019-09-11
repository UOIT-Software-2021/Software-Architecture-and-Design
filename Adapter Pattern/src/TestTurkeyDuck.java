
public class TestTurkeyDuck {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new AdaptTurkeyDuck(turkey);
		
		System.out.println("The turkey says... ");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe duck says... ");
		duck.quack();
		duck.fly();
		
		System.out.println("\nThe turkey adapter says... ");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
