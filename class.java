class Students {
    int rollno; // data member
    String name; // data member
    int marks; // data member
    void insert(int r,String n, int m) //method defination
    {
        rollno = r;
        name = n;
        marks = m;
    }void info(){
        System.out.println(rollno + " " + name + " " + marks);
    }
}
public class opps {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();
        s1.insert(20,"prasad",10);
        s2.insert(21,"akhil",11);
        s3.insert(22,"akshay",12);
        s1.info();
        s2.info();
        s3.info();
        Students s4 = new Students();
        Students s5 = new Students();
        s4.insert(24,"srujan",5);
        s5.insert(24,"gowtham",6);
        s4.info();
        s5.info();
    }
    
}
