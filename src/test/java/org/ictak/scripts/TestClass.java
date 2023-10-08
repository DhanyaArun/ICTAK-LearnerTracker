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
Thread.sleep(5000);
log.Passwd(password);
Thread.sleep(5000);
log.Login();
Thread.sleep(5000);
String admin=log.AdminPageCheck();
Assert.assertEquals(admin,Constants.expAText);

}

@Test(description = "TestCase 2")
public void VerifyAdminLoginEmptyData() throws IOException, InterruptedException
{
	log=new LoginPage(driver);	
	//String username=Excelutility.getData(1, 0);
	//String password=Excelutility.getData(1, 1);
	//log.Username(username);
	//log.Passwd(password);
	log.Login();
	Thread.sleep(5000);
	String invalidtext=log.EmptyLoginCheck();
	Assert.assertEquals(invalidtext,Constants.expInvText);

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
	String invtext=log.InvCheck();
	Assert.assertEquals(invtext,Constants. expinvText);

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
	String trainerText=log.TrainerPageCheck();
	Assert.assertEquals(trainerText,Constants.expTText);
}

@Test(description = "TestCase 5")
public void VerifyTrainerInvLogin() throws IOException, InterruptedException 
{
	log=new LoginPage(driver);	
	String username=Excelutility.getData(5, 0);
	//String password=Excelutility.getData(5, 1);
	log.Username(username);
	Thread.sleep(5000);	
	//log.Passwd(password);
	Thread.sleep(5000);	
	log.Login();
	Thread.sleep(5000);	
	String invtext=log.InvCheck();
	Assert.assertEquals(invtext,Constants. expinvText);

}

// Placement officer Login and actions//
 
@Test(description = "TestCase 6")
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
	String pourl=log.Url();
	Assert.assertEquals(pourl,Constants.expPoUrl);
}

@Test(description = "TestCase 7")
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
	String updtext=log.updateButtonAssert();
	Assert.assertEquals(updtext,Constants.expupdtext);
}

@Test(description = "TestCase 8")
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
@Test(description = "TestCase 9")
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


//Trainer Head login and actions//

//Learner Dashboard//


@Test(description = "TestCase 10")

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
	String addurl=log.Url();
	Assert.assertEquals(addurl,Constants.expAUrl);
}

	@Test(description = "TestCase 13")

	public void VerifyLearnerForm() throws IOException, InterruptedException 
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
		String subtext=log.SubmitCheck();
		Assert.assertEquals(subtext,Constants.expsubtext);	
}
	
	
	@Test(description = "TestCase 14")

	public void VerifyInvalidLearnerSubmit() throws IOException, InterruptedException 
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
		//log.LearnerId();
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
		String subIntext=log.SubmitInvalidCheck();
		Assert.assertEquals(subIntext,Constants.expInText);	
}
	
	@Test(description = "TestCase 15")

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
		
		String Backtext=log.BackToDshbrdPageCheck();
		Assert.assertEquals(Backtext,Constants.expBcktext);	
		
}

@Test(description = "TestCase 16")

	public void VerifyTrainerEdit() throws IOException, InterruptedException 
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
		log.TrainerEditCheck();
		Thread.sleep(5000);
		log.BatchtDropdwnCheck();
		Thread.sleep(3000);
		log.LearnerformSubmit();
		Thread.sleep(3000);
		System.out.println("Updated Successfully");
				
}

@Test(description = "TestCase 17")

public void VerifyTrainerDelete() throws IOException, InterruptedException 
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
	log.TrainerDeleteCheck();
	Thread.sleep(5000);
	System.out.println("Deleted Successfully");
			
}

	@Test(description = "TestCase 18")

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
		log.ChooseFile();
		Thread.sleep(2000);
		log.SubmitFile();
		Thread.sleep(2000);
		//log.RetndshbrdFile();
		String filetext=log.FileCheck();
		Assert.assertEquals(filetext,Constants.expfiletext);
}
	
	
//Admin	Access//
	
	@Test(description = "TestCase 19")
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
	

	
	@Test(description = "TestCase 20")
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
	String name=Excelutility.getData(8, 0);
	log.addName(name);
	String email=Excelutility.getData(9, 0);
	log.addEmail(email);
	String user=Excelutility.getData(10, 0);
	log.addUser(user);
	String passwd=Excelutility.getData(11, 0);
	log.addPasswd(passwd);
	Thread.sleep(5000);
	log.addRoleDropdwnCheck();
	Thread.sleep(5000);
	log.Submit();
	Thread.sleep(5000);
	log.SubmitCheck();
	System.out.println("Posted Successfully");
	String subtext=log.SubmitCheck();
	Assert.assertEquals(subtext,Constants.expsubtext);
	}
	
	
	@Test(description = "TestCase 21")
	public void VerifyNameEmptySubmit() throws IOException, InterruptedException
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
	//String name=Excelutility.getData(8, 0);
	//log.addName(name);
	String email=Excelutility.getData(9, 0);
	log.addEmail(email);
	String user=Excelutility.getData(10, 0);
	log.addUser(user);
	String passwd=Excelutility.getData(11, 0);
	log.addPasswd(passwd);
	Thread.sleep(5000);
	log.addRoleDropdwnCheck();
	Thread.sleep(5000);
	log.Submit();
	Thread.sleep(5000);
	String emptytext=log.NameEmptyCheck();
	Assert.assertEquals(emptytext,Constants.expemptytext);
	}
	

	@Test(description = "TestCase 22")
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
	log.UpdCheck();
	String name=Excelutility.getData(8, 0);
	//log.addName(name);
	Thread.sleep(2000);
	log.Submit();
	System.out.println("Updated Successfully");
	Thread.sleep(2000);
	
	
	}
	
	@Test(description = "TestCase 23")
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
	
	}
	
	@Test(description = "TestCase 24")
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
	
	@Test(description = "TestCase 25")
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