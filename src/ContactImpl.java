
public class ContactImpl implements Contact, Comparable {

	
	int id;
	String name;
	String notes;
	
	/**Constructs a new contact with id, name and notes attached to it
	 * 
	 * @param id contact ID
	 * @param name Name of the contact
	 * @param notes Notes about interaction with contact
	 */
	public ContactImpl(int id, String name, String notes){
		this.id = id;
		this.name = name;
		this.notes = notes;
	}
	
	/**{@inheritDoc} 
	 */
	@Override
	public int getId() {
		return this.id;
	}

	/**{@inheritDoc} 
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**{@inheritDoc} 
	 */
	@Override
	public String getNotes() {
		return this.notes;
	}

	/**{@inheritDoc} 
	 */
	@Override
	public void addNotes(String note) {
		this.notes += "\n\n"+note;
	}

	/**{@inheritDoc}
	 * 
	 * Contacts are sorted based upon ID
	 * 
	 */
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**{@inheritDoc}
	 * 
	 * Contacts with the same ID are equal, else not
	 */
	@Override
	public boolean equals(Object object){
		return false;
	}

	/**{@inheritDoc}
	 * 
	 * Will display as [ID, Contact Name, Notes]
	 */
	@Override
	public String toString(){
		return "Not Implemented";
	}
}
