package com.kh.chap07_properties.section01_properties.javaconfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.kh.chap07_properties.common.Beverage;
import com.kh.chap07_properties.common.Bread;
import com.kh.chap07_properties.common.Product;
import com.kh.chap07_properties.common.ShoppingCart;

@Configuration
/* 클래스 패스 하위 경로를 기술함. 폴더의 구분은 슬래쉬(/) 또는 역슬래쉬(\\)로 함. */
@PropertySource("product-info.properties")		// 해당 프로퍼티 파일을 받아와서 사용 (소스폴더에 저장했으므로 최상위에 저장 되기 때문에 패키지명 기입 x) 
public class ContextConfiguration {

	/* 치환자 문법을 이용하여 properties에 저장된 key를 입력하면 value에 해당하는 값을 꺼내옴
	 * !!공백을 사용하면 읽어오지 못하니 주의!! 
	 * ${키값 :대체 값} : 대체 값은 프로퍼티 파일에 작성한 값을 제대로 읽어오지 못할 경우 사용할 대체 값 입력*/
	
	// =============== 필드부에 작성 ================
	@Value("${bread.carpbread.name:붕어빵}")	// 키 값 마다 각각 붙여줘야 됨
	private String carpBreadName;
	@Value("${bread.carpbread.price:0}")	// 키 값 마다 각각 붙여줘야 됨
	private int carpBreadPrice;
	
	@Bean
	public Product carpBread() {
		return new Bread(carpBreadName, carpBreadPrice, new java.util.Date());
	}
	
	
	// =============== 필드부에 작성 ================
	@Value("${beverage.milk.name:우유}")
	private String milkName;
	@Value("${beverage.milk.price:0}")
	private int milkPrice;
	@Value("${beverage.milk.capacity:0}")
	private int milkCapacity;
	
	@Bean
	public Product milk() {
		return new Beverage(milkName, milkPrice, milkCapacity);
	}
	
	// =============== 파라미터에 작성 =============== 
	@Bean
	public Product water(@Value("${beverage.water.name:물}") String waterName,
						@Value("${beverage.water.price:0}") int waterPrice,
						@Value("${beverage.water.capacity:0}") int waterCapacity) {
		return new Beverage(waterName, waterPrice, waterCapacity);
	}
	
	
	@Bean
	@Scope("prototype")
	public ShoppingCart cart() {
		return new ShoppingCart();
	}
	
	
}
