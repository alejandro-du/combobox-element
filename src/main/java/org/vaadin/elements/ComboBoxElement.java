package org.vaadin.elements;

@Tag("vaadin-combo-box")
@Import("VAADIN/bower_components/vaadin-combo-box/vaadin-combo-box.html")
public interface ComboBoxElement extends Element {

    static ComboBoxElement create() {
        ComboBoxElement element = Elements.create(ComboBoxElement.class);
        return element;
    }

    void setLabel(String label);

    void setItems(String items);

    void setValue(String value);

    String getValue();

}
