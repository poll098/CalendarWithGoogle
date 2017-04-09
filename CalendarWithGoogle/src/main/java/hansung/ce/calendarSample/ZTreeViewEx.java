package hansung.ce.calendarSample;



	import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode; 
	class ZTreeViewEx extends JPanel { 
	   public ZTreeViewEx() { 
	      setLayout( new BorderLayout() ); 
	      DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root"); 
	      DefaultMutableTreeNode mercury = new DefaultMutableTreeNode("Mercury"); 
	      DefaultMutableTreeNode mercury1 = new DefaultMutableTreeNode("Mercury1"); 
	      root.add(mercury); 
	      mercury.add(mercury1);
	      DefaultMutableTreeNode venus = new DefaultMutableTreeNode("Venus"); 
	      root.add(venus); 
	      DefaultMutableTreeNode mars = new DefaultMutableTreeNode("Mars"); 
	      root.add(mars); 
	      JTree tree = new JTree(root); 
	      add( tree, BorderLayout.CENTER ); 
	   } 
	} 
	class TableViewEx extends JPanel { 
	   public TableViewEx() { 
	      setLayout( new BorderLayout() ); 
	      String columnNames[] = 
	      { "상품번호", "상품이름", "상품가격", "상품설명" }; 
	      Object rowData[][] = 
	      { 
	         { 1, "맛동산", 100, "오리온" }, 
	         { 2, "아폴로", 200, "불량식품" }, 
	         { 3, "칸쵸코", 300, "과자계의 레전드" } }; 
	         JTable table = new JTable(rowData, columnNames); 
	         add( table, BorderLayout.CENTER ); 
	      } 
	   } 

