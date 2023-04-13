import java.io.FileOutputStream;
import java.io.FileWriter;
class FileDemo2{
  public static void main(String args[]){
    try{
      FileOutputStream fw=new FileOutputStream("xyz.txt");
      String str="Welcome to bitLabs";
      byte bytes[]=str.getBytes();
      
      fw.write(bytes);
      fw.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
    
  }
}