package it.polimi.aip.javisti.controller.progetti;

import it.polimi.aip.javisti.model.Partner;
import it.polimi.aip.javisti.model.Tema;
import it.polimi.aip.javisti.service.PartnerService;
import it.polimi.aip.javisti.service.TemaService;
import it.polimi.aip.javisti.service.progettoService;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestLocator;

public class NuovoProgettoController extends Controller {

    @Override
    public Navigation run() throws Exception {
     
        TemaService  temaService = new TemaService();
        PartnerService partnerService = new PartnerService();
        
        List<Tema> tuttiTemi = temaService.getAllThemes();
        List<Partner> tuttiPartner = partnerService.getAllPartner();
        requestScope("listTemi", tuttiTemi);
        requestScope("listPartner",tuttiPartner);
      
      
        
       return forward("InserimentoProgetto.jsp");
    }
}
