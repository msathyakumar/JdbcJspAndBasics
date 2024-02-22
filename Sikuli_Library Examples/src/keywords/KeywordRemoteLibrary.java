package keywords;

import org.robotframework.javalib.library.AnnotationLibrary;

import org.robotframework.remoteserver.RemoteServer;

public class KeywordRemoteLibrary extends AnnotationLibrary {

    public static void main(String[] args) {
        RemoteServer.configureLogging();
        RemoteServer server = new RemoteServer("localhost",8271);
        server.putLibrary("/keywords", KeywordRemoteLibrary.class);
        try {
            server.start();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}