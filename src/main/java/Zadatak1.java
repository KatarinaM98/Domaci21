import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak1 {
    /*
    Automatizovati navodjenje na sajtu https://automationexercise.com. Otici na pocetnu stranu, kliknuti na "Signup / Login",
     unesite u polja za "New User Signup!" pomocu faker-a - ime i email. Kliknuti dugme Signup.
Pored neophodnih polja na Signup ekranu uneti i date of birth, cekirati Title i "Receive special offers from our partners!".
Country staviti na "Canada".
Docekace vas ekran Account created, kliknuti "Continue". Vratice vas na pocetnu stranicu.
Za kraj kliknuti Delete Account, opet kliknuti Continue.

Waitere po potrebi dodavati.

     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\driver chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com");

        driver.navigate().to("https://automationexercise.com/");

        WebElement button = driver.findElement(By.xpath("html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
        button.click();

        Faker faker = new Faker();
        String name1 = faker.name().username();


        WebElement inputName = driver.findElement(By.name("name"));
        inputName.sendKeys(name1);

        String email1 = faker.internet().emailAddress();
        WebElement inputEmail = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));
        inputEmail.sendKeys(email1);

        WebElement button2 = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button"));
        button2.click();

        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
        checkbox.click();


        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("lampa");

        WebElement clickSelect = driver.findElement(By.id("days"));
        clickSelect.click();

        WebElement select1 = driver.findElement(By.id("days"));
        Select category = new Select(select1);
        category.selectByVisibleText("3");

        WebElement select2 = driver.findElement(By.id("months"));
        Select category2 = new Select(select2);
        category2.selectByVisibleText("May");

        WebElement select3 = driver.findElement(By.id("years"));
        Select category3 = new Select(select3);
        category3.selectByVisibleText("2000");

        WebElement checkbox2 = driver.findElement(By.id("newsletter"));
        checkbox2.click();

        WebElement checkbox3 = driver.findElement(By.id("optin"));
        checkbox3.click();




        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys(faker.name().firstName());


     WebElement lastName = driver.findElement(By.id("last_name"));
       lastName.sendKeys(faker.name().lastName());

        WebElement address = driver.findElement(By.id("address1"));
        address.sendKeys(faker.address().fullAddress());

        WebElement select4 = driver.findElement(By.id("country"));
        Select category4 = new Select(select4);
        category4.selectByVisibleText("Canada");


   WebElement state = driver.findElement(By.id("state"));
   state.sendKeys(faker.address().state());

   WebElement city = driver.findElement(By.id("city"));
   city.sendKeys(faker.address().city());

   WebElement zipcode = driver.findElement(By.id("zipcode"));
   zipcode.sendKeys(faker.address().zipCode());

   WebElement mobileNumber = driver.findElement(By.id("mobile_number"));
   mobileNumber.sendKeys(faker.phoneNumber().cellPhone());

   WebElement button3 = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button"));
   button3.click();


        WebElement button4 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
        button4.click();

        WebElement button5 = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
        button5.click();

        WebElement button6 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
        button6.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        

        driver.close();









    }
}
