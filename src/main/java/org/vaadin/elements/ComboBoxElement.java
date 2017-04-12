package org.vaadin.elements;

@Tag("vaadin-combo-box")
public interface ComboBoxElement extends Element {

    static ComboBoxElement create() {
        return Elements.create(ComboBoxElement.class);
    }

    void setLabel(String label);

    void setItems(String items);

    void setValue(String value);

    String getValue();

}
