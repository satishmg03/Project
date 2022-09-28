package ExtentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class demoo {
	
	@Test
	
	public void report()
	{
		ExtentHtmlReporter report = new ExtentHtmlReporter("./reports/demoo2.html");
		
		ExtentReports r = new ExtentReports();
		
		r.attachReporter(report);
		
		ExtentTest logger = r.createTest("report");
		
		logger.log(Status.PASS, "test pass");
		
		logger.log(Status.FAIL, "test fail");
		
		r.flush();
		
	}
}
