class Link{
	public int iData; //data item
	public Link next; //reference to the next link
	
	public Link(int id) {
		//constructor
		iData = id;
		next = null;
		
	}
	
	public void displayLink() {
		System.out.println(iData);
	}
	
	
}

class LinkList{
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public boolean find(int key) {
		Link current = first;
		
		while(current != null) {
			if(current.iData == key) { 
				return true;
			}
			else
				current = current.next;
		}
		return false;
	}
	
	public void insert(int key) {
		Link newLink = new Link(key);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		
		return temp;
	}
	
	public boolean delete(int key) {
		Link current = first;
		Link previous = first;
		
		while(current != null) {
			if(current.iData == key) {
				previous.next = current.next;
				return true;
			}else {
				previous = current;
				current = current.next;
			}
		}
		return false;
		
	}
}