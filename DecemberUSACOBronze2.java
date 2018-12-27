import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class DecemberUSACOBronze2 {
     

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String currentDirectory = System.getProperty("user.dir");
        String fullFileName = currentDirectory + "/blist.in";

        FileReader fr = new FileReader(fullFileName);
        BufferedReader f = new BufferedReader(fr);
                                                      
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));

        StringTokenizer st;
        String s;
        s = f.readLine();
        ArrayList <Integer> startTime = new ArrayList();
        ArrayList <Integer> endTime = new ArrayList(); 
        ArrayList <Integer> buckets = new ArrayList();
        while ( s!=null && s.length() > 0){
            st = new StringTokenizer(s);
                startTime.add(Integer.parseInt(st.nextToken()));
            if(st.hasMoreTokens()){
                endTime.add(Integer.parseInt(st.nextToken()));
            }
            if (st.hasMoreTokens()){
                buckets.add(Integer.parseInt(st.nextToken())); 
            }          

            s = f.readLine();
        };
        int numberofCows = startTime.get(0);
        startTime.remove(0);

        int greatestTime = Collections.max(endTime);
        int bucketNumber = 0; 
        int spareBuckets = 0;
        
        ArrayList <Integer> hi = new ArrayList();
        for (int k = 0; k < greatestTime; k++){
//            for (int j = 0; j < numberofCows; j++){
//                if ((startTime.get(j) == k) && (buckets.get(j) > spareBuckets)){
//                    bucketNumber = bucketNumber + buckets.get(j) - spareBuckets;
//                }else if(endTime.get(j) == k){
//                    spareBuckets = spareBuckets +buckets.get(j);
//                }
//            }
            int sum = 0;
            for (int j = 0; j < numberofCows; j++){
                
                if( (k >= startTime.get(j)) && (k <= endTime.get(j))){
                    sum = sum + buckets.get(j);
                }
            }
            hi.add(sum);
        }
        bucketNumber = Collections.max(hi);
        out.println(bucketNumber);
        
//        System.out.println(startTime);
//        System.out.println(endTime);
//        System.out.println(buckets);
        //out.println("smt");
        f.close();
        fr.close();                             
        out.close();  
    }
   
    
    
}

