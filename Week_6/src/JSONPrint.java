/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coleman
 */
// Java program to read JSON from a file 

import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 
  
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 
  
public class JSONPrint  
{ 
    public static void main(String[] args) throws Exception  
    { 
        // Parses the file "JSONExample.json". 
        Object obj = new JSONParser().parse(new FileReader("JSONExample.json")); 
          
        // Typecasts obj to JSONObject.
        JSONObject jsObject = (JSONObject) obj; 
          
        // Gets the firstName and lastName.
        String firstName = (String) jsObject.get("firstName"); 
        String lastName = (String) jsObject.get("lastName"); 
          
        System.out.println(firstName); 
        System.out.println(lastName); 
          
        // Gets the age.
        long age = (long) jsObject.get("age"); 
        System.out.println(age); 
          
        // Gets the address.
        Map address = ((Map)jsObject.get("address")); 
        
        // Iterating address Map.
        Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
        while (itr1.hasNext()) { 
            Map.Entry pair = itr1.next(); 
            System.out.println(pair.getKey() + " : " + pair.getValue()); 
        } 
        
        // Gets the phoneNumbers.
        JSONArray jsArray = (JSONArray) jsObject.get("phoneNumbers"); 
          
        // Iterating phoneNumbers. 
        Iterator itr2 = jsArray.iterator(); 
          
        while (itr2.hasNext())  
        { 
            itr1 = ((Map) itr2.next()).entrySet().iterator(); 
            while (itr1.hasNext()) { 
                Map.Entry pair = itr1.next(); 
                System.out.println(pair.getKey() + " : " + pair.getValue()); 
            } 
        } 
    } 
} 