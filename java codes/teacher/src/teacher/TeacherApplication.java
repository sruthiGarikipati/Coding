package teacher;

public class TeacherApplication {
	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.id=143;
		t1.name="omkar";
		t1.subject= "java";
		t1.teach();
		t1.motivate();
		t1.giveAssignments();
		System.out.println(t1.id);
		System.out.println(t1.name);
		System.out.println(t1.subject);
		
	}

}
