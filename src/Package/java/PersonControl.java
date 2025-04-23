package Package.java;

import java.util.ArrayList;

public class PersonControl {
	
	public static void main(String [] args)
	{
		
		
		
		
		ArrayList<Person> personlist = new ArrayList<Person>();
		
		Person person1 = new Person("Kieron", "Ayoshobo", "Dublin");
		Person person2 = new Person("Chris", "Smoove", "Dublin");
		Person person3 = new Person("Bol", "Bol", "Dublin");
		Person person4 = new Person("Mat", "Ayoshobo", "Dublin");
		Person person5 = new Person("Kevin", "Williams", "Dublin");
		Person person6 = new Person("Donal", "Harcourt", "Dublin");

		
		personlist.add(person1);
		personlist.add(person2);
		personlist.add(person3);
		personlist.add(person4);
		personlist.add(person5);
		personlist.add(person6);

		
		System.out.println(personlist.size());
		
		for(Person person : personlist)
		{
			System.out.println(person);
		}
		
		//ArrayList<Person> personlist2 = (Arraylist<Person>)personlist.clone();
		
		newScreen();
		
	}

}
