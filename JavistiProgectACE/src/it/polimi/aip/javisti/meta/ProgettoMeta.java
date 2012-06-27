package it.polimi.aip.javisti.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-06-27 14:52:28")
/** */
public final class ProgettoMeta extends org.slim3.datastore.ModelMeta<it.polimi.aip.javisti.model.Progetto> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Progetto, java.util.Date> dataFine = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Progetto, java.util.Date>(this, "dataFine", "dataFine", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Progetto, java.util.Date> dataInizio = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Progetto, java.util.Date>(this, "dataInizio", "dataInizio", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Progetto> descrizione = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Progetto>(this, "descrizione", "descrizione");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Progetto, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Progetto, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Progetto> obbiettivi = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Progetto>(this, "obbiettivi", "obbiettivi");

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<it.polimi.aip.javisti.model.Progetto, org.slim3.datastore.ModelRef<it.polimi.aip.javisti.model.Partner>, it.polimi.aip.javisti.model.Partner> partnerRef = new org.slim3.datastore.ModelRefAttributeMeta<it.polimi.aip.javisti.model.Progetto, org.slim3.datastore.ModelRef<it.polimi.aip.javisti.model.Partner>, it.polimi.aip.javisti.model.Partner>(this, "partnerRef", "partnerRef", org.slim3.datastore.ModelRef.class, it.polimi.aip.javisti.model.Partner.class);

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<it.polimi.aip.javisti.model.Progetto, org.slim3.datastore.ModelRef<it.polimi.aip.javisti.model.Tema>, it.polimi.aip.javisti.model.Tema> temaRef = new org.slim3.datastore.ModelRefAttributeMeta<it.polimi.aip.javisti.model.Progetto, org.slim3.datastore.ModelRef<it.polimi.aip.javisti.model.Tema>, it.polimi.aip.javisti.model.Tema>(this, "temaRef", "temaRef", org.slim3.datastore.ModelRef.class, it.polimi.aip.javisti.model.Tema.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Progetto> titolo = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Progetto>(this, "titolo", "titolo");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Progetto, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Progetto, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final ProgettoMeta slim3_singleton = new ProgettoMeta();

    /**
     * @return the singleton
     */
    public static ProgettoMeta get() {
       return slim3_singleton;
    }

    /** */
    public ProgettoMeta() {
        super("Progetto", it.polimi.aip.javisti.model.Progetto.class);
    }

    @Override
    public it.polimi.aip.javisti.model.Progetto entityToModel(com.google.appengine.api.datastore.Entity entity) {
        it.polimi.aip.javisti.model.Progetto model = new it.polimi.aip.javisti.model.Progetto();
        model.setDataFine((java.util.Date) entity.getProperty("dataFine"));
        model.setDataInizio((java.util.Date) entity.getProperty("dataInizio"));
        model.setDescrizione((java.lang.String) entity.getProperty("descrizione"));
        model.setKey(entity.getKey());
        model.setObbiettivi((java.lang.String) entity.getProperty("obbiettivi"));
        if (model.getPartnerRef() == null) {
            throw new NullPointerException("The property(partnerRef) is null.");
        }
        model.getPartnerRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("partnerRef"));
        if (model.getTemaRef() == null) {
            throw new NullPointerException("The property(temaRef) is null.");
        }
        model.getTemaRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("temaRef"));
        model.setTitolo((java.lang.String) entity.getProperty("titolo"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        it.polimi.aip.javisti.model.Progetto m = (it.polimi.aip.javisti.model.Progetto) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("dataFine", m.getDataFine());
        entity.setProperty("dataInizio", m.getDataInizio());
        entity.setProperty("descrizione", m.getDescrizione());
        entity.setProperty("obbiettivi", m.getObbiettivi());
        if (m.getPartnerRef() == null) {
            throw new NullPointerException("The property(partnerRef) must not be null.");
        }
        entity.setProperty("partnerRef", m.getPartnerRef().getKey());
        if (m.getTemaRef() == null) {
            throw new NullPointerException("The property(temaRef) must not be null.");
        }
        entity.setProperty("temaRef", m.getTemaRef().getKey());
        entity.setProperty("titolo", m.getTitolo());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        it.polimi.aip.javisti.model.Progetto m = (it.polimi.aip.javisti.model.Progetto) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        it.polimi.aip.javisti.model.Progetto m = (it.polimi.aip.javisti.model.Progetto) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        it.polimi.aip.javisti.model.Progetto m = (it.polimi.aip.javisti.model.Progetto) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
        it.polimi.aip.javisti.model.Progetto m = (it.polimi.aip.javisti.model.Progetto) model;
        if (m.getPartnerRef() == null) {
            throw new NullPointerException("The property(partnerRef) must not be null.");
        }
        m.getPartnerRef().assignKeyIfNecessary(ds);
        if (m.getTemaRef() == null) {
            throw new NullPointerException("The property(temaRef) must not be null.");
        }
        m.getTemaRef().assignKeyIfNecessary(ds);
    }

    @Override
    protected void incrementVersion(Object model) {
        it.polimi.aip.javisti.model.Progetto m = (it.polimi.aip.javisti.model.Progetto) model;
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
        it.polimi.aip.javisti.model.Progetto m = (it.polimi.aip.javisti.model.Progetto) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getDataFine() != null){
            writer.setNextPropertyName("dataFine");
            encoder0.encode(writer, m.getDataFine());
        }
        if(m.getDataInizio() != null){
            writer.setNextPropertyName("dataInizio");
            encoder0.encode(writer, m.getDataInizio());
        }
        if(m.getDescrizione() != null){
            writer.setNextPropertyName("descrizione");
            encoder0.encode(writer, m.getDescrizione());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getObbiettivi() != null){
            writer.setNextPropertyName("obbiettivi");
            encoder0.encode(writer, m.getObbiettivi());
        }
        if(m.getPartnerRef() != null && m.getPartnerRef().getKey() != null){
            writer.setNextPropertyName("partnerRef");
            encoder0.encode(writer, m.getPartnerRef(), maxDepth, currentDepth);
        }
        if(m.getTemaRef() != null && m.getTemaRef().getKey() != null){
            writer.setNextPropertyName("temaRef");
            encoder0.encode(writer, m.getTemaRef(), maxDepth, currentDepth);
        }
        if(m.getTitolo() != null){
            writer.setNextPropertyName("titolo");
            encoder0.encode(writer, m.getTitolo());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected it.polimi.aip.javisti.model.Progetto jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        it.polimi.aip.javisti.model.Progetto m = new it.polimi.aip.javisti.model.Progetto();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("dataFine");
        m.setDataFine(decoder0.decode(reader, m.getDataFine()));
        reader = rootReader.newObjectReader("dataInizio");
        m.setDataInizio(decoder0.decode(reader, m.getDataInizio()));
        reader = rootReader.newObjectReader("descrizione");
        m.setDescrizione(decoder0.decode(reader, m.getDescrizione()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("obbiettivi");
        m.setObbiettivi(decoder0.decode(reader, m.getObbiettivi()));
        reader = rootReader.newObjectReader("partnerRef");
        decoder0.decode(reader, m.getPartnerRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("temaRef");
        decoder0.decode(reader, m.getTemaRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("titolo");
        m.setTitolo(decoder0.decode(reader, m.getTitolo()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}