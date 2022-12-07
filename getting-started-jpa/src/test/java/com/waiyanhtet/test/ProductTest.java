package com.waiyanhtet.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ProductTest {
	static EntityManagerFactory emf;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("getting-started-jpa");
	}
	
	@AfterAll
	static void close() {
		if(emf != null && emf.isOpen()) {
			emf.close();
		}
	}
	
	@Test
	void test() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.getTransaction().commit();
	}

}
