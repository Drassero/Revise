package com.drassero.revise.controller;

import com.drassero.revise.data.URILinks;
import com.drassero.revise.frames.ExceptionPrintAlert;
import javafx.fxml.FXML;
import javafx.stage.Window;

import java.awt.*;
import java.io.IOException;

public class RootController {

    private static final ExceptionPrintAlert BROWSING_EXCEPTION_ALERT = new ExceptionPrintAlert.BrowsingExceptionAlert();

    private Window rootWindow;

    @FXML
    private void initialize() {
        BROWSING_EXCEPTION_ALERT.initOwner(rootWindow);
    }

    @FXML
    private void openProjectRepository() {
        try {
            Desktop.getDesktop().browse(URILinks.PROJECT_REPOSITORY);
        } catch (IOException e) {
            BROWSING_EXCEPTION_ALERT.printException(e);
            BROWSING_EXCEPTION_ALERT.showAndWait();
        }
    }

    public void setRootWindow(Window rootWindow) {
        this.rootWindow = rootWindow;
    }

}
