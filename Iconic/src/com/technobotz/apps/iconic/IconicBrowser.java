package com.technobotz.apps.iconic;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class IconicBrowser {	

	public static JComponent createContent() {   
	    JPanel contentPane = new JPanel(new BorderLayout());   
	    JPanel webBrowserPanel = new JPanel(new BorderLayout());   
	    //webBrowserPanel.setBorder(BorderFactory.createTitledBorder("Native Web Browser component"));   
	    final JWebBrowser webBrowser = new JWebBrowser();   
	    webBrowser.navigate("http://www.google.com");   
	    webBrowserPanel.add(webBrowser, BorderLayout.CENTER);   
	    contentPane.add(webBrowserPanel, BorderLayout.CENTER);   
	    // Create an additional bar allowing to show/hide the menu bar of the web browser.   
	    /*
	    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 4, 4));   
	    JCheckBox menuBarCheckBox = new JCheckBox("Menu Bar", webBrowser.isMenuBarVisible());   
	    menuBarCheckBox.addItemListener(new ItemListener() {   
	      public void itemStateChanged(ItemEvent e) {   
	        webBrowser.setMenuBarVisible(e.getStateChange() == ItemEvent.SELECTED);   
	      }   
	    });   
	    buttonPanel.add(menuBarCheckBox);   
	    contentPane.add(buttonPanel, BorderLayout.SOUTH);   */
	    return contentPane;   
	  }   
	  
	  /* Standard main method to try that test as a standalone application. */  
	  public static void main(String[] args) {   
	    NativeInterface.open();   
	    UIUtils.setPreferredLookAndFeel();
//	    try {
//	        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//	            if ("Nimbus".equals(info.getName())) {
//	                UIManager.setLookAndFeel(info.getClassName());
//	                break;
//	            }
//	        }
//	    } catch (Exception e) {
//	        // If Nimbus is not available, you can set the GUI to another look and feel.
//	    }
	    SwingUtilities.invokeLater(new Runnable() {   
	      public void run() {   
	        JFrame frame = new JFrame("Iconic Web Browser");   
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	        frame.getContentPane().add(createContent(), BorderLayout.CENTER);   
	        frame.setSize(800, 600);   
	        frame.setLocationByPlatform(true);   
	        frame.setVisible(true);   
	      }   
	    });   
	    NativeInterface.runEventPump();   
  }   
}