package homework_11;

public class Homework_11 {
	public static void main(String[] args) {
		Car c_1 = new Car();
		
		c_1.method("Hello");
		
		Bus b_1 = new Bus();
		
		Driver d_1 = new Driver();
		
		d_1.startBus(b_1);
		
		Autor a_1 = new Autor();
		
		a_1.name = "Alex";
		
		Book bo_1 = new Book();
		
		bo_1.autor = a_1;
		
		System.out.println(bo_1.autor.name);
		
		Town t_1 = new Town();
		
		Building bu_1 = new Building();
		Building bu_2 = new Building();
		Building bu_3 = new Building();
		
		t_1.buildings.add(bu_1);
		t_1.buildings.add(bu_2);
		t_1.buildings.add(bu_3);
		
		Human h_1 = new Human();
		
		System.out.println(h_1.heart);
	}
}
