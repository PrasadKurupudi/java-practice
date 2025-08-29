class Parent {
    String a = "prasad";
}//parent class
class child1 extends Parent {
    String b = "ramu";
     void add(){
        System.out.println(b + " " + a +  " are friends.");
    }
// child class has properties of parent
}
class child2 extends Parent {
    String c = "laxman";
    void add1() { 
        System.out.println(a + " " + c + " are friends." );
    }// child case has the properties of the parent
}

public class herarchical_inheriatnce {
    public static void main(String[] args) {
        child1 test = new child1();
        child2 test1 = new child2();
        test.add();// we can access the properties of the parent from both the child classes makes it herarchical inheritance
        test1.add1();
    }
}
