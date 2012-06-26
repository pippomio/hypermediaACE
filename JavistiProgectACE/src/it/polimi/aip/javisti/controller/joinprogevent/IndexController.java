package it.polimi.aip.javisti.controller.joinprogevent;

import it.polimi.aip.javisti.model.Evento;
import it.polimi.aip.javisti.model.Progetto;
import it.polimi.aip.javisti.service.EventoService;
import it.polimi.aip.javisti.service.progettoService;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception {
     
        progettoService serviceProgetti = new progettoService();
        EventoService   serviceEventi = new EventoService();
        
        List<Progetto> listaProgetti = serviceProgetti.getTuttiProgetti();
        List<Evento> listaEventi =  serviceEventi.getTuttiGliEventi();
        System.out.println("lista eventi = " + listaEventi);
        System.out.println("lista progetti = " + listaProgetti);
        requestScope("listaEventi", listaEventi);
        requestScope("listaProgetti", listaProgetti);
        return forward("index.jsp");
    }
}
