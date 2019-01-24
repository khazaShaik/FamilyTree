import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author khaza.shaik
 * Jan 24, 2019
 * 
 */

/**
 * @author khaza.shaik
 *
 */
public class Functions {

	static List<Person> familyTree = new ArrayList<Person>();
	private static final AtomicInteger marregeCount = new AtomicInteger(0);
	private static final AtomicInteger birthCount = new AtomicInteger(0);

	public void createFamilyHeader(String name, String gender) {
		Person p = new Person(name, gender, null, null);
		p.setId(birthCount.incrementAndGet());
		familyTree.add(p);
	}

	public void born(Person father, Person mother, String name, String gender) {
		// TODO Auto-generated method stub
		Person p = new Person(name, gender, father, mother);
		p.setId(birthCount.incrementAndGet());
		father.addChildrens(p);
		mother.addChildrens(p);
		familyTree.add(p);
	}

	/**
	 * 
	 */
	public void marrage(Person husbend, Person wife) {
		// TODO Auto-generated method stub
		husbend.setMarrageNo(marregeCount.incrementAndGet());
		wife.setMarrageNo(marregeCount.get());

	}

	/**
	 * @return
	 * 
	 */
	public Person getPerson(String name) {
		// TODO Auto-generated method stub
		return familyTree.stream().filter(person -> name.equals(person.getName())).findFirst().get();
	}

}
