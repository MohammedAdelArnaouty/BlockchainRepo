package pages;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takeScreenshot  {


	public static void take_screen_shot(WebDriver driver, String imageFile) {
		Path path = Paths.get("Screenshot", imageFile + ".PNG");
		try {
			Files.createDirectories((path.getParent()));
			FileOutputStream file_output_stream = new FileOutputStream(path.toString());
			file_output_stream.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			file_output_stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	}



