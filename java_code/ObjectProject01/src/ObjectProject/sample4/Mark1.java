package ObjectProject.sample4;

public class Mark1 {
    protected String title;
    protected String color;
    protected String movie;
    public void  description(){
        System.out.println("型号：" + title);
        System.out.println("颜色：" + color);
        System.out.println("首次出场电影：" + movie);
    }
    private void fire() {
        System.out.println("利用手臂燃料射出火焰");
    }

    public static void main(String[] args) {
        Mark1 mark1 = new Mark1();
        mark1.title = "马克1型";
        mark1.color = "银色";
        mark1.movie = "钢铁侠1";
        mark1.description();
        mark1.fire();
    }
}

