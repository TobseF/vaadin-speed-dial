package github.tobsef.vaadin.paperfab;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;

@Route("")
public class View extends Div {

    public View() {
        SpeedDial speedDial = new SpeedDial();
        speedDial.addMenuItem("Copy", VaadinIcon.COPY, e -> Notification.show("Clicked Copy"));
        speedDial.addMenuItem("Print", VaadinIcon.PRINT, e -> Notification.show("Clicked Print"));
        speedDial.setBackdrop(true);
        add(speedDial);
    }
}
