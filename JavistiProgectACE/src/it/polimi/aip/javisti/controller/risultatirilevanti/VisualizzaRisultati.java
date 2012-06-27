package it.polimi.aip.javisti.controller.risultatirilevanti;

import java.util.List;

import it.polimi.aip.javisti.model.Risultati;
import it.polimi.aip.javisti.service.RisultatiService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class VisualizzaRisultati extends Controller {

    
    
    @Override
    public Navigation run() throws Exception {
       
        RisultatiService service = new RisultatiService();
        List<Risultati> risultati = service.getAllRisultati();
        requestScope("risultati", risultati);
        
        return forward("index.jsp");
    }
}
