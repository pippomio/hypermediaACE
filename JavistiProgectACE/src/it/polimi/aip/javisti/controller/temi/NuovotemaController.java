package it.polimi.aip.javisti.controller.temi;

import it.polimi.aip.javisti.model.Evento;
import it.polimi.aip.javisti.model.PresentazioniEventi;
import it.polimi.aip.javisti.model.Progetto;
import it.polimi.aip.javisti.service.TemaService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;
import org.slim3.util.RequestMap;

import com.google.appengine.api.datastore.Transaction;

public class NuovotemaController extends Controller {

    @Override
    public Navigation run() throws Exception
    {
       
        Evento evento1 = new Evento("luciesuoni");  evento1.setTitolo("titolo 1");   evento1.setDescrizione("descrizione eve1");
        Evento evento2 = new Evento("mare");      evento1.setTitolo("titolo ev 2");   evento1.setDescrizione("descrizione eve2");
        
        Progetto progetto1 = new Progetto("progetto1");   progetto1.setTitolo("titolo p1");
        Progetto progetto2 = new Progetto("progetto2");    progetto2.setTitolo("titolo p2");
        
        PresentazioniEventi presentazione1  = new PresentazioniEventi();
        PresentazioniEventi presentazione2  = new PresentazioniEventi();
        
        presentazione1.getEventoRef().setModel(evento1);
        presentazione1.getProgettoRef().setModel(progetto1);
        
        presentazione2.getEventoRef().setModel(evento1);
        presentazione2.getProgettoRef().setModel(progetto2);
        
      //  Transaction tx = Datastore.beginTransaction();
        Datastore.put(evento1, evento2, progetto1, progetto2, presentazione1, presentazione2);
      //  tx.commit();
       
        
        Evento evento3 = Datastore.get(Evento.class, Datastore.createKey(Evento.class, "luciesuoni"));
        
        for(PresentazioniEventi pe : evento3.getEventiProgettiList().getModelList())
        {
            Progetto pRicavato = pe.getProgettoRef().getModel();
            System.out.println("\n\n titolo: " + pRicavato.getTitolo() + "\n descrizione :" + pRicavato.getDescrizione());
        }
        
        TemaService service = new TemaService();
        service.addTema(new RequestMap(this.request));
        return redirect(this.basePath);

    }
}
