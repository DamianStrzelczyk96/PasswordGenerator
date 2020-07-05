package com.company;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world" );
        Map<Integer,String> znak = new TreeMap<>();
        znak.put(1,"a");
        znak.put(2,"A");
        znak.put(3,"b");
        znak.put(4,"B");
        znak.put(5,"c");
        znak.put(6,"C");
        znak.put(7,"d");
        znak.put(8,"D");
        znak.put(9,"e");
        znak.put(10,"E");
        znak.put(11,"f");
        znak.put(12,"F");
        znak.put(13,"g");
        znak.put(14,"G");
        znak.put(15,"h");
        znak.put(16,"H");
        znak.put(17,"i");
        znak.put(18,"I");
        znak.put(19,"j");
        znak.put(20,"J");
        znak.put(21,"k");
        znak.put(22,"K");
        znak.put(23,"l");
        znak.put(24,"L");
        znak.put(25,"m");
        znak.put(26,"M");
        znak.put(27,"n");
        znak.put(28,"N");
        znak.put(29,"o");
        znak.put(30,"O");
        znak.put(31,"p");
        znak.put(32,"P");
        znak.put(33,"r");
        znak.put(34,"R");
        znak.put(35,"s");
        znak.put(36,"S");
        znak.put(37,"t");
        znak.put(38,"T");
        znak.put(39,"u");
        znak.put(40,"U");
        znak.put(41,"w");
        znak.put(42,"W");
        znak.put(43,"y");
        znak.put(44,"Y");
        znak.put(45,"z");
        znak.put(46,"Z");
        znak.put(47,"`");
        znak.put(48,"~");
        znak.put(49, "1");
        znak.put(50, "!");
        znak.put(51,"2");
        znak.put(52, "@");
        znak.put(53,"3");
        znak.put(54, "#");
        znak.put(55,"4");
        znak.put(56,"$");
        znak.put(57,"5");
        znak.put(58,"%");
        znak.put(59,"6");
        znak.put(60,"^");
        znak.put(61,"7");
        znak.put(62,"&");
        znak.put(63,"8");
        znak.put(64,"*");
        znak.put(65,"9");
        znak.put(66 ,"(");
        znak.put(67,"0");
        znak.put(68,")");
        znak.put(69,"-");
        znak.put(70,"_");
        znak.put(71,"=");
        znak.put(72,"+");
        znak.put(73,"[");
        znak.put(74,"{");
        znak.put(75,"]");
        znak.put(76,"}");
        znak.put(77,";");
        znak.put(78,":");
        znak.put(79,"'");
        znak.put(80,",");
        znak.put(81,"<");
        znak.put(82,".");
        znak.put(83,">");
        znak.put(84,"/");
        znak.put(0,"?");



        Random generator = new Random();

        System.out.println("Podaj dlugosc hasla");
        Scanner scanner = new Scanner(System.in);
        int dlugosc = scanner.nextInt();

        StringBuffer strB = new StringBuffer();
        for(int i=0; i<dlugosc ;i++){
            int losowa = generator.nextInt(85);
            String znaczek = znak.get(losowa);
            strB.append(znaczek);

        }
        System.out.println("Twoje hasło to: " + strB);

    }
}
