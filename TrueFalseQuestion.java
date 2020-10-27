import javax.swing.*;

public class TrueFalseQuestion extends Question {

		
	public TrueFalseQuestion(String question, String answer) {
		super(question);
		JPanel buttons = new JPanel();
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		this.question.add(buttons);
		initQuestionDialog();
		
		switch(answer) {
		case "t": answer = "TRUE";
		  break;
		case "true": answer = "TRUE";
	      break;
		case "T": answer = "TRUE";
	      break;
		case "True": answer = "TRUE";
	      break;
		case "TRUE": answer = "TRUE";
	      break;
		case "y": answer = "TRUE";
	      break;
		case "yes": answer = "TRUE";
	      break;
		case "Y": answer = "TRUE";
	      break;
		case "Yes": answer = "TRUE";
	      break;
		case "YES": answer = "TRUE";
	      break;
		case "f": answer = "FALSE";
		  break;
		case "no": answer = "FALSE";
		  break;
		case "false": answer = "FALSE";
		  break;
		case "False": answer = "FALSE";
		  break;
		case "FALSE": answer = "FALSE";
		  break;
		case "n": answer = "FALSE";
		  break;
		case "No": answer = "FALSE";
		  break;
		case "NO": answer = "FALSE";
		  break;
		case "F": answer="FALSE";
		
	}// end switch/case
		this.correctAnswer=answer;
	}
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}

} // end TrueFalseQuestion class
