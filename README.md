# Paper Speed Dial
[![Vaadin-14](https://img.shields.io/badge/Vaadin-14.1.5-blue.svg?style=flat)](https://vaadin.com/)
[![Published on Vaadin Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/tobse)

Vaadin 14 Java integration of [@polymer/paper-fab-speed-dial](https://www.webcomponents.org/element/Collaborne/paper-fab-speed-dial)

![screenshot](https://github.com/Collaborne/paper-fab-speed-dial/raw/master/doc/screenshot.png)

## Development instructions

JavaScript modules can either be published as an NPM package or be kept as local 
files in your project. The local JavaScript modules should be put in 
`src/main/resources/META-INF/frontend` so that they are automatically found and 
used in the using application.

If the modules are published then the package should be noted in the component 
using the `@NpmPackage` annotation in addition to using `@JsModule` annotation.


Starting the test/demo server:
1. Run `mvn jetty:run`.
2. Open http://localhost:8080 in the browser.
