package it.polimi.aip.javisti.controller.partners;

import it.polimi.aip.javisti.service.PartnerService;

import javax.servlet.http.HttpServletRequest;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestLocator;

public class NuovoPartnerController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        HttpServletRequest request = RequestLocator.get();
        PartnerService pService = new PartnerService();
        String partitaIva = request.getAttribute("partitaIva").toString();
        pService.addPartner(partitaIva);
        
        return redirect(this.basePath+"InserisciPartner");
    }
}
