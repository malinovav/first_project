/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package createnewfile;
import java.io.*;

/**
 *
 * @author Алексей
 */
public class CreateNewFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String fileSeparator = System.getProperty("file.separator");
         
        //создаем абсолютный путь к файлу
       File file = new File("file.txt"); 
        //создаем файл только с указанием имени файла
               if(file.createNewFile()){
            System.out.println("file.txt файл создан в корневой директории проекта");
        }
               else System.out.println("file.txt файл уже существует в корневой директории проекта");
         
        
       
 
    }
    
}
