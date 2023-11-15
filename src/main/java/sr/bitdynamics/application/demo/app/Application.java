package sr.bitdynamics.application.demo.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.HibernatePersistenceProvider;
import sr.bitdynamics.application.demo.persistence.CustomPersistence;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        Map<String, String> props = new HashMap<>();
        props.put("hibernate.hbm2dll.auto", "true");

        EntityManagerFactory emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistence(), new HashMap<>());

        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.getTransaction().commit();
        }
    }
}
