package behavioral.singleton.breaks;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * There are some other ways to break the singleton pattern
 * 1.If the class is Serializable
 * 2.If it's Clonable
 * 3.It can be break by Reflection
 * 4.And also if, the class is loaded by multiple class loaders
 * ============================================================
 * 1.Implement the readResolve() and writeReplace() methods in your singleton class 
 *   and return the same object through them.
 * 2.You should also implement the clone() method and throw an exception 
 *   so that the singleton cannot be cloned.
 * 3.An “if condition” inside the constructor can prevent the singleton 
 *   from getting instantiated more than once using reflection.
 * 4.To prevent the singleton getting instantiated from different class loaders, 
 *   you can implement the getClass() method. 
 *   The above getClass() method associates the classloader with the current thread; 
 *   if that classloader is null, the method uses the same classloader that loaded the singleton class.
 * 
 * @author nannan.c.wang
 *
 */
public class SingletonBreak implements Serializable {

	/**
	 * SID
	 */
	private static final long serialVersionUID = -1514929201158285361L;
	
	private static SingletonBreak sc = new SingletonBreak();
	
	private SingletonBreak() {
		if (sc != null) {
			throw new IllegalStateException("SingletonBreak Instance Already Created!!");
		}
	}
	
	public static SingletonBreak getInstance() {
		return sc;
	}

	private Object readResolve() throws ObjectStreamException {
		return sc;
	}
	
	private Object writeReplace() throws ObjectStreamException {
		return sc;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("SingletonBreak, cannot be clonned!!");
	}
	
	@SuppressWarnings("unused")
	private static Class<?> getClass(String classname) throws ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		if (classLoader == null) {
			classLoader = SingletonBreak.class.getClassLoader();
		}
		
		return classLoader.loadClass(classname);
	}
}
