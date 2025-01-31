package com.zs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.zs.entity.Department;
import com.zs.entity.Employee;

public class EmpDeptDao {

	private EntityManagerFactory factory;
	
	public EmpDeptDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public void add(Object obj) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		try {
			em.persist(obj);
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}
	}
	
	public Department getDept(int deptNo) {
		EntityManager em = factory.createEntityManager();
		return em.find(Department.class, deptNo);
	}
	
	public Employee getEmp(int empNo) {
		EntityManager em = factory.createEntityManager();
		return em.find(Employee.class, empNo);
	}
	
	public List<Department> allDept() {
		EntityManager em = factory.createEntityManager();
		return em.createQuery("FROM Department").getResultList();
	}
	
	public List<Employee> allEmp() {
		EntityManager em = factory.createEntityManager();
		return em.createQuery("FROM Employee").getResultList();
	}
}
