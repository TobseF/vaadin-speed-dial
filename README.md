# Paper Speed Dial
[![Vaadin-14](https://img.shields.io/badge/Vaadin-14.1.5-blue.svg?style=flat)](https://vaadin.com/)
[![Published on Vaadin Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/speed-dial)

Vaadin 14 Java integration of [@polymer/paper-fab-speed-dial](https://www.webcomponents.org/element/Collaborne/paper-fab-speed-dial)

![screenshot](https://github.com/Collaborne/paper-fab-speed-dial/raw/master/doc/screenshot.png)


## ⭐ Features  
⭐ Floating menu bar  
⭐ Build in support of [Vaadin Icons](https://vaadin.com/directory/component/speed-dial)    
⭐ Backdrop to darken the background on open  
⭐ Setters fot all 11 CSS properties  
⭐ Server side ClickListener  
⭐ Server side `close` and `open` actions  
⭐ Uses Vaadin-Core, so no pro subscription is needed  


## 🖊 Usage

Add it as dependency -  It's available on the [Central Maven Repository](https://search.maven.org/artifact/io.github.tobsef/speed-dial/1.1.1/jar):
``` xml
<dependency>
    <groupId>io.github.tobsef</groupId>
    <artifactId>speed-dial</artifactId>
    <version>1.1.1</version>
</dependency>
```

Add it to your View:
``` java
SpeedDial speedDial = new SpeedDial();
speedDial.addMenuItem("Copy", VaadinIcon.COPY, e -> Notification.show("Clicked Copy"));
speedDial.addMenuItem("Print", VaadinIcon.PRINT, e -> Notification.show("Clicked Print"));
speedDial.setBackdrop(true);
add(speedDial);
```


## 🔨 Development instructions

JavaScript modules can either be published as an NPM package or be kept as local 
files in your project. The local JavaScript modules should be put in 
`src/main/resources/META-INF/frontend` so that they are automatically found and 
used in the using application.

If the modules are published then the package should be noted in the component 
using the `@NpmPackage` annotation in addition to using `@JsModule` annotation.

Starting the test/demo server:
1. Run `mvn jetty:run`.
2. Open http://localhost:8080 in the browser.


## 🎨 Theming

### SpeedDial
|Style|Method|Description|
|---|---|---|
|`--paper-fab-speed-dial-background`|`setColor(color)`|The background color of the Floating Action Button|
|`--paper-fab-speed-dial-keyboard-focus-background`|`setColorFocus(color)`|The background color of the Floating Action Button when focused|
|`--paper-fab-speed-dial-background-close`|`setColorClose(color)`|The background color of the Floating Action Button when opened|
|`--paper-fab-speed-dial-keyboard-focus-background-close`|`setColorCloseFocus(color)`|The background color of the Floating Action Button when opened and focused|
|`--paper-fab-speed-dial-position`|`setPositionMode(position)`|The type of positioning method used for the Floating Action Button (default: absolute)|
|`--paper-fab-speed-dial-right`|`setMarginRight(marginRight)`|Margin to the right of the screen (default: 16px)|
|`--paper-fab-speed-dial-bottom`|`setMarginBottom(marginBottom)`|Margin to the bottom of the screen (default: 16px)|

### SpeedDialAction
|Style|Method|Description|
|---|---|---|
|`--paper-fab-speed-dial-action-label-color`|`setColorActionLabelText(color)`|The text color of label|
|`--paper-fab-speed-dial-action-label-background`|`setColorActionLabel(color)`|The background color of label|
|`--paper-fab-speed-dial-action-background`|`setColorAction(color)`|The background color of the Floating Action Button|
|`--paper-fab-speed-dial-action-keyboard-focus-background`|`setColorActionFocus(color)`|The background color of the Floating Action Button when focused|