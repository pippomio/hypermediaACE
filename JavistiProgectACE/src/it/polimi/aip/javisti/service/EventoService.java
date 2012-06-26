package it.polimi.aip.javisti.service;

import it.polimi.aip.javisti.meta.EventoMeta;
import it.polimi.aip.javisti.model.Evento;

import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Transaction;


public class EventoService {

    EventoMeta em = new EventoMeta();
    
    public void addEvento(Map<String, Object> input)
    {           
        Evento evento = new Evento();
        BeanUtil.copy(input, evento);
        
        String noSpacesTitle =  evento.getTitolo().replace(" ","");
        System.out.println("SONO ADD EVENTO!"+noSpacesTitle);
        evento.setId_evento(noSpacesTitle);
        evento.setKey(Datastore.createKey(Evento.class, evento.getId_evento()));
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(evento);
        tx.commit();
    }
    
    
    
    public List<Evento> getTuttiGliEventi()
    {
        
        return  Datastore.query(em).asList();
        
    }
    
    public List<Evento> getEventiPerData() {
       
        return Datastore.query(em).sort(em.data.desc).asList();
        
    }
    
    public List<Evento> getEventiPerSede() {
        
        
        return Datastore.query(em).sort(em.sede.desc).asList();
        
    }

    public List<Evento> getEventiPerTipo() {
       
        return Datastore.query(em).sort(em.tipo.desc).asList();
    }

}
