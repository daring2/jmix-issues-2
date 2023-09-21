package ru.itsyn.sandbox.view.sandbox;


import ru.itsyn.sandbox.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "SandboxView", layout = MainView.class)
@ViewController("sb_SandboxView")
@ViewDescriptor("sandbox-view.xml")
public class SandboxView extends StandardView {
}