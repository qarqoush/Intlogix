package kok;
import javax.swing.*;
import java.awt.*;
public class main3 {
	public static void main (String[] args) {
		try {
			String choose = JOptionPane.showInputDialog("Made By:Morad Abdelrasheed Mokhtar\n"+
		"1-Weight\n"+
		"2-Velosity\n"+
		"3-Exit\n"+
		"4-Density\n"+
		"5-Joule\n"+
		"6-Potential Energy\n"+
		"7-Mechanical Energy\n"+
		"8-Friction\n"+
		"9-WaveLenght\n"+
		"10-Electric Current\n"+
		"11-Kinetic Energy\n"+
		"12-Time Of Flight\n"+
		"13-Quantity of heat\n");
		double c = Double.parseDouble(choose);
		if (c == 1) {
			weight();
		}else if (c == 3) {
			System.exit(0);
		}else if (c == 2) {
			velosity();
		}else if (c == 4) {
			density();
		}else if (c == 5) {
			work();
		}else if (c == 6) {
			pe();
		}else if (c == 7) {
			me();
		}else if (c == 8) {
			fe();
		}else if (c == 9) {
			wl();
		}else if (c == 10) {
			ec();
		}else if (c == 11) {
			ke();
		}else if (c == 12) {
			tof();		
		}else if (c == 13) {
			qof();
		}
		else {
			JOptionPane.showMessageDialog(null,"Invalid Option !");
			tmain();
		}
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			tmain();
		}
	}
	public static void qof () {
		try {
			String dt,c,m;double _dt,_c,_m;
			dt = JOptionPane.showInputDialog("Enter the change in temp. (in Fahrenheit)");
			c = JOptionPane.showInputDialog("Enter the heat capacity (in Joules/Kelvin)");
			m = JOptionPane.showInputDialog("Enter the Mass (in KiloGrams)");
			_dt = Double.parseDouble(dt);_c = Double.parseDouble(c);_m = Double.parseDouble(m);
			JOptionPane.showMessageDialog(null,"The Quantity of heat is:"+(_dt*_c*_m)+" Joules/KiloGram Kelvin");
			tmain();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			tmain();
		}
	}
	public static void tof () {
		try {
			String v,la;double _v,_la,tof;
			v = JOptionPane.showInputDialog("Enter the Initial Velosity (in Meters/Second)");
			la = JOptionPane.showInputDialog("Enter the Launch Angle (in degrees)");
			_v = Double.parseDouble(v);_la = Double.parseDouble(la);
			tof = (2*(_v)*(Math.sin(_la)))/(9.8); // Calculation
			JOptionPane.showMessageDialog(null,"The time of flight is:"+tof+" Seconds");
			tmain();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			tmain();
		}
	}
	public static void ke () {
		try {
			String m,v;double ke,_m,_v;
			m = JOptionPane.showInputDialog("Enter the mass of the object (in KiloGrams)");
			v = JOptionPane.showInputDialog("Enter the Velosity (in Meters/Second)");
			_m = Double.parseDouble(m);
			_v = Double.parseDouble(v);
			ke = 0.5*(_m)*(_v * _v); //Calculation
			JOptionPane.showMessageDialog(null,"The Kinetic Energy:"+ke+" Joule");
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			tmain();
		}
	}
	public static void ec () {
		try {
			String v = JOptionPane.showInputDialog("Enter the voltage (in volts)") 
					,	r = JOptionPane.showInputDialog("Enter the resistance of the material (in ohms)");
			double _v = Double.parseDouble(v)
					, _r = Double.parseDouble(r);
			JOptionPane.showMessageDialog(null,"The electric current:"+(_v / _r)+" Ampere");
			tmain();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			tmain();
		}
	}
	public static void wl () {
		try {
			String wv = JOptionPane.showInputDialog("Enter the Wave Velosity (in Meter/Sec.)");
			String f = JOptionPane.showInputDialog("Enter the frequency (in Hertz or Cycle)");
			double _wv,_f;
			_wv = Double.parseDouble(wv);
			_f = Double.parseDouble(f);
			JOptionPane.showMessageDialog(null,"The Wave Length is:"+(_wv / _f)+" Meter");
			tmain();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			tmain();
		}
	}
	public static void fe () {
		try {
			String u = JOptionPane.showInputDialog("Enter the coefficient of friction");
			String n = JOptionPane.showInputDialog("Enter the normal force (in newton)");
			double uu = Double.parseDouble(u);
			double nn = Double.parseDouble(n);
			JOptionPane.showMessageDialog(null,"The friction force is:"+(uu*nn)+" Newtons");
			tmain();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			tmain();
		}
	}
	public static void me () {
		try {
			String pe,ke;
			pe = JOptionPane.showInputDialog("Enter the Potential Energy (in Joule)");
			ke = JOptionPane.showInputDialog("Enter the Kinetic Energy (in Joule)");
			double pee = Double.parseDouble(pe) , kee = Double.parseDouble(ke);
			JOptionPane.showMessageDialog(null,"The Mechanical Energy:"+(pee + kee)+" Joule");
			tmain();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			tmain();
		}
	}
	public static void weight () {
		try {
			String m;
		    double w;
			m = JOptionPane.showInputDialog("Input the mass of the object (in KG)");
			double mm = Double.parseDouble(m);
			w = mm * 9.8;
			JOptionPane.showMessageDialog(null,"The weight is:"+w+" Newtons");
			tmain();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			tmain();
		}
	}
	public static void velosity () {
		try {
			double v;
			String d = JOptionPane.showInputDialog("Enter the Distance (in meters)");
			String t = JOptionPane.showInputDialog("Enter the Time of Travel (in hours)");
			double dd,tt;
			dd = Double.parseDouble(d);
			tt = Double.parseDouble(t);
			v = dd / tt;
			JOptionPane.showMessageDialog(null,"The Velosity is:"+v+" M/S");
			tmain();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			tmain();
		}
	}
	public static void density () {
		try {
			double d;
			String m = JOptionPane.showInputDialog("Enter the Mass (in grams)");
			String v = JOptionPane.showInputDialog("Enter the Volume (in CM Cubic)");
			double mm = Double.parseDouble(m),vv = Double.parseDouble(v);
			d = mm / vv;
			JOptionPane.showMessageDialog(null,"The Density of the object is:"+d+" GM/CM3");
			tmain();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			tmain();
		}
	}
	public static void work () {
		try {
			double j;
			String f = JOptionPane.showInputDialog("Enter the force (in Newtons)");
			String d = JOptionPane.showInputDialog("Enter the distance (in Meters)");
			double ff = Double.parseDouble(f);
			double dd = Double.parseDouble(d);
			j = ff * dd;
			JOptionPane.showMessageDialog(null,"The Amount of work is:"+j+" Joules");
			tmain();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			tmain();
		}
	}
	public static void pe () {
		try {
		double pe;
		String m = JOptionPane.showInputDialog("Enter the mass (in Kilo Grams)");
		String h = JOptionPane.showInputDialog("Enter the height (in Meters)");
		double mm = Double.parseDouble(m);
		double hh = Double.parseDouble(h);
		pe = mm * 9.8 * hh;
		JOptionPane.showMessageDialog(null,"The Potential Energy is:"+pe+" Joules");
	}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		tmain();
	}
		}
	public static void tmain () {
		try {
			String[] args = {"1","2","3"};
			main(args);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Another Error OMG !");
		}
	}
}
