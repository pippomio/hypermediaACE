package it.polimi.aip.javisti.controller.inserisciRisultati;

import it.polimi.aip.javisti.service.RisultatiService;

import javax.servlet.http.HttpServletRequest;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestLocator;

public class MettiDatiRisultatiController extends Controller {

    @Override
    public Navigation run() throws Exception {
        HttpServletRequest request = RequestLocator.get();
        
      System.out.println("metti dati risultati controller"); 
        String titolo = request.getAttribute("titolo").toString();
        RisultatiService risService = new RisultatiService();
      
        risService.addRisultato(titolo
            ,request.getAttribute("descrizione").toString()
            , request.getAttribute("progetto").toString()
            ,request.getAttribute("id_tema").toString() );
        
        return redirect(this.basePath+ "RisultatiPreparaForm");
    }
}
