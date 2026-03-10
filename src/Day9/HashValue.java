package Day9;

public class HashValue {
    public static void main(String[] args) {
        int key=25;
        int tableSize=10;
        int hasValue=key%tableSize;

        System.out.println("Key ->"+ key +" HashValue(Index)->"+hasValue);
    }
}
