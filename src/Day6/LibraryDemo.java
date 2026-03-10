package Day6;
//Custom Exception
class GC extends Exception{
    GC(String message){
        super(message);
    }
}
public class LibraryDemo {
    static void CheckAttendence(boolean absent)throws GC{
        if(absent){
            throw new GC("Penalty to submit 3 books in library");
        }
        else {
            System.out.println("Present in class: No penalty");
        }
    }
    public static void main(String[] args) {
        try{
            CheckAttendence(true);
        }
        catch(GC e){
            System.out.println("caught Exception :"+e.getMessage());
        }
        finally{
            System.out.println("Welcome to Sapthagiri");
        }
    }
}
