package it.polimi.aip.javisti.controller.inserisciRisultati;

import java.util.List;

import it.polimi.aip.javisti.model.Progetto;
import it.polimi.aip.javisti.service.progettoService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;


public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        progettoService pService = new progettoService();
        List<Progetto> progetti = pService.getTuttiProgetti();
        requestScope("progetti",progetti);
        return forward("index.jsp");
    }
}
