package Package.java;

import java.util.ArrayList;
import java.util.List;

public class ItemManager <T>{

	List<T> id;
	
	public ItemManager()
	{
		id = new ArrayList<>();
	}
	
	public  void addItem(T item)
	{
		id.add(item);
	}
	
	public List<T> AllItems()
	{
		return id;
	}
	
	public T getItemAt(int position)
	{
		return id.get(position);
	}
}
