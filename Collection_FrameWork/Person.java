package Collection_FrameWork;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static int compare(int x, int y){
        //return (Integer.compare(x, y));
        //return (x < y ? -1 : (x == y ? 0 : 1));

        if (x<y){
            return -1;
        }else if (x>y){
            return 1;
        }return 0;
    }
}
