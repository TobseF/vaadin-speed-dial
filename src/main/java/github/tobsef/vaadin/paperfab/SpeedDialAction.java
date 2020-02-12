package github.tobsef.vaadin.paperfab;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.dom.Style;
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

	public Element setIcon(Icon icon) {
		return getElement().setAttribute("icon", getIconAttribute(icon));
	}

	public Registration addClickListener(ComponentEventListener<SpeedDialClickEvent> listener) {
		return addListener(SpeedDialClickEvent.class, listener);
	}

	/**
	 * @param color
	 * 		The background color of the Floating Action Button
	 */
	public void setColorAction(String color) {
		setStyle("--paper-fab-speed-dial-action-background", color);
	}

	/**
	 * @param color
	 * 		The background color of the Floating Action Button when focused
	 */
	public void setColorActionFocus(String color) {
		setStyle("--paper-fab-speed-dial-action-keyboard-focus-background", color);
	}

	/**
	 * @param color
	 * 		The background color of label
	 */
	public void setColorActionLabel(String color) {
		setStyle("--paper-fab-speed-dial-action-label-background", color);
	}

	/**
	 * @param color
	 * 		The text color of label
	 */
	public void setColorActionLabelText(String color) {
		setStyle("--paper-fab-speed-dial-action-label-color", color);
	}

	/**
	 * @param color
	 * 		The background color of the Floating Action Button
	 */
	public void setColor(String color) {
		setStyle("--paper-fab-speed-dial-background", color);
	}

	/**
	 * @param color
	 * 		The background color of the Floating Action Button when focused
	 */
	public void setColorFocus(String color) {
		setStyle("--paper-fab-speed-dial-keyboard-focus-background", color);
	}

	/**
	 * @param color
	 * 		The background color of the Floating Action Button when opened
	 */
	public void setColorClose(String color) {
		setStyle("--paper-fab-speed-dial-background-close", color);
	}

	/**
	 * @param color
	 * 		The background color of the Floating Action Button when opened and focused
	 */
	public void setColorCloseFocus(String color) {
		setStyle("--paper-fab-speed-dial-keyboard-focus-background-close", color);
	}

	/**
	 * @param positionMode
	 * 		The type of positioning method used for the Floating Action Button (default: absolute)
	 */
	public void setPositionMode(String positionMode) {
		setStyle("--paper-fab-speed-dial-position", positionMode);
	}

	/**
	 * @param marginRight
	 * 		Margin to the right of the screen (default: 16px)
	 */
	public void setMarginRight(String marginRight) {
		setStyle("--paper-fab-speed-dial-right", marginRight);
	}

	/**
	 * @param marginBottom
	 * 		Margin to the bottom of the screen (default: 16px)
	 */
	public void setMarginBottom(String marginBottom) {
		setStyle("--paper-fab-speed-dial-bottom", marginBottom);
	}

	/**
	 * @param name
	 * 		the style property name as camelCase, not <code>null</code>
	 * @param value
	 * 		the style property value (if <code>null</code>, the property
	 * 		will be removed)
	 */
	private Style setStyle(String name, String value) {
		return getElement().getStyle().set(name, value);
	}

	private String getIconAttribute(Icon icon) {
		return icon.getElement().getAttribute("icon");
	}

}
