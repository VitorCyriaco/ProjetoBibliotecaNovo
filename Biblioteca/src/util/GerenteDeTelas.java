package util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class GerenteDeTelas {

    private static JDesktopPane jDesktopPane;

    public GerenteDeTelas(JDesktopPane jDesktopPane) {
        GerenteDeTelas.jDesktopPane = jDesktopPane;
    }

    public void abrirTelas(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();
        } else {
            jDesktopPane.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }
}
