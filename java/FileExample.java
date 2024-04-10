// import java.io.*;

// public class FileExample {
//     public static void main(String[] args) {
//         try {
//             File file1 = new File("C://Users/tasog/OneDrive/Desktop/example.txt");
//             if (file1.createNewFile()) {
//                 System.out.println("File creation success");
//             } else {
//                 System.out.println("File exists");
//             }

//             if (file1.exists()){
//                 System.out.println("File exists...");
//                 System.out.println(file1.getName());
//                 System.out.println(file1.getAbsolutePath());
//                 System.out.println(file1.canRead());
//                 System.out.println(file1.canWrite());
//                 System.out.println(file1.length());
//             }
//         }

//         catch (IOException e) {
//             e.printStackTrace();
//         }

//     }

    
// }

import java.io.*;
// fun fact - we can also pass same java file name and it would still work.
public class FileExample {
    public static void main(String[] args) {
        try {
            File file1 = new File("F://class//java//FileExample.java"); 
            if (file1.createNewFile()) {
                System.out.println("File creation success");
            } else {
                System.out.println("File exists");
            }
            // add true to append remove to delete earlier data from file
            // writing

            // FileWriter writer = new FileWriter(file1,true);
            // writer.write("Hello this is being appended");
            // writer.close();c

            //reading

            FileReader reader = new FileReader(file1);
            int character;
            System.out.println("Reading file now ...");
            while(((character = reader.read())!=-1))
            System.out.print((char)character);


            reader.close();

                // System.out.println(file1.delete());
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }
}


