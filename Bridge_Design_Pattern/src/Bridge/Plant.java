package Bridge;

public  class Plant extends LivingThings{
	
	public Plant(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
	}
	
	
public void breatheProcess() {
	
	breatheImplementor.implementBreatheProcess();
	

		
	}




}
