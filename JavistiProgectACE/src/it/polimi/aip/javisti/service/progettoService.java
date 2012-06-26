package it.polimi.aip.javisti.service;

import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;


import it.polimi.aip.javisti.meta.ProgettoMeta;
import it.polimi.aip.javisti.model.Evento;
import it.polimi.aip.javisti.model.Progetto;
import it.polimi.aip.javisti.model.Risultati;
import it.polimi.aip.javisti.model.Tema;


public class progettoService {

    
    private ProgettoMeta mProgetto;
    
    public String getDescrizioneProgetto() {
        
       List<Progetto> descrizioni =  Datastore.query(mProgetto).sort(mProgetto.descrizione.desc).asList();
       
       return descrizioni.get(0).getDescrizione();
    }
    
    
    public List<Progetto> getTuttiProgetti()
    {
        ProgettoMeta pm = new ProgettoMeta();
        return Datastore.query(pm).asList();
    }
    
    public  void addProgetto(Map<String,Object> map) {
        Progetto progetto = new Progetto();
        BeanUtil.copy(map, progetto);
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(progetto);
        tx.commit();
    }

    public void addProgetto(String titolo, String descrizione, String tema)
    {
        Progetto progetto = new Progetto();
               
        progetto.setDescrizione(descrizione);
        progetto.setTitolo(titolo);
        
        System.out.println("titolo = " + titolo + "descrizione = " + descrizione + "tema = "+ tema );
        Key key = Datastore.createKey(Progetto.class, progetto.getTitolo());
        progetto.setKey(key);        
        
        Key temaKey = Datastore.createKey(Tema.class, tema);
        Tema temaProgetto = Datastore.get(Tema.class, temaKey);
        
        Transaction tx = Datastore.beginTransaction(); 
        progetto.getTemaRef().setModel(temaProgetto);
        
        Tema temaProgettoRicavato =  progetto.getTemaRef().getModel();
        System.out.println(" tema appena datomi:  " + temaProgettoRicavato.getNome() + " tratta la descriz:  " + temaProgettoRicavato.getDescrizione() + "  ");
        
       
        
        Datastore.put(progetto);
        
        tx.commit();
        
        
       
        
    }
    
}
