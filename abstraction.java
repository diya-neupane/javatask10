abstract class MyLaptop{
    // cannot innstantiate abstract class--no objects
    public MyLaptop(int num){
        super(num);
        System.out.println("Laptop created");
    }
    void greet(){
        System.out.println("hello");

    }
    abstract void printName();

}
class Asus extends MyLaptop{
    // you can only extend one class
    @Override
    void printName() {
        System.out.println("Asus Laptop");
    }

}
public class abstraction extends MyLaptop{
    public static void main(String[] args) {

    }
    // MyLaptop Laptop = new MyLaptop);--error
    Asus myAsus= new Asus();
    myAsus.greet();
    myAsus.printName();
    // MyLaptop myLaptop = new MyLaptop();--error, cannot instantiate abstract class
       
    }
