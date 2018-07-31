package structural.bridge.abstraction.refined;

import structural.bridge.abstraction.Car;
import structural.bridge.implementer.Product;

/**
 * @author nannan.c.wang
 *
 */
public class BigWheel extends Car {

	public BigWheel(Product product, String carType) {
		super(product, carType);
	}

	@Override
	public void assemble() {
		System.out.println("Assembling "+product.productName()+" for "+carType);
	}

	@Override
	public void produceProduct() {
		product.produce();
		System.out.println("Modifing product "+product.productName()+" according to "+carType);
	}

}
