1.class Room {
	private int roomNo;
	private String roomType, roomArea;
	private boolean acMachine;

	Room() {

	}

	Room(int roomNo, String roomType, String roomArea, boolean acMachine) {
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.acMachine = acMachine;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public boolean isAcMachine() {
		return acMachine;
	}

	public void setAcMachine(boolean acMachine) {
		this.acMachine = acMachine;
	}

	void displayData() {
		System.out.println("The room is: " + getRoomNo());
		System.out.println("The type is: " + getRoomType());
		System.out.println("The area is: " + getRoomArea());

		String s = (acMachine) ? "yes" : "No";
		System.out.println("the ac machine is: " + s);

	}

	public static void main(String[] args) {
		Room r1 = new Room();
		r1.setRoomNo(1);
		r1.setRoomType("large");
		r1.setRoomArea("double type");
		r1.setAcMachine(true);

		r1.displayData();
	}

}

Output:
The room is: 1
The type is: large
The area is: double type
the ac machine is: yes

2.class SimpleObject {
	SimpleObject() {
		System.out.println("No argument Constructor");
	}

	SimpleObject(int a) {
		System.out.println("One argument Constructor");
	}

	public static void main(String[] args) {
		new SimpleObject();
		new SimpleObject(200);
	}
}

Output:
No argument Constructor
One argument Constructor

3.public class ClassByValue {
	int data = 50;

	void change(ClassByValue op) {
		op.data = op.data + 100;
	}

	public static void main(String[] args) {
		ClassByValue op = new ClassByValue();

		System.out.println("before changes " + op.data);
		op.change(op);
		System.out.println("after changes " + op.data);

	}

}

Output:
before changes 50
after changes 150

4.public class ClassByRefernce {

	public static void main(String[] args) {
		ReferenceTest obj = new ReferenceTest(150, 200);

		int a = 150, b = 200;

		System.out.println("the value is: ");
		System.out.println("obj a: " + obj.a + " obj b: " + obj.b);

		obj.meth(obj);

		System.out.println("the value after call: ");
		System.out.println("obj a: " + obj.a + " obj b: " + obj.b);

	}

}

Output:
the value is: 
obj a: 150 obj b: 200
the value after call: 
obj a: 300 obj b: 100

5.public class ThisClass {
	int rollno;
	String name;
	float fee;

	ThisClass(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		ThisClass t1 = new ThisClass(1, "akshu", 4000f);
		ThisClass t2 = new ThisClass(2, "pawan", 5000f);

		t1.display();
		t2.display();
	}

}

Output:
1 akshu 4000.0
2 pawan 5000.0
