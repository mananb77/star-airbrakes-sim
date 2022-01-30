package net.sf.openrocket.ARC;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import java.awt.GridLayout;

import net.sf.openrocket.document.Simulation;
import net.sf.openrocket.gui.SpinnerEditor;
import net.sf.openrocket.gui.adaptor.DoubleModel;
import net.sf.openrocket.gui.components.BasicSlider;
import net.sf.openrocket.gui.components.UnitSelector;
import net.sf.openrocket.plugin.Plugin;
import net.sf.openrocket.simulation.extention.AbstractSimulationExtensionConfigurator;
import net.sf.openrocket.unit.UnitGroup;

@Plugin

public class ARCConfigurator extends AbstractSwingSimulationExtensionConfigurator<ARC> {

    public ARCConfigurator(){
        super(ARC.class);
    }
}

    @Override
    protected JComponent getConfigurationComponent(ARC extension, Simulation simulation, Jpanel panel){
        //TODO: Build UI
        return panel;
    }