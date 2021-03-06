package github.tobsef.vaadin.paperfab;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.HasEnabled;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.shared.Registration;

import static org.apache.commons.lang3.StringUtils.EMPTY;

/**
 * A material design floating action button with speed dial.
 */
@Tag("paper-fab-speed-dial")
@NpmPackage(value = "@cwmr/paper-fab-speed-dial", version = "3.0.0")
@JsModule("@cwmr/paper-fab-speed-dial/paper-fab-speed-dial.js")
public class SpeedDial extends Component implements HasEnabled, HasSpeedDialStyle {

	public SpeedDialAction addMenuItem(String item, VaadinIcon icon) {
		return addMenuItem(item, icon.create());
	}

	public SpeedDialAction addMenuItem(String item, Icon icon) {
		SpeedDialAction speedDialAction = new SpeedDialAction(item, icon);
		getElement().appendChild(speedDialAction.getElement());
		return speedDialAction;
	}

	public SpeedDialAction addMenuItem(String item, VaadinIcon icon, ComponentEventListener<SpeedDialClickEvent> listener) {
		SpeedDialAction speedDialAction = addMenuItem(item, icon);
		speedDialAction.addClickListener(listener);
		return speedDialAction;
	}

	public SpeedDialAction addMenuItem(String item, Icon icon, ComponentEventListener<SpeedDialClickEvent> listener) {
		SpeedDialAction speedDialAction = addMenuItem(item, icon);
		speedDialAction.addClickListener(listener);
		return speedDialAction;
	}

	public Element setIcon(VaadinIcon icon) {
		return setIcon(icon.create());
	}

	public Element setIcon(Icon icon) {
		return getElement().setAttribute("icon", getIconAttribute(icon));
	}

	@Synchronize("opened-changed")
	public boolean isOpened() {
		return getElement().getProperty("opened", false);
	}

	public void setBackdrop(boolean backdrop) {
		if (backdrop) {
			getElement().setAttribute("with-backdrop", EMPTY);
		} else {
			getElement().removeAttribute("with-backdrop");
		}
	}

	public void close() {
		getElement().setProperty("opened", false);
	}

	public void open() {
		getElement().setProperty("opened", true);
	}

	@Override
	public void setEnabled(boolean enabled) {
		if (enabled) {
			getElement().setAttribute("disabled", "disabled");
		} else {
			getElement().removeAttribute("disabled");
		}
	}

	public Registration addClickListener(ComponentEventListener<ClickEvent> listener) {
		return addListener(ClickEvent.class, listener);
	}

	@DomEvent("click")
	public static class ClickEvent extends ComponentEvent<SpeedDial> {

		public ClickEvent(SpeedDial source, boolean fromClient) {
			super(source, fromClient);
		}

	}

	private String getIconAttribute(Icon icon) {
		return icon.getElement().getAttribute("icon");
	}
}
