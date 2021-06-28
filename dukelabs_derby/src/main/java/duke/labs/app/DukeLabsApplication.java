package duke.labs.app;

import io.helidon.microprofile.server.Server;

public class DukeLabsApplication {
    private static Server server;
    private static String serverUrl;

    public static void main(String[] args) {
        server = Server.create().start();
        serverUrl = "http://localhost:" + server.port();
    }
}
