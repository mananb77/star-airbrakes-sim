package net.sf.openrocket.ARC;

import net.sf.openrocket.simulation.SimulationConditions;
import net.sf.openrocket.simulation.expection.SimulationExpection;
import net.sf.openrocket.simulation.extension.AbstractSimulationExtension;

public class ARC extends AbstractSimulationExtension{

    @Override
    public String getName() {
        return "Air Brake Control";
    }

    @Override
    public String getDescription(){
        return "Deploys air brake at specfic time.";
    }

    @Override
    public void initialize(SimulationConditions conditions) throws SimulationExpection{
        conditions.getSimulationListenerList().add(new ARCSimulationListener());
    }
}