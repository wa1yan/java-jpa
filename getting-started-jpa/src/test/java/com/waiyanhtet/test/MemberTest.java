package com.waiyanhtet.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.waiyanhtet.entity.Member;

public class MemberTest {

	static EntityManagerFactory emf;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("getting-started-jpa");
	} 
	
	@AfterAll
	static void close() {
		if(null != emf && emf.isOpen()) {
			emf.close();	
		}
	}
	
	@Test
	void test() {
		Member member = new Member();
		member.setName("William");
		
		var em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(member);
		em.getTransaction().commit();
		
	}
}
