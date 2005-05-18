/*
 * FuzzListener.java
 *
 * Created on 06 February 2005, 08:42
 */

package org.owasp.webscarab.plugin.fuzz;

import org.owasp.webscarab.model.HttpUrl;
import org.owasp.webscarab.plugin.PluginListener;

/**
 *
 * @author  rogan
 */
public interface FuzzerListener extends PluginListener {
    
    public abstract void appStatusChanged(FuzzerEvent evt);
    
    public abstract void signatureAdded(FuzzerEvent evt);
    
    public abstract void authenticationRequired(FuzzerEvent evt);
    
    public abstract void urlError(FuzzerEvent evt);
    
    public abstract void fuzzerStarted(FuzzerEvent evt);
    
    public abstract void fuzzerStopped(FuzzerEvent evt);
    
}
