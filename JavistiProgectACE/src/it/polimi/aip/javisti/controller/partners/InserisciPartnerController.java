package it.polimi.aip.javisti.controller.partners;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class InserisciPartnerController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("InserisciPartner.jsp");
    }
}