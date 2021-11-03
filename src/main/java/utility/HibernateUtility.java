package utility;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class HibernateUtility {

    public static Session getSession() {
        SessionFactory sf;
        Session s = null;
        try {
            sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            s = sf.openSession();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return s;
    }


}
