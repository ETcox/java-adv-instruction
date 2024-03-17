package ui;

import java.util.ArrayList;
import java.util.List;

import util.Console;

public class WizardInventoryApp {

	// assigning them to numbers so it's easier to interact with, could use the
	// associated words "show,grab,edit,etc..."
	private static final String COMMAND_SHOW = "1";
	private static final String COMMAND_GRAB = "2";
	private static final String COMMAND_EDIT = "3";
	private static final String COMMAND_DROP = "4";
	private static final String COMMAND_EXIT = "5";

	public static void main(String[] args) {
		System.out.println("The Wizard Inventory Game");

		String command = "";

		// creating a list with 3 starting items
		List<String> itemsList = new ArrayList<>();
		itemsList.add("wooden staff");
		itemsList.add("wizard hat");
		itemsList.add("cloth shoes");

		// as long as the command isnt 5(aka command_exit), this will loop
		while (!command.equalsIgnoreCase(COMMAND_EXIT)) {
			command = promptCommandMenu();
			// if or switch statement
			// (itemList) is showing that it interacts with the list we made
			switch (command) {
			case COMMAND_SHOW:
				showItems(itemsList);
				break;
			case COMMAND_GRAB:
				grabItem(itemsList);
				break;
			case COMMAND_EDIT:
				editItem(itemsList);
				break;

			case COMMAND_DROP:
				dropItem(itemsList);
				break;

			// doesn't necessarily need a method? this loop/App ends when chosen
			case COMMAND_EXIT:
				System.out.println("Exit app:");
				break;
				
			default:
				System.out.println("Invalid command.");

			}

		}
		System.out.println("Goodbye!");

	}

	// Showing a list of commands that the user will choose from
	private static String promptCommandMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("==================================");
		System.out.println(COMMAND_SHOW + " : Show all items");
		System.out.println(COMMAND_GRAB + " : Grab (Add) an item");
		System.out.println(COMMAND_EDIT + " : Edit an item");
		System.out.println(COMMAND_DROP + " : Drop an item");
		System.out.println(COMMAND_EXIT + " : Exit program");
		return Console.getString("Command: ");
	}

	private static void showItems(List<String> items) {
		System.out.println("Show all items:");
		System.out.println("==================================");

		// setting first item to 1, then incrementing +1 for rest of items in list
		for (int i = 1; i <= items.size(); i++) {

			// printing new item number in association to position in list
			// have to do (i - 1) since we set first item to 1 in the for loop parameter
			System.out.println(i + ". " + items.get(i - 1));

		}
	}

	private static void grabItem(List<String> items) {
		System.out.println("Grab (Add) an item:");
		System.out.println("==================================");

		// if there are 4 or more items in list, print deny explanation
		if (items.size() >= 4) {
			System.out.println("You can't carry any more items. Drop something first.");
		} else {
			// creating a new String variable, prompting for item name
			String itemName = Console.getString("Item name: ");
			// storing that new item in the list (items)
			items.add(itemName);
			// confirmation that new item was added
			System.out.println(itemName + " was added.");
		}
	}

	public static void editItem(List<String> items) {
		System.out.println("Pick an item to edit: ");
		System.out.println("---------------");

		// printing out the list of items for user to pick from
		for (int i = 1; i < items.size(); i++) {
			System.out.println((i) + ". " + items.get(i - 1));
		}

		// Ask the user to pick an item
		// System.out.print("Enter the number of the item you want to change: ");
		int itemNumber = Console.getInt("Enter the number of the item you wish to edit: ");

		if (itemNumber < 1 || itemNumber > items.size()) {
			System.out.println("Invalid choice.");
			return;
		}

		// Ask the user for the new name
		// System.out.print("Enter the new name for the item: ");
		String newName = Console.getString("Enter the new item name: ");

		// Change the name of the selected item
		items.set(itemNumber - 1, (String) newName);

		System.out.println("Item updated succesfully!");

	}

	public static void dropItem(List<String> items) {

		System.out.println("Pick an item to drop: ");
		// printing list of items to choose from
		for (int i = 1; i <=items.size(); i++) {
			System.out.println((i) + ". " + items.get(i - 1));
		}

		// System.out.println("Enter the number of the item you want to drop");
		int itemNumber = Console.getInt("Enter the number of the item you want to drop: ");

		
		if (itemNumber > 0 && itemNumber <= items.size()) {
			items.remove(itemNumber - 1); //telling which array spot to remove from
			
			System.out.println("Item dropped successfully");
		} else {
			System.out.println("Invalid item number.");
		}

	}

}
