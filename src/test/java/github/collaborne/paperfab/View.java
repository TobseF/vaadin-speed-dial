package github.collaborne.paperfab;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.Route;

@Route("")
public class View extends Div {

    public View() {
        SpeedDial speedDial = new SpeedDial();
        speedDial.addMenuItem("Copy", VaadinIcon.COPY);
        speedDial.addMenuItem("Print", VaadinIcon.PRINT);
        add(speedDial);
    }
}
