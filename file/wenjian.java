import java.io.*;    
public class wenjian {    
    public static void main(String[] args) {    
        File file = new File("E:\\��\\����.txt");    
        try {    
            FileReader fr = new FileReader(file);    
            BufferedReader reader = new BufferedReader(fr);    
            String str = reader.readLine();    
            while (str != null) {    
                System.out.println(str);    
                str = reader.readLine();    
            }    
        } 
 //���׳�����쳣ʱ�����쳣���ڸ��쳣ǰ�׳���  
        catch (FileNotFoundException e) {   
                       e.printStackTrace();    
        } 
        catch (IOException e) {    
            e.printStackTrace();    
        }    
    }      
} 