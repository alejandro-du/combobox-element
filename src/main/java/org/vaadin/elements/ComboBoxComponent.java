package org.vaadin.elements;

import com.vaadin.ui.CssLayout;
import elemental.json.JsonArray;
import elemental.json.impl.JreJsonFactory;

public class ComboBoxComponent extends CssLayout {

    public static interface ValueChangeListener {
        void valueChange(String option);
    }

    private ComboBoxElement element;

    public ComboBoxComponent(String label, String... options) {
        element = ComboBoxElement.create();
        element.bindAttribute("value", "change");
        element.setLabel(label);

        if (options != null) {
            JsonArray array = new JreJsonFactory().createArray();

            for (int i = 0; i < options.length; i++) {
                array.set(i, options[i]);
            }
            element.setItems(array.toJson());
        }

        Root root = ElementIntegration.getRoot(this);
        root.appendChild(element);
    }

    public String getValue() {
        return element.getValue();
    }

    public void setValue(String value) {
        element.setValue(value);
    }

    public void addValueChangeListener(ValueChangeListener listener) {
        element.addEventListener("change",
                args -> listener.valueChange(getValue()));
    }

}
