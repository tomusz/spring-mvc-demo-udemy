package hibernate.shop;

import hibernate.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.Optional;


/**
 * Created by Lukasz on 10.03.2018.
 */
public class ProductRepository {

    public static void saveProduct(Product product){
        Session session = null;
        try {
            session = HibernateUtil.openSession();
            session.save(product);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if(session != null && session.isOpen()){
                session.close();
            }
        }
    }

    public static Optional<Product> findOneById(Long id){
        Session session = null;
        try {
            session = HibernateUtil.openSession();
            Product product = session.find(Product.class, id);
            return Optional.ofNullable(product);
        }catch (Exception ex){
            ex.printStackTrace();
            return Optional.empty();
        }finally {
            if(session != null && session.isOpen()){
                session.close();
            }
        }
    }


    public static List<Product> findAll(){

        Session session = null;

        try{
            sesion = HibernateUtil.openSession();
            String jpql = 'SELECT '
        }

    }


    public static List<Product> findAllByNameLike(String name){

        Session session = null;

        try{
            session = HibernateUtil.openSession();
            String jpql = 'SELECT p FROM Product p WHERE  UPPER(p.name) like :name';
            Query query = session.createQuery(jpql);
            return query.getResultList();
        }catch (Exeption ex){
            ex.printStackTrace();
            return Collection.emptyList();
        }finally{

        }

    }

}
