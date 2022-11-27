package org.jvmrepo;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Generatejvm {

	public static void report(String jsonfilepath) {
		
		File f =new File("C:\\Users\\ADMIN\\eclipse-workspace\\HomeBaseuk\\src\\test\\resources\\jvm");
		
		Configuration c=new Configuration(f, "home base");
		c.addClassifications("browser", "chrome");
		c.addClassifications("version", "68.9");
		
		ArrayList<String> l=new ArrayList<String>();
		l.add(jsonfilepath);
		
		ReportBuilder r =new ReportBuilder(l, c);
		r.generateReports();
		
		
	}

}
