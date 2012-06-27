package it.polimi.aip.javisti.controller.progetti;

import java.util.List;

import it.polimi.aip.javisti.model.Partner;
import it.polimi.aip.javisti.service.progettoService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class TuttiIProgettiController extends Controller {

    @Override
    public Navigation run() throws Exception {
       
        progettoService progettoService = new progettoService();
        List<Partner> listaPartners =  progettoService.getListaPartners();
        return forward("TuttiIProgetti.jsp");
    }
}
