
package sw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para competencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="competencia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCompetencia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="listaRolCompetencia" type="{http://sw/}rolCompetencia" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "competencia", propOrder = {
    "descripcion",
    "idCompetencia",
    "listaRolCompetencia",
    "nombre"
})
public class Competencia {

    protected String descripcion;
    protected int idCompetencia;
    @XmlElement(nillable = true)
    protected List<RolCompetencia> listaRolCompetencia;
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idCompetencia.
     * 
     */
    public int getIdCompetencia() {
        return idCompetencia;
    }

    /**
     * Define el valor de la propiedad idCompetencia.
     * 
     */
    public void setIdCompetencia(int value) {
        this.idCompetencia = value;
    }

    /**
     * Gets the value of the listaRolCompetencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaRolCompetencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaRolCompetencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolCompetencia }
     * 
     * 
     */
    public List<RolCompetencia> getListaRolCompetencia() {
        if (listaRolCompetencia == null) {
            listaRolCompetencia = new ArrayList<RolCompetencia>();
        }
        return this.listaRolCompetencia;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
