package keywords;
import org.robotframework.javalib.annotation.ArgumentNames;

import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class MyKeyword {

    @RobotKeyword("Print Message")
    @ArgumentNames({"message"})
    public void printMessage(String message) {
        System.out.println("My message is : " + message);
    }

}