import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DecemberUSACO {

    public static void main(String[] args) throws FileNotFoundException, IOException {

    String currentDirectory = System.getProperty("user.dir");
    String fullFileName = currentDirectory + "/mixmilk.in";
    
    FileReader fr = new FileReader(fullFileName);
    BufferedReader f = new BufferedReader(fr);
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
    
    StringTokenizer st;
    String s;
    s = f.readLine();
    ArrayList <Integer> a = new ArrayList();
    ArrayList <Integer> b = new ArrayList();
    
    while ( s!=null && s.length() > 0){
        st = new StringTokenizer(s);
        a.add(Integer.parseInt(st.nextToken()));    // first integer
        b.add(Integer.parseInt(st.nextToken()));
        s = f.readLine();
    };
    int xc = a.get(0);
    int yc = a.get(1);
    int zc = a.get(2);
    
    int x = b.get(0);
    int y = b.get(1);
    int z = b.get(2);

    
    for(int k = 0; k < 100; k++){
        switch (k%3) {
        //x goes to y
            case 0: if(x + y > yc){
                x = x + y - yc;
                y = yc;
            }else if(x + y <= yc){
                y = x + y;
                x = 0;
            }  
//            System.out.print(x);
//            System.out.print(y);    
//            System.out.print(z); 
//            System.out.println("");
                break;
        //y goes to z
            case 1: if (y + z > zc){
                y = y + z-zc;
                z = zc;
            }else if (z + y <= zc ){
                z = y + z;
                y = 0;
            }
//            System.out.print(x);
//            System.out.print(y);    
//            System.out.print(z);
//            System.out.println("");
                break;
        //z goes to x
            case 2: if (z + x > xc){
                z = x+z -xc;
                x = xc;
            }else if ( z + x <= xc){
                x = z + x;
                z = 0;
            }
//            System.out.print(x);
//            System.out.print(y);    
//            System.out.print(z);
//            System.out.println("");
                break;
            default:
                break;
        }
    }
//    System.out.println(x);
//    System.out.println(y);    
//    System.out.println(z);
    
//    System.out.println(a);
//    System.out.println(b);
    out.println(x);
    out.println(y);
    out.println(z);
    f.close();
    fr.close();                             
    out.close();                                  
    }
}
    

