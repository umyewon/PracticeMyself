package chap06;

public class Earth {

	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	// 상수 초기화를 위한 static 블록
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
