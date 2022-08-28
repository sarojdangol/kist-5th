package questions;

///Create a new Class VipCustomer
//it should have 3 fields name,credit limit and email address
//create 3 constructors
////1st construtor should call the constructer with 3 parameter with defaultvalues
//2nd constructor should pass on the 2 values it receives and add a default value for the 3rd one
//3rd constructor should save all the fields
//Create getters  only for this using code generation of intellij as setters won't be needed
//test and confirm it works

public class Main {
    public static void main(String[] args) {
        VipCustomer Bipul= new VipCustomer();
        VipCustomer Ram=new VipCustomer("Ram","ram@yahoo.com");
        VipCustomer Shyam=new VipCustomer("Shyam",100000,"shyam@yahoo.com");

//        System.out.println("this is the data of bipul object");
//        System.out.println(Bipul.getCreditLimit());
//        System.out.println(Bipul.getName());
//        System.out.println(Bipul.getEmailAddress());
//
////        System.out.println("this is the data of Ram object");
//        System.out.println(Ram.getCreditLimit());
//        System.out.println(Ram.getName());
//        System.out.println(Ram.getEmailAddress());
//
////        System.out.println("this is the data of Shyam object");
//        System.out.println(Shyam.getCreditLimit());
//        System.out.println(Shyam.getName());
//        System.out.println(Shyam.getEmailAddress());
    }
}

