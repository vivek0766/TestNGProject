package udemy.testNG.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParameter {
	
	@DataProvider
	public Object[][] sendData(){
		Object[][] data = new Object[2][3];
		System.out.println("User Data");
		data[0][0]="01";
		data[0][1]="Vivek";
		data[0][2]="Kvivek0766";
		
		
		data[1][0]="02";
		data[1][1]="Satish";
		data[1][2]="SattiReddy";
		
		return data;
		
	}
	
	@Test(dataProvider="sendData")
	public void receiveData(String userID, String userName, String password){
		System.out.println(userID);
		System.out.println(userName);
		System.out.println(password);
	}

}
