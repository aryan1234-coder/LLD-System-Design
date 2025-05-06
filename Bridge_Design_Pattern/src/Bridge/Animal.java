package Bridge;

public  class Animal  extends LivingThings{
	
	public Animal(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
	}
	
	
public void breatheProcess() {
	
	breatheImplementor.implementBreatheProcess();
	
	}


}
