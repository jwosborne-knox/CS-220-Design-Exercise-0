import java.util.HashMap;
import java.lang.Integer;

public class Tracker{
	private HashMap<Integer, Person> personMap = new HashMap<Integer, Person>();
	public void addPerson(Person p) {
		personMap.put(p.getDaysSinceTestOrSymptom(), p);
	}
	public Person getPerson(int key) {
		return personMap.get(key);
	}
	public int size() {
		return personMap.size();
	}
	public void metInfected(int key) {
		Person p = personMap.get(key);
		p.resetDaysSinceTestOrSymptom();
	}
	public void toLeaveQuarantine(int key) {
		Person p = personMap.get(key);
		if(p.getDaysSinceTestOrSymptom() > 13) {
			personMap.remove(key, p);
		}
	}
}
