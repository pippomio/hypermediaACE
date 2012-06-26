package it.polimi.aip.javisti.controller.inserisciRisultati;

import it.polimi.aip.javisti.model.Risultati;
import it.polimi.aip.javisti.model.RisultatoOttenuto;
import it.polimi.aip.javisti.service.RisultatiService;

import javax.servlet.http.HttpServletRequest;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;
import org.slim3.util.RequestLocator;

public class NuovorisultatoController extends Controller {

    @Override
    public Navigation run() throws Exception {
        HttpServletRequest request = RequestLocator.get();
        
       
        String titolo = request.getAttribute("titolo").toString();
        RisultatiService risService = new RisultatiService();
        risService.addRisultato(titolo, request.getAttribute("progetto").toString());
        
        return redirect(this.basePath);
    }
}
