import java.util.*; 

public class MyLinkedList {
	
	class Node{
		int val;
		Node next;
		public Node(int val){
			this.val = val;
		}
	}
	
	Node head = null, tail = null;
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(10);
		list.add(5);
		list.add(6);
		list.add(18);
		list.add(8);
		list.add(4);
		list.printLinkedList();
		list.reverse();
		list.printLinkedList();
	}
	
	// Adds node at the end of the list
	public void add(int val){
		if(head == null){
			Node temp = new Node(val);
			head = temp;
			tail = temp;
		}else{
			tail.next = new Node(val);
			tail = tail.next;
		}
	}
    
	// Prints the list
	public void printLinkedList(){
		Node temp = head;
		while(temp != null){
			System.out.print(" "+temp.val);
			temp = temp.next;
		}
        System.out.println();
	}
    
	// Retrun length of the list
	public int length(){
        int length = 0;
		Node temp = head;
		while(temp != null){
			length++;
		}
        return length;
	}
    
    	// Return value at the tager index of the list
	public int get(int index){
		Node temp = head;
		int count = 0;
		while(temp!=null && ++count!=index){
			return temp.val;
        	}
        return 0;
	}
    
	// Reverse the list
	public void reverse() { 
        Node temp = head;
        Node previous = null, current = null;
        while (temp != null){
            current = temp; 
            temp = temp.next;
            // reverse the link of the list
            current.next = previous;
            previous = current;
            head = current;
        }
    }
}
