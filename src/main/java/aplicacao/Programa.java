package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

	Pessoa p1 = new Pessoa(null, "Nícholas Cassano", "nicholascassano@gmail.com");
	Pessoa p2 = new Pessoa(null, "Aline Dias", "alinedias@gmail.com");
	Pessoa p3 = new Pessoa(null, "Chloe", "chloe@gmail.com");
	Pessoa p4 = new Pessoa(null, "Pepeto", "pepeto@gmail.com");
	
	EntityManagerFactory conf = Persistence.createEntityManagerFactory("exemplo-jpa");
	EntityManager em = conf.createEntityManager();
	
	em.getTransaction().begin();
	em.persist(p1);
	em.persist(p2);
	em.persist(p3);
	em.persist(p4);
	em.getTransaction().commit();
    
	System.out.println("Dados enviados com sucesso!");
	
	}
}
