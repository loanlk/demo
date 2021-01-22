# Get source code from git hub at master branch
# Install JDK 13 if your machine doesn't JDK
# Download chromedriver https://chromedriver.storage.googleapis.com/index.html?path=88.0.4324.96/
  Save chromedriver.exe into D:\browsers
# Open IntelliJ IDEA Then open the project
# Config run chromedrive, add this code before driver = new ChromeDriver(); 
  System.setProperty("webdriver.chrome.driver", "D:\\browsers\\chromedriver.exe");
# Run test
  Open Terminal window
  mvn test
# View report 
  Find target/surefire-reports/index.html
