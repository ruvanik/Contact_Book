package com.addressbook;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Ruvani
 */
public class DBManager {
    EntityManagerFactory emf;
    EntityManager em;
    Users c;
    
    //used for inserts
    public DBManager() {
        emf = Persistence.createEntityManagerFactory("AddressBookProPU");
        em = emf.createEntityManager();
    }
    
    //used for update or delete
    public DBManager(Users c) {
        emf = Persistence.createEntityManagerFactory("AddressBookProPU");
        em = emf.createEntityManager();
        
        this.c = c;
    }
    
    //clean up all instances of this class
    public void close() {
        em.close();
        emf.close();
    }
    
    //insert this record
    public void insert(Users c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
    
    //find a record by it's id
    public Users findById(int id) {
        Users c = em.find(Users.class, id);
        
        return c;
    }
    
    //delete this record
    public void delete(Users c) {
        em.getTransaction().begin();
        Users users = findById(c.getId());
        em.remove(users);
        em.getTransaction().commit();
    }
    
    //update this record
    public void update (Users c) {
        Users contacts = em.find(Users.class, c.getId());
        em.getTransaction().begin();
        contacts.setFirstname(c.getFirstname());
        contacts.setLastname(c.getLastname());
        contacts.setMobile(c.getMobile());
        contacts.setPhone(c.getPhone());
        em.getTransaction().commit();
    }
}