package org.vaadin.elements;

@Tag("vaadin-combo-box")
@Import("VAADIN/bower_components/vaadin-combo-box/vaadin-combo-box.html")
public interface ComboBoxElement extends Element {

    static ComboBoxElement create() {
        return Elements.create(ComboBoxElement.class);
    }

    void setLabel(String label);

    void setItems(String items);

    void setValue(String value);

    String getValue();

}
