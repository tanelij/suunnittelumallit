/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author tanel
 */
public class Iteraattori {

       public static void main(String[] args){
        test1();
        test2();
        test3();
        test4();
    }

    
    /**
    *Metodi testaa pystyykö kokoelmaa iteroimaan kahdella säikeellä.
    *Jos testi tulostaa false, se epäonnistuu.
    *Tulos: testi onnistui.
    */
    public static void test1(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        Iterator<Integer> iterator1 = list.iterator();
        Iterator<Integer> iterator2 = list.iterator();
        
        new Thread(() -> {
            String integers = "";
            while(iterator1.hasNext()){
                integers += iterator1.next();
            }
            System.out.println("test1: " + integers.equals("123"));
        }).start();

        new Thread(() -> {
            String integers = "";
            while(iterator2.hasNext()){
                integers += iterator2.next();
            }
            System.out.println("test1: " + integers.equals("123"));
        }).start();
    }
    
    /**
    *Metodi testaa pystyykö kokoelmaa iteroimaan kahdella säikeellä ja yhdellä iteraattorilla.
    *Jos testi tulostaa false, se epäonnistuu.
    *Tulos: testi epäonnistui.
    */
    public static void test2(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        Iterator<Integer> iterator1 = list.iterator();
        
        new Thread(() -> {
            String integers = "";
            while(iterator1.hasNext()){
                iterator1.next();
            }
        System.out.println("test2: " + integers.equals("123"));
        }).start();
        
        new Thread(() -> {
            String integers = "";
            while(iterator1.hasNext()){
                iterator1.next();
            }
            System.out.println("test2: " + integers.equals("123"));
        }).start();
    }
    
    /**
    *Metodi testaa voiko iteraattorin kokoelmaan lisätä elementtejä sitä iteroidessa.
    *Jos testi tulostaa false, se epäonnistuu.
    *Tulos: testi epäonnistui.
    */
    public static void test3(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        Iterator<Integer> iterator1 = list.iterator();
        boolean onnistui = true;
        
        try{
            iterator1.next();
            list.add(1);
            iterator1.next();
        }catch(ConcurrentModificationException e){
            onnistui = false;
        }
        System.out.println("test3: " + onnistui);
    }

    /**
    *Metodi testaa voiko tehdä iteraattoreita iteroivan iteraattorin.
    * Tulos: testi onnistui.
    */
    public static void test4(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        List<Iterator<?>> iteratorList = new ArrayList<>();
        iteratorList.add(list.iterator());
        iteratorList.add(list.iterator());

        System.out.println();
        iteratorList.forEach(iterator -> iterator.forEachRemaining(integer -> System.out.print(integer)));
    }
}

