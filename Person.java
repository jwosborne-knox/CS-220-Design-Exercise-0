
public class Person {
	private int id;
	private String name;
	private int daysSinceTestOrSymptom;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		daysSinceTestOrSymptom = 0;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getDaysSinceTestOrSymptom() {
		return daysSinceTestOrSymptom;
	}
	public void resetDaysSinceTestOrSymptom() {
		daysSinceTestOrSymptom = 0;
	}
}
