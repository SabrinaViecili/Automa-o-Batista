package utils;
import org.openqa.selenium.WebDriver;

public class BasicConfiguration {

    protected WebDriver driver;

    public BasicConfiguration(WebDriver driver) {
        this.driver = driver;
    }

    public void waitTo(int time) {
        try {
            time *= 1000;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

