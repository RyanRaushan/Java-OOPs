package DynamicArray;

public class ArrayDynamic {
	private int data[];
	private int nextIndex;
	
	public ArrayDynamic() {
		data = new int[5];
		nextIndex = 0;
	}
	
	public int size(){
		return nextIndex;
	}
		
	public void add(int element) {
		if (nextIndex == data.length) {
			reStructure();
		}
		
		data[nextIndex] = element;
		nextIndex++;
	}
	
	public void set(int index, int value) {
		if (index >= size()) {
			System.out.println("Enter correct index.");
			return;
		}
		data[index] = value;
	}
	
	public void remove(int index) {
		
		if (index  >= size()) {
			System.out.println("Enter correct index..");
			return;
		}
		
		System.out.println(index + " : " + data[index] + " Will be removed.");
		int size = size()-1;
		for (int i = index; i < size; i++) {
			data[i] = data[i+1];
		}
		nextIndex--;
	}
	
	public void delete(int value) {
		int size = size();
		int []arr = new int[size];
		int k = 0;
		
		for (int i = 0; i < size; i++) {
			if (data[i] != value) {
				arr[k++] = data[i];
			}
		}

		if (size == k) {
			System.out.println("No value found...");
			return;
		}
		size = k;
		
		for (int i = 0; i < size; i++) {
			data[i] = arr[i];
		}
		nextIndex = size;
	}
	
	private void reStructure() {
		int temp[] = data;
		data = new int[data.length * 2];
		
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}	
		
	public void print() {
		
		if (size() == 0) {
			System.out.println("No element entered..");
			return;
		}
		
		for (int i = 0; i < size(); i++) {
			System.out.print(data[i] + " ");
		}	
		System.out.println();
	}	
}
