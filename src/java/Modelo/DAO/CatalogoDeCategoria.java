

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
    ;
    ;
    
    public boolean addCategoria(Categoria categoria){
        boolean res;
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;
        try{
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
    
    public void eliminarCategoria(Categoria categoria){}
    
    public void modificarCategoria(Categoria categoria){
    
    }
    
    public ArrayList getCategorias(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query consulta = session.createQuery("from Categoria");
        ArrayList<Categoria> lista = (ArrayList<Categoria>) consulta.list();
        session.close();
        return lista;
    }
    
    public Categoria getCategoria(int idCategoria){
        return null;
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
