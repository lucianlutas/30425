package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddFrame extends ZooFrame{
	public class setComboKindActionListener {

	}

	private JPanel panel;
	private JComboBox comboKind;
	private JPanel pan;
	private JButton btnAddE;
	public AddFrame(String title) {
		super(title);
		
		String[] kindStrings = {"==EMPLOYEES==", "Caretaker", "==ANIMALS==","Ant", "BumbleBee", "Cobra", "Cow", "DungBeatle", "Lion", "Lizard", "Parrot", "Penguin", "Salmon", "Shark"};
		
		contentPanel.setLayout(new GridLayout(0,3,0,0));
		
		panel = new JPanel();
		contentPanel.add(panel);
		
		pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		
		comboKind = new JComboBox(kindStrings);
		slPanel.putConstraint(SpringLayout.NORTH, comboKind, 68, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, comboKind, 10, SpringLayout.WEST, pan);
		slPanel.putConstraint(SpringLayout.EAST, comboKind, 0, SpringLayout.EAST, pan);
		pan.add(comboKind);
		
		
		btnAddE = new JButton("Add Entry");
		slPanel.putConstraint(SpringLayout.NORTH, btnAddE, 21, SpringLayout.SOUTH, comboKind);
		slPanel.putConstraint(SpringLayout.WEST, comboKind, 10, SpringLayout.WEST, pan);
		slPanel.putConstraint(SpringLayout.EAST, comboKind, 0, SpringLayout.EAST, pan);
		pan.add(btnAddE);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
		
	}
	
}
