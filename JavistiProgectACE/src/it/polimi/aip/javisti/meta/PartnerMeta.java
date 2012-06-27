package it.polimi.aip.javisti.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-06-27 13:36:37")
/** */
public final class PartnerMeta extends org.slim3.datastore.ModelMeta<it.polimi.aip.javisti.model.Partner> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Partner, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Partner, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Partner> nome = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Partner>(this, "nome", "nome");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Partner> partitaIva = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Partner>(this, "partitaIva", "partitaIva");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Partner, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Partner, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final PartnerMeta slim3_singleton = new PartnerMeta();

    /**
     * @return the singleton
     */
    public static PartnerMeta get() {
       return slim3_singleton;
    }

    /** */
    public PartnerMeta() {
        super("Partner", it.polimi.aip.javisti.model.Partner.class);
    }

    @Override
    public it.polimi.aip.javisti.model.Partner entityToModel(com.google.appengine.api.datastore.Entity entity) {
        it.polimi.aip.javisti.model.Partner model = new it.polimi.aip.javisti.model.Partner();
        model.setKey(entity.getKey());
        model.setNome((java.lang.String) entity.getProperty("nome"));
        model.setPartitaIva((java.lang.String) entity.getProperty("partitaIva"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        it.polimi.aip.javisti.model.Partner m = (it.polimi.aip.javisti.model.Partner) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("nome", m.getNome());
        entity.setProperty("partitaIva", m.getPartitaIva());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        it.polimi.aip.javisti.model.Partner m = (it.polimi.aip.javisti.model.Partner) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        it.polimi.aip.javisti.model.Partner m = (it.polimi.aip.javisti.model.Partner) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        it.polimi.aip.javisti.model.Partner m = (it.polimi.aip.javisti.model.Partner) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        it.polimi.aip.javisti.model.Partner m = (it.polimi.aip.javisti.model.Partner) model;
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
        it.polimi.aip.javisti.model.Partner m = (it.polimi.aip.javisti.model.Partner) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getNome() != null){
            writer.setNextPropertyName("nome");
            encoder0.encode(writer, m.getNome());
        }
        if(m.getPartitaIva() != null){
            writer.setNextPropertyName("partitaIva");
            encoder0.encode(writer, m.getPartitaIva());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected it.polimi.aip.javisti.model.Partner jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        it.polimi.aip.javisti.model.Partner m = new it.polimi.aip.javisti.model.Partner();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("nome");
        m.setNome(decoder0.decode(reader, m.getNome()));
        reader = rootReader.newObjectReader("partitaIva");
        m.setPartitaIva(decoder0.decode(reader, m.getPartitaIva()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}