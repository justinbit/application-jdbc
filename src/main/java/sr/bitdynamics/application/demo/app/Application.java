package sr.bitdynamics.application.demo.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.HibernatePersistenceProvider;
import sr.bitdynamics.application.demo.entities.Department;
import sr.bitdynamics.application.demo.entities.Employee;
import sr.bitdynamics.application.demo.entities.EmployeeFunction;
import sr.bitdynamics.application.demo.entities.Role;
import sr.bitdynamics.application.demo.persistence.CustomPersistence;
import java.util.HashMap;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        EntityManagerFactory emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistence(), new HashMap<>());

        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();

            Employee e = new Employee();
            e.setFirstName("Peter");
            e.setSurname("Parker");
            e.setExtension("idk123");
            e.setTelephone("+5978887766");

            Department d = new Department();
            d.setName("IT");
            e.setDepartment(d);

            EmployeeFunction ef = new EmployeeFunction();
            ef.setName("Web App");
            e.setEmployeeFunction(ef);

            Role r = new Role();
            r.setName("Back End");
            e.setRoles(List.of(r));

            em.persist(d);
            em.persist(ef);
            em.persist(r);
            em.persist(e);

            em.getTransaction().commit();
        }
    }
}
