class Parent1 {
    void test1(){ // this is the main parent class
        System.out.println("These are grand father properties");
    }
}
class Parent2 extends Parent1 {
    void test2(){ //properties of parent 1 are in parent 2
        System.out.println("These are Father properties");
    }
}
class Parent3 extends Parent2 {
    void test3(){ //properties of parent 1 and parent 2 are in parent 3
        System.out.println("This is son properties");
    }
}

public class multilevel_inhertance {
    public static void main(String[] args) {
        Parent3 a = new Parent3();
        a.test1();
        a.test2();// both the test1 and test 2 are not the properties of the test3 but we can access using multi level inhertance
        a.test3();
    }
}
