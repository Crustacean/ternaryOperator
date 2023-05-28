public class Ternary {
	
	public static void main(String[] args){
		
		String makeOfCar = "Volkswagen";
		boolean isDomestic = makeOfCar == "BMW" ? false : true;
		
		if (isDomestic) {
			System.out.println("This car "+makeOfCar+" is domestic to our country");
		}else{
			System.out.println("This car "+makeOfCar+" is not domestic to our country");
		}
		
	}
	
}