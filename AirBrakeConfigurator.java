package net.sf.openrocket.AirBrake;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import java.awt.GridLayout;

import net.sf.openrocket.document.Simulation;
import net.sf.openrocket.gui.SpinnerEditor;
import net.sf.openrocket.gui.adaptors.DoubleModel;
import net.sf.openrocket.gui.components.BasicSlider;
import net.sf.openrocket.gui.components.UnitSelector;
import net.sf.openrocket.plugin.Plugin;
import net.sf.openrocket.simulation.extension.AbstractSwingSimulationExtensionConfigurator;
import net.sf.openrocket.unit.UnitGroup;

@Plugin
public class AirBrakeConfigurator extends AbstractSwingSimulationExtensionConfigurator<AirBrake> {
    
    public AirBrakeConfigurator() {
        super(AirBrake.class);
    }

    @Override
    protected JComponent getConfigurationComponent(AirBrake extension, Simulation simulation, JPanel panel) {
        return panel;
    }
}