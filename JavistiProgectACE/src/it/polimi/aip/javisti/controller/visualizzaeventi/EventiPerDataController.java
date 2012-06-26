package it.polimi.aip.javisti.controller.visualizzaeventi;

import java.util.List;

import it.polimi.aip.javisti.model.Evento;
import it.polimi.aip.javisti.service.EventoService;

import javax.servlet.http.HttpServletRequest;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;
import org.slim3.util.RequestLocator;

import com.google.appengine.api.datastore.Key;

public class EventiPerDataController extends Controller {

    @Override
    public Navigation run() throws Exception {
       
       
        System.out.println("kkkkkkkkkkkkkkkk");
        EventoService eventoService = new EventoService();
        List<Evento> eventiPerData = eventoService.getEventiPerData();
        System.out.println(eventiPerData.size());
        requestScope("listaEventiPerData", eventiPerData);

        return forward("eventiperdata.jsp");
    }
}
