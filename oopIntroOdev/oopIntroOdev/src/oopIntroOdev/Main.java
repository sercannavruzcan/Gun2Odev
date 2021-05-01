package oopIntroOdev;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course (1,"Programlamaya giriş temel kursu",100,"Engin Demiroğ");
		
		Course course2 = new Course(2, "C# + Angular", 0, "Engin Demiroğ");
		
		Course course3 = new Course(3, "Java + React", 32, "Engin Demiroğ");
			
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			
			System.out.println(course.name);	
		}
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "My Courses";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "My All Courses";
				
		CourseManager courseManager = new CourseManager();
		courseManager.finishAndContinue(course1);
		courseManager.finishAndContinue(course2);
	    courseManager.finishAndContinue(course3);
		
	}

}
