package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "invalidCredentials")
    public static Object invalidCredentials(){
        Object[][] dataset = {{"alamin","123456","Invalid Login Credentials! "},
                {"Tausif","12345","Invalid Login Credentials! "},
                {"Jojo","1234","Invalid Login Credentials! "},
                {"","",""},
                {"Operator1","1234","Invalid Login Credentials! "}};

        return dataset;
    }

}
