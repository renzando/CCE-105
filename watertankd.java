package jal;
 
 
 
 
public class watertank {
 
	private String name;
 
	private int[] buckets;
 
	private int top;
 
	
 
	public watertank() {
 
		this.name = "Standard tank";
 
		this.buckets = new int[5];
 
		this.top = -1;
 
	}
 
	
 
	public watertank(String name, int capacity) {
 
		this.name = name;
 
		this.buckets = new int[capacity];
 
		this.top = -1;
 
		System.out.println(name +": holds " + capacity + " buckets");
 
	}
 
	
 
	public void pour(int litters) {
 
		if(top == buckets.length - 1) {
 
			System.out.println("OVERFLOW! " + name  + " is full " + litters + "L spilled on the floor!" );
 
			return;	
 
		}
 
		top++;
 
		buckets[top] = litters;
 
		System.out.println("Poured " + litters + "L into " + name);
 
	}
 
	
 
	public int drain() {
 
		if(isEmpty()) {
 
			System.out.println("UNDERFLOW");
 
			return -1;
 
		}
 
		int litters = buckets[top];
 
		top--;
 
		System.out.println("Drained " + litters + "L from " + name);
 
		return litters;
 
	}
 
	
 
	public int checkTop() {
 
		if(isEmpty()) {
 
			System.out.println(name + " is empty");
 
			return 0;
 
		}
 
		
 
		return buckets[top];
 
	}
 
	
 
	public boolean isEmpty() {
 
		return top == -1;
 
	}
 
	
 
	public int bucketCount() {
 
		return top + 1;
 
	}
 
	
 
	public int totalLitters() {
 
		int total = 0;
 
		for(int i = 0; i <= top; i++) {
 
			total += buckets[i];
 
		}
 
		return total;
 
	}
 
}
 
package jal;
 
// SEPERATED FILE
 
public class main {
 
 
 
 
	public static void main(String[] args) {
 
		// no argument constructor
 
		watertank tank1 = new watertank();
 
		tank1.pour(20);
 
		tank1.pour(30);
 
		tank1.pour(9);
 
		System.out.println("Top bucket: " + tank1.checkTop() + "L");
 
		tank1.drain();
 
		System.out.println("Buckets left " + tank1.bucketCount() + " | total water: " + tank1.bucketCount());
 
		
 
		watertank tank2 = new watertank();
 
		tank2.pour(5);
 
		tank2.pour(10);
 
		tank2.pour(15);
 
		tank2.pour(20);
 
		tank2.drain();
 
		tank2.drain();
 
		tank2.drain();
 
		System.out.println("Is the tank empty " + tank2.isEmpty());
 
	}
 
 
 
 
}
