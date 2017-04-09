package hansung.ce.calendarSample;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EAdd_Group extends JFrame {

	   private JPanel contentPane;
	   private GroupData groupData;
	   



	private JLabel GroupIntroLabel;
	   
	   private JTextField GroupNameField;
	   private JTextField GroupIntroField;
	   private EFriend_GroupUI eFGUi;
	   
	   public EAdd_Group(final EFriend_GroupUI eFGUi) {
			  
		   	this.eFGUi = eFGUi;
		   
		      setTitle("Make Group");
		      setResizable(false);
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      setBounds(100, 100, 400, 420);
		      contentPane = new JPanel();
		      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		      setContentPane(contentPane);
		      contentPane.setLayout(null);

		      JLabel PrefaceLabel = new JLabel("그룹 생성");
		      PrefaceLabel.setFont(new Font("굴림", Font.BOLD, 18));
		      PrefaceLabel.setBounds(150, 0, 100, 50);
		      contentPane.add(PrefaceLabel);
		      
		      JLabel GroupNameLabel = new JLabel("그룹이름 :");
		      GroupNameLabel.setBounds(70, 100, 65, 15);
		      contentPane.add(GroupNameLabel);
		      
		      JLabel GroupIntroLabel = new JLabel("그룹소개 :");
		      GroupIntroLabel.setBounds(70, 150, 65, 15);
		      contentPane.add(GroupIntroLabel);
		      
		      GroupNameField = new JTextField();
		      GroupNameField.setBounds(140, 100, 158, 21);
		      contentPane.add(GroupNameField);
		      GroupNameField.setColumns(10);
		      
		      GroupIntroField = new JTextField();
		      GroupIntroField.setColumns(10);
		      GroupIntroField.setBounds(140, 150, 158, 150);
		      contentPane.add(GroupIntroField);
		      
		      JButton createGBtn = new JButton("생성");
		      createGBtn.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            //내용 저장 
		        	 setGroupData();
		        	 eFGUi.addGroup(groupData);
		        	 for(int i=0; i<eFGUi.getGroupNum();i++){	//그룹을 추가할 때 마다 모든 그룹의 이름과 소개 출력
		        		 System.out.println(i + "번째 그룹 이름: " + eFGUi.getGroupName(i));
		        		 System.out.println(i + "번째 그룹 소개: " + eFGUi.getGroupIntro(i));
		        	 }
		        	 System.out.println("---------------------------------------");
		        	 dispose();       	 
		        	 
		         }
		      });
		      createGBtn.setBounds(70, 320, 97, 23);
		      contentPane.add(createGBtn);
		      
		      JButton cancleBtn = new JButton("취소");
		      cancleBtn.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 dispose();       	 
		         }
		      });
		      cancleBtn.setBounds(220, 320, 97, 23);
		      contentPane.add(cancleBtn);
	   }
	   
	   
	   public void setGroupData(){//GroupData Set
		   	groupData = new GroupData(GroupNameField.getText(),GroupIntroField.getText());
	    	   }
	   
}
