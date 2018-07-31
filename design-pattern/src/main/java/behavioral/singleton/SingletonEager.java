package behavioral.singleton;

/**
 * 
 * @author nannan.c.wang
 *
 */
public class SingletonEager {

	private static SingletonEager sc = null;
	
	private SingletonEager() {
		
	}
	
	public static synchronized SingletonEager getInstance() {
		if (sc == null) {
			sc = new SingletonEager();
		}
		
		return sc;
	}
}
