package kok;
import java.awt.*;

import javax.swing.*;
public class main2 {
public static void main(String[] args) {
	try {
    String cho = JOptionPane.showInputDialog("Enter the operation \n --------------------------------- \n 0.Exit 1.Squaring and cubic \n 2.Square 2D \n 3.Rectangle \n 4.Cube \n 5.Cuboid \n 6.Circle \n 7.Calculate your age to seconds \n 8.Rhombus \n 9.Parallelogram \n 10.cylinder \n 11.Exit");
    int choose = Integer.parseInt(cho);
    switch (choose) {
        case 1: {
            main2.case1();
            break;
        }
        case 2: {
            main2.case2();
            break;
        }
        case 3: {
            main2.case3();
            break;
        }
        case 4: {
            main2.case4();
            break;
        }
        case 5: {
            main2.case5();
            break;
        }
        case 6: {
            main2.case6();
            break;
        }
        case 7: {
            main2.case7();
            break;
        }
        case 8: {
            main2.case8();
            break;
        }
        case 9: {
            main2.case9();
            break;
        }
        case 10: {
            main2.case10();
            break;
        }
        case 0 : {
        	System.exit(0);
        }
    }
	}catch (Exception e) {
		System.out.println("ERROR:"+e.getMessage());
	}
}

public static void case1() {
	try {
    String number = JOptionPane.showInputDialog("enter the number");
    float number0 = Float.parseFloat(number);
    float squ = number0 * number0;
    float cub = number0 * number0 * number0;
    JOptionPane.showMessageDialog(null, "the square=" + squ + "\n" + "the cubic=" + cub);
    String[] args = new String[]{"123"};
    main2.main(args);
	}catch (Exception e) {
		System.out.println("ERROR:"+e.getMessage());	
	}
}

public static void case2() {
	try {
    String view = JOptionPane.showInputDialog("enter the length");
    float l = Float.parseFloat(view);
    float area = l * l;
    float prei = l * 4.0f;
    JOptionPane.showMessageDialog(null, "the primeter=" + prei + "\n" + "the area=" + area);
    String[] args = new String[]{"123"};
    main2.main(args);
    }catch (Exception e) {
		System.out.println("ERROR:"+e.getMessage());
    }
}

public static void case3() {
	try {
    String viewer = JOptionPane.showInputDialog("enter the length");
    float len = Float.parseFloat(viewer);
    viewer = JOptionPane.showInputDialog("enter the width");
    float wed = Float.parseFloat(viewer);
    float per = (len + wed) * 2.0f;
    float ar = len * wed;
    JOptionPane.showMessageDialog(null, "the primeter=" + per + "\n" + "the area=" + ar);
    String[] args = new String[]{"123"};
    main2.main(args);
	}catch(Exception e) {
		System.out.println("ERROR:"+e.getMessage());

	}
}

public static void case4() {
	try {
    String sl = JOptionPane.showInputDialog("enter the side length");
    float sl0 = Float.parseFloat(sl);
    float fa = sl0 * sl0;
    float vol = sl0 * sl0 * sl0;
    JOptionPane.showMessageDialog(null, "the face area=" + fa + "\n" + "the volume=" + vol);
    String[] args = new String[]{"123"};
    main2.main(args);
	}catch (Exception e) {
		System.out.println("ERROR:"+e.getMessage());

	}
}

public static void case5() {
	try {
    String vw = JOptionPane.showInputDialog("enter the length");
    float le = Float.parseFloat(vw);
    vw = JOptionPane.showInputDialog("enter the width");
    float wi = Float.parseFloat(vw);
    vw = JOptionPane.showInputDialog("enter the height");
    float he = Float.parseFloat(vw);
    float vol0 = le * wi * he;
    float of = le * wi;
    JOptionPane.showMessageDialog(null, "the volume=" + vol0 + "\n" + "the area of one face=" + of);
    String[] args = new String[]{"123"};
    main2.main(args);
	}catch (Exception e) {
		System.out.println("ERROR:"+e.getMessage());

	}
}

public static void case6() {
	try {
    String choos = JOptionPane.showInputDialog("1. radius measure \n 2.diameter measure");
    int choos0 = Integer.parseInt(choos);
    switch (choos0) {
        case 2: {
            String v0 = JOptionPane.showInputDialog("enter the pie");
            float pie = Float.parseFloat(v0);
            v0 = JOptionPane.showInputDialog("enter the diameter");
            float dia = Float.parseFloat(v0);
            float area12 = pie * (dia / 2.0f * (dia / 2.0f));
            float cir = pie * dia;
            JOptionPane.showMessageDialog(null, "the area=" + area12 + "\n" + "the circumference=" + cir);
            String[] args = new String[]{"123"};
            main2.main(args);
        }
        case 1: {
            String v1 = JOptionPane.showInputDialog("enter the pie");
            float pie0 = Float.parseFloat(v1);
            v1 = JOptionPane.showInputDialog("enter the radius");
            float rad = Float.parseFloat(v1);
            float are0 = pie0 * (rad * rad);
            float circ = 2.0f * (pie0 * rad);
            JOptionPane.showMessageDialog(null, "the area=" + are0 + "\n" + "te circumference=" + circ);
            String[] args1 = new String[]{"123"};
            main2.main(args1);
        }
    }
	}catch (Exception e) {
		System.out.println("ERROR:"+e.getMessage());
	}
}

public static void case7() {
	try {
    String v10 = JOptionPane.showInputDialog("enter your age");
    long age = Long.parseLong(v10);
    long days = age * 365L;
    long hours = days * 24L;
    long minutes = hours * 60L;
    long seconds = minutes * 60L;
    JOptionPane.showMessageDialog(null, "in days:" + days + "\n" + "in hours:" + hours + "\n" + "in minutes:" + minutes + "\n" + "in seconds:" + seconds);
    String[] args = new String[]{"123"};
    main2.main(args);
	}catch (Exception e) {
		System.out.println("ERROR:"+e.getMessage());

	}
}

public static void case8() {
	try {
    String vi0 = JOptionPane.showInputDialog("1.area \n 2.primeter");
    int ch = Integer.parseInt(vi0);
    switch (ch) {
        case 1: {
            String v00 = JOptionPane.showInputDialog("1.by diagonals \n 2.side length");
            int ch0 = Integer.parseInt(v00);
            switch (ch0) {
                case 1: {
                    String v000 = JOptionPane.showInputDialog("enter the first diagonal");
                    float d0 = Float.parseFloat(v000);
                    v000 = JOptionPane.showInputDialog("enter the second diagonal");
                    float d1 = Float.parseFloat(v000);
                    float area123 = d0 * d1 / 2.0f;
                    JOptionPane.showMessageDialog(null, "the area=" + area123);
                    String[] args0 = new String[]{"123"};
                    main2.main(args0);
                }
                case 2: {
                    String v123 = JOptionPane.showInputDialog("enter the side length");
                    float s = Float.parseFloat(v123);
                    v123 = JOptionPane.showInputDialog("enter the altidude");
                    float alt = Float.parseFloat(v123);
                    float area0000 = alt * s;
                    JOptionPane.showMessageDialog(null, "the area=" + area0000);
                    String[] args = new String[]{"123"};
                    main2.main(args);
                }
            }
        }
    }
 }catch (Exception e) {
    System.out.println("ERROR:"+e.getMessage());
  }
}

public static void case9() {
	try {
    String tere = JOptionPane.showInputDialog("enter the side length");
    float slo = Float.parseFloat(tere);
    tere = JOptionPane.showInputDialog("enter the height");
    float hee = Float.parseFloat(tere);
    tere = JOptionPane.showInputDialog("enter the base length");
    float base = Float.parseFloat(tere);
    float area012 = base * hee;
    float premee = 2.0f * (base + hee);
    JOptionPane.showMessageDialog(null, "the primeter=" + premee + "\n" + "the area=" + area012);
    String[] args = new String[]{"123"};
    main2.main(args);
	}catch (Exception e) {
	    System.out.println("ERROR:"+e.getMessage());	
	}
}

public static void case10() {
	try {
    String ppp = JOptionPane.showInputDialog("enter the height");
    float h00 = Float.parseFloat(ppp);
    ppp = JOptionPane.showInputDialog("enter the radius");
    float r00 = Float.parseFloat(ppp);
    float sa = 6.0f * r00 * (r00 + h00);
    float vc = 3.0f * (r00 * r00) * h00;
    JOptionPane.showMessageDialog(null, "The volume=" + vc + "\n" + "The Surface Area=" + sa);
    String[] args = new String[]{"123"};
    main2.main(args);
	}catch (Exception e) {
	    System.out.println("ERROR:"+e.getMessage());
	}
}
}