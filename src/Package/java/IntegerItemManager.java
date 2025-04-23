package Package.java;


import java.util.ArrayList;
import java.util.List;

public class IntegerItemManager {
	
	List<Integer> id;
	
	public IntegerItemManager()
	{
		id = new ArrayList<>();
	}
	
	public void addItem(int item)
	{
		id.add(item);
	}
	
	public List<Integer> AllItems()
	{
		return id;
	}
	
	public Integer getItemAt(int position)
	{
		return id.get(position);
	}

}
