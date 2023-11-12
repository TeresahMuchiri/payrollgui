package payroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Payroll {

	private JFrame frmGeorgetoenCleaningServices;
	private JTextField textFieldName;
	private JTextField textFieldHourlySalary;
	private JTextField textFieldMFW;
	private JTextField textFieldMSW;
	private JTextField textFieldTSW;
	private JTextField textFieldTFW;
	private JTextField textFieldWFW;
	private JTextField textFieldWSW;
	private JTextField textFieldThFW;
	private JTextField textFieldThSW;
	private JTextField textFieldFFW;
	private JTextField textFieldFSW;
	private JTextField textFieldSaFW;
	private JTextField textFieldSaSW;
	private JTextField textFieldSuFW;
	private JTextField textFieldSuSW;
	private JTextField textFieldOverHrs;
	private JTextField textFieldRegAmt;
	private JTextField textFieldOverAmt;
	private JTextField textFieldNetPay;
	private JTextField textFieldRegHrs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payroll window = new Payroll();
					window.frmGeorgetoenCleaningServices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorgetoenCleaningServices = new JFrame();
		frmGeorgetoenCleaningServices.setTitle("Georgetown Cleaning Services - Employee Payroll");
		frmGeorgetoenCleaningServices.setBounds(100, 100, 647, 498);
		frmGeorgetoenCleaningServices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorgetoenCleaningServices.getContentPane().setLayout(null);
		
		JLabel EmployeeIDLabel = new JLabel("Employee Identification");
		EmployeeIDLabel.setBounds(10, 11, 140, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(EmployeeIDLabel);
		
		JLabel EmployeeNameLabel = new JLabel("Employee Name:");
		EmployeeNameLabel.setBounds(20, 36, 112, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(EmployeeNameLabel);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(135, 33, 251, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel HourlySalaryLabel = new JLabel("Hourly Salary:");
		HourlySalaryLabel.setBounds(387, 36, 86, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(HourlySalaryLabel);
		
		textFieldHourlySalary = new JTextField();
		textFieldHourlySalary.setBounds(483, 33, 86, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldHourlySalary);
		textFieldHourlySalary.setColumns(10);
		
		JLabel TimeSheetLabel = new JLabel("Time Sheet");
		TimeSheetLabel.setBounds(10, 96, 110, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(TimeSheetLabel);
		
		JLabel TuesdayLabel = new JLabel("Tuesday");
		TuesdayLabel.setBounds(190, 116, 64, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(TuesdayLabel);
		
		JLabel WednesdayLabel = new JLabel("Wednesday");
		WednesdayLabel.setBounds(264, 116, 76, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(WednesdayLabel);
		
		JLabel ThursdayLabel = new JLabel("Thursday");
		ThursdayLabel.setBounds(350, 116, 64, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(ThursdayLabel);
		
		JLabel FridayLabel = new JLabel("Friday");
		FridayLabel.setBounds(433, 116, 40, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(FridayLabel);
		
		JLabel SaturdayLabel = new JLabel("Saturday");
		SaturdayLabel.setBounds(504, 116, 56, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(SaturdayLabel);
		
		JLabel SundayLabel = new JLabel("Sunday");
		SundayLabel.setBounds(577, 116, 46, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(SundayLabel);
		
		JLabel MondayLabel = new JLabel("Monday");
		MondayLabel.setBounds(124, 116, 46, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(MondayLabel);
		
		JLabel FirstWeekLabel = new JLabel("First Week:");
		FirstWeekLabel.setBounds(10, 149, 76, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(FirstWeekLabel);
		
		JLabel SecondWeekLabel = new JLabel("Second Week:");
		SecondWeekLabel.setBounds(10, 189, 93, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(SecondWeekLabel);
		
		textFieldMFW = new JTextField();
		textFieldMFW.setBounds(113, 146, 64, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldMFW);
		textFieldMFW.setColumns(10);
		
		textFieldMSW = new JTextField();
		textFieldMSW.setBounds(113, 186, 64, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldMSW);
		textFieldMSW.setColumns(10);
		
		textFieldTSW = new JTextField();
		textFieldTSW.setBounds(187, 186, 66, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldTSW);
		textFieldTSW.setColumns(10);
		
		textFieldTFW = new JTextField();
		textFieldTFW.setBounds(187, 146, 66, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldTFW);
		textFieldTFW.setColumns(10);
		
		textFieldWFW = new JTextField();
		textFieldWFW.setBounds(261, 146, 66, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldWFW);
		textFieldWFW.setColumns(10);
		
		textFieldWSW = new JTextField();
		textFieldWSW.setBounds(264, 186, 66, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldWSW);
		textFieldWSW.setColumns(10);
		
		textFieldThFW = new JTextField();
		textFieldThFW.setBounds(340, 146, 66, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldThFW);
		textFieldThFW.setColumns(10);
		
		textFieldThSW = new JTextField();
		textFieldThSW.setBounds(340, 186, 66, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldThSW);
		textFieldThSW.setColumns(10);
		
		textFieldFFW = new JTextField();
		textFieldFFW.setBounds(417, 146, 66, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldFFW);
		textFieldFFW.setColumns(10);
		
		textFieldFSW = new JTextField();
		textFieldFSW.setBounds(417, 186, 66, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldFSW);
		textFieldFSW.setColumns(10);
		
		textFieldSaFW = new JTextField();
		textFieldSaFW.setBounds(494, 186, 66, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldSaFW);
		textFieldSaFW.setColumns(10);
		
		textFieldSaSW = new JTextField();
		textFieldSaSW.setBounds(494, 146, 66, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldSaSW);
		textFieldSaSW.setColumns(10);
		
		textFieldSuFW = new JTextField();
		textFieldSuFW.setBounds(567, 146, 56, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldSuFW);
		textFieldSuFW.setColumns(10);
		
		textFieldSuSW = new JTextField();
		textFieldSuSW.setBounds(567, 186, 56, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldSuSW);
		textFieldSuSW.setColumns(10);
		
		JLabel PayrollLabel = new JLabel("Payroll Processing");
		PayrollLabel.setBounds(10, 262, 110, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(PayrollLabel);
		
		JButton btnProcess = new JButton("Process It");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hourlysal, Mon1, Mon2, Tue1, Tue2, Wed1, Wed2, Thur1, Thur2, Fri1, Fri2, Sat1, Sat2, Sun1, Sun2;
				double regularhrs;
				double regularamt;
				double overtimehrs;
				double overtimeamt;
				double netpay;
				
				hourlysal = textFieldHourlySalary.getText();
				Mon1 = textFieldMFW.getText();
				Mon2 = textFieldMSW.getText();
				Tue1 = textFieldTFW.getText();
				Tue2 = textFieldTSW.getText();
				Wed1 = textFieldWFW.getText();
				Wed2 = textFieldWSW.getText();
				Thur1 = textFieldThFW.getText();
				Thur2 = textFieldThSW.getText();
				Fri1 = textFieldFFW.getText();
				Fri2 = textFieldFSW.getText();
				Sat1 = textFieldSaFW.getText();
				Sat2 = textFieldSaSW.getText();
				Sun1 = textFieldSuFW.getText();
				Sun2 = textFieldSuSW.getText();
				
				double hoursal = Double.parseDouble(hourlysal);
				double m1 = Double.parseDouble(Mon1);
				double m2 = Double.parseDouble(Mon2);
				double t1 = Double.parseDouble(Tue1);
				double t2 = Double.parseDouble(Tue2);
				double w1 = Double.parseDouble(Wed1);
				double w2 = Double.parseDouble(Wed2);
				double th1 = Double.parseDouble(Thur1);
				double th2 = Double.parseDouble(Thur2);
				double f1 = Double.parseDouble(Fri1);
				double f2 = Double.parseDouble(Fri2);
				double sa1 = Double.parseDouble(Sat1);
				double sa2 = Double.parseDouble(Sat2);
				double su1 = Double.parseDouble(Sun1);
				double su2 = Double.parseDouble(Sun2);
				
				regularhrs = m1+(m2-1.0)+t1+(t2-0.5)+w1+(w2-1.5)+th1+(th2-2.5)+f1+f2+sa1+sa2+su1+su2;
				regularamt = (regularhrs*hoursal);
				overtimehrs = (m2-8)+(t2-8)+(w2-8)+(th2-8)+(f2-8);
				overtimeamt = (overtimehrs*hoursal);
				netpay = (regularamt+overtimeamt);
				
				textFieldMFW.setText(Double.toString(m1));
				textFieldMSW.setText(Double.toString(m2));
				textFieldTFW.setText(Double.toString(t1));
				textFieldTSW.setText(Double.toString(t2));
				textFieldWFW.setText(Double.toString(w1));
				textFieldWSW.setText(Double.toString(w2));
				textFieldThFW.setText(Double.toString(th1));
				textFieldThSW.setText(Double.toString(th2));
				textFieldFFW.setText(Double.toString(f1));
				textFieldFSW.setText(Double.toString(f2));
				textFieldSaFW.setText(Double.toString(sa1));
				textFieldSaSW.setText(Double.toString(sa2));
				textFieldSuFW.setText(Double.toString(su1));
				textFieldSuSW.setText(Double.toString(su2));
				textFieldRegHrs.setText(Double.toString(regularhrs));
				textFieldRegAmt.setText(Double.toString(regularamt));
				textFieldOverHrs.setText(Double.toString(overtimehrs));
				textFieldOverAmt.setText(Double.toString(overtimeamt));
				textFieldNetPay.setText(Double.toString(netpay));
				
				
			}
		});
		btnProcess.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnProcess.setBounds(31, 307, 89, 105);
		frmGeorgetoenCleaningServices.getContentPane().add(btnProcess);
		
		JLabel RegularLabel = new JLabel("Regular:");
		RegularLabel.setBounds(135, 352, 70, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(RegularLabel);
		
		JLabel OvertimeLabel = new JLabel("Overtime:");
		OvertimeLabel.setBounds(135, 398, 70, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(OvertimeLabel);
		
		JLabel HoursLabel = new JLabel("Hours");
		HoursLabel.setBounds(225, 329, 46, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(HoursLabel);
		
		JLabel AmountLabel = new JLabel("Amount");
		AmountLabel.setBounds(301, 329, 46, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(AmountLabel);
		
		textFieldOverHrs = new JTextField();
		textFieldOverHrs.setEditable(false);
		textFieldOverHrs.setBounds(205, 392, 66, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldOverHrs);
		textFieldOverHrs.setColumns(10);
		
		textFieldRegAmt = new JTextField();
		textFieldRegAmt.setEditable(false);
		textFieldRegAmt.setBounds(276, 349, 76, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldRegAmt);
		textFieldRegAmt.setColumns(10);
		
		textFieldOverAmt = new JTextField();
		textFieldOverAmt.setEditable(false);
		textFieldOverAmt.setBounds(277, 392, 76, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldOverAmt);
		textFieldOverAmt.setColumns(10);
		
		JLabel NetPayLabel = new JLabel("NetPay:");
		NetPayLabel.setBounds(373, 349, 46, 14);
		frmGeorgetoenCleaningServices.getContentPane().add(NetPayLabel);
		
		textFieldNetPay = new JTextField();
		textFieldNetPay.setEditable(false);
		textFieldNetPay.setBounds(428, 349, 76, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldNetPay);
		textFieldNetPay.setColumns(10);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGeorgetoenCleaningServices.setVisible(false);
			}
		});
		btnClose.setBounds(534, 307, 89, 105);
		frmGeorgetoenCleaningServices.getContentPane().add(btnClose);
		
		textFieldRegHrs = new JTextField();
		textFieldRegHrs.setEditable(false);
		textFieldRegHrs.setBounds(205, 349, 66, 20);
		frmGeorgetoenCleaningServices.getContentPane().add(textFieldRegHrs);
		textFieldRegHrs.setColumns(10);
	}

}
