package org.vaadin.elements;

import com.vaadin.ui.CssLayout;
import elemental.json.JsonArray;
import elemental.json.impl.JreJsonFactory;

public class ComboBoxComponent extends CssLayout {

    private ComboBoxElement element;

    public ComboBoxComponent(String label, String... options) {
        element = ComboBoxElement.create();
        element.setLabel(label);

        JreJsonFactory jsonFactory = new JreJsonFactory();
        JsonArray array = jsonFactory.createArray();

        if (options != null) {
            for (int i = 0; i < options.length; i++) {
                array.set(i, options[i]);
            }
            element.setItems(array.toJson());
        }

        Root root = ElementIntegration.getRoot(this);
        root.appendChild(element);
    }

}
