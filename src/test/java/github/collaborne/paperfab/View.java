package github.collaborne.paperfab;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.Route;

import static com.vaadin.flow.component.icon.VaadinIcon.NOTEBOOK;
import static com.vaadin.flow.component.icon.VaadinIcon.TROPHY;

@Route("")
public class View extends Div {

    public View() {
        new Label("test");
        SpeedDial speedDial = new SpeedDial();
        speedDial.addMenuItem("Hero", TROPHY.create());
        speedDial.addMenuItem("Note", NOTEBOOK.create());
        add(speedDial);
    }
}
