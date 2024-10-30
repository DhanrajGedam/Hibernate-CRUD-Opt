import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory e = Persistence.createEntityManagerFactory("BATMAN");
		EntityManager m = e.createEntityManager();
		EntityTransaction t = m.getTransaction();
		
		Employee emp = new Employee();
		
		emp.seteName("Aditya Lochan");
		emp.seteEmail("aditya@gmail.com");
		emp.seteAge(22);
		
		Employee ref = m.find(Employee.class, 2);
		//ref.seteEmail("adityaLochan@gmail.com");
		t.begin();
		m.remove(ref);
		t.commit();
		
		//System.out.println(ref.geteId()+" "+ref.geteName()+" "+ref.geteEmail()+" "+ref.geteAge()+" "+ref.getObjCreationTime());
	}

}
