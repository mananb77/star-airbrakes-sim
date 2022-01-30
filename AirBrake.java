package net.sf.openrocket.AirBrake;

import net.sf.openrocket.simulation.SimulationConditions;
import net.sf.openrocket.simulation.exception.SimulationException;
import net.sf.openrocket.simulation.extension.AbstractSimulationExtension;

public class AirBrake extends AbstractSimulationExtension {

    @Override
    public String getname() {
        return "Air Brake Control";
    }

    @Override
    public String getDescription() {
        return "Deploys air brake at specific time.";
    }

    @Override
    public void initialize(SimulationConditions conditions) throws SimulationException {
        conditions.getSimulationListenerList().add(new AirBrakeSimulationListener());
    }
}