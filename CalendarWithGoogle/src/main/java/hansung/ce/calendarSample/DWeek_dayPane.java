package hansung.ce.calendarSample;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DWeek_dayPane extends JPanel implements MouseListener {
	DWeek_CalendarView calendar;

	private JPanel dayInfoPanel;// 하루 전체 정보판넬

	private JPanel dayNumPanel;// 날짜
	private JLabel dayNumLabel = new JLabel();
	private String strDay;

	private JPanel 	schedulePanel = new JPanel();// 스케줄
	private JLabel[] ScheduleLabel = new JLabel[24];// 시간별로
	private String scheduleName;

	private int year, month, day;

	public DWeek_dayPane(DWeek_CalendarView dWeek_CalendarView, String strDay) {
		super();
		this.calendar = dWeek_CalendarView;
		this.strDay = strDay;
		this.setOpaque(false);

		dayInfoPanel = new JPanel();
		dayInfoPanel.setBackground(Color.WHITE);

		dayNumPanel = new JPanel();

		dayNumPanel.setOpaque(true);
		dayNumPanel.add(dayNumLabel);
		

		schedulePanel.setLayout(new GridLayout(24, 1));
		schedulePanel.setOpaque(false);
//		if (strDay.equals("시간")) {
//
//			JLabel[] timeLabel = new JLabel[24];
//			String time[] = { "00:00-01:00", "01:00-02:00", "02:00-03:00", "03:00-04:00", "04:00-05:00", "05:00-06:00",
//					"06:00-07:00", "07:00-08:00", "08:00-09:00", "09:00-10:00", "10:00-11:00", "11:00-12:00",
//					"12:00-13:00", "13:00-14:00", "14:00-15:00", "15:00-16:00", "16:00-17:00", "17:00-18:00",
//					"18:00-19:00", "19:00-20:00", "20:00-21:00", "21:00-22:00", "22:00-23:00", "23:00-24:00" };
//			for (int i = 0; i < timeLabel.length; i++) {
//				timeLabel[i] = new JLabel(time[i]);
//				schedulePanel.add(timeLabel[i]);
//			}
//		} 
//		else {
//			for (int i = 0; i < ScheduleLabel.length; i++) {
//			ScheduleLabel[i] = new JLabel();
//			schedulePanel.add(ScheduleLabel[i]);
//		}
//		}


		dayInfoPanel.setLayout(new BorderLayout());
		//dayInfoPanel.add(schedulePanel, BorderLayout.CENTER);

		dayInfoPanel.addMouseListener(this);

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(1)
						.addComponent(dayInfoPanel, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE).addGap(1)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)

				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup().addGap(1)
						.addComponent(dayInfoPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(1)));
		setLayout(groupLayout);

	}


	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void initInfo() {
		dayNumLabel.setText("");
		// Aday.add(dayLabel);
	}

	/* 각각의 day판넬에 날짜 지정하기 */
	public void setValue(int year, int month, String strDay, int position) {
		int num = position % 7;
		this.year = year;
		this.month = month;
		this.strDay = strDay;

		// 토요일 파란 일요일 빨간 설정
		if (num == 1)
			dayNumLabel.setForeground(Color.RED);
		else if (num == 0)
			dayNumLabel.setForeground(Color.BLUE);
		
		dayNumLabel.setText(strDay);
		
		if (strDay.equals("시간")) {

			JLabel[] timeLabel = new JLabel[24];
			String time[] = { "00:00-01:00", "01:00-02:00", "02:00-03:00", "03:00-04:00", "04:00-05:00", "05:00-06:00",
					"06:00-07:00", "07:00-08:00", "08:00-09:00", "09:00-10:00", "10:00-11:00", "11:00-12:00",
					"12:00-13:00", "13:00-14:00", "14:00-15:00", "15:00-16:00", "16:00-17:00", "17:00-18:00",
					"18:00-19:00", "19:00-20:00", "20:00-21:00", "21:00-22:00", "22:00-23:00", "23:00-24:00" };
			for (int i = 0; i < timeLabel.length; i++) {
				timeLabel[i] = new JLabel(time[i]);
				schedulePanel.add(timeLabel[i]);
			}
		} 
		else {
			for (int i = 0; i < ScheduleLabel.length; i++) {
			ScheduleLabel[i] = new JLabel();
			schedulePanel.add(ScheduleLabel[i]);
		}
		}

		dayInfoPanel.add(dayNumLabel,BorderLayout.NORTH);
		dayInfoPanel.add(schedulePanel, BorderLayout.CENTER);

	}

}