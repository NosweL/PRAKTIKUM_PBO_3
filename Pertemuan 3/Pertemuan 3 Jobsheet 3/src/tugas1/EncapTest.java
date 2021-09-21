/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author welso
 */
public class EncapTest {
    public static void main(String[]args){
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);
        
        EncapDemo encap2 = new EncapDemo();
        encap2.setName("Jett");
        encap2.setAge(15);
        
        System.out.println("Name    :" + encap.getName());
        System.out.println("Age     :" + encap.getAge());
        
        System.out.println("===========================");
        
        System.out.println("Name    :" + encap2.getName());
        System.out.println("Age     :" + encap2.getAge());
    }
}
