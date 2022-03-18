package com.interview.jsonparser;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlattenDir {


    public static void main(String[] args){
        File folder = new File("/Users/macbook/test1/");
        List<String> list = new ArrayList<>();
        move(folder, list, folder);
    }

    public static void flattenDir(List<String> list, File file){

        if(file == null)
            return;

        if(file.isDirectory()){
            for(File file1: file.listFiles()){
                flattenDir(list, file1);
            }
        }
        else{
            list.add(file.getAbsolutePath().replace("/", ".")+"\n");
        }

    }

    public static void move(File file, List<String> list, File root){
        if(file == null)
            return;

        if(file.isDirectory()){
            for(File file1: file.listFiles()){
                move(file1, list, root);
            }
        }
        else{

            String newName = file.getAbsolutePath().replace(root.getAbsolutePath()+"/","").replace("/",".");
            String newPath = root.getAbsolutePath()+File.separator+newName;
            System.out.println(newPath);
//            try {
//                //Path path = Files.move(Paths.get(file.getAbsolutePath()), Paths.get(root.getAbsolutePath()+File.pathSeparator+newName));
//                list.add(newName+"\n");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

        }
    }

}
