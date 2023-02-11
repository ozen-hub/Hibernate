import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //==========Save===============
       /* Customer c1 = new Customer("C001", "Nimal", "Colombo", 25000);
        Configuration configuration =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Customer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(c1);
        transaction.commit();
        //==========
        session.close();
        sessionFactory.close();*/
        //=========================
       /* //==========Find One===============
        Customer c1 = null;
        Configuration configuration =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Customer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        c1 = session.find(Customer.class,"C001"); // hql => (FROM customer WHERE id:id)
        System.out.println(c1);
        session.close();
        sessionFactory.close();
        //=========================*/
       /* //==========Update One===============
        Customer c1 = null;
        Configuration configuration =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Customer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        c1 = session.find(Customer.class,"C001");
        c1.setName("Kamal");
        c1.setAddress("Galle");
        c1.setSalary(25000);
        Transaction transaction = session.beginTransaction();
        session.save(c1);
        transaction.commit();
        session.close();
        sessionFactory.close();
        //=========================*/
       /* //==========Find All===============
        Customer c1 = null;
        Configuration configuration =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Customer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM customer_table");
        List<Customer> list = query.list();
        System.out.println(list);
        session.close();
        sessionFactory.close();
        //=========================*/
        //==========Delete===============
       /* Customer c1 = null;
        Configuration configuration =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Customer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();*/
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(session.find(Customer.class,"C001"));
        transaction.commit();
        session.close();
        //=========================
    }
}
