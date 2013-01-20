
package edu.upc.webservice.genero.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.upc.webservice.genero.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteResponse_QNAME = new QName("http://service.genero.webservice.upc.edu/", "deleteResponse");
    private final static QName _GetAllResponse_QNAME = new QName("http://service.genero.webservice.upc.edu/", "getAllResponse");
    private final static QName _Update_QNAME = new QName("http://service.genero.webservice.upc.edu/", "update");
    private final static QName _GetGenero_QNAME = new QName("http://service.genero.webservice.upc.edu/", "getGenero");
    private final static QName _Save_QNAME = new QName("http://service.genero.webservice.upc.edu/", "save");
    private final static QName _SaveResponse_QNAME = new QName("http://service.genero.webservice.upc.edu/", "saveResponse");
    private final static QName _UpdateResponse_QNAME = new QName("http://service.genero.webservice.upc.edu/", "updateResponse");
    private final static QName _GetGeneroResponse_QNAME = new QName("http://service.genero.webservice.upc.edu/", "getGeneroResponse");
    private final static QName _Delete_QNAME = new QName("http://service.genero.webservice.upc.edu/", "delete");
    private final static QName _GetAll_QNAME = new QName("http://service.genero.webservice.upc.edu/", "getAll");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.upc.webservice.genero.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetGenero }
     * 
     */
    public GetGenero createGetGenero() {
        return new GetGenero();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link GetGeneroResponse }
     * 
     */
    public GetGeneroResponse createGetGeneroResponse() {
        return new GetGeneroResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link Genero }
     * 
     */
    public Genero createGenero() {
        return new Genero();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.genero.webservice.upc.edu/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.genero.webservice.upc.edu/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.genero.webservice.upc.edu/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGenero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.genero.webservice.upc.edu/", name = "getGenero")
    public JAXBElement<GetGenero> createGetGenero(GetGenero value) {
        return new JAXBElement<GetGenero>(_GetGenero_QNAME, GetGenero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.genero.webservice.upc.edu/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.genero.webservice.upc.edu/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.genero.webservice.upc.edu/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeneroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.genero.webservice.upc.edu/", name = "getGeneroResponse")
    public JAXBElement<GetGeneroResponse> createGetGeneroResponse(GetGeneroResponse value) {
        return new JAXBElement<GetGeneroResponse>(_GetGeneroResponse_QNAME, GetGeneroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.genero.webservice.upc.edu/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.genero.webservice.upc.edu/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

}
