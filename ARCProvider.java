package net.sf.openrocket.ARC;

import net.sf.openrocket.plugin.Plugin;
import net.sf.openrocket.simulation.extension.AbstractSimulationExtensionProvider;

@Plugin
public class ARCProvider extends AbstractSimulationExtensionProvider {
    
    public ARCProvider() {
        super(ARC.class, "Flight", "ARC-AB");
    }
}