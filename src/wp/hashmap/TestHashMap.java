package wp.hashmap;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Employee,Project> hm = new HashMap<Employee,Project>();
		Employee e1 = new Employee(1,"Harry",540000,"CEO");
		Employee e2 = new Employee(2,"Harmoine",740000,"CTO");
		Employee e3 = new Employee(3,"Ron",340000,"CFO");
		Employee e4 = new Employee(1,"Draco",540000,"MD");
		
		Project p1 = new Project(100,"Magic",365,"Voldermot");
		Project p2 = new Project(200,"Plants",730,"Bellatrix");
		Project p3 = new Project(100,"Defense",1095,"Lucious");
		Project p4 = new Project(400,"FLy",365,"Ayushi");
		
		hm.put(e1,p1);
		hm.put(e2,p2);
		hm.put(e3,p3);
		hm.put(e4,p4);
		
		System.out.println(hm);

	}

}
