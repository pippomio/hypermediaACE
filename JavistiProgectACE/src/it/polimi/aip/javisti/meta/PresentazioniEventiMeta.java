package it.polimi.aip.javisti.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-06-26 23:42:34")
/** */
public final class PresentazioniEventiMeta extends org.slim3.datastore.ModelMeta<it.polimi.aip.javisti.model.PresentazioniEventi> {

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<it.polimi.aip.javisti.model.PresentazioniEventi, org.slim3.datastore.ModelRef<it.polimi.aip.javisti.model.Evento>, it.polimi.aip.javisti.model.Evento> eventoRef = new org.slim3.datastore.ModelRefAttributeMeta<it.polimi.aip.javisti.model.PresentazioniEventi, org.slim3.datastore.ModelRef<it.polimi.aip.javisti.model.Evento>, it.polimi.aip.javisti.model.Evento>(this, "eventoRef", "eventoRef", org.slim3.datastore.ModelRef.class, it.polimi.aip.javisti.model.Evento.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.PresentazioniEventi, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.PresentazioniEventi, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<it.polimi.aip.javisti.model.PresentazioniEventi, org.slim3.datastore.ModelRef<it.polimi.aip.javisti.model.Progetto>, it.polimi.aip.javisti.model.Progetto> progettoRef = new org.slim3.datastore.ModelRefAttributeMeta<it.polimi.aip.javisti.model.PresentazioniEventi, org.slim3.datastore.ModelRef<it.polimi.aip.javisti.model.Progetto>, it.polimi.aip.javisti.model.Progetto>(this, "progettoRef", "progettoRef", org.slim3.datastore.ModelRef.class, it.polimi.aip.javisti.model.Progetto.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.PresentazioniEventi, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.PresentazioniEventi, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final PresentazioniEventiMeta slim3_singleton = new PresentazioniEventiMeta();

    /**
     * @return the singleton
     */
    public static PresentazioniEventiMeta get() {
       return slim3_singleton;
    }

    /** */
    public PresentazioniEventiMeta() {
        super("PresentazioniEventi", it.polimi.aip.javisti.model.PresentazioniEventi.class);
    }

    @Override
    public it.polimi.aip.javisti.model.PresentazioniEventi entityToModel(com.google.appengine.api.datastore.Entity entity) {
        it.polimi.aip.javisti.model.PresentazioniEventi model = new it.polimi.aip.javisti.model.PresentazioniEventi();
        if (model.getEventoRef() == null) {
            throw new NullPointerException("The property(eventoRef) is null.");
        }
        model.getEventoRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("eventoRef"));
        model.setKey(entity.getKey());
        if (model.getProgettoRef() == null) {
            throw new NullPointerException("The property(progettoRef) is null.");
        }
        model.getProgettoRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("progettoRef"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        it.polimi.aip.javisti.model.PresentazioniEventi m = (it.polimi.aip.javisti.model.PresentazioniEventi) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        if (m.getEventoRef() == null) {
            throw new NullPointerException("The property(eventoRef) must not be null.");
        }
        entity.setProperty("eventoRef", m.getEventoRef().getKey());
        if (m.getProgettoRef() == null) {
            throw new NullPointerException("The property(progettoRef) must not be null.");
        }
        entity.setProperty("progettoRef", m.getProgettoRef().getKey());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        it.polimi.aip.javisti.model.PresentazioniEventi m = (it.polimi.aip.javisti.model.PresentazioniEventi) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        it.polimi.aip.javisti.model.PresentazioniEventi m = (it.polimi.aip.javisti.model.PresentazioniEventi) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        it.polimi.aip.javisti.model.PresentazioniEventi m = (it.polimi.aip.javisti.model.PresentazioniEventi) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
        it.polimi.aip.javisti.model.PresentazioniEventi m = (it.polimi.aip.javisti.model.PresentazioniEventi) model;
        if (m.getEventoRef() == null) {
            throw new NullPointerException("The property(eventoRef) must not be null.");
        }
        m.getEventoRef().assignKeyIfNecessary(ds);
        if (m.getProgettoRef() == null) {
            throw new NullPointerException("The property(progettoRef) must not be null.");
        }
        m.getProgettoRef().assignKeyIfNecessary(ds);
    }

    @Override
    protected void incrementVersion(Object model) {
        it.polimi.aip.javisti.model.PresentazioniEventi m = (it.polimi.aip.javisti.model.PresentazioniEventi) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        it.polimi.aip.javisti.model.PresentazioniEventi m = (it.polimi.aip.javisti.model.PresentazioniEventi) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getEventoRef() != null && m.getEventoRef().getKey() != null){
            writer.setNextPropertyName("eventoRef");
            encoder0.encode(writer, m.getEventoRef(), maxDepth, currentDepth);
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getProgettoRef() != null && m.getProgettoRef().getKey() != null){
            writer.setNextPropertyName("progettoRef");
            encoder0.encode(writer, m.getProgettoRef(), maxDepth, currentDepth);
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected it.polimi.aip.javisti.model.PresentazioniEventi jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        it.polimi.aip.javisti.model.PresentazioniEventi m = new it.polimi.aip.javisti.model.PresentazioniEventi();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("eventoRef");
        decoder0.decode(reader, m.getEventoRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("progettoRef");
        decoder0.decode(reader, m.getProgettoRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}