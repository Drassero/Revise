package com.drassero.revise.frames;

import com.drassero.revise.data.DialogsResources;
import javafx.scene.control.Alert;

public class ExceptionPrintAlert extends Alert {

    private ExceptionPrintAlert() {
        super(AlertType.ERROR);
        setTitle(DialogsResources.EXCEPTION_PRINT_ALERT.getString("exception_print_alert.title"));
    }

    public void printException(Throwable throwable) {
        throwable.printStackTrace();
    }

    public static final class BrowsingExceptionAlert extends ExceptionPrintAlert {

        public BrowsingExceptionAlert() {
            super();
            setHeaderText(DialogsResources.EXCEPTION_PRINT_ALERT.getString("browsing_exception_alert.header"));
        }

    }

}
