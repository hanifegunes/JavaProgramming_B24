package AdvanceClass.AObject_Practice.One;

import java.util.ArrayList;
import java.util.Arrays;

public class Module {
    // ArrayList<Integer>  list = new ArrayList<>();
        ArrayList<File> files;

        public Module( ){
            files= new ArrayList<>();

        }
        public void addFile(File[] note){
            files.addAll(Arrays.asList(note));
        }
        public  void removeFile(String name){
            files.removeIf(each->each.name.equals(name));
        }


    public static void main(String[] args) {

    }






    /*
    create a class Module

  instance variables:
   - files (ArrayList of File objects)

  constructor:
   - no parameter -> create empty ArrayList object
   - initialize with given ArrayList of Files
    -> Use chaining

  methods:
   - toString: print all the quiz information
   - addFile(File): accept a File object and add the given File to the ArrayList
of Files of that module
Unit 5 - Problem Set

   - removeFile(File): accepts a File object and remove the given File from
the ArrayList of Files of that module
     */



    }
