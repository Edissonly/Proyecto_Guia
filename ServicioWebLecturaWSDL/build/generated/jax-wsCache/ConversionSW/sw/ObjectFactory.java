
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
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

    private final static QName _Consulta_QNAME = new QName("http://sw/", "consulta");
    private final static QName _ConsultaResponse_QNAME = new QName("http://sw/", "consultaResponse");
    private final static QName _Diccionario_QNAME = new QName("http://sw/", "diccionario");
    private final static QName _DiccionarioResponse_QNAME = new QName("http://sw/", "diccionarioResponse");
    private final static QName _EuroAdolar_QNAME = new QName("http://sw/", "euroAdolar");
    private final static QName _EuroAdolarResponse_QNAME = new QName("http://sw/", "euroAdolarResponse");
    private final static QName _Hello_QNAME = new QName("http://sw/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://sw/", "helloResponse");
    private final static QName _ValidarDatos_QNAME = new QName("http://sw/", "validarDatos");
    private final static QName _ValidarDatosResponse_QNAME = new QName("http://sw/", "validarDatosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Consulta }
     * 
     */
    public Consulta createConsulta() {
        return new Consulta();
    }

    /**
     * Create an instance of {@link ConsultaResponse }
     * 
     */
    public ConsultaResponse createConsultaResponse() {
        return new ConsultaResponse();
    }

    /**
     * Create an instance of {@link Diccionario }
     * 
     */
    public Diccionario createDiccionario() {
        return new Diccionario();
    }

    /**
     * Create an instance of {@link DiccionarioResponse }
     * 
     */
    public DiccionarioResponse createDiccionarioResponse() {
        return new DiccionarioResponse();
    }

    /**
     * Create an instance of {@link EuroAdolar }
     * 
     */
    public EuroAdolar createEuroAdolar() {
        return new EuroAdolar();
    }

    /**
     * Create an instance of {@link EuroAdolarResponse }
     * 
     */
    public EuroAdolarResponse createEuroAdolarResponse() {
        return new EuroAdolarResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ValidarDatos }
     * 
     */
    public ValidarDatos createValidarDatos() {
        return new ValidarDatos();
    }

    /**
     * Create an instance of {@link ValidarDatosResponse }
     * 
     */
    public ValidarDatosResponse createValidarDatosResponse() {
        return new ValidarDatosResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link TipoPago }
     * 
     */
    public TipoPago createTipoPago() {
        return new TipoPago();
    }

    /**
     * Create an instance of {@link UsuarioRol }
     * 
     */
    public UsuarioRol createUsuarioRol() {
        return new UsuarioRol();
    }

    /**
     * Create an instance of {@link Rol }
     * 
     */
    public Rol createRol() {
        return new Rol();
    }

    /**
     * Create an instance of {@link RolCompetencia }
     * 
     */
    public RolCompetencia createRolCompetencia() {
        return new RolCompetencia();
    }

    /**
     * Create an instance of {@link Competencia }
     * 
     */
    public Competencia createCompetencia() {
        return new Competencia();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consulta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Consulta }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "consulta")
    public JAXBElement<Consulta> createConsulta(Consulta value) {
        return new JAXBElement<Consulta>(_Consulta_QNAME, Consulta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "consultaResponse")
    public JAXBElement<ConsultaResponse> createConsultaResponse(ConsultaResponse value) {
        return new JAXBElement<ConsultaResponse>(_ConsultaResponse_QNAME, ConsultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diccionario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Diccionario }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "diccionario")
    public JAXBElement<Diccionario> createDiccionario(Diccionario value) {
        return new JAXBElement<Diccionario>(_Diccionario_QNAME, Diccionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiccionarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiccionarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "diccionarioResponse")
    public JAXBElement<DiccionarioResponse> createDiccionarioResponse(DiccionarioResponse value) {
        return new JAXBElement<DiccionarioResponse>(_DiccionarioResponse_QNAME, DiccionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroAdolar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EuroAdolar }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "euroAdolar")
    public JAXBElement<EuroAdolar> createEuroAdolar(EuroAdolar value) {
        return new JAXBElement<EuroAdolar>(_EuroAdolar_QNAME, EuroAdolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroAdolarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EuroAdolarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "euroAdolarResponse")
    public JAXBElement<EuroAdolarResponse> createEuroAdolarResponse(EuroAdolarResponse value) {
        return new JAXBElement<EuroAdolarResponse>(_EuroAdolarResponse_QNAME, EuroAdolarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarDatos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarDatos }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "validarDatos")
    public JAXBElement<ValidarDatos> createValidarDatos(ValidarDatos value) {
        return new JAXBElement<ValidarDatos>(_ValidarDatos_QNAME, ValidarDatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarDatosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarDatosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "validarDatosResponse")
    public JAXBElement<ValidarDatosResponse> createValidarDatosResponse(ValidarDatosResponse value) {
        return new JAXBElement<ValidarDatosResponse>(_ValidarDatosResponse_QNAME, ValidarDatosResponse.class, null, value);
    }

}
