package Package.java;

public class ItemManager_control {
	

	public static void main(String [] args)
	{
		ItemManager<Integer> myNum = new ItemManager<>();
		ItemManager<String> myString = new ItemManager<>();

		
		myNum.addItem(10);
		myNum.addItem(20);
		myNum.addItem(30);
		myNum.addItem(40);
		myNum.addItem(50);
		myNum.addItem(50);
		myString.addItem("Kieron");
		myString.addItem("John");
		myString.addItem("Pork");
		myString.addItem("Mathew");
		myString.addItem("Luke");

		System.out.print(myNum.AllItems());
		System.out.print(myNum.getItemAt(4));
		
		System.out.print(myString.AllItems());
		System.out.print(myNum.getItemAt(4));

		
	}

}
