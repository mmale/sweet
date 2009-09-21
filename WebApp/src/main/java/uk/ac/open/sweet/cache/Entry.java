/*
 * Entry.java
 * 
 * Created on Aug 27, 2007, 1:33:06 PM
 *
 */

package uk.ac.open.sweet.cache;

import java.io.Serializable;

/**
 *
 * @author KMi, The Open University
 */
public class Entry implements Serializable {

    public Object key;
    public Object value;
    
    public Entry () {}
    
    public Entry(Object key, Object value) {
        this();
        this.key = key;
        this.value = value;
    }

}
