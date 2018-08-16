package model.hiberDAO.util;

import com.mysql.jdbc.Driver;
import model.Car;
import model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.MySQL5Dialect;

import java.util.Properties;

/**
 * Created by Vladyslava_Hubenko on 7/12/2018.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = buildSessionfactiry();

    private static SessionFactory buildSessionfactiry(){
        Properties properties = new Properties();
        properties.put(AvailableSettings.DRIVER, Driver.class.getCanonicalName());
        properties.put(AvailableSettings.URL, "jdbc:mysql://localhost:3306/spring_mvc_data");
        properties.put(AvailableSettings.USER, "root");
        properties.put(AvailableSettings.PASS, "");
        properties.put(AvailableSettings.DIALECT, MySQL5Dialect.class.getCanonicalName());
        properties.put(AvailableSettings.SHOW_SQL, true);
        properties.put(AvailableSettings.ENABLE_LAZY_LOAD_NO_TRANS, true);

        Configuration configuration = new Configuration()
                .addProperties(properties)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Car.class);

        configuration.addAttributeConverter(ConverterEnum.class);
        return configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
