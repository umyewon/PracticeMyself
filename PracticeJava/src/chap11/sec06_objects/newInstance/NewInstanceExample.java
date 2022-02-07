package chap11.sec06_objects.newInstance;

import java.lang.reflect.Constructor;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("chap11.sec06_objects.newInstance.SendAction");	
			
			/* Action action = (Action)clazz.newInstance();  Class.newInstance()�� deprecated ����
			 * action.execute();   => SendAction�� execute �޼ҵ� �����
			 * 
			 * 
			 */
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
