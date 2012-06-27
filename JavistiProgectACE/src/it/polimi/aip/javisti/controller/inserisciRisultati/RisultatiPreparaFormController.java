package it.polimi.aip.javisti.controller.inserisciRisultati;

import it.polimi.aip.javisti.model.Progetto;
import it.polimi.aip.javisti.model.Tema;
import it.polimi.aip.javisti.service.TemaService;
import it.polimi.aip.javisti.service.progettoService;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class RisultatiPreparaFormController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        progettoService pService = new progettoService();
        List<Progetto> progetti = pService.getTuttiProgetti();
        List<Tema> areeTematiche = new TemaService().getAllThemes();
        
        requestScope("progetti",progetti);
        requestScope("temi", areeTematiche);
        return forward("inserimentoRisultati.jsp");
    }
}
