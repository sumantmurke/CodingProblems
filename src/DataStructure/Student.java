package DataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Student {
	 private String first;     // first name
	 private String last;
	 private int age;
	 
	 public Student(String firstname , String lastname, int age) {
		 this.first = firstname;
		 this.last = lastname;
		 this.age = age;
	 }
	 
	 public static void main(String[] args) {
		
		 List<Student> list = new ArrayList<Student>();
		 list.add(new Student("Sumant", "Murke", 29));
		 list.add(new Student("Sudhakar", "Kamanboina", 29));
		 list.add(new Student("Sumant", "Kamanboina", 29));
		 list.add(new Student("Sudhakar", "Murke", 29));
		 
		 for(Student s : list) {
			 System.out.println("first "+ s.first+" last: "+s.last);
		 }
		 
		 list.sort((o1, o2) -> { 
			 int cmp = o1.first.compareTo(o2.first);
			 if (cmp == 0) 
			 cmp = o1.last.compareTo(o2.last);
			  return cmp; 
			 });
		 
		 System.out.println("After sort");
		 
		 for(Student s : list) {
			 System.out.println("first "+ s.first+" last: "+s.last);
		 }
		 
		 HashSet<Integer> set = new HashSet<Integer>();
		 //set.

	}

}
