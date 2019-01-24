import java.util.ArrayList;

/**
 * @author khaza.shaik
 * Jan 24, 2019
 * 
 */
public class Person {
	private int id;
	private String name;
	private String gender;
	private Person father;
	private Person mother;
	private int marrageNo;
	private ArrayList<Person> childrens;
	private int generation  ;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public Person getFather() {
		return father;
	}
	public Person getMother() {
		return mother;
	}
	public ArrayList<Person> getChildrens() {
		return childrens;
	}
	public int getGeneration() {
		return generation;
	}
	public int getMarrageNo() {
		return marrageNo;
	}
	public void setMarrageNo(int marrageNo) {
		this.marrageNo = marrageNo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	public void setChildrens(ArrayList<Person> childrens) {
		this.childrens = childrens;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	public void addChildrens(Person person) {
		// TODO Auto-generated method stub
		if(this.getChildrens()==null) {this.setChildrens(new ArrayList<Person>());}
		this.getChildrens().add(person);
	}
	public Person(String name, String gender, Person father, Person mother) {
		super();
		this.name = name;
		this.gender = gender;
		this.father = father;
		this.mother = mother;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", marrageNo=" + marrageNo + ", childrens=" + childrens + ", generation=" + generation + "]";
	} 
	

	
}
