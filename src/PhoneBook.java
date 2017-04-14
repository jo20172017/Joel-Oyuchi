

/**
 *
 * PhoneBook project
 * 
 * Phone Book Class
 * @author joel
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	
private List<Contact>contacts;
	
	

	
	public PhoneBook() {
		this.contacts=new ArrayList<Contact>();
	}


	public void addContact(Contact contact) {

			this.contacts.add(contact);
		}
		
	

	
public ArrayList<Contact> find(String firstName){
	 ArrayList<Contact> contacts = new ArrayList<>();
	for(int i=0; i<this.contacts.size(); i++){
		Contact temp = this.contacts.get(i);
		if(temp.getFirstName().toLowerCase().contains(firstName.toLowerCase()) )  {   
			contacts.add(temp);
		}
	}
	return contacts;
}

public ArrayList<Contact> findLastName(String lastName){
	 ArrayList<Contact> contacts = new ArrayList<>();
	for(int i=0; i<this.contacts.size(); i++){
		Contact temp = this.contacts.get(i);
		if(temp.getLastName().toLowerCase().contains(lastName.toLowerCase()) )  {   
			contacts.add(temp);
		}
	}
	return contacts;
}

public ArrayList<Contact> findNumber(String number){
	 ArrayList<Contact> contacts = new ArrayList<>();
	for(int i=0; i<this.contacts.size(); i++){
		Contact temp = this.contacts.get(i);
		if(temp.getNumber().toLowerCase().contains(number.toLowerCase()) )  {   
			contacts.add(temp);
		}
	}
	return contacts;
}


public ArrayList<Contact> findState(String state){
	 ArrayList<Contact> contacts = new ArrayList<>();
	for(int i=0; i<this.contacts.size(); i++){
		Contact temp = this.contacts.get(i);
		if(temp.getState().toLowerCase().contains(state.toLowerCase()) )  {   
			contacts.add(temp);
		}
	}
	return contacts;
}

public void removeContact(String contact){
	for(int i =0; i<this.contacts.size();i++){
		Contact tempContact=this.contacts.get(i);
		if(tempContact.getNumber().equals(contact)){
			System.out.println("Deleting "+contacts.get(i));
			contacts.remove(i);
			
			break;
		}
		
		
	}
}

public void updateContact(String contact, String name){
	for(int i =0; i<this.contacts.size();i++){
		Contact tempContact=this.contacts.get(i);
		if(tempContact.getNumber().equals(contact)){
			System.out.println("updating "+contacts.get(i).getFirstName() +" to "+name);
			contacts.get(i).setFirstName(name);
			break;
		}
}
}
public void ascOrder(){
	String[] x={};
	String temp="";
	  for (int j = 0;  j < contacts.size() - 1;  j++ )
      {
              if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
              {                                             // ascending sort
                          temp = x [ j ];
                          x [ j ] = x [ j+1];     // swapping
                          x [ j+1] = temp;                                       
               } 
       } 
	  System.out.println(temp);
}
}