package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverUtil {

    private static WebDriver driver;

    public static WebDriver openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/sabrina-viecili/Downloads/chromedriver");
        //System.setProperty("webdriver.gecko.driver", getPathFirefoxDriver());
        //System.setProperty("webdriver.ie.driver", getPathInternetExplorer());
        //System.setProperty("webdriver.edge.driver", getPathEdgeDriver());
        driver = new ChromeDriver(addOptions());
        //driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        //driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.americas.dbccompany.com.br/");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Entrou no abrir browser");
        return driver;
    }

    public static void quitBrowser() {
        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }

    static String getPathChromeDriver(){
        String so = System.getProperty("os.name").toLowerCase();
        so = so.replaceAll(" ", "");
        so = so.replaceAll("[0-9]", "");
        String directory = System.getProperty("user.dir");

        if("windows".equals(so)){
            return directory + "/Users/sabrina-viecili/Downloads/chromedriver";
        } else {
            //Foi trocado ${s} pelo .format %s
            return directory + String.format("/drivers/%s/chromedriver",so);
        }
    }

    static String getPathFirefoxDriver(){
        String so = System.getProperty("os.name").toLowerCase();
        so = so.replaceAll(" ", "");
        so = so.replaceAll("[0-9]", "");
        String directory = System.getProperty("user.dir");

        if("windows".equals(so)){
            return directory + "/drivers/windows/geckodriver.exe";
        } else {
            return directory + String.format("/drivers/%s/geckodriver",so);
        }
    }

    static String getPathInternetExplorer(){
        String so = System.getProperty("os.name").toLowerCase();
        so = so.replaceAll(" ", "");
        so = so.replaceAll("[0-9]", "");
        String directory = System.getProperty("user.dir");

        if("windows".equals(so)){
            return directory + "/drivers/windows/IEDriverServer.exe";
        } else {
            return directory + String.format("/drivers/%s/IEDriverServer",so);
        }
    }

    static String getPathEdgeDriver(){
        String so = System.getProperty("os.name").toLowerCase();
        so = so.replaceAll(" ", "");
        so = so.replaceAll("[0-9]", "");
        String directory = System.getProperty("user.dir");

        if("windows".equals(so)){
            return directory + "/drivers/windows/MicrosoftWebDriver.exe";
        } else {
            return directory + String.format("/drivers/%s/MicrosoftWebDriver",so);
        }
    }

    static ChromeOptions addOptions(){
        String so = System.getProperty("os.name").toLowerCase();
        so = so.replaceAll(" ", "");
        so = so.replaceAll("[0-9]", "");
        ChromeOptions options = new ChromeOptions();

        if("linux".equals(so)){
            options.addArguments("--no-sandbox");
        }

        return options;
    }
}
