package kok;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.imageio.*;
import javax.swing.*;

public class main {
	public static void main(String[] args){
		try {
			Thread.sleep(1500);
			float o = 0.80f;
	        JFrame frame1 = new JFrame();
	        frame1.setSize(500,350);
	        frame1.setLayout(null);
	        frame1.setTitle("INTLOGIX firewall");
	        URL img = new URL("https://scontent-hbe1-1.xx.fbcdn.net/v/t1.15752-9/51105764_2136498926407130_224313291327930368_n.jpg?_nc_cat=107&_nc_ht=scontent-hbe1-1.xx&oh=aba9abf7b11e41809dac64a6647adee3&oe=5CC3AD86");
	        frame1.setContentPane(new JLabel(new ImageIcon(ImageIO.read(img))));
	        JButton button = new JButton("About the programmer");
	        JButton exitt = new JButton("CLOSE");
	        URL iconn = new URL("https://scontent-hbe1-1.xx.fbcdn.net/v/t1.15752-0/p280x280/50856844_1029783947228912_2607646779100889088_n.png?_nc_cat=105&_nc_ht=scontent-hbe1-1.xx&oh=cc28277765f82ebe16642bbbd21d532f&oe=5CF1B49B");
	        JLabel picLabel = new JLabel(new ImageIcon(ImageIO.read(iconn)));
	        JCheckBox checkbox0 = new JCheckBox("Block ports (Recommended)");
	        JCheckBox checkbox2 = new JCheckBox("Block ping requests");
	        JCheckBox checkbox4 = new JCheckBox("Block RDP");
	        JCheckBox checkbox6 = new JCheckBox("Disable Remote Shutdown");
	        JCheckBox checkbox7 = new JCheckBox("Disable NetLogon");
	        JCheckBox checkbox8 = new JCheckBox("Disable print and file sharing");
	        JCheckBox checkbox10 = new JCheckBox("Block HomeGroup");
	        checkbox0.setBounds(0,93,200,30);
	        checkbox2.setBounds(0,117,200,30);
	        checkbox4.setBounds(0,140,200,30);
	        checkbox6.setBounds(0,160,200,30);
	        checkbox7.setBounds(0,180,200,30);
	        checkbox8.setBounds(0,200,200,30);
	        checkbox10.setBounds(0,220,200,30);
	        checkbox0.setOpaque(false);
	        checkbox2.setOpaque(false);
	        checkbox4.setOpaque(false);
	        checkbox6.setOpaque(false);
	        checkbox7.setOpaque(false);
	        checkbox8.setOpaque(false);
	        checkbox10.setOpaque(false);
	        picLabel.setBounds(90,0,500,120);
	        button.setBounds(95,260,430,35);
	        exitt.setBounds(258,300,97,50);
	        frame1.add(picLabel);
	        frame1.add(checkbox0);
	        frame1.add(checkbox2);
	        frame1.add(checkbox4);
	        frame1.add(checkbox6);
	        frame1.add(exitt);
	        frame1.add(checkbox7);
	        frame1.add(button);
	        frame1.add(checkbox8);
	        frame1.add(checkbox10);
	        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	        int height = screenSize.height;
	        int width = screenSize.width;
	        frame1.setSize(width/2, height/2);
	        frame1.setLocationRelativeTo(null);
	        frame1.setUndecorated(true);
	        frame1.setOpacity(o);
	        button.setActionCommand("clicked");
	        class ActionHandler implements ActionListener {
	        	@Override
	            public void actionPerformed(ActionEvent event) {
	        		try {
	                if (checkbox0.isSelected()) {
	                	Process tcp = Runtime.getRuntime().exec("cmd.exe /C netsh advfirewall firewall add rule name=\"protection/1\" dir=in action=block protocol=TCP localport=0-65535");
	                	Process udp = Runtime.getRuntime().exec("cmd.exe /C netsh advfirewall firewall add rule name=\"protection/1\" dir=in action=block protocol=UDP localport=0-65535");
	                	JOptionPane.showMessageDialog(frame1,"Ports Blocked Successfully !");
	                	checkbox0.setSelected(false);
	                	return;
	                }if (checkbox2.isSelected()) {
	                	Process icmp6 = Runtime.getRuntime().exec("cmd.exe /C netsh advfirewall firewall add rule name=\"protection/3\" protocol=icmpv6:any,any dir=in action=block");
	                	Process icmp4 = Runtime.getRuntime().exec("cmd.exe /C netsh advfirewall firewall add rule name=\"protection/3\" protocol=icmpv4:any,any dir=in action=block");
	                	JOptionPane.showMessageDialog(frame1,"Ping Requests Blocked Successfully !");
	                	checkbox2.setSelected(false);
	                	return;
	                }if (checkbox4.isSelected()) {
	                	Process rdp = Runtime.getRuntime().exec("cmd.exe /C netsh firewall set service REMOTEDESKTOP DISABLE");
	                	JOptionPane.showMessageDialog(frame1,"Remote Desktop Protocol Blocked Successfully !");
	                	checkbox4.setSelected(false);
	                	return;
	                }if (checkbox6.isSelected()) {
	            		Process rsht = Runtime.getRuntime().exec("cmd.exe /C netsh advfirewall firewall set rule group=\"Remote Shutdown\" new enable=No");
	            		JOptionPane.showMessageDialog(frame1,"Remote Shutdown Requests Blocked successfully !");
	            		checkbox6.setSelected(false);
	            		return;
	                }if (checkbox7.isSelected()) {
		                Process netlog = Runtime.getRuntime().exec("cmd.exe /C netsh advfirewall firewall set rule group=\"Netlogon Service\" new enable=No");
		                JOptionPane.showMessageDialog(frame1,"NetLogon Protocol Disabled successfully !");
		                checkbox7.setSelected(false);
		                return;
	                }if (checkbox8.isSelected()) {	
	                	Process prnt = Runtime.getRuntime().exec("cmd.exe /C netsh advfirewall firewall set rule group=\"File and Printer Sharing\" new enable=No");
		                JOptionPane.showMessageDialog(frame1,"File and printer sharing Disabled Successfully !");
		                checkbox8.setSelected(false);
		                return;
	                }if (checkbox10.isSelected()) {
	            		Process hmgrp = Runtime.getRuntime().exec("cmd.exe /C netsh advfirewall firewall set rule group=\"HomeGroup\" new enable=No");
	            		JOptionPane.showMessageDialog(frame1,"HomeGroup Disabled successfully !");
	            		checkbox10.setSelected(false);
	            		return;
	                }
	                }catch (Exception e) {
	                	e.printStackTrace();
	                }
	            }}
	        class Ach implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent event) {
					try {
	        			JButton button0 = (JButton) event.getSource();
						if (button0 == button) {
	        			JOptionPane.showMessageDialog(frame1,"Morad Abdelrasheed Mokhtar Ali \n");
	        		}
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
	        }
	        class exittt implements ActionListener {
	        	@Override
	        	public void actionPerformed(ActionEvent event) {
	        		try {
	        			frame1.dispose();
	        		}catch (Exception e) {
	        			e.printStackTrace();
	        		}
	        	}
	        }
	        ActionListener actionListener = new ActionHandler();
	        ActionListener actionListener2 = new Ach();
	        ActionListener actionListener3 = new exittt();
	        button.addActionListener(actionListener2);
	        checkbox0.addActionListener(actionListener);
	        checkbox2.addActionListener(actionListener);
	        checkbox4.addActionListener(actionListener);
	        checkbox6.addActionListener(actionListener);
	        exitt.addActionListener(actionListener3);
	        checkbox7.addActionListener(actionListener);
	        checkbox8.addActionListener(actionListener);
	        checkbox10.addActionListener(actionListener);
	        picLabel.setFont(picLabel.getFont().deriveFont(17.0f));
	        frame1.setVisible(true);
		}catch (Exception e) {
			 e.printStackTrace();
			 JOptionPane.showMessageDialog(null,"Please check your internet connection");
		}
		}
}