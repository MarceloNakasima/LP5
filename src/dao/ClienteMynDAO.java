/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import bean.ClienteMyn;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class ClienteMynDAO extends DAOAbstract{

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
        Criteria criteria = session.createCriteria(ClienteMyn.class);
        criteria.add (Restrictions.eq("idCliente_myn", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteMyn.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
    }
    
    public List listNome(String nome){
        session.beginTransaction();
        Criteria crit = session.createCriteria(ClienteMyn.class);
        crit.add(Restrictions.like("nomeMyn", "%"+nome+"%"));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;
    }
    
     

    public List listSexo(int sexo){
        
        session.beginTransaction();
        Criteria crit = session.createCriteria(ClienteMyn.class);
        crit.add(Restrictions.eq("sexoMyn", sexo));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;
    
    }

   public List listNomeSexo(String nome, int sexo){
        
        session.beginTransaction();
        Criteria crit = session.createCriteria(ClienteMyn.class);
        crit.add(Restrictions.like("nomeMyn", "%"+nome+"%"));
        crit.add(Restrictions.eq("sexoMyn", sexo));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;
    }
    
}
