package ObjectProject.sample3;

public class MobileNumber {
    //成员变量私有化
    private String owner;//所有者
    private String areaCode = "86";//国家地区
    private String mobileNumber;//手机号
    //getter方法 ： getter 方法用于读取成员变量的内容
    //getter方法书写格式： public 成员变量类型 get成员变量名( ), PS: 成员变量名首字母要求大写
    public String getOwner(){
        //this 关键词 代表当前对象的。。。。。
        return this.owner;
    }
    //setter 方法： setter 方法用于设置成员变量的内容；
    //setter 书写格式： public void set成员变量名（新的数据参数）, PS: 成员变量名首字母要求大写
    public void setOwner(String owner){
        this.owner = owner;//用外部输入的新的数据参数（owner）为当前变量（this.owner）进行赋值
    }
    public String getAreaCode(){
        return this.areaCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}

