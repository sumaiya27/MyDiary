package appiumtests;
import java.net.URL;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class MyDiary {
	
	static ///WebDriver driver;
	AppiumDriver<MobileElement>driver;
	static AndroidDriver<MobileElement> driver1;


	public static void main(String[] args) {
			
		try {
			login();
		}catch(Exception exp) 
		{
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}			
	}

			
		public static void login() throws Exception{
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "AVD Nexus_5x_API_29");
			cap.setCapability("udid", "emulator-5554");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "10");
			cap.setCapability("appPackage", "jp.hyperlab.mydiary");
			cap.setCapability("appActivity", "jp.hyperlab.mydiary.splash.SplashActivity");
			cap.setCapability("unicodeKeyboard", true);
									
			URL url = new URL ("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);
			System.out.println("Application Started....!");
			
			Thread.sleep(3000);
			MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]\r\n" + 
					"");
			el1.click();
			
			Thread.sleep(3000);
			MobileElement el2 = (MobileElement) driver.findElementById("android:id/button1");
			el2.click();
			
			Thread.sleep(3000);
			MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.View\r\n" + 
					"");
			el3.click();
			
			MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("日記を書く");
			el5.click();
			Thread.sleep(3000);
			
			MobileElement el6 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/diaryLayout");
			el6.click();
			el6.sendKeys("first text");
			
			MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton");
			el7.click();
			MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton");
			el8.click();
		
			///checking notes by right-corner calendar dropdown////
			
			MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("リスト表示");
			el9.click();
			MobileElement el10 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/timeline_text");
			el10.click();
			MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton");
			el11.click();
			System.out.print("checking with right corner done!");
			
			////note searching////
			
			Thread.sleep(3000);
			MobileElement el333 = (MobileElement) driver.findElementByAccessibilityId("Search");
			el333.click();
			MobileElement el444 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/search_src_text");
			el444.sendKeys("first");
			MobileElement el555 = (MobileElement) driver.findElementByAccessibilityId("Clear query");
			el555.click();
			MobileElement el666 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/toolBackButton");
			el666.click();
			System.out.println("note searching done!");
		
			////Settings////
			
			Thread.sleep(3000);
			MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Open Drawer");
			el12.click();
			Thread.sleep(3000);
			
			///Font-changing///
			
			MobileElement el414 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.TextView");
			el414.click();
			MobileElement el565 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout");
			el565.click();
			MobileElement el656 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
			el656.click();
			MobileElement el777 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout");
			el777.click();
			MobileElement el888 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
			el888.click();
			System.out.println("Font has been changed.");
			Thread.sleep(3000);
			
			/////Password Setting/////
			
			MobileElement el590 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.CheckBox");
			el590.click();
			
			////MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
			////el15.click();
			Thread.sleep(3000);
	
			MobileElement el18 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/editText1");
			el18.click();
			MobileElement el19 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/editText1");
			el19.sendKeys("1234");
			MobileElement el20 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/editText2");
			el20.click();
			MobileElement el21 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/editText2");
			el21.sendKeys("1234");
			MobileElement el22 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/editText3");
			el22.click();
			el22.sendKeys("12");
			MobileElement el23 = (MobileElement) driver.findElementById("android:id/button1");
			el23.click();
			MobileElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
			el24.click();
			System.out.println("done with settings!");
						
	
			/////Password Changing////
			
			Thread.sleep(3000);
			MobileElement el224 = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[7]/android.widget.RelativeLayout");
			el224.click();
			MobileElement el25 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/currentPasswordEditText");
			el25.sendKeys("1234");
			MobileElement el26 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/newPasswordEditText");
			el26.sendKeys("5678");
			MobileElement el27 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/confirmPasswordEditText");
			el27.sendKeys("5678");
			MobileElement el28 = (MobileElement) driver.findElementById("jp.hyperlab.mydiary:id/hintEditText");
			el28.sendKeys("56");
			MobileElement el29 = (MobileElement) driver.findElementById("android:id/button1");
			el29.click();
			Thread.sleep(3000);
			MobileElement el30 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]\r\n" + 
					"");
			el30.click();
			System.out.println("it is working!");			
						
			/////Notification time settings////
			
			Thread.sleep(3000);		
			MobileElement el33 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.RelativeLayout");
			el33.click();
			MobileElement el34 = (MobileElement) driver.findElementByAccessibilityId("Switch to text input mode for the time input.");
			el34.click();
			Thread.sleep(3000);
			MobileElement el35 = (MobileElement) driver.findElementById("android:id/input_hour");
			el35.click();
			el35.sendKeys("20");
			Thread.sleep(3000);
			MobileElement el36 = (MobileElement) driver.findElementById("android:id/input_minute");
			el36.click();
			MobileElement el37 = (MobileElement) driver.findElementById("android:id/input_minute");
			el37.sendKeys("10");
			MobileElement el38 = (MobileElement) driver.findElementById("android:id/button1");
			el38.click();
			System.out.println("done with notification time settings!!");
			
			////account login from setting////
			
			Thread.sleep(3000);
			MobileElement el39 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout");
			el39.click();
			System.out.print("Choose one account!");
			Thread.sleep(3000);
			MobileElement el40 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
			el40.click();	
			
		}	
		
}