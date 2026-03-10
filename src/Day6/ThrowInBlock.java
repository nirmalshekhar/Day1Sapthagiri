package Day6;
public class ThrowInBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try Block");
            throw new ArithmeticException("Exception from try");
        }
        catch(ArithmeticException e){
            System.out.println("caught in catch"+e.getMessage());
            throw new NullPointerException("Exception from catch");
        }
        finally
        {
            System.out.println("Inside finally Block");
            throw new IllegalStateException("Exception from finally");
        }
    }
}
