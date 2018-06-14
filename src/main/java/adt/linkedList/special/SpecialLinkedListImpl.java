package adt.linkedList.special;

import adt.linkedList.SingleLinkedListImpl;
import adt.linkedList.SingleLinkedListNode;

public class SpecialLinkedListImpl<T> extends SingleLinkedListImpl<T> implements SpecialLinkedList<T> {

	@Override
	public void swap(T elem1, T elem2) {
		// TODO Implement your code here
		//throw new UnsupportedOperationException("Not implemented yet!");
		SingleLinkedListNode<T> current = this.getHead();
		SingleLinkedListNode<T> element1 = null;
		SingleLinkedListNode<T> element2 = null;
		
		while(!current.isNIL()) {
			
			if(current.getData().equals(element1)) {
				element1 = current;
			}else if(current.getData().equals(element2)){
				element2 = current;
			}
			current = current.getNext();
		}
		if(element1 != null && element2 != null) {
			T aux = element1.getData();
			element1.setData(element2.getData());
			element2.setData(aux);
		}
	}

	@Override
	public T elementFromTheEnd(int k) {
		// TODO Implement your code here
		//throw new UnsupportedOperationException("Not implemented yet!");
		SingleLinkedListNode<T> current = this.head;
		SingleLinkedListNode<T> currentaux = this.head;
		T element = null;
		int count = 1;
		while(!current.isNIL()) {
			if(count >= k) {
				element = currentaux.getData();
				currentaux = currentaux.getNext();
			}
			current = current.getNext();
			count++;
		}
		return element;
	}
}
