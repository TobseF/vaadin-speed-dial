package github.collaborne.paperfab;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

@DomEvent("click")
public class SpeedDialClickEvent extends ComponentEvent<SpeedDialAction> {

    private int x, y;

    public SpeedDialClickEvent(SpeedDialAction source, boolean fromClient, @EventData("event.offsetX") int x, @EventData("event.offsetY") int y) {
        super(source, fromClient);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
