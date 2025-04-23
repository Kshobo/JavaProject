package Package.java;

public class IntegerItemManager_control {
	
	public static void main(String [] args)
	{
		IntegerItemManager num = new IntegerItemManager();
		
		num.addItem(10);
		num.addItem(20);
		num.addItem(30);
		num.addItem(40);
		num.addItem(50);
		System.out.print(num.AllItems());
		System.out.print(num.getItemAt(4));
		
	}

}
