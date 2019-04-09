
public enum Season {
	SUMMER(35), WINTER(-20),AUTUM(15), SPRING(18);
	
	private int temperature;
	
	Season(int temperatuere){
		this.temperature = temperatuere;
	}
	
	public int getTemperature() {
		return temperature;
	}
}
