package Day6;

public class MultipleThrows {
    static void checkValues(int num,String text)throws ArithmeticException,NullPointerException{
        if(num<0){
            throw new ArithmeticException("Number Cant be negative");
        }
        if(text==null){
            throw new NullPointerException("Text cant be null");
        }
        System.out.println(num+" "+text);
    }
    public static void main(String[] args) {
        try{
            checkValues(-5,null);
        }
        catch(ArithmeticException e){
            System.out.println("caught Arithmetic "+ e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer "+ e.getMessage());
        }
        finally{
            System.out.println("Finally gets executed");
        }
    }
}
