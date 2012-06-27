package it.polimi.aip.javisti.model;

import java.io.Serializable;
import java.util.Date;

import com.google.appengine.api.datastore.Key;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Datastore;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModelRef;

@Model(schemaVersion = 1)
public class Progetto implements Serializable {

    private static final long serialVersionUID = 1L;
    private String descrizione;
    private String titolo;
    private ModelRef<Tema> temaRef =
            new ModelRef<Tema>(Tema.class);
    private Date dataInizio;
    private Date dataFine;
    private String obbiettivi;
    private ModelRef<Partner> partnerRef = 
            new ModelRef<Partner>(Partner.class);
    
    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;

    @Attribute(persistent=false)
    private InverseModelListRef<PresentazioniEventi, Progetto>  presentazioneProgettiListRef =
      new InverseModelListRef<PresentazioniEventi, Progetto>
        (PresentazioniEventi.class, "progettoRef" , this);
    
    
  
    
    public Progetto()
    {
        
    }
    
    public Progetto(String titolo)
    {
        this.setKey( Datastore.createKey(Progetto.class, titolo));
        this.setTitolo(titolo);
    }

    public Key getKey() {
        return key;
    }

    public String getTitolo()
    {
        return this.titolo;
    }

    public void setTitolo(String titolo)
    {
        this.titolo = titolo;
    }
    

    
    
    /**
     * Sets the key.
     *
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Progetto other = (Progetto) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public ModelRef<Tema> getTemaRef() {
        return temaRef;
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }

    public String getObbiettivi() {
        return obbiettivi;
    }

    public void setObbiettivi(String obbiettivi) {
        this.obbiettivi = obbiettivi;
    }

    public InverseModelListRef<PresentazioniEventi, Progetto> getPresentazioneProgettiListRef() {
        return presentazioneProgettiListRef;
    }

    public ModelRef<Partner> getPartnerRef() {
        return partnerRef;
    }

   
 


}
