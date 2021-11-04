package Learning;

public class Array {

		public static void main(String[] args)
		
		{
			Student[] arr;
			arr = new Student[3];
			
			arr[0] = new Student(1,"aman");
			arr[1] = new Student(2,"akshay");
			arr[2] = new Student(3,"akash");
			
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("Element at " + i + " : " + arr[i].roll_no + " "+ arr[i].name);
			}
			
		}
}

class Student{
	
	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}