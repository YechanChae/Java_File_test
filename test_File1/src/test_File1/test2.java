package test_File1;

import java.io.*;

public class test2 {
  public static void main(String[] args)throws IOException {
    RandomAccessFile raf;
    raf = new RandomAccessFile("RandomAccessFile.txt", "rw");

    for(int i=0; i<100; i++) {
      raf.writeInt(i);
    }

    for(int i=0; i<10; i++) {
      int accPointer = (int)(Math.random()*100);
      raf.seek(accPointer * 4);
      System.out.print("Current FP: " + raf.getFilePointer());
      System.out.println(", Data: " + raf.readInt());
    }
    raf.close();
  }
}