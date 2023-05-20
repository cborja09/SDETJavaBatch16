package Class23;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
    maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */

        void openBrowser();
        void closeBrowser();
        void maximizeWindow();
        void findElement();

    }

    class ChromeDriver implements WebDriver{
        @Override
        public void openBrowser() {
            System.out.println("Opening Google Chrome Browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Closing Google Chrome Browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximizing Chrome Window");
        }

        @Override
        public void findElement() {
            System.out.println("Finding element in Chrome browser");
        }
    }

    class FireFoxDriver implements WebDriver{
        @Override
        public void openBrowser() {
            System.out.println("Opening FireFox Browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Closing FireFox Browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximizing FireFox Window");
        }

        @Override
        public void findElement() {
            System.out.println("Finding element in FireFox browser");
        }
    }
