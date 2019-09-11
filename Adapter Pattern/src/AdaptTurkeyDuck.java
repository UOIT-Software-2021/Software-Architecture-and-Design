
public class AdaptTurkeyDuck implements Duck{
	
	public AdaptTurkeyDuck(WildTurkey turkey) {
		
	}

	@Override
	public void quack() {
		System.out.println("Quack");
		
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
		
	}
}
