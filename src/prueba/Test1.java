package prueba;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\felip\\IdeaProjects\\pruebaTest1\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String titulo = driver.getTitle();
        System.out.println("El título de la web es: " + titulo);

        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

        //Prueba Fail username "Admin"
        WebElement inputLoginFail = wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
        inputLoginFail.sendKeys("Admin");
        System.out.println("Username Fail ingresado con exito");

        // Fail password "admin123b"
        WebElement inputPassFail = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
        inputPassFail.sendKeys("admin123b");
        System.out.println("Password Fail ingresado con exito");

        //apretar boton
        WebElement botonClickFail = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")));
        botonClickFail.click();
        System.out.println("boton Fail presionado exitosamente");

        //navegar atras
        driver.navigate().back();

        // Espera hasta que el elemento con nombre "username" sea interactuable y luego ingresa "Admin"
        WebElement inputLogin = wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
        inputLogin.sendKeys("Admin");
        System.out.println("Username ingresado con exito");

        // Espera hasta que el elemento con nombre "password" sea interactuable y luego ingresa "admin123"
        WebElement inputPass = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
        inputPass.sendKeys("admin123");
        System.out.println("Password ingresado con exito");

        //apretar boton
        WebElement botonClick = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")));
        botonClick.click();
        System.out.println("boton presionado exitosamente");

        //navegar a categoria PIM
        WebElement elementoPIM = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")));
        elementoPIM.click();
        System.out.println("navegando");

        //Agregar contacto de emergencia, salario y calificaciones al empleado.
        WebElement elementName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")));
        elementName.sendKeys("Roberto Sanchez");
        System.out.println("nombre agregado con exito");

        WebElement elementID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")));
        elementID.sendKeys("12345");
        System.out.println("Id agregado con exito");



        // Cerrar el navegador
        //driver.close();
    }
}