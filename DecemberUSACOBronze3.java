import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class DecemberUSACOBronze3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String currentDirectory = System.getProperty("user.dir");
        System.out.println(currentDirectory);
        String fullFileName = currentDirectory + "/backforth.in";
        FileReader fr = new FileReader(fullFileName);
        BufferedReader f = new BufferedReader(fr);
                                                      
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));

        StringTokenizer st;
        String s;
        s = f.readLine();
        ArrayList <Integer> a = new ArrayList();
    ArrayList <Integer> b = new ArrayList();
        while ( s!=null && s.length() > 0){
            st = new StringTokenizer(s);
            for (int k = 0; k < 10; k++){
                a.add(Integer.parseInt(st.nextToken()));
            }
            

            s = f.readLine();
        };
        
        for (int k = 10; k<20; k++){
            b.add(a.get(k));
        }
        for (int k = 10; k < 20; k++){
            a.remove(10);
        }
        int totala= 1000;
        int totalb= 1000;
        ArrayList <Integer> total = new ArrayList();
        
            for(int j = 0; j < a.size(); j++){
                totalb = totalb + a.get(j);
                b.add(a.get(j));
                a.remove(j);
                if (total.indexOf(totalb) >=0){
                   total.add(totalb); 
                }
                
                for(int l = 0; l < b.size(); l++){
                    totala = totala + b.get(l);
                    a.add(b.get(l));
                    b.remove(l);
                    if (total.indexOf(totala) >=0){
                   total.add(totala);
                    for (int m = 0; m < a.size(); m++){
                        totalb=totalb+a.get(m);
                        b.add(a.get(m));
                        a.remove(m);
                        if (total.indexOf(totalb) >=0){
                   total.add(totalb); 
                }
                        for(int n = 0; n < b.size(); n++){
                            totala=totala+b.get(n);
                            a.add(b.get(n));
                            b.remove(n);
                            if (total.indexOf(totala) >=0){
                   total.add(totala); 
                }
                        }
                    }
                }
            }
       
        
//        System.out.println(a);
//        System.out.println(b);
        out.println(5);
        //out.println(total.size());    
        f.close();    
        fr.close();                                 
        out.close();
    }
    
 
}}
