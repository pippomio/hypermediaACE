package it.polimi.aip.javisti.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-06-27 13:37:04")
/** */
public final class EventoMeta extends org.slim3.datastore.ModelMeta<it.polimi.aip.javisti.model.Evento> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Evento, java.util.Date> data = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Evento, java.util.Date>(this, "data", "data", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Evento> descrizione = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Evento>(this, "descrizione", "descrizione");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Evento> id_evento = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Evento>(this, "id_evento", "id_evento");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Evento, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Evento, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Evento> sede = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Evento>(this, "sede", "sede");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Evento, it.polimi.aip.javisti.model.TipoEvento> tipo = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Evento, it.polimi.aip.javisti.model.TipoEvento>(this, "tipo", "tipo", it.polimi.aip.javisti.model.TipoEvento.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Evento> titolo = new org.slim3.datastore.StringAttributeMeta<it.polimi.aip.javisti.model.Evento>(this, "titolo", "titolo");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Evento, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<it.polimi.aip.javisti.model.Evento, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final EventoMeta slim3_singleton = new EventoMeta();

    /**
     * @return the singleton
     */
    public static EventoMeta get() {
       return slim3_singleton;
    }

    /** */
    public EventoMeta() {
        super("Evento", it.polimi.aip.javisti.model.Evento.class);
    }

    @Override
    public it.polimi.aip.javisti.model.Evento entityToModel(com.google.appengine.api.datastore.Entity entity) {
        it.polimi.aip.javisti.model.Evento model = new it.polimi.aip.javisti.model.Evento();
        model.setData((java.util.Date) entity.getProperty("data"));
        model.setDescrizione((java.lang.String) entity.getProperty("descrizione"));
        model.setId_evento((java.lang.String) entity.getProperty("id_evento"));
        model.setKey(entity.getKey());
        model.setSede((java.lang.String) entity.getProperty("sede"));
        model.setTipo(stringToEnum(it.polimi.aip.javisti.model.TipoEvento.class, (java.lang.String) entity.getProperty("tipo")));
        model.setTitolo((java.lang.String) entity.getProperty("titolo"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        it.polimi.aip.javisti.model.Evento m = (it.polimi.aip.javisti.model.Evento) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("data", m.getData());
        entity.setProperty("descrizione", m.getDescrizione());
        entity.setProperty("id_evento", m.getId_evento());
        entity.setProperty("sede", m.getSede());
        entity.setProperty("tipo", enumToString(m.getTipo()));
        entity.setProperty("titolo", m.getTitolo());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        it.polimi.aip.javisti.model.Evento m = (it.polimi.aip.javisti.model.Evento) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        it.polimi.aip.javisti.model.Evento m = (it.polimi.aip.javisti.model.Evento) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        it.polimi.aip.javisti.model.Evento m = (it.polimi.aip.javisti.model.Evento) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        it.polimi.aip.javisti.model.Evento m = (it.polimi.aip.javisti.model.Evento) model;
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
        it.polimi.aip.javisti.model.Evento m = (it.polimi.aip.javisti.model.Evento) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getData() != null){
            writer.setNextPropertyName("data");
            encoder0.encode(writer, m.getData());
        }
        if(m.getDescrizione() != null){
            writer.setNextPropertyName("descrizione");
            encoder0.encode(writer, m.getDescrizione());
        }
        if(m.getId_evento() != null){
            writer.setNextPropertyName("id_evento");
            encoder0.encode(writer, m.getId_evento());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getSede() != null){
            writer.setNextPropertyName("sede");
            encoder0.encode(writer, m.getSede());
        }
        if(m.getTipo() != null){
            writer.setNextPropertyName("tipo");
            encoder0.encode(writer, m.getTipo());
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
    protected it.polimi.aip.javisti.model.Evento jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        it.polimi.aip.javisti.model.Evento m = new it.polimi.aip.javisti.model.Evento();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("data");
        m.setData(decoder0.decode(reader, m.getData()));
        reader = rootReader.newObjectReader("descrizione");
        m.setDescrizione(decoder0.decode(reader, m.getDescrizione()));
        reader = rootReader.newObjectReader("id_evento");
        m.setId_evento(decoder0.decode(reader, m.getId_evento()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("sede");
        m.setSede(decoder0.decode(reader, m.getSede()));
        reader = rootReader.newObjectReader("tipo");
        m.setTipo(decoder0.decode(reader, m.getTipo(), it.polimi.aip.javisti.model.TipoEvento.class));
        reader = rootReader.newObjectReader("titolo");
        m.setTitolo(decoder0.decode(reader, m.getTitolo()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}