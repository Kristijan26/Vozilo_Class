public class Motor extends Vozilo{

	Motor(){
		speed = 220;
		fuel_capacity = 15;
		
	}
	public void izvediKaskada( ) {
		String tipnamotor="Poloven";
		System.out.println("Motorciklot izvede kaskada");
		System.out.println("Motorciklot so atributi: "+speed+" brzina, "+fuel_capacity+" kapacitet gorivo "+tipnamotor+" tip na motor");

	}
}