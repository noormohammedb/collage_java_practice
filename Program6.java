/*
    Program6-Read Keyboard With Buffered Reader

    scanner reads 1kb
    BufferReader reads 8kbs
    BufferReader may cause io exceptions
*/

import java.io.*;

public class Program6 {
    public static void main(String[] args) throws Exception {
        // public static void main(String[] args) {

        // try {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader bufRead = new BufferedReader(inputStream);
        System.out.print("enter data : ");
        String name = bufRead.readLine();
        System.out.println(name);

        // } catch (Exception e) {
        //
        // System.out.println(e);
        // }
    }
}
