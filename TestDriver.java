//not setting up the full setup to make this a working program, this is just an example of a simplified version
public class TestDriver {
	public static void Main(String[] args) {
		//setup
		Tracker quarantineTracker = new Tracker();
		Person personA = new Person(1, "name1"); //show that it stores
		Person personB = new Person(2, "name2"); 
		Person personC = new Person(3, "name3");
		quarantineTracker.addPerson(personA);
		quarantineTracker.addPerson(personB);
		quarantineTracker.addPerson(personC);
		
		//some tests
		
		//first and second size's should match
		quarantineTracker.size();
		quarantineTracker.addPerson(personA);
		quarantineTracker.size(); 
		
		//testing that the means to check infected work
		Person temp = quarantineTracker.getPerson(personA.getId());
		Person temp2 = quarantineTracker.getPerson(personB.getId());
		
		quarantineTracker.dayPassed(); //a day passed, but...
		quarantineTracker.metInfected(personA.getId()); //...personA met personB!
		quarantineTracker.metInfected(personB.getId()); //!!!
	}
}
