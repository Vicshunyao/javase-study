package atguigu.exer1;

public class PassObject {
    public static void main(String[] args) {
        PassObject obj = new PassObject();
        Circle circle = new Circle();
        obj.PrintArea(circle, 5);
        System.out.println("now radius is:" + circle.raidus);
    }

    public void PrintArea(Circle c, int time) {
        System.out.println("Radius\t\tArea");
        int i = 1;
        for (; i <= time; i++) {
            c.raidus = i;
            System.out.println(c.raidus + "\t\t\t" + c.findarea());
        }

        c.raidus = i;
    }
}
