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

public String AdminPageCheck()
{	
	WebElement admin=driver.findElement(By.id("basic-nav-dropdown"));
	String adminText=admin.getText();
	System.out.println(adminText);
	return adminText;
	
}

public String EmptyLoginCheck()
{	
	WebElement admin=driver.findElement(By.xpath("//div[@role='alert' and @class='fade alert alert-danger alert-dismissible show' and text()='User not found !!']"));
	String notloginText=admin.getText();
	System.out.println(notloginText);
	return notloginText;
	
}

public String InvCheck()
{	
	WebElement admin=driver.findElement(By.xpath("//div[@role='alert' and contains(@class, 'alert-danger') and text()='Login Failed!!']"));
	String adminInvText=admin.getText();
	System.out.println(adminInvText);
	return adminInvText;
	
}


public String TrainerPageCheck()
{	
	WebElement trainer=driver.findElement(By.id("basic-nav-dropdown"));
	String trainerText=trainer.getText();
	System.out.println(trainerText);
	return trainerText;
	
}

public String PofficerPageCheck()
{	
	WebElement pofficer=driver.findElement(By.id("basic-nav-dropdown"));
	String pofficerText=pofficer.getText();
	System.out.println(pofficerText);
	return pofficerText;
	
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

public String addButtonAssert()
{
	WebElement addtext=driver.findElement(By.xpath("//h3[text()='Add Users']"));
	String AddText=addtext.getText();
	return AddText;
}


public void updBtnClick()
{
	updtBtn=driver.findElement(By.xpath("//button[@type=\"button\"and@class=\"btn btn-success btn btn-primary\"])"));
	updtBtn.click();
}

public String updateButtonAssert()
{
	WebElement updtext=driver.findElement(By.xpath("//label[@class='form-label' and text()='Placement Status:']"));
	String UpdText=updtext.getText();
	return UpdText;
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
	submbtn=driver.findElement(By.xpath("//button[@class='btn btn-success' and text()='Submit']"));
	submbtn.click();
	//System.out.println("Updated Successfully");
	
}

public void LogoButn() 
{
	logobtn=driver.findElement(By.xpath("//a[@href=\"/\"and @class='mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1']"));
	logobtn.click();
	//System.out.println("Updated Successfully");
	
}



//Learner Form Details(Add new user)//




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

public String BackToDshbrdPageCheck()
{	
	WebElement LearnerText=driver.findElement(By.xpath("//a[@class='navbar-brand' and text()='LearnerTracker']"));
	String BackText=LearnerText.getText();
	System.out.println(BackText);
	return BackText;
	
}

public void UploadFile()
{
	UpldFile=driver.findElement(By.xpath("//button[@type='button' and contains(@class, 'btn-success')]/ion-icon[@name='cloud-upload']\r\n"
		+ ""));	
	UpldFile.click();

}

public void ChooseFile()
{
	WebElement chooseFile=driver.findElement(By.name("file"));	
	chooseFile.sendKeys("C:\\Users\\Arun\\Documents\\Learner data.csv");

}

public void SubmitFile()
{
	WebElement submtFile=driver.findElement(By.xpath("//button[@class='ui grey mini button' and text()='Submit']"));	
	submtFile.click();
}

public void RetndshbrdFile()
{
	WebElement retFile=driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled' and text()='Return to Dashboard']"));	
	retFile.click();
}

public String FileCheck()
{
	WebElement FileText=driver.findElement(By.id("swal2-title"));	
	String filetext=FileText.getText();
	return filetext;

}

//swal2-title

//Admin Access//

// a. User Dashboard//

public void addName(String Name)
{
	name=driver.findElement(By.name("name"));
	name.sendKeys(Name);
	
}
public void addEmail(String Email)
{
	email=driver.findElement(By.name("email"));
	email.sendKeys(Email);
}
public void addUser(String user)
{
	uname=driver.findElement(By.name("username"));
	uname.sendKeys(user);
}

public void addPasswd(String passwd)
{
	addpswd=driver.findElement(By.name("password"));
	addpswd.sendKeys(passwd);
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
	submitbtn=driver.findElement(By.xpath("//button[@class='btn btn-success' and text()='Submit']"));
	submitbtn.click();
	
}

public String NameEmptyCheck()
{
	WebElement submText=driver.findElement(By.xpath("//p[@class='fw-light fst-italic text-start text-danger' and text()='Must contain letters only']"));
	String subtext=submText.getText(); 
	return subtext;
	
}


public String SubmitCheck()
{
	WebElement submText=driver.findElement(By.id("swal2-html-container"));
	String subtext=submText.getText(); 
	return subtext;
	
}



public void TrainerEditCheck()
{
	WebElement edit=driver.findElement(By.xpath("(//button[@class='btn btn-success'])[4]"));
	edit.click();
	
}

public void TrainerDeleteCheck()
{
	WebElement delete=driver.findElement(By.xpath("(//button[@class='btn btn-danger'])[4]"));
	delete.click();
	
}

//button[@class='btn btn-danger'])[4]
	
public String SubmitInvalidCheck()
{
	WebElement submText=driver.findElement(By.xpath("//p[@class='fw-light fst-italic text-start text-danger' and text()='Must contain letters,numbers and - only']"));
	String subIntext=submText.getText(); 
	return subIntext;
	
}



public void Updatebtn()
{
	updBtn=driver.findElement(By.xpath("(//button[@class='btn btn-success btn btn-primary'])[4]"));
	updBtn.click();
}


public void UpdCheck()
{
	WebElement inputField = driver.findElement(By.id("name"));
	String initialValue = inputField.getAttribute("Meera");
	inputField.sendKeys("Dev");
	String updatedValue = inputField.getAttribute("Meera");
	/* if (!initialValue.equals(updatedValue)) {
         System.out.println("The field has been updated.");
     } else {
         System.out.println("The field has not been updated.");
     }*/


	
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
