package it.polimi.aip.javisti.controller.visualizzaeventi;

import it.polimi.aip.javisti.model.Evento;
import it.polimi.aip.javisti.service.EventoService;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class EventiPerSedeController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        List<Evento> listaEventiPerSede = new EventoService().getEventiPerSede();
        requestScope("listaEventiPerSede", listaEventiPerSede);
        return forward("EventiPerSede.jsp");
    }
}
