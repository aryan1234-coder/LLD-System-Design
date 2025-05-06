package Bridge;

public class BridgePattern {

	public static void main(String[] args) {
		
		LivingThings human=new Human(new HumanBreatheProcess());
		human.breatheProcess();
		// TODO Auto-generated method stub

	}

}
