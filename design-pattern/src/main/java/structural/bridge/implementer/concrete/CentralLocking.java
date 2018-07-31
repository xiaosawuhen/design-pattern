package structural.bridge.implementer.concrete;

import structural.bridge.implementer.Product;

/**
 * @author nannan.c.wang
 *
 */
public class CentralLocking implements Product {

	private final String productName;
	
	public CentralLocking(String productName) {
		this.productName = productName;
	}
	
	public String productName() {
		return productName;
	}

	public void produce() {
		 System.out.println("Producing Central Locking System");
	}

}
