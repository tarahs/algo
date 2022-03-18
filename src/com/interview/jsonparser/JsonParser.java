package com.interview.jsonparser;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JsonParser {


    public static void main(String[] args){
        try {
            readJson("/Users/macbook//Docs/sample.json");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void readJson(String filePath) throws IOException, ParseException {
        FileReader reader = new FileReader(filePath);
        Object ob = new JSONParser().parse(reader);
        JSONObject json = (JSONObject)ob;

        Map jsonMap = (Map) json;
        Iterator iterator = jsonMap.entrySet().iterator();
        
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            StringBuilder out = new StringBuilder();
            flatten((String) entry.getKey(), out, entry.getValue());
            System.out.println(out.toString());
        }





    }

    public static void flatten(String key, StringBuilder output, Object ob){

        if(ob == null)
            return;

        if(ob instanceof Map){
            Map jsonMap = (Map) ob;
            Iterator iterator = jsonMap.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry entry = (Map.Entry) iterator.next();
                flatten(key+"."+entry.getKey(), output, entry.getValue());
            }
        }else if(ob instanceof List){
            List jsonLst = (List)ob;
            for(int i=0;i<jsonLst.size();i++){
                flatten(key+"["+i+"]", output, jsonLst.get(i));
            }
        }else{
            output.append(key).append(": ").append(String.valueOf(ob)).append(", ").append("\n").toString();
        }
    }
}
