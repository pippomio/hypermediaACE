package it.polimi.aip.javisti.model;

import it.polimi.aip.javisti.meta.ProgettoMeta;
import it.polimi.aip.javisti.meta.TemaMeta;

import java.io.Serializable;

import javax.jdo.datastore.DataStoreCache;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Query.SortDirection;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Datastore;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;

@Model(schemaVersion = 1)
public class Tema implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;
    
    
    private String nome;
    
    private String descrizione;
   
    private String id_tema;
  
    @Attribute(persistent=false)
    private InverseModelListRef<Progetto, Tema> progettiListRef = 
        new InverseModelListRef<Progetto, Tema>(Progetto.class , "temaRef" , this);

    @Attribute(persistent=false)
    private InverseModelListRef<Risultati, Tema> risultatiRef =
    new InverseModelListRef<Risultati, Tema>(Risultati.class, 
             "temaRef"
            , this);
    
    public Tema()
    {}
    
    public Tema(String nome, String descrizione)
    {
        this.nome = nome;
        this.descrizione = descrizione;
        this.id_tema = nome.replace(" ", "");
        this.setKey( Datastore.createKey(Tema.class, this.id_tema));
    }
    
    /**
     * Returns the key.
     *
     * @return the key
     */
    public Key getKey() {
        return key;
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
        Tema other = (Tema) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    public InverseModelListRef<Progetto, Tema> getProgettiListRef() {
        return progettiListRef;
    }


    public String getId_tema() {
        return id_tema;
    }


    public void setId_tema(String id_tema) {
        this.id_tema = id_tema;
    }

    public InverseModelListRef<Risultati, Tema> getRisultatiRef() {
        return risultatiRef;
    }



    

}
