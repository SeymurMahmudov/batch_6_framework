package dataDriven;

import java.util.HashMap;

import org.testng.annotations.DataProvider;

public class TestDatas {

	@DataProvider(name = "calculationData")
	public Object[][] dataSet() {
		Object[][] calculation = {
				{2,5,7},
				{3,11,14},
				{5,4,9},
		};
		return calculation;
	}
	@DataProvider(name = "personInfo")
	public Object[] dataSet2 (){
		
		Object[] personInfos = new Object[3];
		
		HashMap<String, String> info = new HashMap<>();
		info.put("firstname", "John");
		info.put("lastName", "Peter");
		info.put("Email", "peter@gmail.com");
		info.put("phone", "703-66-5686");
		
		HashMap<String, String> info2 = new HashMap<>();
		info.put("firstname", "Lilly");
		info.put("lastName", "Wang");
		info.put("Email", "lilly@gmail.com");
		info.put("phone", "703-66-5686");
		
		HashMap<String, String> info3 = new HashMap<>();
		info.put("firstname", "Pao");
		info.put("lastName", "Li");
		info.put("MiddleName", "S");
		info.put("Email", "pao@gmail.com");
		info.put("phone", "703-66-5686");
		
		personInfos[0] = info;
		personInfos[1] = info;
		personInfos[2] = info;
		
		return personInfos;
	}
	
	}
