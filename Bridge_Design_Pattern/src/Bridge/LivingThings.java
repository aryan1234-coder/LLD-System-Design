package Bridge;

public abstract class LivingThings {
	
	
	
	

			
		public BreatheImplementor breatheImplementor;
		
		public LivingThings(BreatheImplementor breatheImplementor) {
			this.breatheImplementor=breatheImplementor;
			
		}
		
		public abstract  void breatheProcess();
		

	


}
