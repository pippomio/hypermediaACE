package it.polimi.aip.javisti.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-06-27 09:45:05")
/** */
public final class RisultatiMeta extends org.slim3.datastore.ModelMeta<it.polimi.aip.javisti.model.Risultati> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Risultati, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Risultati, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<it.polimi.aip.javisti.model.Risultati, org.slim3.datastore.ModelRef<it.polimi.aip.javisti.model.Progetto>, it.polimi.aip.javisti.model.Progetto> progettoRef = new org.slim3.datastore.ModelRefAttributeMeta<it.polimi.aip.javisti.model.Risultati, org.slim3.datastore.ModelRef<it.polimi.aip.javisti.model.Progetto>, it.polimi.aip.javisti.model.Progetto>(this, "progettoRef", "progettoRef", org.slim3.datastore.ModelRef.class, it.polimi.aip.javisti.model.Progetto.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Risultati> titolo = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Risultati>(this, "titolo", "titolo");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Risultati, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Risultati, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final RisultatiMeta slim3_singleton = new RisultatiMeta();

    /**
     * @return the singleton
     */
    public static RisultatiMeta get() {
       return slim3_singleton;
    }

    /** */
    public RisultatiMeta() {
        super("Risultati", it.polimi.aip.javisti.model.Risultati.class);
    }

    @Override
    public it.polimi.aip.javisti.model.Risultati entityToModel(com.google.appengine.api.datastore.Entity entity) {
        it.polimi.aip.javisti.model.Risultati model = new it.polimi.aip.javisti.model.Risultati();
        model.setKey(entity.getKey());
        if (model.getProgettoRef() == null) {
            throw new NullPointerException("The property(progettoRef) is null.");
        }
        model.getProgettoRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("progettoRef"));
        model.setTitolo((java.lang.String) entity.getProperty("titolo"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        it.polimi.aip.javisti.model.Risultati m = (it.polimi.aip.javisti.model.Risultati) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        if (m.getProgettoRef() == null) {
            throw new NullPointerException("The property(progettoRef) must not be null.");
        }
        entity.setProperty("progettoRef", m.getProgettoRef().getKey());
        entity.setProperty("titolo", m.getTitolo());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        it.polimi.aip.javisti.model.Risultati m = (it.polimi.aip.javisti.model.Risultati) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        it.polimi.aip.javisti.model.Risultati m = (it.polimi.aip.javisti.model.Risultati) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        it.polimi.aip.javisti.model.Risultati m = (it.polimi.aip.javisti.model.Risultati) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
        it.polimi.aip.javisti.model.Risultati m = (it.polimi.aip.javisti.model.Risultati) model;
        if (m.getProgettoRef() == null) {
            throw new NullPointerException("The property(progettoRef) must not be null.");
        }
        m.getProgettoRef().assignKeyIfNecessary(ds);
    }

    @Override
    protected void incrementVersion(Object model) {
        it.polimi.aip.javisti.model.Risultati m = (it.polimi.aip.javisti.model.Risultati) model;
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
        it.polimi.aip.javisti.model.Risultati m = (it.polimi.aip.javisti.model.Risultati) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getProgettoRef() != null && m.getProgettoRef().getKey() != null){
            writer.setNextPropertyName("progettoRef");
            encoder0.encode(writer, m.getProgettoRef(), maxDepth, currentDepth);
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
    protected it.polimi.aip.javisti.model.Risultati jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        it.polimi.aip.javisti.model.Risultati m = new it.polimi.aip.javisti.model.Risultati();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("progettoRef");
        decoder0.decode(reader, m.getProgettoRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("titolo");
        m.setTitolo(decoder0.decode(reader, m.getTitolo()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}