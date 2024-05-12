
package sw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="idRol" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="listaRolCompetencia" type="{http://sw/}rolCompetencia" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listaUsuarioRol" type="{http://sw/}usuarioRol" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rol", propOrder = {
    "estado",
    "idRol",
    "listaRolCompetencia",
    "listaUsuarioRol",
    "rol"
})
public class Rol {

    protected boolean estado;
    protected int idRol;
    @XmlElement(nillable = true)
    protected List<RolCompetencia> listaRolCompetencia;
    @XmlElement(nillable = true)
    protected List<UsuarioRol> listaUsuarioRol;
    protected String rol;

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(boolean value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad idRol.
     * 
     */
    public int getIdRol() {
        return idRol;
    }

    /**
     * Define el valor de la propiedad idRol.
     * 
     */
    public void setIdRol(int value) {
        this.idRol = value;
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
     * Gets the value of the listaUsuarioRol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaUsuarioRol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaUsuarioRol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioRol }
     * 
     * 
     */
    public List<UsuarioRol> getListaUsuarioRol() {
        if (listaUsuarioRol == null) {
            listaUsuarioRol = new ArrayList<UsuarioRol>();
        }
        return this.listaUsuarioRol;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRol(String value) {
        this.rol = value;
    }

}
