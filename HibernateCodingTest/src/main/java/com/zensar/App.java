package com.zensar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.zensar.bean.Address;
import com.zensar.bean.BankAccount;
import com.zensar.bean.Employee;
import com.zensar.bean.Skill;

import com.zensar.util.JPAUtil;

public class App {
	public static Employee loadtesting() {
		//write code here to load employee object
		Skill skill1=new Skill("java", 9);
		Skill skill2=new Skill("python", 8);
		Skill skill3=new Skill("DOTNET",10);
		List<Skill>skillset=new ArrayList<Skill>();
		skillset.add(skill3);
		skillset.add(skill2);
		skillset.add(skill1);
		Address address=new Address(1, "Jaggayyapeta", "676768", null);

		BankAccount bankAccount=new BankAccount("12345");

		Employee employee=new Employee("vikitha", 60000, null,null, null);
		employee.setAddress(address);
		employee.setAccount(bankAccount);
		employee.setSkillList(skillset);
		return employee;
	}
	public static void inserttesting() {
		//write code here to persist employee object
		Employee employee=new Employee("vicky", 30000, null, null, null);
		EntityManager em=JPAUtil.createEntityManager("HibernateCoding");
		
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	public static void test1() {
		Employee employee=new Employee("vicky", 30000, null, null, null);
		Address address=new Address(1, "hyd", "521178", null);
		employee.setAddress(address);
		EntityManager em= JPAUtil.createEntityManager("HibernateCoding");
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		}
  public static void main(String[] args) {
  System.out.println("hellooooo-------vicky");
  test1();
  }
}
