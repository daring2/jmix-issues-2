package ru.itsyn.sandbox.view.sandbox;


import com.vaadin.flow.component.ClickEvent;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import ru.itsyn.sandbox.entity.User;
import ru.itsyn.sandbox.view.main.MainView;

import com.vaadin.flow.router.Route;

@Route(value = "SandboxView", layout = MainView.class)
@ViewController("sb_SandboxView")
@ViewDescriptor("sandbox-view.xml")
public class SandboxView extends StandardView {

    @ViewComponent
    private EntityComboBox<User> userField;

    @Subscribe("removeActions")
    public void onRemoveActionsClick(final ClickEvent<JmixButton> event) {
        userField.removeAllActions();
    }

    @Subscribe("testAction")
    public void onTestActionPerformed(final ActionPerformedEvent event) {
        System.out.println("SandboxView.onTestActionPerformed");
//        new Exception().printStackTrace();
    }

}