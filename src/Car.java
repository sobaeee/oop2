
public class Car {
	
	String modelName;
	int speed;
	
	public String getModelName() {//값을 주는것
		return modelName;
	}
	public void setModelName(String modelName) {//값을 받는것
		this.modelName = modelName;
	}
	/**
	 * 함수설명 : 
	 * @return
	 */
	public String getSpeed() {
		return speed+"km/h";
	}
	/**
	 * 함수설명 : 현재속도를 설정한다.
	 * 0이하는 0을 나타내고, 최고속도는 240이다.
	 * @param speed
	 */
	public void setSpeed(int speed) {
		if(speed <= 0) {
			this.speed = 0;
		}else if (speed > 240) {
			this.speed = 240;
		}else {
			this.speed = speed;
		
			return;
	}
		this.speed = speed;
	}
	
	

}
