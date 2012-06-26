package it.polimi.aip.javisti.controller.visualizzaeventi;

import it.polimi.aip.javisti.model.Evento;
import it.polimi.aip.javisti.model.Tema;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;
import org.slim3.util.RequestLocator;

import com.google.appengine.api.datastore.Key;

public class MostraeventoController extends Controller {

    @Override
    public Navigation run() throws Exception 
    {
        System.out.println(" sono mostra evento  controller ");
        HttpServletRequest request = RequestLocator.get();
        
        String id_evento = request.getAttribute("id_evento").toString();
        
        Key eventoKey = Datastore.createKey(Evento.class, id_evento);
        Evento eventoDaVisualizzare = Datastore.get(Evento.class, eventoKey);
        
        requestScope("evento", eventoDaVisualizzare);
        return forward("mostraevento.jsp");
    
    
    }
}
