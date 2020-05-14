import java.util.Scanner;

public class People {
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

    public void show(){
        if (age<0){
            System.out.println(name+" age not be less than 0.");
        }else if (age>60||(age>=0&&age<18)){
            System.out.println(name+"'s age is: "+age+", ticket: free.");
        }else {
            System.out.println(name+"'s age is: "+age+", ticket: 20$.");
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        People people1=new People();
        System.out.println("please input name");
        String name=in.next();
        people1.setName(name);
        System.out.println("please input age");
        int age=in.nextInt();
        people1.setAge(age);
        people1.show();
    }


}
