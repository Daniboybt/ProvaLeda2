package adt.linkedList;

public class SingleLinkedListImpl<T> implements LinkedList<T> {

	protected SingleLinkedListNode<T> head;

	public SingleLinkedListImpl() {
		this.head = new SingleLinkedListNode<T>();
	}

	@Override
	public boolean isEmpty() {
		if(this.head.isNIL()) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Not implemented!");
		SingleLinkedListNode<T> current = this.head;
		int count = 0;
		while(!current.isNIL()) {
			current = current.getNext();
			count++;
		}
		return count;
	}

	@Override
	public T search(T element) {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Not implemented!");
		SingleLinkedListNode<T> current = this.head;
		while(!current.isNIL()) {
			if(current.getData().equals(element)){
				return current.getData();
			}
			current = current.getNext();
		}
		return null;
	}

	@Override
	public void insert(T element) {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Not implemented!");
		if(element != null) {
			
			SingleLinkedListNode<T> current = this.head;
			while(!current.isNIL()) {
				current = current.getNext();
			}
			current.setData(element);
			current.setNext(new SingleLinkedListNode<T>());
		}
	}

	@Override
	public void remove(T element) {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Not implemented!");
		SingleLinkedListNode<T> current = this.head;
		while(!current.isNIL()) {
			if(current.getData().equals(element)) {
				current.setData(current.getNext().getData());
				current.setNext(current.getNext().getNext());
				break;
			}
			current = current.getNext();
		}
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Not implemented!");
		T[] array = (T[]) new Object[this.size()];
		int count = 0;
		SingleLinkedListNode<T> current = this.head;
		while(!current.isNIL()) {
			array[count] = current.getData();
			current = current.getNext();
			count++;
		}
		return array;
	}

	public SingleLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}

}
