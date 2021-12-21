import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {
	public static void main(String[]args) {
		ArrayList<Student> al = null;
		LinkedList<Employee> el = null;
		int ch,n,sid,eid;
		String name,address;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.create array \n2.add \n3.display \n4.delete \n5.create linked \n6.add \n7.delete \n8.display");

			System.out.println("enter ut choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				al= new ArrayList<Student>();
				break;
			case 2:
				System.out.println("enter id");
				sid=sc.nextInt();
				System.out.println("enter name");
				name=sc.next();
				System.out.println("enter address");
				address=sc.nextLine();
				al.add(new Student(sid,name,address));
				break;

			case 3:
				for(Student s :al) {
					System.out.println(s.getSid());
					System.out.println(s.getName());
					System.out.println(s.getAddress());
				}
				break;
			case 4:
				System.out.println("enter index");
				n=sc.nextInt();
				al.remove(n);
				break;

			case 5:
				el=new LinkedList<Employee>();
				break;

			case 6:
				System.out.println("enter id");
				eid=sc.nextInt();
				System.out.println("enter name");
				name=sc.next();
				el.add(new Employee(eid,name));
				break;
			case 7:
				System.out.println("enter index");
				n=sc.nextInt();
				el.remove(n);
				break;
			case 8:
				for(Employee e :el) {
					System.out.println(e.getEid());
					System.out.println(e.getName());
				}
				break;
			}
		}
	}

}
