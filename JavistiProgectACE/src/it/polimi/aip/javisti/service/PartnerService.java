package it.polimi.aip.javisti.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;

import it.polimi.aip.javisti.meta.PartnerMeta;
import it.polimi.aip.javisti.model.Partner;
import it.polimi.aip.javisti.model.Tema;


public class PartnerService {

    private PartnerMeta partnerMeta = new PartnerMeta();
    
    
    public void addPartner(String partitaIva) {
        Partner partner = new Partner();
        Transaction tx = Datastore.beginTransaction();
        Key partnerKey = Datastore.createKey(Partner.class, partitaIva);
        partner.setKey(partnerKey);
        partner.setPartitaIva(partitaIva);
        Datastore.put(partner);
        tx.commit();
    }
    
    public List<Partner> getAllPartner() {
        return Datastore.query(partnerMeta).asList();
    }
    
}
