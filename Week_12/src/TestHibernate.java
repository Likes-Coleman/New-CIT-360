/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coleman
 */
//import hibernate.test.dto.EmployeeEntity;
import org.hibernate.Session;
 
/* This code will create a new table employee in database and 
insert one row in this table. */
public class TestHibernate {
 
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        // Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("demo-user@mail.com");
        emp.setFirstName("demo");
        emp.setLastName("user");
 
        session.save(emp);
 
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}