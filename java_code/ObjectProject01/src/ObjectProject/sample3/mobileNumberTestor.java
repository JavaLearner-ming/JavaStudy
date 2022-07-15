package ObjectProject.sample3;

public class mobileNumberTestor  {
    public static void main(String[] args) {
        MobileNumber mobileNumber = new MobileNumber();
//        mobileNumber.owner = "老齐";
//        mobileNumber.areaCode = "84";
        mobileNumber.setOwner("老齐");
        String owner = mobileNumber.getOwner();
        System.out.println(owner);
        String areaCode =  mobileNumber.getAreaCode();
        System.out.println(areaCode);

        mobileNumber.setMobileNumber("17888888888");
 //       String mobileNumber = mobileNumber.getMobileNumber();
        System.out.println(mobileNumber);


    }

}
