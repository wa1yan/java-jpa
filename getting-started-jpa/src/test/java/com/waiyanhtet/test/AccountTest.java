package com.waiyanhtet.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.waiyanhtet.relationship.onetoone.uni.Account;
import com.waiyanhtet.relationship.onetoone.uni.Address;
import com.waiyanhtet.relationship.onetoone.uni.Role;

public class AccountTest {

	static EntityManagerFactory emf;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("getting-started-jpa");
	}
	
	@AfterAll
	static void close() {
		if(emf.isOpen() && emf != null) {
			emf.close();
		}
	}
	
	@Test
	void test() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Account account = new Account();
		account.setLoginId("william");
		account.setName("Wai Yan Htet");
		account.setRole(Role.Admin);
		account.setPassword("123456");
		
		em.persist(account);
		Assertions.assertEquals(1, account.getId());
		
		var address = new Address();
		address.setAccount(account);
		address.setAddress("Kamaryut");
		
		em.persist(address);
		em.getTransaction().commit();
		
		
	}
}
