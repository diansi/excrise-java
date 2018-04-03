import java.io.*;    
public class wenjian {    
    public static void main(String[] args) {    
        File file = new File("E:\\信\\致你.txt");    
        try {    
            FileReader fr = new FileReader(file);    
            BufferedReader reader = new BufferedReader(fr);    
            String str = reader.readLine();    
            while (str != null) {    
                System.out.println(str);    
                str = reader.readLine();    
            }    
        } 
 //当抛出多个异常时，子异常当在父异常前抛出。  
        catch (FileNotFoundException e) {   
                       e.printStackTrace();    
        } 
        catch (IOException e) {    
            e.printStackTrace();    
        }    
    }      
} 