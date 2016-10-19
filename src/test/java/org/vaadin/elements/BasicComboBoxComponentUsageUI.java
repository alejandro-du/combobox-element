package org.vaadin.elements;

import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import org.vaadin.addonhelpers.AbstractTest;

@JavaScript("vaadin://bower_components/webcomponentsjs/webcomponents.js")
public class BasicComboBoxComponentUsageUI extends AbstractTest {

    @Override
    public Component getTestComponent() {
        ComboBoxComponent comboBox = new ComboBoxComponent("Select an option",
                "Option 1", "Option 2", "Option 3");

        comboBox.setValue("Option 2");
        comboBox.addValueChangeListener(value -> Notification.show(value));

        return comboBox;
    }

}
