package roshan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test46 
{
	public static void main(String[] args)throws Exception 
	{
		//Segregate various types of <input> tag elements using IF- ELSE -IF
		//open browser
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//open site
		driver.get("https://my.aidaform.com/signup");
		Thread.sleep(3000);
		//Segregate various types of <input> tag elements
		List<WebElement> l=driver.findElements(By.tagName("input"));
		System.out.println("All input tagged elements count is: "+l.size());
		int rbc=0, cbc=0, tbc=0, fac=0, rabc=0, ubc=0, bc=0, hec=0, sbc=0, sebc=0, pbc=0, dc=0;
		int others=0;
		for(WebElement e:l)
		{
			String x=e.getAttribute("type");
			if(x.equals("text"))
			{
				tbc++;
			}
			else if(x.equals("radio"))
			{
				rbc++;
			}
			else if(x.equals("checkbox"))
			{
				cbc++;
			}
			else if(x.equals("file"))
			{
				fac++;
			}
			else if(x.equals("password"))
			{
				pbc++;
			}
			else if(x.equals("range"))
			{
				rabc++;
			}
			else if(x.equals("search"))
			{
				sebc++;
			}
			else if(x.equals("date"))
			{
				dc++;
			}
			else if(x.equals("hidden"))
			{
				hec++;
			}
			else if(x.equals("url"))
			{
				ubc++;
			}
			else if(x.equals("button"))
			{
				bc++;
			}
			else
			{
				others++;
			}
		}
		System.out.println("Text boxes count is "+tbc);
		System.out.println("Check boxes count is "+cbc);
		System.out.println("radio buttons count is "+rbc);
		System.out.println("file attachments count is "+fac);
		System.out.println("URL boxes count is "+ubc);
		System.out.println("Push buttons count is "+bc);
		System.out.println("Hidden elements count is "+hec);
		System.out.println("Submit buttons count is "+sbc);
		System.out.println("Password boxes count is "+pbc);
		System.out.println("Search boxes count is "+sebc);
		System.out.println("Range boxes count is "+rabc);
		System.out.println("Date boxes count is "+dc);
		System.out.println("Others count is "+others);
		//close site
		driver.close();
	}
}
