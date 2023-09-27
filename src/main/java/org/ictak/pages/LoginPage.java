package org.ictak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage
{
WebDriver driver;

private WebElement ausername,tusername,backToDshb,name,email,uname,addpswd,addRoleDrpDwn,updBtn,deletBtn;
private WebElement apassword,tpassword,courseDrpDwn,projectDrpDwn,batchDrpDwn,courseStDrpDwn,submitbtn;
private WebElement alogin,tlogin,logo,addbtn,updtBtn,testDrpDwn,submbtn,logobtn,learnId,UpldFile;
private WebElement LearnersBtn,placementBtn;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
}



//Login Functionality//



public void Username(String admUser) throws InterruptedException
{
	ausername=driver.findElement(By.id("username"));
	ausername.sendKeys(admUser);
	Thread.sleep(2000);
	ausername.clear();
}
public void Passwd(String admPasswd) throws InterruptedException
{
	apassword=driver.findElement(By.id("password"));
	apassword.sendKeys(admPasswd);
	Thread.sleep(2000);
	apassword.clear();
}
public void Login()
{
	alogin=driver.findElement(By.xpath("//button[@class='btn btn-success w-100']"));
	alogin.click();
}
	
public String Url()
{	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	return(url);
	
}



//Learner Dashboard//



public void LogoCheck()
{

	logo=driver.findElement(By.xpath("//a[@href=\"/\"and @class=\"mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1\"]"));
	logo.click();

}
public void addButtonCheck()
{
addbtn=driver.findElement(By.xpath("//button[@class=\"mb-3 btn btn-success\"]"));
addbtn.click();
}
public void updBtnClick()
{
	updtBtn=driver.findElement(By.xpath("//button[@type=\"button\"and@class=\"btn btn-success btn btn-primary\"]"));
	updtBtn.click();
}

public void PlcmtStatsDropdwnCheck() 
{
	testDrpDwn=driver.findElement(By.name("pstatus"));
	testDrpDwn.click();
	Select dropDown=new Select(testDrpDwn);
	dropDown.selectByVisibleText("Placed");
	
}

public void PlcmtStatsButn() 
{
	submbtn=driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]"));
	submbtn.click();
	//System.out.println("Updated Successfully");
	
}

public void LogoButn() 
{
	logobtn=driver.findElement(By.xpath("//a[@href=\"/\"and @class='mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1']"));
	logobtn.click();
	//System.out.println("Updated Successfully");
	
}



//Learner Form Details//




public void LearnerId() 
{
	learnId=driver.findElement(By.id("learnerid"));
	learnId.sendKeys("ID101");
}

public void LearnerName() 
{
	learnId=driver.findElement(By.id("name"));
	learnId.sendKeys("Maya");
}
public void CourseDropdwnCheck() 
{
	courseDrpDwn=driver.findElement(By.name("course"));
	courseDrpDwn.click();
	Select dropDown=new Select(courseDrpDwn);
	dropDown.selectByIndex(3);
	
}
public void ProjectDropdwnCheck() 
{
	projectDrpDwn=driver.findElement(By.name("project"));
	projectDrpDwn.click();
	Select dropDown=new Select(projectDrpDwn);
	dropDown.selectByIndex(3);
	
}
public void BatchtDropdwnCheck() 
{
	batchDrpDwn=driver.findElement(By.name("batch"));
	batchDrpDwn.click();
	Select dropDown=new Select(batchDrpDwn);
	dropDown.selectByIndex(2);
	
}
public void CourseStatDropdwnCheck() 
{
	courseStDrpDwn=driver.findElement(By.name("cstatus"));
	courseStDrpDwn.click();
	Select dropDown=new Select(courseStDrpDwn);
	dropDown.selectByIndex(1);
	
}
public void LearnerformSubmit()
{
	submitbtn=driver.findElement(By.xpath("//button[text()='Submit']"));
	submitbtn.click();
	
}
public void BackToDashboardBtn() 
{
	backToDshb=driver.findElement(By.xpath("//button[text()='Back to Dashboard']"));
	backToDshb.click();
}

public void UploadFile()
{
	UpldFile=driver.findElement(By.xpath("//button[@type='button' and contains(@class, 'btn-success')]/ion-icon[@name='cloud-upload']\r\n"
		+ ""));	
	UpldFile.click();

}


//Admin Access//

// a. User Dashboard//

public void addName()
{
	name=driver.findElement(By.name("name"));
	name.sendKeys("Meera");
}
public void addEmail()
{
	email=driver.findElement(By.name("email"));
	email.sendKeys("Meera123@gmail.com");
}
public void addUser()
{
	uname=driver.findElement(By.name("username"));
	uname.sendKeys("Trainer123");
}

public void addPasswd()
{
	addpswd=driver.findElement(By.name("password"));
	addpswd.sendKeys("trainer@234");
}

public void addRoleDropdwnCheck() 
{
	addRoleDrpDwn=driver.findElement(By.name("roleInputs"));
	addRoleDrpDwn.click();
	Select dropDown=new Select(addRoleDrpDwn);
	dropDown.selectByIndex(3);
	
}
public void Submit()
{
	submitbtn=driver.findElement(By.xpath("//button[text()='Submit']"));
	submitbtn.click();
	
}
public void Updatebtn()
{
	updBtn=driver.findElement(By.xpath("//button[@class='btn btn-success btn btn-primary']"));
	updBtn.click();
}

public void Deletebtn()
{
	deletBtn=driver.findElement(By.xpath("//button[@class='btn btn-danger btn btn-primary']"));
	deletBtn.click();
}


//b. Learner Dashboard//

public void Learnersbtn()
{
	LearnersBtn=driver.findElement(By.xpath("//span[@class='item-content' and text()='Learners']"));
	LearnersBtn.click();
}

public void Placementbtn()
{
	placementBtn=driver.findElement(By.xpath("//span[@class='item-content' and text()='Placement']"));
	placementBtn.click();
}
}
