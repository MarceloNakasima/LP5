/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import bean.ProdutoMyn;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author User
 */
public class ProdutoMynDAO extends DAOAbstract{

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
        Criteria criteria = session.createCriteria(ProdutoMyn.class);
        criteria.add (Restrictions.eq("idProduto_myn", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoMyn.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
    }
    
    public List listNome(String nome){
        session.beginTransaction();
        Criteria crit = session.createCriteria(ProdutoMyn.class);
        crit.add(Restrictions.like("nomeMyn", "%"+nome+"%"));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;
    }
    
    
    public List listDesc(String Desc){
        session.beginTransaction();
        Criteria crit = session.createCriteria(ProdutoMyn.class);
        crit.add(Restrictions.like("descricaoMyn", "%"+Desc+"%"));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;
    }
    
      public List listNomeDesc(String nome, String Desc){
        session.beginTransaction();
        Criteria crit = session.createCriteria(ProdutoMyn.class);
        crit.add(Restrictions.like("nomeMyn", "%"+nome+"%"));
        crit.add(Restrictions.like("descricaoMyn", "%"+Desc+"%"));
        List lista = crit.list();
        session.getTransaction().commit();
        return lista;
    
    }
}
