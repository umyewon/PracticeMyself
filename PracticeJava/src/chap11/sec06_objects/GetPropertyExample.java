package chap11.sec06_objects;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println("운영체제 이름 : " + osName);

		
		String userName = System.getProperty("user.name");
		System.out.println("사용자 이름 : " + userName);
		
		String userHome = System.getProperty("user.home");
		System.out.println("사용자 홈 디렉토리 : " + userHome);
		
		String javaVersion = System.getProperty("java.version");
		System.out.println(javaVersion);
		
		System.out.println("---------------------------------------");
		System.out.println(" {key}  value");
		System.out.println("---------------------------------------");		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String)objKey;
			String value = System.getProperty(key);
			System.out.println("{" + key + "}" + value);
		} 
		
		
		
	}
}
