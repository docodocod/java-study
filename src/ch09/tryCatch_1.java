package ch09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class tryCatch_1 {
    public static void main(String[] args) {
        try{
            readFile("C:/example.txt");
        }catch(IOException e){
            System.out.println(e);
        }finally{
            System.out.println("프로그램을 종료합니다.");
        }
    }
    public static void readFile(String fileName) throws IOException {
        File file=new File(fileName);
        BufferedReader reader=new BufferedReader(new FileReader(file));
        String line=reader.readLine();
        while(line!=null){
            System.out.println(line);
            line=reader.readLine();
        }
        reader.close();
    }
}
