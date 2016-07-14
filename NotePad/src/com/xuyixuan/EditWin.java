package com.xuyixuan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class EditWin extends JFrame implements ActionListener{

	private static final long serialVersionUID = 3800757567889826902L;
	private JTextArea ta;
	private JScrollPane sp;
	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem newItem;
	private JMenuItem openItem;
	private JMenuItem saveItem;
	private JMenuItem exitItem;
	private JMenuItem fontItem;
	private JMenuItem colorItem;
	private JToolBar toolBar;
	private JLabel status;
	private JButton bn;
	public EditWin() throws HeadlessException  {
		super();
		ta = new JTextArea(20, 20);
		sp = new JScrollPane(ta);
		getContentPane().add(sp);
		
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		toolBar  = new JToolBar();
		getContentPane().add(toolBar,BorderLayout.NORTH);
		toolBar.setBackground(new Color(155,155,0));
		bn = new JButton("open");
		bn.addActionListener(this);
	    toolBar.add(bn);

		toolBar  = new JToolBar();
		getContentPane().add(toolBar,BorderLayout.SOUTH);
		 status = new JLabel();
		 status.setText("notepad!");
		toolBar.add(status);
		//toolBar.setBackground(new Color(155,155,0));
		
		menu = new JMenu("文件");
		menubar.add(menu);
		newItem = new JMenuItem("新建");
		menu.add(newItem);
		newItem.addActionListener(this);
		openItem = new JMenuItem("打开");
		menu.add(openItem);
		openItem.addActionListener(this);
		
		saveItem = new JMenuItem("保存");
		menu.add(saveItem);
		menu.addSeparator();
		exitItem = new JMenuItem("退出");
		menu.add(exitItem);
		
		menu = new JMenu("设置");
		menubar.add(menu);
		fontItem = new JMenuItem("字体");
		menu.add(fontItem);
		colorItem = new JMenuItem("颜色");
		menu.add(colorItem);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	 if( e.getSource() == bn) {
		 JOptionPane.showMessageDialog(null, "button");
	 }
	 else if(e.getSource() == newItem) {
		 JOptionPane.showMessageDialog(null, "new ");
		 
	 }
	 else if(e.getSource() == openItem) {
		 JOptionPane.showMessageDialog(null, "open ");
		 
	 }
	}

}
