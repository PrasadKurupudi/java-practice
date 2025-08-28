// single level inheritance


class school { // parent class or main class
    public void schools() {
        System.out.println("Layer 1");
    }

}
class students extends school { // child class or derived class
    public void students1(){
        System.out.println("Layer 2");
    }
}

public class inheritance {
    public static void main(String[] args) {
       students a = new students();
       a.schools(); // we can access the parent properties from the child 
       a.students1();
    }
}