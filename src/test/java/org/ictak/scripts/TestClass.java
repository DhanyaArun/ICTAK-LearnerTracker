package org.ictak.scripts;

import java.io.IOException;

import org.ictak.constants.Constants;
import org.ictak.excel.Excelutility;
import org.ictak.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBase
{
	
	LoginPage log;
	
@Test(description = "TestCase 1")
public void VerifyAdminLogin() throws IOException, InterruptedException
{
	
log=new LoginPage(driver);	
String username=Excelutility.getData(0, 0);
String password=Excelutility.getData(0, 1);
log.Username(username);
log.Passwd(password);
log.Login();
Thread.sleep(5000);
String admurl=log.Url();
Assert.assertEquals(admurl,Constants.expaUrl);

}
@Test(description = "TestCase 2")
public void VerifyAdminLoginEmptyData() throws IOException, InterruptedException
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(1, 0);
	String password=Excelutility.getData(1, 1);
	log.Username(username);
	log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	String admEurl=log.Url();
	Assert.assertEquals(admEurl,Constants.expEUrl);	
}
@Test(description = "TestCase 3")
public void VerifyAdminLoginInvalidPasswd() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(2, 0);
	String password=Excelutility.getData(2, 1);
	log.Username(username);
	Thread.sleep(5000);	
	log.Passwd(password);
	Thread.sleep(5000);	
	log.Login();
	Thread.sleep(5000);	
	String admEurl=log.Url();
	Assert.assertEquals(admEurl,Constants.expEUrl);	
}
@Test(description = "TestCase 4")
public void VerifyTrainerLogin() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(5, 0);
	String password=Excelutility.getData(5, 1);
	log.Username(username);
	Thread.sleep(5000);	
	log.Passwd(password);
	Thread.sleep(5000);	
	log.Login();
	Thread.sleep(5000);	
	String trnUrl=log.Url();
	Assert.assertEquals(trnUrl,Constants.exptUrl);
}
@Test(description = "TestCase 5")
public void VerifyLogoCheck() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(5, 0);
	String password=Excelutility.getData(5, 1);
	log.Username(username);
	Thread.sleep(5000);	
	log.Passwd(password);
	Thread.sleep(5000);	
	log.Login();
	Thread.sleep(5000);	
	log.LogoCheck();
	Thread.sleep(1000);
	String logoUrl=log.Url();
	Assert.assertEquals(logoUrl,Constants.expEUrl);
}
@Test(description = "TestCase 6")
public void VerifyAddBtnCheck() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(5, 0);
	String password=Excelutility.getData(5, 1);
	log.Username(username);
	Thread.sleep(5000);	
	log.Passwd(password);
	Thread.sleep(5000);	
	log.Login();
	Thread.sleep(5000);	
	log.addButtonCheck();
	Thread.sleep(2000);
	String addUrl=log.Url();
	Assert.assertEquals(addUrl,Constants.expAUrl);
}

// Placement officer Login and actions//
 
@Test(description = "TestCase 7")
public void VerifyPofficerLogin() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(6, 0);
	String password=Excelutility.getData(6, 1);
	log.Username(username);
	Thread.sleep(5000);	
	log.Passwd(password);
	Thread.sleep(5000);	
	log.Login();
	Thread.sleep(5000);	
	String poUrl=log.Url();
	Assert.assertEquals(poUrl,Constants.expPoUrl);
}
@Test(description = "TestCase 8")
public void VerifyPofficerUpdBtn() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(6, 0);
	String password=Excelutility.getData(6, 1);
	log.Username(username);
	Thread.sleep(5000);	
	log.Passwd(password);
	Thread.sleep(5000);	
	log.Login();
	Thread.sleep(5000);	
	log.updBtnClick();
	Thread.sleep(5000);	
	String poUrl=log.Url();
	Assert.assertEquals(poUrl,Constants.expPoUrl);
}
@Test(description = "TestCase 9")
public void VerifyPofficerSelctDrpDwn() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(6, 0);
	String password=Excelutility.getData(6, 1);
	log.Username(username);
	Thread.sleep(5000);	
	log.Passwd(password);
	Thread.sleep(5000);	
	log.Login();
	Thread.sleep(5000);	
	log.updBtnClick();
	Thread.sleep(5000);	
	log.PlcmtStatsDropdwnCheck();
	Thread.sleep(5000);
	String poUrl=log.Url();
	Assert.assertEquals(poUrl,Constants.expPoUrl);
}
@Test(description = "TestCase 10")
public void VerifyPofficerSubmtBtn() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(6, 0);
	String password=Excelutility.getData(6, 1);
	log.Username(username);
	Thread.sleep(3000);	
	log.Passwd(password);
	Thread.sleep(3000);	
	log.Login();
	Thread.sleep(3000);	
	log.updBtnClick();
	Thread.sleep(3000);	
	log.PlcmtStatsDropdwnCheck();
	Thread.sleep(3000);
	log.PlcmtStatsButn();
	Thread.sleep(3000);
	System.out.println("Updated Successfully");
	String poUrl=log.Url();
	Assert.assertEquals(poUrl,Constants.expPoUrl);
}


//Learner Dashboard//

@Test(description = "TestCase 11")

public void VerifyLoginBtn() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(5, 0);
	String password=Excelutility.getData(5, 1);
	log.Username(username);
	Thread.sleep(3000);	
	log.Passwd(password);
	Thread.sleep(3000);	
	log.Login();
	Thread.sleep(5000);	
	String trnUrl=log.Url();
	Assert.assertEquals(trnUrl,Constants.exptUrl);
}

@Test(description = "TestCase 12")

public void VerifyLogoBtn() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(5, 0);
	String password=Excelutility.getData(5, 1);
	log.Username(username);
	Thread.sleep(3000);	
	log.Passwd(password);
	Thread.sleep(3000);	
	log.Login();
	Thread.sleep(5000);	
	log.LogoButn();
	String trnUrl=log.Url();
	Assert.assertEquals(trnUrl,Constants.expEUrl);
}
@Test(description = "TestCase 13")

public void VerifyLearnerId() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(5, 0);
	String password=Excelutility.getData(5, 1);
	log.Username(username);
	Thread.sleep(3000);	
	log.Passwd(password);
	Thread.sleep(3000);	
	log.Login();
	Thread.sleep(5000);	
	log.addButtonCheck();
	log.LearnerId();
	String trnUrl=log.Url();
	Assert.assertEquals(trnUrl,Constants.expAUrl);
}
@Test(description = "TestCase 14")

public void VerifyLearnerName() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(5, 0);
	String password=Excelutility.getData(5, 1);
	log.Username(username);
	Thread.sleep(3000);	
	log.Passwd(password);
	Thread.sleep(3000);	
	log.Login();
	Thread.sleep(5000);	
	log.addButtonCheck();
	Thread.sleep(5000);
	log.LearnerId();
	Thread.sleep(5000);
	log.LearnerName();
	Thread.sleep(5000);
	String trnUrl=log.Url();
	Assert.assertEquals(trnUrl,Constants.expAUrl);
}

@Test(description = "TestCase 15")

public void VerifyLearnerCourse() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(5, 0);
	String password=Excelutility.getData(5, 1);
	log.Username(username);
	Thread.sleep(3000);	
	log.Passwd(password);
	Thread.sleep(3000);	
	log.Login();
	Thread.sleep(5000);	
	log.addButtonCheck();
	Thread.sleep(5000);
	log.LearnerId();
	Thread.sleep(5000);
	log.LearnerName();
	Thread.sleep(5000);
	log.CourseDropdwnCheck();
	String trnUrl=log.Url();
	Assert.assertEquals(trnUrl,Constants.expAUrl);
}

@Test(description = "TestCase 16")

public void VerifyLearnerProject() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(5, 0);
	String password=Excelutility.getData(5, 1);
	log.Username(username);
	Thread.sleep(3000);	
	log.Passwd(password);
	Thread.sleep(3000);	
	log.Login();
	Thread.sleep(5000);	
	log.addButtonCheck();
	Thread.sleep(5000);
	log.LearnerId();
	Thread.sleep(5000);	
	log.LearnerName();
	Thread.sleep(5000);
	log.CourseDropdwnCheck();
	Thread.sleep(3000);
	log.ProjectDropdwnCheck();
	Thread.sleep(3000);
	String trnUrl=log.Url();
	Assert.assertEquals(trnUrl,Constants.expAUrl);
}
@Test(description = "TestCase 17")

public void VerifyLearnerBatch() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(5, 0);
	String password=Excelutility.getData(5, 1);
	log.Username(username);
	Thread.sleep(3000);	
	log.Passwd(password);
	Thread.sleep(3000);	
	log.Login();
	Thread.sleep(5000);	
	log.addButtonCheck();
	Thread.sleep(5000);
	log.LearnerId();
	Thread.sleep(5000);	
	log.LearnerName();
	Thread.sleep(5000);
	log.CourseDropdwnCheck();
	Thread.sleep(3000);
	log.ProjectDropdwnCheck();
	Thread.sleep(3000);
	log.BatchtDropdwnCheck();
	Thread.sleep(3000);
	String trnUrl=log.Url();
	Assert.assertEquals(trnUrl,Constants.expAUrl);
}
@Test(description = "TestCase 18")

public void VerifyLearnerCstatus() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(5, 0);
	String password=Excelutility.getData(5, 1);
	log.Username(username);
	Thread.sleep(3000);	
	log.Passwd(password);
	Thread.sleep(3000);	
	log.Login();
	Thread.sleep(5000);	
	log.addButtonCheck();
	Thread.sleep(5000);
	log.LearnerId();
	Thread.sleep(5000);	
	log.LearnerName();
	Thread.sleep(5000);
	log.CourseDropdwnCheck();
	Thread.sleep(3000);
	log.ProjectDropdwnCheck();
	Thread.sleep(3000);
	log.BatchtDropdwnCheck();
	Thread.sleep(3000);
	log.CourseStatDropdwnCheck();
	Thread.sleep(3000);
	String trnUrl=log.Url();
	Assert.assertEquals(trnUrl,Constants.expAUrl);
}
	@Test(description = "TestCase 19")

	public void VerifyLearnerSubmit() throws IOException, InterruptedException 
	{
		log=new LoginPage(driver);	
		String username=Excelutility.getData(5, 0);
		String password=Excelutility.getData(5, 1);
		log.Username(username);
		Thread.sleep(3000);	
		log.Passwd(password);
		Thread.sleep(3000);	
		log.Login();
		Thread.sleep(5000);	
		log.addButtonCheck();
		Thread.sleep(5000);
		log.LearnerId();
		Thread.sleep(5000);	
		log.LearnerName();
		Thread.sleep(5000);
		log.CourseDropdwnCheck();
		Thread.sleep(3000);
		log.ProjectDropdwnCheck();
		Thread.sleep(3000);
		log.BatchtDropdwnCheck();
		Thread.sleep(3000);
		log.CourseStatDropdwnCheck();
		Thread.sleep(3000);
		log.LearnerformSubmit();
		Thread.sleep(3000);
		String trnUrl=log.Url();
		Assert.assertEquals(trnUrl,Constants.exptUrl);	
}
	
	@Test(description = "TestCase 20")

	public void VerifyBackToDshb() throws IOException, InterruptedException 
	{
		log=new LoginPage(driver);	
		String username=Excelutility.getData(5, 0);
		String password=Excelutility.getData(5, 1);
		log.Username(username);
		Thread.sleep(3000);	
		log.Passwd(password);
		Thread.sleep(3000);	
		log.Login();
		Thread.sleep(5000);	
		log.addButtonCheck();
		Thread.sleep(5000);
		log.BackToDashboardBtn();
		String trnUrl=log.Url();
		Assert.assertEquals(trnUrl,Constants.exptUrl);	
		
}

	@Test(description = "TestCase 21")

	public void VerifyUploadFile() throws IOException, InterruptedException 
	{
		log=new LoginPage(driver);	
		String username=Excelutility.getData(5, 0);
		String password=Excelutility.getData(5, 1);
		log.Username(username);
		Thread.sleep(3000);	
		log.Passwd(password);
		Thread.sleep(3000);	
		log.Login();
		Thread.sleep(5000);	
		log.UploadFile();
		Thread.sleep(2000);
}
	
//Admin	Access//
	
	@Test(description = "TestCase 22")
	public void VerifyAdminAddnew() throws IOException, InterruptedException
	{
		
	log=new LoginPage(driver);	
	String username=Excelutility.getData(0, 0);
	String password=Excelutility.getData(0, 1);
	log.Username(username);
	log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	log.addButtonCheck();
	String admurl=log.Url();
	Assert.assertEquals(admurl,Constants.expAAUrl);

	}
	

	@Test(description = "TestCase 23")
	public void VerifyAdminAddName() throws IOException, InterruptedException
	{
		
	log=new LoginPage(driver);	
	String username=Excelutility.getData(0, 0);
	String password=Excelutility.getData(0, 1);
	log.Username(username);
	log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	log.addButtonCheck();
	Thread.sleep(2000);
	log.addName();
	String admurl=log.Url();
	Assert.assertEquals(admurl,Constants.expAAUrl);

	}
	
	@Test(description = "TestCase 24")
	public void VerifyAdminAddEmail() throws IOException, InterruptedException
	{
		
	log=new LoginPage(driver);	
	String username=Excelutility.getData(0, 0);
	String password=Excelutility.getData(0, 1);
	log.Username(username);
	log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	log.addButtonCheck();
	Thread.sleep(2000);
	log.addEmail();
	String admurl=log.Url();
	Assert.assertEquals(admurl,Constants.expAAUrl);

	}
	
	@Test(description = "TestCase 25")
	public void VerifyAdminAddUser() throws IOException, InterruptedException
	{
		
	log=new LoginPage(driver);	
	String username=Excelutility.getData(0, 0);
	String password=Excelutility.getData(0, 1);
	log.Username(username);
	log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	log.addButtonCheck();
	Thread.sleep(2000);
	log.addUser();
	String admurl=log.Url();
	Assert.assertEquals(admurl,Constants.expAAUrl);
	}
	
	@Test(description = "TestCase 26")
	public void VerifyAdminAddPasswd() throws IOException, InterruptedException
	{
		
	log=new LoginPage(driver);	
	String username=Excelutility.getData(0, 0);
	String password=Excelutility.getData(0, 1);
	log.Username(username);
	log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	log.addButtonCheck();
	Thread.sleep(2000);
	log.addPasswd();
	String admurl=log.Url();
	Assert.assertEquals(admurl,Constants.expAAUrl);
	}
	
	
	@Test(description = "TestCase 27")
	public void VerifyAdminAddRole() throws IOException, InterruptedException
	{
		
	log=new LoginPage(driver);	
	String username=Excelutility.getData(0, 0);
	String password=Excelutility.getData(0, 1);
	log.Username(username);
	log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	log.addButtonCheck();
	Thread.sleep(2000);
	log.addRoleDropdwnCheck();
	String admurl=log.Url();
	Assert.assertEquals(admurl,Constants.expAAUrl);
	}
	
	@Test(description = "TestCase 28")
	public void VerifyAdminSubmit() throws IOException, InterruptedException
	{
		
	log=new LoginPage(driver);	
	String username=Excelutility.getData(0, 0);
	String password=Excelutility.getData(0, 1);
	log.Username(username);
	log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	log.addButtonCheck();
	Thread.sleep(2000);
	log.addName();
	Thread.sleep(5000);
	log.addEmail();
	Thread.sleep(5000);
	log.addUser();
	Thread.sleep(5000);
	log.addPasswd();
	Thread.sleep(5000);
	log.addRoleDropdwnCheck();
	Thread.sleep(5000);
	log.Submit();
	Thread.sleep(5000);
	System.out.println("Posted Successfully");
	String admurl=log.Url();
	Assert.assertEquals(admurl,Constants.expaUrl);
	}
	

	@Test(description = "TestCase 29")
	public void VerifyAdminUpdate() throws IOException, InterruptedException
	{
		
	log=new LoginPage(driver);	
	String username=Excelutility.getData(0, 0);
	String password=Excelutility.getData(0, 1);
	log.Username(username);
	log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	log.Updatebtn();
	System.out.println("Updated Successfully");
	Thread.sleep(2000);
	String admurl=log.Url();
	Assert.assertEquals(admurl,Constants.expaUrl);
	}
	
	@Test(description = "TestCase 30")
	public void VerifyAdminDelete() throws IOException, InterruptedException
	{
		
	log=new LoginPage(driver);	
	String username=Excelutility.getData(0, 0);
	String password=Excelutility.getData(0, 1);
	log.Username(username);
	log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	log.Deletebtn();	
	Thread.sleep(2000);
	System.out.println("Deleted Successfully");
	String admurl=log.Url();
	Assert.assertEquals(admurl,Constants.expaUrl);
	}
	
	@Test(description = "TestCase 31")
	public void VerifyAdminToLearners() throws IOException, InterruptedException
	{
		
	log=new LoginPage(driver);	
	String username=Excelutility.getData(0, 0);
	String password=Excelutility.getData(0, 1);
	log.Username(username);
	log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	log.Learnersbtn();	
	Thread.sleep(2000);
	String admurl=log.Url();
	Assert.assertEquals(admurl,Constants.exptUrl);
	}
	
	@Test(description = "TestCase 32")
	public void VerifyAdminToPlacement() throws IOException, InterruptedException
	{
		
	log=new LoginPage(driver);	
	String username=Excelutility.getData(0, 0);
	String password=Excelutility.getData(0, 1);
	log.Username(username);
	log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	log.Placementbtn();	
	Thread.sleep(2000);
	String admurl=log.Url();
	Assert.assertEquals(admurl,Constants.expPoUrl);
	}
}