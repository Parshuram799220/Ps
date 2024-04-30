package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ProjectTestNg {
	WebDriver drive;
@BeforeTest
public void beforeTest() {
	drive= new ChromeDriver();
	drive.get("https://sampleapp.tricentis.com/101/app.php");
	drive.manage().window().maximize();
	
	  }
	
	
  @Test(priority = 0)
  public void automobile() throws InterruptedException {
	  WebElement automobile=drive.findElement(By.xpath("//*[@id=\"nav_automobile\"]"));
		automobile.click();
		WebElement make=drive.findElement(By.xpath("//select[@id='make']"));
		Select drop1=new Select(make);
		drop1.selectByVisibleText("BMW");
		WebElement eng=drive.findElement(By.xpath("//*[@id=\"engineperformance\"]"));
		eng.sendKeys("1000");
		WebElement mfdate=drive.findElement(By.xpath("//*[@id=\"dateofmanufacture\"]"));
		mfdate.sendKeys("05/25/2012");
		WebElement seats=drive.findElement(By.xpath("//*[@id=\"numberofseats\"]"));
		Select drop2=new Select(seats);
		drop2.selectByIndex(6);
		WebElement fuel=drive.findElement(By.xpath("//*[@id=\"fuel\"]"));
		Select drop3=new Select(fuel);
		drop3.selectByIndex(1);
		WebElement price=drive.findElement(By.xpath("//*[@id=\"listprice\"]"));
		price.sendKeys("15000");
		WebElement licno=drive.findElement(By.xpath("//*[@id=\"licenseplatenumber\"]"));
		licno.sendKeys("Mh44r4500");
		WebElement anmileg=drive.findElement(By.xpath("//*[@id=\"annualmileage\"]"));
		anmileg.sendKeys("200");
		WebElement nxtbtn=drive.findElement(By.xpath("//*[@id=\"nextenterinsurantdata\"]"));
		nxtbtn.click();
		WebElement fname=drive.findElement(By.xpath("//*[@id=\"firstname\"]"));
		fname.sendKeys("Rajeev");
		WebElement lname=drive.findElement(By.xpath("//*[@id=\"lastname\"]"));
		lname.sendKeys("Kumar");
		WebElement dob=drive.findElement(By.xpath("//*[@id=\"birthdate\"]"));
		dob.sendKeys("10/11/1992");
		WebElement gender=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
		gender.click();
		WebElement add=drive.findElement(By.xpath("//*[@id=\"streetaddress\"]"));
		add.sendKeys("Sangavi ,pune, maharashtra");
		WebElement country=drive.findElement(By.xpath("//*[@id=\"country\"]"));
		Select drop4=new Select(country);
		drop4.selectByVisibleText("India");
		WebElement pcode=drive.findElement(By.xpath("//*[@id=\"zipcode\"]"));
		pcode.sendKeys("415780");
		WebElement city=drive.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("Pune");
		WebElement occup=drive.findElement(By.xpath("//*[@id=\"occupation\"]"));
		Select drop5=new Select(occup);
		drop5.selectByIndex(1);
		WebElement hobbies=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span"));
		hobbies.click();
		WebElement web=drive.findElement(By.xpath("//*[@id=\"website\"]"));
		web.sendKeys("www.rajeev99.com");
		WebElement pic=drive.findElement(By.xpath("//*[@id=\"picture\"]"));
		
		
		
		
		
		pic.sendKeys("image.jbg");
		WebElement nextbtn=drive.findElement(By.xpath("//*[@id=\"nextenterproductdata\"]"));
		nextbtn.click();
		WebElement sdate=drive.findElement(By.xpath("//*[@id=\"startdate\"]"));
		sdate.sendKeys("05/25/2024");
		WebElement inssm=drive.findElement(By.xpath("//*[@id=\"insurancesum\"]"));
		Select drop6=new Select(inssm);
		drop6.selectByIndex(6);
		WebElement mrat=drive.findElement(By.xpath("//*[@id=\"meritrating\"]"));
		Select drop7=new Select(mrat);
		drop7.selectByIndex(5);
		WebElement dmgins=drive.findElement(By.xpath("//*[@id=\"damageinsurance\"]"));
		Select drop8=new Select(dmgins);
		drop8.selectByIndex(3);
		WebElement optpr=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span"));
		optpr.click();
		WebElement csycar=drive.findElement(By.xpath("//*[@id=\"courtesycar\"]"));
		Select drop9=new Select(csycar);
		drop9.selectByIndex(2);
		WebElement nxbtn=drive.findElement(By.xpath("//*[@id=\"nextselectpriceoption\"]"));
		nxbtn.click();
		WebElement prctbl=drive.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span"));
		prctbl.click();
		Thread.sleep(3000);
		WebElement nbtn=drive.findElement(By.id("nextsendquote"));
		nbtn.click();
		WebElement email=drive.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("raj663679@gmail.com");
		WebElement phone=drive.findElement(By.xpath("//*[@id=\"phone\"]"));
		phone.sendKeys("7992203282");
		WebElement user=drive.findElement(By.xpath("//*[@id=\"username\"]"));
		user.sendKeys("Raj_799220");
		WebElement pass=drive.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("Raj123@");
		WebElement cfpass=drive.findElement(By.xpath("//*[@id=\"confirmpassword\"]"));
		cfpass.sendKeys("Raj123@");
		WebElement comm=drive.findElement(By.xpath("//*[@id=\"Comments\"]"));
		comm.sendKeys("i am car lover."
				+ " Thankyou");
		Thread.sleep(3000);
		WebElement sendeml=drive.findElement(By.xpath("//*[@id=\"sendemail\"]"));
		sendeml.click();
		Thread.sleep(10000);
		WebElement Okay=drive.findElement(By.xpath("/html/body/div[4]/div[7]/div/button"));
		Okay.click();
	
	  
  }
  @Test(priority = 1)
  public void truck() throws InterruptedException {

WebElement truck=drive.findElement(By.xpath("//*[@id=\"nav_truck\"]"));
truck.click();
WebElement make1=drive.findElement(By.xpath("//*[@id=\"make\"]"));
Select drop11=new Select(make1);
drop11.selectByVisibleText("Volvo");
WebElement eng1=drive.findElement(By.xpath("//*[@id=\"engineperformance\"]"));
eng1.sendKeys("1000");
WebElement mfdate1=drive.findElement(By.xpath("//*[@id=\"dateofmanufacture\"]"));
mfdate1.sendKeys("05/25/2012");
WebElement seats1=drive.findElement(By.xpath("//*[@id=\"numberofseats\"]"));
Select drop21=new Select(seats1);
drop21.selectByIndex(3);
WebElement fuel1=drive.findElement(By.xpath("//*[@id=\"fuel\"]"));
Select drop31=new Select(fuel1);
drop31.selectByIndex(2);
WebElement payload=drive.findElement(By.xpath("//*[@id=\"payload\"]"));
payload.sendKeys("500");
WebElement twght=drive.findElement(By.xpath("//*[@id=\"totalweight\"]"));
twght.sendKeys("700");

WebElement price1=drive.findElement(By.xpath("//*[@id=\"listprice\"]"));
price1.sendKeys("15000");
WebElement licno1=drive.findElement(By.xpath("//*[@id=\"licenseplatenumber\"]"));
licno1.sendKeys("Mh44r4500");
WebElement anmileg1=drive.findElement(By.xpath("//*[@id=\"annualmileage\"]"));
anmileg1.sendKeys("200");
WebElement nxtbtn1=drive.findElement(By.xpath("//*[@id=\"nextenterinsurantdata\"]"));
nxtbtn1.click();
//next page
WebElement fname1=drive.findElement(By.xpath("//*[@id=\"firstname\"]"));
fname1.sendKeys("Sanjeev");
WebElement lname1=drive.findElement(By.xpath("//*[@id=\"lastname\"]"));
lname1.sendKeys("Kumar");
WebElement dob1=drive.findElement(By.xpath("//*[@id=\"birthdate\"]"));
dob1.sendKeys("10/11/1992");
WebElement gender1=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
gender1.click();
WebElement add1=drive.findElement(By.xpath("//*[@id=\"streetaddress\"]"));
add1.sendKeys("Aundh ,pune, maharashtra");
WebElement country1=drive.findElement(By.xpath("//*[@id=\"country\"]"));
Select drop41=new Select(country1);
drop41.selectByVisibleText("India");
WebElement pcode1=drive.findElement(By.xpath("//*[@id=\"zipcode\"]"));
pcode1.sendKeys("415780");
WebElement city1=drive.findElement(By.xpath("//*[@id=\"city\"]"));
city1.sendKeys("Pune");
WebElement occup1=drive.findElement(By.xpath("//*[@id=\"occupation\"]"));
Select drop51=new Select(occup1);
drop51.selectByIndex(1);
WebElement hobbies1=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span"));
hobbies1.click();
WebElement web1=drive.findElement(By.xpath("//*[@id=\"website\"]"));
web1.sendKeys("www.sanjeev99.com");
WebElement pic1=drive.findElement(By.xpath("//*[@id=\"picture\"]"));
pic1.sendKeys("image.jbg");
WebElement nextbtn2=drive.findElement(By.xpath("//*[@id=\"nextenterproductdata\"]"));
nextbtn2.click();
//next page
WebElement sdate1=drive.findElement(By.xpath("//*[@id=\"startdate\"]"));
sdate1.sendKeys("05/25/2024");
WebElement inssm1=drive.findElement(By.xpath("//*[@id=\"insurancesum\"]"));
Select drop61=new Select(inssm1);
drop61.selectByIndex(6);
WebElement dmgins1=drive.findElement(By.xpath("//*[@id=\"damageinsurance\"]"));
Select drop81=new Select(dmgins1);
drop81.selectByIndex(3);
WebElement optpr1=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[2]/span"));
optpr1.click();
WebElement nxbtn3=drive.findElement(By.xpath("//*[@id=\"nextselectpriceoption\"]"));
nxbtn3.click();
//next page
WebElement prctbl1=drive.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span"));
prctbl1.click();
Thread.sleep(3000);
WebElement nbtn5=drive.findElement(By.id("nextsendquote"));
nbtn5.click();
//next page
WebElement email1=drive.findElement(By.xpath("//*[@id=\"email\"]"));
email1.sendKeys("sanjeev663679@gmail.com");
WebElement phone1=drive.findElement(By.xpath("//*[@id=\"phone\"]"));
phone1.sendKeys("7992203282");
WebElement user1=drive.findElement(By.xpath("//*[@id=\"username\"]"));
user1.sendKeys("sanj_799220");
WebElement pass1=drive.findElement(By.xpath("//*[@id=\"password\"]"));
pass1.sendKeys("San123@");
WebElement cfpass1=drive.findElement(By.xpath("//*[@id=\"confirmpassword\"]"));
cfpass1.sendKeys("San123@");
WebElement comm1=drive.findElement(By.xpath("//*[@id=\"Comments\"]"));
comm1.sendKeys("Truck insurance."
		+ " Thankyou");
Thread.sleep(3000);
WebElement sendeml1=drive.findElement(By.xpath("//*[@id=\"sendemail\"]"));
sendeml1.click();
Thread.sleep(10000);
//WebElement Okay=drive.findElement(By.xpath("/html/body/div[4]/div[7]/div/button"));
//Okay.click();


Actions act = new Actions(drive);
act.keyDown(Keys.SPACE);
act.perform();
act.keyUp(Keys.SPACE);
act.perform();

	  
  }
  @Test(priority = 2)
  public void motorcycle() throws InterruptedException {
	  WebElement motor=drive.findElement(By.xpath("//*[@id=\"nav_motorcycle\"]"));
		motor.click();
		WebElement make3=drive.findElement(By.xpath("//*[@id=\"make\"]"));
		Select drop13=new Select(make3);
		drop13.selectByVisibleText("BMW");
		WebElement model=drive.findElement(By.xpath("//*[@id=\"model\"]"));
		Select mod=new Select(model);
		mod.selectByIndex(4);
		WebElement cycc=drive.findElement(By.xpath("//*[@id=\"cylindercapacity\"]"));
		cycc.sendKeys("250");
		WebElement eng2=drive.findElement(By.xpath("//*[@id=\"engineperformance\"]"));
		eng2.sendKeys("500");
		WebElement mfdate2=drive.findElement(By.xpath("//*[@id=\"dateofmanufacture\"]"));
		mfdate2.sendKeys("05/25/2018");
		WebElement seats2=drive.findElement(By.xpath("//*[@id=\"numberofseatsmotorcycle\"]"));
		Select drop22=new Select(seats2);
		drop22.selectByIndex(3);
		WebElement price2=drive.findElement(By.xpath("//*[@id=\"listprice\"]"));
		price2.sendKeys("15000");
		WebElement anmileg2=drive.findElement(By.xpath("//*[@id=\"annualmileage\"]"));
		anmileg2.sendKeys("200");
		WebElement nxtbtn5=drive.findElement(By.xpath("//*[@id=\"nextenterinsurantdata\"]"));
		nxtbtn5.click();
		//nextpage
		WebElement fname10=drive.findElement(By.xpath("//*[@id=\"firstname\"]"));
		fname10.sendKeys("Sanjeet");
		WebElement lname10=drive.findElement(By.xpath("//*[@id=\"lastname\"]"));
		lname10.sendKeys("Kumar");
		WebElement dob10=drive.findElement(By.xpath("//*[@id=\"birthdate\"]"));
		dob10.sendKeys("10/11/1992");
		WebElement gender10=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
		gender10.click();
		WebElement add10=drive.findElement(By.xpath("//*[@id=\"streetaddress\"]"));
		add10.sendKeys("Aundh ,pune, maharashtra");
		WebElement country10=drive.findElement(By.xpath("//*[@id=\"country\"]"));
		Select drop410=new Select(country10);
		drop410.selectByVisibleText("India");
		WebElement pcode10=drive.findElement(By.xpath("//*[@id=\"zipcode\"]"));
		pcode10.sendKeys("415780");
		WebElement city10=drive.findElement(By.xpath("//*[@id=\"city\"]"));
		city10.sendKeys("Pune");
		WebElement occup10=drive.findElement(By.xpath("//*[@id=\"occupation\"]"));
		Select drop510=new Select(occup10);
		drop510.selectByIndex(1);
		WebElement hobbies10=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span"));
		hobbies10.click();
		WebElement web10=drive.findElement(By.xpath("//*[@id=\"website\"]"));
		web10.sendKeys("www.sanjeet99.com");
		WebElement pic10=drive.findElement(By.xpath("//*[@id=\"picture\"]"));
		pic10.sendKeys("image10.jbg");
		WebElement nextbtn20=drive.findElement(By.xpath("//*[@id=\"nextenterproductdata\"]"));
		nextbtn20.click();
		//next page
		WebElement sdate10=drive.findElement(By.xpath("//*[@id=\"startdate\"]"));
		sdate10.sendKeys("05/25/2024");
		WebElement inssm10=drive.findElement(By.xpath("//*[@id=\"insurancesum\"]"));
		Select drop610=new Select(inssm10);
		drop610.selectByIndex(6);
		WebElement dmgins10=drive.findElement(By.xpath("//*[@id=\"damageinsurance\"]"));
		Select drop810=new Select(dmgins10);
		drop810.selectByIndex(3);
		WebElement optpr10=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[2]/span"));
		optpr10.click();
		WebElement nxbtn30=drive.findElement(By.xpath("//*[@id=\"nextselectpriceoption\"]"));
		nxbtn30.click();
		//next page
		WebElement prctbl10=drive.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span"));
		prctbl10.click();
		Thread.sleep(3000);
		WebElement nbtn50=drive.findElement(By.id("nextsendquote"));
		nbtn50.click();
		//next page
		WebElement email10=drive.findElement(By.xpath("//*[@id=\"email\"]"));
		email10.sendKeys("sanjeet663679@gmail.com");
		WebElement phone10=drive.findElement(By.xpath("//*[@id=\"phone\"]"));
		phone10.sendKeys("7992203282");
		WebElement user10=drive.findElement(By.xpath("//*[@id=\"username\"]"));
		user10.sendKeys("sanj_799220");
		WebElement pass10=drive.findElement(By.xpath("//*[@id=\"password\"]"));
		pass10.sendKeys("San123@");
		WebElement cfpass10=drive.findElement(By.xpath("//*[@id=\"confirmpassword\"]"));
		cfpass10.sendKeys("San123@");
		WebElement comm10=drive.findElement(By.xpath("//*[@id=\"Comments\"]"));
		comm10.sendKeys("Motor cycle insurance."
				+ " Thankyou");
		Thread.sleep(3000);
		WebElement sendeml10=drive.findElement(By.xpath("//*[@id=\"sendemail\"]"));
		sendeml10.click();
		Thread.sleep(10000);
		//WebElement Okay=drive.findElement(By.xpath("/html/body/div[4]/div[7]/div/button"));
		//Okay.click();


		Actions act1 = new Actions(drive);
		act1.keyDown(Keys.SPACE);
		act1.perform();
		act1.keyUp(Keys.SPACE);
		act1.perform();
	  
  }
  @Test(priority=3)
  public void camper() throws InterruptedException {
	  WebElement camper=drive.findElement(By.xpath("//*[@id=\"nav_camper\"]"));
		camper.click();
		WebElement make13=drive.findElement(By.xpath("//*[@id=\"make\"]"));
		Select drop113=new Select(make13);
		drop113.selectByVisibleText("Volvo");
		WebElement eng13=drive.findElement(By.xpath("//*[@id=\"engineperformance\"]"));
		eng13.sendKeys("1000");
		WebElement mfdate13=drive.findElement(By.xpath("//*[@id=\"dateofmanufacture\"]"));
		mfdate13.sendKeys("05/25/2012");
		WebElement seats13=drive.findElement(By.xpath("//*[@id=\"numberofseats\"]"));
		Select drop213=new Select(seats13);
		drop213.selectByIndex(3);
		WebElement righthand=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[1]/span"));
		righthand.click();
		WebElement fuel13=drive.findElement(By.xpath("//*[@id=\"fuel\"]"));
		Select drop313=new Select(fuel13);
		drop313.selectByIndex(2);
		WebElement payload1=drive.findElement(By.xpath("//*[@id=\"payload\"]"));
		payload1.sendKeys("500");
		WebElement twght1=drive.findElement(By.xpath("//*[@id=\"totalweight\"]"));
		twght1.sendKeys("700");

		WebElement price13=drive.findElement(By.xpath("//*[@id=\"listprice\"]"));
		price13.sendKeys("15000");
		WebElement licno13=drive.findElement(By.xpath("//*[@id=\"licenseplatenumber\"]"));
		licno13.sendKeys("Mh44r4500");
		WebElement anmileg13=drive.findElement(By.xpath("//*[@id=\"annualmileage\"]"));
		anmileg13.sendKeys("200");
		WebElement nxtbtn13=drive.findElement(By.xpath("//*[@id=\"nextenterinsurantdata\"]"));
		nxtbtn13.click();
		//next page
		WebElement fname13=drive.findElement(By.xpath("//*[@id=\"firstname\"]"));
		fname13.sendKeys("Sanjeev");
		WebElement lname13=drive.findElement(By.xpath("//*[@id=\"lastname\"]"));
		lname13.sendKeys("Kumar");
		WebElement dob13=drive.findElement(By.xpath("//*[@id=\"birthdate\"]"));
		dob13.sendKeys("10/11/1992");
		WebElement gender13=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
		gender13.click();
		WebElement add13=drive.findElement(By.xpath("//*[@id=\"streetaddress\"]"));
		add13.sendKeys("Aundh ,pune, maharashtra");
		WebElement country13=drive.findElement(By.xpath("//*[@id=\"country\"]"));
		Select drop413=new Select(country13);
		drop413.selectByVisibleText("India");
		WebElement pcode13=drive.findElement(By.xpath("//*[@id=\"zipcode\"]"));
		pcode13.sendKeys("415780");
		WebElement city13=drive.findElement(By.xpath("//*[@id=\"city\"]"));
		city13.sendKeys("Pune");
		WebElement occup13=drive.findElement(By.xpath("//*[@id=\"occupation\"]"));
		Select drop513=new Select(occup13);
		drop513.selectByIndex(1);
		WebElement hobbies13=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span"));
		hobbies13.click();
		WebElement web13=drive.findElement(By.xpath("//*[@id=\"website\"]"));
		web13.sendKeys("www.sanjeev99.com");
		WebElement pic13=drive.findElement(By.xpath("//*[@id=\"picture\"]"));
		pic13.sendKeys("image.jbg");
		WebElement nextbtn23=drive.findElement(By.xpath("//*[@id=\"nextenterproductdata\"]"));
		nextbtn23.click();
		//next page
		WebElement sdate13=drive.findElement(By.xpath("//*[@id=\"startdate\"]"));
		sdate13.sendKeys("05/25/2024");
		WebElement inssm13=drive.findElement(By.xpath("//*[@id=\"insurancesum\"]"));
		Select drop613=new Select(inssm13);
		drop613.selectByIndex(6);
		WebElement dmgins13=drive.findElement(By.xpath("//*[@id=\"damageinsurance\"]"));
		Select drop813=new Select(dmgins13);
		drop813.selectByIndex(3);
		WebElement optpr13=drive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[2]/span"));
		optpr13.click();
		WebElement nxbtn33=drive.findElement(By.xpath("//*[@id=\"nextselectpriceoption\"]"));
		nxbtn33.click();
		//next page
		WebElement prctbl13=drive.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span"));
		prctbl13.click();
		Thread.sleep(3000);
		WebElement nbtn53=drive.findElement(By.id("nextsendquote"));
		nbtn53.click();
		//next page
		WebElement email13=drive.findElement(By.xpath("//*[@id=\"email\"]"));
		email13.sendKeys("sanjeev663679@gmail.com");
		WebElement phone13=drive.findElement(By.xpath("//*[@id=\"phone\"]"));
		phone13.sendKeys("7992203282");
		WebElement user13=drive.findElement(By.xpath("//*[@id=\"username\"]"));
		user13.sendKeys("sanj_799220");
		WebElement pass13=drive.findElement(By.xpath("//*[@id=\"password\"]"));
		pass13.sendKeys("San123@");
		WebElement cfpass13=drive.findElement(By.xpath("//*[@id=\"confirmpassword\"]"));
		cfpass13.sendKeys("San123@");
		WebElement comm133=drive.findElement(By.xpath("//*[@id=\"Comments\"]"));
		comm133.sendKeys("camper insurance."
				+ " Thankyou");
		Thread.sleep(3000);
		WebElement sendeml13=drive.findElement(By.xpath("//*[@id=\"sendemail\"]"));
		sendeml13.click();
		Thread.sleep(10000);
		//WebElement Okay=drive.findElement(By.xpath("/html/body/div[4]/div[7]/div/button"));
		//Okay.click();


		Actions act2 = new Actions(drive);
		act2.keyDown(Keys.SPACE);
		act2.perform();
		act2.keyUp(Keys.SPACE);
		act2.perform();
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  

  @AfterTest
  public void afterTest() {
	  drive.close();
  }

}
