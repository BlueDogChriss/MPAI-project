import controller.Controller;
import view.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        View view = new View();
        Controller controller = new Controller(view);
        controller.start();

    }
}
