package homework_230321;

import homework_230321.car.HybridCar;

public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridCar hc = new HybridCar(100, 100);
		
		hc.speedUp();
		hc.speedDown();
		hc.addFuel();
		hc.charge();
		
		hc.changeMode();
		hc.speedUp();
		hc.speedUp();
	}

}
