
public class StudentDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student stu1= new Student("Janelle","2445234324");
        stu1.courses("math121");
	}

}
class Student{
	private String name;
	private String SSN;
	private static int SID=1000;
	private String courses;
	private int balance=0;
	private static final int costOfCourse=800;
	
	public Student(String name,String SSN) {
		SID++;
		this.name=name;
		this.SSN= SSN;
		setEmail();
		SetID();
	}

public void SetID() {
	int max=9000;
	int min= 1000;
		int random= (int)(Math.random()*(max-min));
		random= random+min;
		System.out.println(random);
	    String userID= SID+random+SSN.substring(6);
		System.out.println("your user id is "+userID);
}
public void setEmail() {
        String email= name.toLowerCase()+"@gmail.com";
        System.out.println("your email is: "+email);
}
public void enroll(String courses) {
	this.courses=this.courses;
	System.out.println(name+"is enrolled in "+courses);
}
public void payTuition() {
	
}
public void checkBalance() {
	
}
@Override
public String toString() {
	return("[Name: "+name+" ]\n[Courses: "+ courses+" ]\n[Balance"+balance);
}
}
