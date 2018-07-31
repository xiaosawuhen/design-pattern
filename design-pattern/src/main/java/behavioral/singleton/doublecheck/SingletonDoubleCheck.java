package behavioral.singleton.doublecheck;

/**
 * 
 * With the double-check locking, we first check to see if an instance is created,
 * and if not, then we synchronize.
 * This way, we only synnchronize the first time
 * 
 * @author nannan.c.wang
 *
 */
public class SingletonDoubleCheck {

	private static SingletonDoubleCheck sc = null;
	
	private SingletonDoubleCheck() {
		
	}
	
	public static SingletonDoubleCheck getInstance() {
		if (sc == null) {
			synchronized (SingletonDoubleCheck.class) {
				if (sc == null) {
					sc = new SingletonDoubleCheck();
				}
			}
		}
		
		return sc;
	}
}
