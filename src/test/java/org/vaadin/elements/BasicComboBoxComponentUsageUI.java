package org.vaadin.elements;

import com.vaadin.ui.Component;
import org.vaadin.addonhelpers.AbstractTest;

public class BasicComboBoxComponentUsageUI extends AbstractTest {

    @Override
    public Component getTestComponent() {
        ComboBoxComponent comboBox = new ComboBoxComponent("Select an option",
                "Option 1", "Option 2", "Option 3");
        return comboBox;
    }

}
