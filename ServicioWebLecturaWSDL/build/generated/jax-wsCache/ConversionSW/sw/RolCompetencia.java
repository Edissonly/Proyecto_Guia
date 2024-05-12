
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rolCompetencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rolCompetencia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCompetencia" type="{http://sw/}competencia" minOccurs="0"/&gt;
 *         &lt;element name="idRol" type="{http://sw/}rol" minOccurs="0"/&gt;
 *         &lt;element name="idRolCompetencia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rolCompetencia", propOrder = {
    "idCompetencia",
    "idRol",
    "idRolCompetencia"
})
public class RolCompetencia {

    protected Competencia idCompetencia;
    protected Rol idRol;
    protected int idRolCompetencia;

    /**
     * Obtiene el valor de la propiedad idCompetencia.
     * 
     * @return
     *     possible object is
     *     {@link Competencia }
     *     
     */
    public Competencia getIdCompetencia() {
        return idCompetencia;
    }

    /**
     * Define el valor de la propiedad idCompetencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Competencia }
     *     
     */
    public void setIdCompetencia(Competencia value) {
        this.idCompetencia = value;
    }

    /**
     * Obtiene el valor de la propiedad idRol.
     * 
     * @return
     *     possible object is
     *     {@link Rol }
     *     
     */
    public Rol getIdRol() {
        return idRol;
    }

    /**
     * Define el valor de la propiedad idRol.
     * 
     * @param value
     *     allowed object is
     *     {@link Rol }
     *     
     */
    public void setIdRol(Rol value) {
        this.idRol = value;
    }

    /**
     * Obtiene el valor de la propiedad idRolCompetencia.
     * 
     */
    public int getIdRolCompetencia() {
        return idRolCompetencia;
    }

    /**
     * Define el valor de la propiedad idRolCompetencia.
     * 
     */
    public void setIdRolCompetencia(int value) {
        this.idRolCompetencia = value;
    }

}
