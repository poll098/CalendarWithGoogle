package hansung.ce.calendarSample;


import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class EFriend_GroupUI extends JFrame {
	private JTabbedPane tab;
	
	private JPanel FriendPanel;
	private JTable FriendTable;
	private JScrollPane scrollPane;
	
	private JPanel GroupPanel;
	
	private JPanel RequestPanel;
	private JTable RequestTable;

	private Panel Gp1;
	private JTextField Gp1_name;
	private JTextField Gp1_member;
	private Vector <GroupData>GroupVec=new Vector<GroupData>();
	

	
	EAdd_Group MakeGroup=new EAdd_Group(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EFriend_GroupUI frame = new EFriend_GroupUI();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EFriend_GroupUI() {
		setTitle("Friend_Group");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1210, 710);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);	
		tab=new JTabbedPane();
		tab.setBounds(0, 0, 1194, 600);
		
	/*탭에서 친구 패널*/
		FriendPanel = new JPanel();		
		FriendPanel.setLayout(null);
		String []columnNames={"이름","전화번호","이메일","그룹","한마디"};//테이블에 저장될 정보들
		DefaultTableModel friend_model=new DefaultTableModel(columnNames,0);//고정된 첫번째 줄
		friend_model.addRow(new Object[]{"최보윤","01066311668","boyoon456123@naver.com","졸업프로젝트","반갑습니다."});
		friend_model.addRow(new Object[]{"유후","01022362222","gdfge@naver.com","졸업프로젝트","반갑습니다."});
		
		FriendTable = new JTable(friend_model);//친구리스트테이블
		FriendTable.setPreferredScrollableViewportSize(new Dimension(1150, 600));			
		FriendTable.getColumnModel().getColumn(0).setPreferredWidth(100);//각 컬럼이름 사이즈 조정 
		FriendTable.getColumnModel().getColumn(1).setPreferredWidth(200);
		FriendTable.getColumnModel().getColumn(2).setPreferredWidth(250);
		FriendTable.getColumnModel().getColumn(3).setPreferredWidth(200);
		FriendTable.getColumnModel().getColumn(4).setPreferredWidth(400);	
		scrollPane = new JScrollPane(FriendTable);
		scrollPane.setBounds(0, 53, 1189, 628);
		FriendPanel.add(scrollPane);
	
		JButton inviteButton = new JButton("친구초대");//친구초대버튼
		inviteButton.setBounds(28, 20, 97, 23);
		FriendPanel.add(inviteButton);
		
		final JButton addGroupButton = new JButton("그룹만들기");//그룹만들기버튼
		addGroupButton.setBounds(137, 20, 114, 23);
		FriendPanel.add(addGroupButton);
		addGroupButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            if(e.getSource()==addGroupButton){
	               MakeGroup.setVisible(true);
	            }
	         }
	      });
		tab.addTab("친구", FriendPanel);
		
	/*탭에서 그룹패널*/
		GroupPanel=new JPanel();	
		GroupPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 150, 100));
		
			Gp1 = new Panel();
			Gp1.setBackground(Color.LIGHT_GRAY);
			Gp1.setPreferredSize(new Dimension(350,150));
			GroupPanel.add(Gp1);
			Gp1.setLayout(null);
			
			Gp1_name = new JTextField();
			Gp1_name.setText("그룹이름");
			Gp1_name.setBounds(160, 35, 116, 21);
			Gp1.add(Gp1_name);
			Gp1_name.setColumns(10);
			
			Gp1_member = new JTextField();
			Gp1_member.setText("멤버이름");
			Gp1_member.setColumns(10);
			Gp1_member.setBounds(160, 91, 116, 21);
			Gp1.add(Gp1_member);
			tab.addTab("그룹", GroupPanel);
		
	/*탭에서 요청메세지 패널*/
		RequestPanel=new JPanel();
		RequestPanel.setLayout(null);
		String []columnNames2={"소제목 명","그룹","날짜","장소","참석여부"};
		DefaultTableModel request_model=new DefaultTableModel(columnNames2,0);
		RequestTable = new JTable(request_model);//요청리스트테이블
		RequestTable.setPreferredScrollableViewportSize(new Dimension(1150, 600));	
		RequestTable.getColumnModel().getColumn(0).setPreferredWidth(300);//각 컬럼이름 사이즈 조정 
		RequestTable.getColumnModel().getColumn(1).setPreferredWidth(180);
		RequestTable.getColumnModel().getColumn(2).setPreferredWidth(200);
		RequestTable.getColumnModel().getColumn(3).setPreferredWidth(200);
		RequestTable.getColumnModel().getColumn(4).setPreferredWidth(300);	
		
		scrollPane = new JScrollPane(RequestTable);
		scrollPane.setBounds(0, 53, 1189, 628);
		RequestPanel.add(scrollPane);
		tab.addTab("요청메세지", RequestPanel);	
		
		getContentPane().add(tab);
  
		Button mypageBtn = new Button("마이페이지");
		mypageBtn.setBounds(321, 625, 115, 23);
		getContentPane().add(mypageBtn);
		
		
		Button MCalendarBtn = new Button("달력");///////////현재 달력버튼에만 액션리스너달아놓음
		MCalendarBtn.setBounds(469, 625, 115, 23);
		getContentPane().add(MCalendarBtn);
		MCalendarBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 DMonth_CalendarView m=(DMonth_CalendarView)DMonth_CalendarView.getInstanace();
				 	dispose();
					m.setVisible(true);
			}
		   });
		
		Button settingBtn = new Button("환경설정");
		settingBtn.setBounds(615, 625, 115, 23);
		getContentPane().add(settingBtn);
		
		Button logoutBtn = new Button("로그아웃");
		logoutBtn.setBounds(758, 625, 115, 23);
		getContentPane().add(logoutBtn);
	}
	
	//addGroup
	public void addGroup(GroupData groupData){
		GroupVec.addElement(groupData);
	}
	
	public String getGroupIntro(int index){
		return GroupVec.elementAt(index).getGroupIntro();
	}
	
	public String getGroupName(int index){
		return GroupVec.elementAt(index).getGroupName();
	}
	
	public int getGroupNum(){
		return GroupVec.size();
	}
}
