package it.polimi.aip.javisti.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-06-30 11:07:13")
/** */
public final class TemaMeta extends org.slim3.datastore.ModelMeta<it.polimi.aip.javisti.model.Tema> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Tema> descrizione = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Tema>(this, "descrizione", "descrizione");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Tema> id_tema = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Tema>(this, "id_tema", "id_tema");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Tema, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Tema, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Tema> nome = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Tema>(this, "nome", "nome");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Tema, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Tema, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final TemaMeta slim3_singleton = new TemaMeta();

    /**
     * @return the singleton
     */
    public static TemaMeta get() {
       return slim3_singleton;
    }

    /** */
    public TemaMeta() {
        super("Tema", it.polimi.aip.javisti.model.Tema.class);
    }

    @Override
    public it.polimi.aip.javisti.model.Tema entityToModel(com.google.appengine.api.datastore.Entity entity) {
        it.polimi.aip.javisti.model.Tema model = new it.polimi.aip.javisti.model.Tema();
        model.setDescrizione((java.lang.String) entity.getProperty("descrizione"));
        model.setId_tema((java.lang.String) entity.getProperty("id_tema"));
        model.setKey(entity.getKey());
        model.setNome((java.lang.String) entity.getProperty("nome"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        it.polimi.aip.javisti.model.Tema m = (it.polimi.aip.javisti.model.Tema) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("descrizione", m.getDescrizione());
        entity.setProperty("id_tema", m.getId_tema());
        entity.setProperty("nome", m.getNome());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        it.polimi.aip.javisti.model.Tema m = (it.polimi.aip.javisti.model.Tema) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        it.polimi.aip.javisti.model.Tema m = (it.polimi.aip.javisti.model.Tema) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        it.polimi.aip.javisti.model.Tema m = (it.polimi.aip.javisti.model.Tema) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        it.polimi.aip.javisti.model.Tema m = (it.polimi.aip.javisti.model.Tema) model;
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
        it.polimi.aip.javisti.model.Tema m = (it.polimi.aip.javisti.model.Tema) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getDescrizione() != null){
            writer.setNextPropertyName("descrizione");
            encoder0.encode(writer, m.getDescrizione());
        }
        if(m.getId_tema() != null){
            writer.setNextPropertyName("id_tema");
            encoder0.encode(writer, m.getId_tema());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getNome() != null){
            writer.setNextPropertyName("nome");
            encoder0.encode(writer, m.getNome());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected it.polimi.aip.javisti.model.Tema jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        it.polimi.aip.javisti.model.Tema m = new it.polimi.aip.javisti.model.Tema();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("descrizione");
        m.setDescrizione(decoder0.decode(reader, m.getDescrizione()));
        reader = rootReader.newObjectReader("id_tema");
        m.setId_tema(decoder0.decode(reader, m.getId_tema()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("nome");
        m.setNome(decoder0.decode(reader, m.getNome()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}