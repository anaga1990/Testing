package com.test;
import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{
        	 String configFile = System.getProperty("user.dir") + "/src/test/resources/globalTest.properties";
             FileOutputStream fout=new FileOutputStream(configFile);    
             String s="s=Welcome to javaTpoint.";
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  