import java.util.*;
//case1: general implementation 
public class StackPredefinedLibrary {
    public static void main(String[] args) 
	{
		Stack s = new Stack();
		System.out.println(s.empty());//true
		System.out.println(s);//[]
		s.push(111);
		s.push(222);
		s.push(333);
		s.push(444);
		s.push(555);
		System.out.println(s);//[111,222,333,444,555]
		System.out.println(s.peek());//555
		System.out.println(s.pop());//555
		System.out.println(s);//[111,222,333,444]
		System.out.println(s.search(111));//3+1=4
		System.out.println(s.search(222));//2+1=3
		System.out.println(s.search(333));//1+1=2
		System.out.println(s.search(444));//0+1=1
		System.out.println(s.search(999));//-1
	}
}

//case2: Hold string objects

/**
 * InnerStackPredefinedLibrary
 */
class StringObjInStack {
   
    public static void main(String[] args) {
        Stack s = new Stack<String>();
         System.out.println(s);//[]
		s.push("AAA");
		s.push("BBB");
		s.push("CCC");
		s.push("DDD");
		s.push("EEE");
		System.out.println(s);//[AAA,BBB,CCC,DDD,EEE]
		System.out.println(s.peek());//EEE
		System.out.println(s.pop());//EEE
		System.out.println(s);//[AAA,BBB,CCC,DDD]
    }
    
}

//case3: Student objects
class Student
{
	int id;
	String name;
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}

	public String toString(){
		return "("+this.id+", "+this.name+")";
	}
}
class TestStudent
{
	public static void main(String[] args) 
	{
		Stack<Student> s = new Stack<Student>();
		System.out.println(s);//[]
		Student s1 = new Student(1,"Prakash");
		Student s2 = new Student(2,"Mahesh");
		Student s3 = new Student(6,"Venkatesh");
		Student s4 = new Student(4,"Kiran");
		Student s5 = new Student(3,"Kumar");
		Student s6 = new Student(5,"Kalyan");
		s.push(s1);
		s.push(s2);
		s.push(s3);
		s.push(s4);
		s.push(s5);
		s.push(s6);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
	}
}
