import java.awt.*;
import java.net.URI;

public class LinkOpener {
    public static void main(String[] args) {
        String linkToOpen = "http://umis.babcock.edu.ng/babcock/a_students.jsp?view=19:0";  // Replace with the actual link you want to open
        int delayInSeconds = 300;  // Delay in seconds (5 minutes)

        while (true) {
            try {
                openLink(linkToOpen);
                Thread.sleep(delayInSeconds * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void openLink(String link) throws Exception {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI(link));
        }
    }
}



//Note: Some websites might have mechanisms to prevent automated access, so be prepared to handle any challenges that may arise.