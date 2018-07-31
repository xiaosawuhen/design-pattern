package structural.bridge;

import structural.bridge.abstraction.Car;
import structural.bridge.abstraction.refined.BigWheel;
import structural.bridge.abstraction.refined.Motoren;
import structural.bridge.implementer.Product;
import structural.bridge.implementer.concrete.CentralLocking;
import structural.bridge.implementer.concrete.GearLocking;

public class BridgeTester {

	public static void main(String[] args) {

		Product product = new CentralLocking("Central Locking System");
		Product product2 = new GearLocking("Gear Locking System");
		
		Car car = new BigWheel(product, "BigWheel xz model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
		System.out.println();

		car = new BigWheel(product2, "BigWheel xz model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
		System.out.println("-----------------------------------------------------");

		car = new Motoren(product, "Motoren lm model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
		System.out.println();
		
		car = new Motoren(product2, "Motoren lm model");
		car.produceProduct();
		car.assemble();
		car.printDetails();

	}

}
