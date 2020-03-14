/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author colem
 */
// Java program for write JSON to a file 
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
  
public class JSONExample 
{ 
    public static void main(String[] args) throws FileNotFoundException  
    { 
        // Creates the JSONObject file.
        JSONObject jsObject = new JSONObject(); 
          
        // Moves the data to JSONObject 
        jsObject.put("firstName", "Coleman"); 
        jsObject.put("lastName", "Likes"); 
        jsObject.put("age", 25); 
          
        // For the address data, first create LinkedHashMap.
        //Creates a new hashmap called hashMap.
        Map hashMap = new LinkedHashMap(4); 
        hashMap.put("streetAddress", "1778 Somerset Ridge Dr."); 
        hashMap.put("city", "Draper"); 
        hashMap.put("state", "UT"); 
        hashMap.put("postalCode", 84020); 
          
        // Moves address to JSONObject.
        jsObject.put("address", hashMap); 
          
        // for phone numbers, first create JSONArray..\  
        JSONArray jsArray = new JSONArray(); 
          
        hashMap = new LinkedHashMap(2); 
        hashMap.put("type", "cell"); 
        hashMap.put("number", "801 608-4580"); 
          
        // Adds the map to list.
        jsArray.add(hashMap); 
          
        // Moves phoneNumbers to JSONObject.
        jsObject.put("phoneNumber", jsArray); 
          
        // Writes the JSON to file:"JSONExample.json" in current directory.
        PrintWriter pw = new PrintWriter("JSONExample.json"); 
        pw.write(jsObject.toJSONString()); 
          
        pw.flush(); 
        pw.close(); 
    } 
} 