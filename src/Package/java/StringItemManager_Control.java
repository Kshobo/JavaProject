package Package.java;

public class StringItemManager_Control {
	public static void main(String [] args)
	{
		StringItemManager sim = new StringItemManager();
		
		sim.addItem("Matthew");
		sim.addItem("Mark");
		sim.addItem("Luke");
		sim.addItem("John");
		sim.addItem("Paul");
		System.out.print(sim.AllItems());
		System.out.print(sim.getItemAt(4));
		
	}

}
