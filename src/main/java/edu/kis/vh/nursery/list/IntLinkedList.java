package edu.kis.vh.nursery.list;

public class IntLinkedList {

	Node last;
	int i;

	/**
	 * Funkcja tworzy obiekt typu Node i dodaje jako kolejny element przypisaujac do last.next lub last (pusta lista)
	 * @param i wartosc liczbowa, ktora funkcja przypisuje do pola value nowego obiektu Node
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/**
	 * Funkcja sprawdza, czy lista jest pusta
	 * @return Funkcja zwraca True jesli lista jest pusta
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Funkcja sprawdza, czy lista jest pelna
	 * @return Funkcja zwraca False
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Funkcja zwraca ostatnio dodana wartosc tablicy lub -1 gdy tablica jest pusta
	 * @return
	 */
	public int top() {
		if (isEmpty())
			return -1;
		return last.value;
	}

	/**
	 * Funkcja zmienia refernecje last na poprzedni obiekt typu Node wskazywany przez last.prev
	 * @return Funkcja zwraca wartosc liczbowa usunietego obiektu typu Node
	 */
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;

		return ret;
	}

}
