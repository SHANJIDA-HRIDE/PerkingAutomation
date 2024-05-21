package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "invalidCredentials")
    public static Object invalidCredentials(){
        Object[][] dataset = {
                {"alamin","123456","Invalid Login Credentials!"},
                {"Tausif","12345","Invalid Login Credentials!"},
                {"Jojo","1234","Invalid Login Credentials!"},
                {"Operator1","1234","Invalid Login Credentials!"}
        };

        return dataset;
    }

    @DataProvider(name = "validCredentials")
    public static Object validCredentials(){
        Object[][] dataset = {
                {"tausif","1234"}
        };


        return dataset;
    }
    @DataProvider(name = "newUserEntry")
    public static Object newUserEntry(){
        Object[][] dataset = {
                {"Test5","Rofiq","test5","Superadmin","1234","1234"}
        };

        return dataset;
    }
    @DataProvider(name = "cardNumber1")
    public static Object cardNumber1(){
        Object[][] dataset = {
                {"cc21"}
        };

        return dataset;
    }

    @DataProvider(name = "cardNumber2")
    public static Object cardNumber2(){
        Object[][] dataset = {
                {"cc22"}
        };

        return dataset;
    }

    @DataProvider(name = "cardIssueWithModePostPaidHourly_Daily")
    public static Object cardIssueWithModePostPaidHourly_Daily(){
        Object[][] dataset = {
                {"Post-Paid","Hourly","Motorcycle","cc21","Hafiz","Na-55-1200","1234"},
                {"Post-Paid","Daily","Private Car","cc22","Rakib","Ba-56-1300","01777048151"}
        };

        return dataset;
    }

    @DataProvider(name = "exitScreenExemption")
    public static Object exitScreenExemption(){
        Object[][] dataset = {
                {"cc22","122","Extra Paid"}
        };

        return dataset;
    }


}
