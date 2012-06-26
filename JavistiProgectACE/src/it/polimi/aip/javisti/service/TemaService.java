package it.polimi.aip.javisti.service;

import it.polimi.aip.javisti.meta.TemaMeta;
import it.polimi.aip.javisti.model.Tema;

import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import sun.security.util.Debug;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;


public class TemaService {
    
        public void addTema(Map<String, Object> input)
        {           
            Tema tema = new Tema();
            BeanUtil.copy(input, tema);
            Transaction tx = Datastore.beginTransaction();
            Key temaKey = Datastore.createKey(Tema.class, tema.getNome());

            tema.setKey(temaKey);
            System.out.print(" tema.key.name() = " + tema.getKey().getName());
            System.out.print(" tema.key.name() = " + tema.getKey().toString());
            Datastore.put(tema);
            tx.commit();
        }

       TemaMeta tm = new TemaMeta();
        
        public List<Tema> getAllThemes() 
        {
            return  Datastore.query(tm).asList();
         }
           

    
}
