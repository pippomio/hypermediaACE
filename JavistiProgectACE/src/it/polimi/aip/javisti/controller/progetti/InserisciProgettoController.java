package it.polimi.aip.javisti.controller.progetti;

import it.polimi.aip.javisti.model.Partner;
import it.polimi.aip.javisti.model.Tema;
import it.polimi.aip.javisti.service.PartnerService;
import it.polimi.aip.javisti.service.TemaService;
import it.polimi.aip.javisti.service.progettoService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestLocator;


public class InserisciProgettoController extends Controller {

    @Override
    public Navigation run() throws Exception
    {
        
       
       
        HttpServletRequest request = RequestLocator.get();
        
        
  
        String partnerKey = request.getParameter("partnerKey");
        System.out.println("parteKey = "+partnerKey);
        String tema = request.getParameter("tema");
        String descrizione = request.getParameter("descrizione");
        String nome = request.getParameter("nome");
        
        progettoService progService = new progettoService();
        progService.addProgetto(nome, descrizione, tema, partnerKey);
        return redirect(this.basePath+"NuovoProgetto");
    }
}
