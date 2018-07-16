
package br.com.caelum.estoque.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoItem.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoItem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Livro"/&gt;
 *     &lt;enumeration value="Celular"/&gt;
 *     &lt;enumeration value="Tablet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoItem")
@XmlEnum
public enum TipoItem {

    @XmlEnumValue("Livro")
    LIVRO("Livro"),
    @XmlEnumValue("Celular")
    CELULAR("Celular"),
    @XmlEnumValue("Tablet")
    TABLET("Tablet");
    private final String value;

    TipoItem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoItem fromValue(String v) {
        for (TipoItem c: TipoItem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
