package DynamicArray;

public class DynamicArrayUse {
	public static void main(String[] args) {
		ArrayDynamic d = new ArrayDynamic();
		
		System.out.println(d.size());
		d.print();	
		
		// To add element
		d.add(23);
		d.add(10);
		d.add(15);
		d.add(25);
		d.add(30);
		System.out.println(d.size());
		d.print();
		
		// to reset element (index, value)
		d.set(2, 8);
		d.set(3, 8);
		d.set(8, 10);
		d.print();
		
		d.remove(2);
		d.remove(9);
		System.out.println(d.size());
		d.print();
		
		// for deleting any value (value)
		d.delete(10);
		d.print();
		
		d.delete(34);
		
		d.add(34);
		d.print();
		d.delete(34);
		d.print();
		
		d.add(90);
		d.add(100);
	}
}
