/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions3;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Kullanıcı
 */
public class Questions3 {

    public String repeatingElement(String[] words) {
        HashMap<String, Integer> map=new HashMap<String, Integer>();
        
        for(int i=0; i<words.length; i++) {             // Map creation
            if (map.containsKey(words[i])) {
                int count = map.get(words[i]);         // count :  used to find values
                map.put(words[i], count+1);
            } else {
                map.put(words[i], 1);
            }
        }
        
        String highestKey = null;                       //   highestKey   : the key that corresponds to the highest value
        int highestValue = 0;                           //   highestValue : highest value
        int highestValue2 = 0;                          //  highestValue : second highest value
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {    // this loop finds the two highest values
            if (entry.getValue() > highestValue ) {                 
                highestKey = entry.getKey();
                highestValue = entry.getValue();
            }
            if(entry.getValue().equals(highestValue) && !entry.getKey().equals(highestKey)) {
                highestValue2=entry.getValue();
            }
        }
        
        // If the two highest values ​​are equal, 
        // there isn't  maximum repetitive element in this array
        // If the highest two values ​​aren't equal, 
        // send repeating element of this array to main
        if(highestValue==highestValue2) {                
            System.out.print("This array hasn't got maximum repeating elements.");
            return "";
        } else {
            return highestKey;
        }
        
    
    }

   
}

