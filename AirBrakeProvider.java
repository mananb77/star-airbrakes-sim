package net.sf.openrocket.AirBrake;

import net.sf.openrocket.plugin.Plugin;
import net.sf.openrocket.simulation.extension.AbstractSwingSimulationExtensionProvider;

@Plugin
public class AirBrakeProvider extends AbstractSwingSimulationExtensionProvider {

    public AirBrakeProvider() {
        super(AirBrake.class, "Flight", "Airbrake-AB");
    }
}