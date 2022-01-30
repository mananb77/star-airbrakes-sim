package net.sf.openrocket.ARC;

import java.lang.Math.*;
import net.sf.openrocket.simulation.SimulationStatus;
import net.sf.openrocket.simulation.exception.SimulationException;
import net.sf.openrocket.simulation.listeners.AbstractSimulationListener;
import net.sf.openrocket.aerodynamics.FlightConditions;

public class ARCSimulationListener extends AbstractSimulationListener {
    private double START_TIME = 1.5;
    private static final double[] cf = {0, -0.026065, 0.00633972}

    private double velocity;

    public ARCSimulationListener(){
        super();
    }

    @Override
    public FlightConditions postFlightConditions(SimulationStatus status, FlightConditions flightconditions){
        velocity = FlightConditions.getVelocity();
        return null;
    }

    @Override
    public double postSimpleThrustCalculation(SimulationStatus status, double thrust) throws SimulationExpection{
        if (status.getSimulationTime() > START_TIME && !status.isApogeeReached()) {
            return -getAirBreakForce(velocity);
        } else {
            return thrust;
        }
    }

    private double getAirBreakForce(double vel){
        return cf[0] + (cf[1] * vel) + (cf[2] * Math.pow(vel,2));
    }
}