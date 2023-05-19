package Class22;

public abstract class WebDriver {

    abstract void openBrowser();
    abstract void loadURL(String url);
    abstract void performTesting();
    abstract void closeBrowser();
}

class ChromeDriver extends WebDriver{

    @Override
    void openBrowser(){
        System.out.println("Opening Google Chrome");
    }
    @Override
    void loadURL(String url){
        System.out.println("Load website on Google Chrome "+url);
    }
    @Override
    void performTesting(){
        System.out.println("Test the webpage on Google Chrome");
    }
    @Override
    void closeBrowser(){

    }
}
