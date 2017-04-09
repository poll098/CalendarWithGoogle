package hansung.ce.calendarSample;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;

public class ZApplicationTest extends JFrame { 
    public ZApplicationTest() { 
       JMenuBar menubar = new JMenuBar(); 
       JMenu menu1 = new JMenu("menu1"); 
       JMenuItem item11 = new JMenuItem("item1"); 
       JMenuItem item12 = new JMenuItem("item2"); 
       JMenuItem item13 = new JMenuItem("item3"); 
       menu1.add(item11); 
       menu1.add(item12); 
       menu1.add(item13); 
       JMenu menu2 = new JMenu("menu2"); 
       JMenuItem item21 = new JMenuItem("item1"); 
       JMenuItem item22 = new JMenuItem("item2"); 
       JMenuItem item23 = new JMenuItem("item3"); 
       menu2.add(item21); 
       menu2.add(item22); 
       menu2.add(item23); 
       JMenu menu3 = new JMenu("menu3"); 
       JMenuItem item31 = new JMenuItem("item1"); 
       JMenuItem item32 = new JMenuItem("item2"); 
       JMenuItem item33 = new JMenuItem("item3"); 
       menu3.add(item31); 
       menu3.add(item32); 
       menu3.add(item33); 
       JMenu menu4 = new JMenu("menu4"); 
       JMenuItem item41 = new JMenuItem("item1"); 
       JMenuItem item42 = new JMenuItem("item2"); 
       JMenuItem item43 = new JMenuItem("item3"); 
       menu4.add(item41); 
       menu4.add(item42); 
       menu4.add(item43); 
       JMenu menu5 = new JMenu("menu5"); 
       JMenuItem item51 = new JMenuItem("item1"); 
       JMenuItem item52 = new JMenuItem("item2"); 
       JMenuItem item53 = new JMenuItem("item3"); 
       menu5.add(item51); 
       menu5.add(item52); 
       menu5.add(item53); 
       menubar.add(menu1); 
       menubar.add(menu2); 
       menubar.add(menu3); 
       menubar.add(menu4); 
       menubar.add(menu5); 
       JSplitPane jsp =new JSplitPane(); 
       jsp.setLeftComponent( new ZTreeViewEx() ); 
       jsp.setRightComponent( new TableViewEx() ); 
       setJMenuBar( menubar ); 
       add( jsp ); 
       setSize(500, 500); 
       setDefaultCloseOperation(EXIT_ON_CLOSE); 
       setVisible(true); 
    } 
    public static void main(String[] args) { 
       new ZApplicationTest(); 
    } 
 } 

