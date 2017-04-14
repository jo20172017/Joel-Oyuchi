/**
 * PhoneBook Program main class/application class
 * 
 * @author Joel Oyuchi
 * 
 * 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;


public class MainClass {

	
	public static void main(String[] args) {
		
      
		PhoneBook  phoneBook = new PhoneBook();
		
		try(Scanner sc = new Scanner(System.in)){
		
		
	do{	
	System.out.println("What would you like to do? ");
	System.out.println(" 1. Add New Entry ");
	System.out.println(" 2. Search for An entry by First Name ");
	System.out.println(" 3. Search for An entry by Last Name ");
	System.out.println(" 4. Search for An entry by telephone Number ");
	System.out.println(" 5. Search for An entry by state"); 
	System.out.println(" 6. Delete a record ");
	System.out.println(" 7. Update a record ");
	System.out.println(" 8. Show all records in ascending order ");
	int choice =sc.nextInt();
	sc.nextLine();
	
	switch(choice){
	
	case 1: 
		System.out.println(" Adding new Entry");
		//String first;
		//String last;
		//String number;
		Contact contact = new Contact();
		System.out.print(" Format John Doe,114 Markets St,St Louis,MO,63403,6366435698 ");
		String input = sc.nextLine();
		String [] detail= input.split("\\s*,\\s*");		
		String [] name = detail[0].split(" ");
		String fullname = "";
		for (int i=0; i < name.length; i++) {
			
			if(i == name.length - 1)
			{
				contact.setLastName(name[i]);
			}
			else{
				
				fullname+= " "+name[i];
			}
			
		}
		
		contact.setFirstName(fullname);	
		
		
		contact.setStreet(detail[1]);
		contact.setCity(detail[2]);
		contact.setState(detail[3]);
		contact.setZipCode(detail[4]);
		contact.setNumber(detail[5]);
	
		phoneBook.addContact(contact);
		System.out.println(contact);
		//System.out.println("Phone : "+contact.getNumber());
		 
	
				
		break;
	case 2:
		
		System.out.println("Search for an Entry by First Name");
		ArrayList<Contact> contacts = phoneBook.find(sc.nextLine());
		if(contacts.isEmpty())
			System.out.println("No records found");
		else
			for (Contact contact2 : contacts) {
				System.out.println(contact2);
			}
	      
	      
	break;
	case 3:
		System.out.println("Search for an entry by last Name");
		ArrayList<Contact> contacts1 = phoneBook.findLastName(sc.nextLine());
		if(contacts1.isEmpty())
			System.out.println("No records found");
		else
			for (Contact contact2 : contacts1) {
				System.out.println(contact2);
			}
	
		break;
	case 4:
		System.out.println("Search an entry by telephone number");
		
		ArrayList<Contact> telephone = phoneBook.findNumber(sc.nextLine());
		if(telephone.isEmpty())
			System.out.println("No records found");
		else
			for (Contact contact2 : telephone) {
				System.out.println(contact2);
			}
		
		break;
		
	case 5:
		System.out.println("Search an entry by State");
		ArrayList<Contact> state = phoneBook.findState(sc.nextLine());
		if(state.isEmpty())
			System.out.println("No records found");
		else
			for (Contact contact2 : state) {
				System.out.println(contact2);
			}
	
		break;
		
	case 6:
		System.out.println("Delete a record by entering phone number");
		phoneBook.removeContact(sc.nextLine());	
		break;
		
	case 7:
		System.out.println("Update a record by entering phone number");
		
		 String number=sc.nextLine();
		 System.out.println("Please enter the new FirstName of the contact");
		
		String newName= sc.nextLine();
		
		phoneBook.updateContact(number, newName);
		break;	
		
	case 8:
		System.out.println("Show all records in ascending order");
		phoneBook.ascOrder();
		break;
		
		
	default:
		break;
	}
		
		System.out.println("Do you wish to perform another function? (Y/N)");
		if(sc.next().toLowerCase().charAt(0)!='y')
			break;
	
	} while(!(sc.nextLine().equals("exit")));
		} catch(Exception e){
			
			System.out.println(e.getMessage());
		}
	}

}
