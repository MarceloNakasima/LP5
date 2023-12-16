/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import bean.FuncionarioMyn;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author User
 */
public class FuncionarioMynDAO extends DAOAbstract{

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
        Criteria criteria = session.createCriteria(FuncionarioMyn.class);
        criteria.add (Restrictions.eq("idFuncionario_myn", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FuncionarioMyn.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
    }
    
    
    public List listNome(String nome){
        session.beginTransaction();
        Criteria crit = session.createCriteria(FuncionarioMyn.class);
        crit.add(Restrictions.like("nomeMyn", "%"+nome+"%"));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;
    }
    
    
   public List listData(Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FuncionarioMyn.class);
        criteria.add(Restrictions.eq("dataAdmissaoMyn", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public List listNomeData(Date data, String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FuncionarioMyn.class);
        criteria.add(Restrictions.eq("dataAdmissaoMyn", data));
        criteria.add(Restrictions.ilike("nomeMyn", "%"+nome+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
}
