//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.21 at 10:23:44 AM CEST 
//


package pl.training.integration.lab03;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.training.integration.lab03 package.
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.training.integration.lab03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Shiporder }
     * 
     */
    public Shiporder createShiporder() {
        return new Shiporder();
    }

    /**
     * Create an instance of {@link Shiporder.Shipto }
     * 
     */
    public Shiporder.Shipto createShiporderShipto() {
        return new Shiporder.Shipto();
    }

    /**
     * Create an instance of {@link Shiporder.Item }
     * 
     */
    public Shiporder.Item createShiporderItem() {
        return new Shiporder.Item();
    }

}
