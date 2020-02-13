package github.tobsef.vaadin.paperfab;

import com.vaadin.flow.component.HasStyle;

public interface HasSpeedDialStyle extends HasStyle {

	/**
	 * @param color
	 * 		The background color of the Floating Action Button
	 */
	default void setColor(String color) {
		getStyle().set("--paper-fab-speed-dial-background", color);
	}

	/**
	 * @param color
	 * 		The background color of the Floating Action Button
	 */
	default void setColorAction(String color) {
		getStyle().set("--paper-fab-speed-dial-action-background", color);
	}

	/**
	 * @param color
	 * 		The background color of the Floating Action Button when focused
	 */
	default void setColorActionFocus(String color) {
		getStyle().set("--paper-fab-speed-dial-action-keyboard-focus-background", color);
	}

	/**
	 * @param color
	 * 		The background color of label
	 */
	default void setColorActionLabel(String color) {
		getStyle().set("--paper-fab-speed-dial-action-label-background", color);
	}

	/**
	 * @param color
	 * 		The text color of label
	 */
	default void setColorActionLabelText(String color) {
		getStyle().set("--paper-fab-speed-dial-action-label-color", color);
	}

	/**
	 * @param color
	 * 		The background color of the Floating Action Button when opened
	 */
	default void setColorClose(String color) {
		getStyle().set("--paper-fab-speed-dial-background-close", color);
	}

	/**
	 * @param color
	 * 		The background color of the Floating Action Button when opened and focused
	 */
	default void setColorCloseFocus(String color) {
		getStyle().set("--paper-fab-speed-dial-keyboard-focus-background-close", color);
	}

	/**
	 * @param color
	 * 		The background color of the Floating Action Button when focused
	 */
	default void setColorFocus(String color) {
		getStyle().set("--paper-fab-speed-dial-keyboard-focus-background", color);
	}

	/**
	 * @param color
	 * 		The color of the icon
	 */
	default void setIconColor(String color) {
		getStyle().set("--iron-icon-fill-color", color);
	}

	/**
	 * @param marginBottom
	 * 		Margin to the bottom of the screen (default: 16px)
	 */
	default void setMarginBottom(String marginBottom) {
		getStyle().set("--paper-fab-speed-dial-bottom", marginBottom);
	}

	/**
	 * @param marginRight
	 * 		Margin to the right of the screen (default: 16px)
	 */
	default void setMarginRight(String marginRight) {
		getStyle().set("--paper-fab-speed-dial-right", marginRight);
	}

	/**
	 * @param positionMode
	 * 		The type of positioning method used for the Floating Action Button (default: absolute)
	 */
	default void setPositionMode(String positionMode) {
		getStyle().set("--paper-fab-speed-dial-position", positionMode);
	}
}
