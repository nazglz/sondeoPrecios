

package Modelo.DAO;

import Hibernate.HibernateUtil;
import Modelo.Categoria;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Nahum
 */
public class CatalogoDeCategoria {
    ArrayList<Categoria> categorias;
    
    public CatalogoDeCategoria() {
    }
    
   
    
    public boolean addCategoria(Categoria categoria){
       boolean res;
        SessionFactory sf;
        Session session;
        Transaction tx = null;
        try{
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(categoria);
            tx.commit();
            session.close();
            res = true;
        }catch(HibernateException ex){
            if(tx != null)
                tx.rollback();
            res = false;
        }
        return res;
    }
    
    public void eliminarCategoria(Categoria categoria){
        SessionFactory sf;
        Session session;
        Transaction tx = null;
        try{
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.delete(categoria);
            tx.commit();
            session.close();
        }catch(HibernateException ex){
            if(tx != null)
                tx.rollback();
        }
    }
    
    public void modificarCategoria(Categoria categoria){
    
    }
    
    public ArrayList<Categoria> getCategorias(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query consulta = session.createQuery("from Categoria");
        ArrayList<Categoria> lista = (ArrayList<Categoria>) consulta.list();
        session.close();
        return lista;
    }
    
    public Categoria getCategoria(int idCategoria){
        SessionFactory sf;
        Session session;
        sf = HibernateUtil.getSessionFactory();
        session = sf.openSession();
        Categoria cat = (Categoria) session.get(Categoria.class, idCategoria);
        session.close();
        return cat;
    }
    
    public boolean validarNombre(String nombre){
        boolean valido = nombre.matches("/^([a-z ñáéíóú]{2,60})$/i");
        boolean res = true;
        if(valido){
           this.categorias = getCategorias();
            for (Categoria categoria : categorias) {
                if(categoria.esIgual(nombre)){
                    res = false;
                    break;
                }
            }
        }else{
            res = false;
        }
        return res;
    }
    
}
