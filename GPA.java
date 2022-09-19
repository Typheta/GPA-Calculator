import java.util.*;
public class GPA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many classes are you taking?");
		int num = input.nextInt();
		
		
		classes[] c = new classes[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("What is the name of class " + (i + 1));
			String name = input.next();
			System.out.println("How many credits is " + name + " worth?");
			double credits = input.nextInt();
			System.out.println("What grade are you expecting in " + name + "?(A,B,C,D,F)");
			double grade = input.nextInt();
			c[i] = new classes(name, grade, credits);
			
		}
		double totalCredits = 0;
		for(int i = 0; i < c.length; i++) {
			 totalCredits = totalCredits + c[i].getCredits();
			 
		}
		
		//System.out.println(totalCredits);
		
		
		
		for(int i = 0; i < c.length; i++) {
			 if(c[i].getGrade() >= 90) {
				c[i].setPoints(c[i].getCredits() * 4);
			 }
			 else if(c[i].getGrade() >= 80) {
				 c[i].setPoints(c[i].getCredits() * 3);
			 }
			 
			 else if(c[i].getGrade() >= 70) {
				 c[i].setPoints(c[i].getCredits() * 2);
			 }
			 
			 else if(c[i].getGrade() >= 60) {
				 c[i].setPoints(c[i].getCredits() * 1 );
			 }
			 
			System.out.println(c[i].getPoints());
			 
		}
		
		double totalPoints = 0;
		for(int i = 0; i < c.length; i++) {
			totalPoints = totalPoints + c[i].getPoints();
		}
		
		double gpa = totalPoints/totalCredits;
		
		//System.out.println(gpa);
		
		
		
		
		
		System.out.println("With the information provided, your transcript has been created.");
		
		for(int i = 0; i < num; i++) {
			System.out.println(c[i].getName() + " " + c[i].getGrade());
		}
		
		System.out.println("Total GPA: " + gpa);
	}
	
	
	public static class classes {
		public String name;
		public double grade;
		public double credits;
		public double points;
		public double GPA;
		
		static int numOfClasses = 0;
		
		public classes() {
			numOfClasses++;
		}
		
		public classes(String name, double grade, double credits) {
			this.name = name;
			this.grade = grade;
			this.credits = credits;
			this.points = points;
			this.GPA = GPA;
			numOfClasses++;
			
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setGrade(double grade) {
			this.grade = grade;
		}
		
		public void setCredits(double credits) {
			this.credits = credits;
		}
		
		public void setPoints(double points) {
			this.points = points;
		}
		
		
		public void setGPA(double GPA) {
			this.GPA = GPA;
		}
		
		public String getName() {
			return name;
		}
		
		public double getGrade() {
			return grade;
		}
		
		public double getCredits() {
			return credits;
		}
		
		public double getPoints() {
			return points;
		}
		
		public double getGPA() {
			
			return GPA;
		}
		
		
		
		
		
		
		
		
	}

}
