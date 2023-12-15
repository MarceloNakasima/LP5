/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import bean.VendasMyn;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author User
 */
public class VendasMynDAO extends DAOAbstract{

   @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendasMyn.class);
        criteria.add (Restrictions.eq("idVendas_myn", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendasMyn.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
    }
    
     public List listTempoE(String tempo){
        session.beginTransaction();
        Criteria crit = session.createCriteria(VendasMyn.class);
        crit.add(Restrictions.like("tempoEntregaMyn", "%"+tempo+"%"));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;
    }
    
     

    public List listCliente(int cliente){
        
        session.beginTransaction();
        Criteria crit = session.createCriteria(VendasMyn.class);
        crit.add(Restrictions.ge("clienteMyn", cliente));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;
    
    }

   public List listNomeCliente(String tempo, int cliente){
        
        session.beginTransaction();
        Criteria crit = session.createCriteria(VendasMyn.class);
        crit.add(Restrictions.like("tempoEntregaMyn", "%"+tempo+"%"));
        crit.add(Restrictions.ge("clienteMyn", cliente));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;
    }
    
}
