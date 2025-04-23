package Package.java;

//import javax.swing.JList;
import java.util.ArrayList;
import java.util.List;


public class StringItemManager{
	
	List<String> studentNames;

	
	public StringItemManager()
	{
		studentNames = new ArrayList<>();
	}
	
	
	public void addItem(String item)
	{
		studentNames.add(item);
	}
	
	public List<String> AllItems()
	{
		return studentNames;
	}

	public String getItemAt(int position)
	{
		return studentNames.get(position);
	}

}
