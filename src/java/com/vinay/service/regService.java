/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.service;

import com.vinay.dto.regDTO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Vinay1
 */
public class regService {

    static SessionFactory st;

    static {
        st = new AnnotationConfiguration().configure().buildSessionFactory();
    }

    public static void Save(regDTO re) {
        Session s = st.openSession();
        Transaction tx = s.beginTransaction();
        s.saveOrUpdate(re);
        tx.commit();
        s.close();
        st.close();

    }

    public List<regDTO> ShowList(int i) {
        Session s = st.openSession();
        List l = new ArrayList();
        Query q = null;
        if (i != 0) {
            q = s.createQuery("from regDTO where id = '" + i + "'");
        } else {
            q = s.createQuery("from regDTO");
        }

        l = q.list();
        System.out.println("----" + l.size());
        s.close();
        return l;
    }

    public void delete(int i) {
        Session s = st.openSession();
        Query q = s.createQuery("Delete regDTO where id = '" + i + "'");
        q.executeUpdate();
        s.close();
    }
}
