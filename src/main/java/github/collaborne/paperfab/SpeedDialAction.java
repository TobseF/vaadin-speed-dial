package github.collaborne.paperfab;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.shared.Registration;

/**
 * Menu entry of the {@link SpeedDial}.
 */
@Tag("paper-fab-speed-dial-action")
@NpmPackage(value = "@cwmr/paper-fab-speed-dial", version = "3.0.0")
@JsModule("@cwmr/paper-fab-speed-dial/paper-fab-speed-dial-action.js")
public class SpeedDialAction extends Label implements HasEnabled {

    public SpeedDialAction(String text, Icon icon) {
        super(text);
        setIcon(icon);
    }

    private Element setIcon(Icon icon) {
        return getElement().setAttribute("icon", getIconAttribute(icon));
    }

    public Registration addClickListener(ComponentEventListener<SpeedDialClickEvent> listener) {
        return addListener(SpeedDialClickEvent.class, listener);
    }


    private String getIconAttribute(Icon icon) {
        return icon.getElement().getAttribute("icon");
    }

}
