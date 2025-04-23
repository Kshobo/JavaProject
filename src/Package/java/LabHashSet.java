package Package.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class LabHashSet {
	
	HashSet<String> counties;
	Collections collections;

	
	public LabHashSet()
	{
		String [] namecounties =  {"Antrim", "Armagh", "Carlow", "Cavan", "Clare", "Cork", "Derry", "Donegal", "Down", "Dublin",
									"Fermanagh", "Galway", "Kerry", "Kildare", "Kilkenny", "Laois", "Leitrim", "Limerick", "Longford",
									"Louth", "Mayo", "Meath", "Monaghan", "Offaly", "Roscommon", "Sligo", "Tipperary", "Tyrone",
									"Waterford", "Westmeath", "Wexford", "Wicklow"};
		counties = new HashSet<>();
		for (String county : namecounties)
		{
			counties.add(county);
		}
			
	}
	
	public void printSet()
	{
		Iterator<String> it = counties.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());	
		}
	}
	
	public void addEntry(String county)
	{
		counties.add(county);
	}
	
	public void matchEntry(String country)
	{
		if(counties.contains(country))
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
	
	public void HashSet()
	{
		counties.clear();
	}
	
	public void sortSet()
	{
		ArrayList<String> sortedCounties = new ArrayList<>(counties);
		Collections.sort(sortedCounties);	
		System.out.println("//////////////////////////////////////////////////////////");
		for (String county : sortedCounties)
		{
			System.out.println(county);
		}
	}
	
	public void reverse()
	{
		ArrayList<String> reverseCounties = new ArrayList<>(counties);
		Collections.reverse(reverseCounties);	
		System.out.println("//////////////////////////////////////////////////////////");
		for (String county : reverseCounties)
		{
			System.out.println(county);
		}
	}
	
	public void shuffleSet()
	{
		ArrayList<String> shuffleCounties = new ArrayList<>(counties);
		Collections.shuffle(shuffleCounties);	
		System.out.println("//////////////////////////////////////////////////////////");
		for (String county : shuffleCounties)
		{
			System.out.println(county);
		}
	}
}
