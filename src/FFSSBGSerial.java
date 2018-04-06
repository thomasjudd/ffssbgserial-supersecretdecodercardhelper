import javax.swing.*;
import java.util.ArrayList;

public class FFSSBGSerial {
    public static void main(String[] args) {

        //TODO: add JLabels
        JFrame f = new JFrame("Flip Florey's Super Secret Decoder Card Helper");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //TextAreas
        JTextArea input = new JTextArea();
        input.setLineWrap(true);
        input.setBounds(25,175,350,50);
        f.add(input);

        JTextArea output = new JTextArea();
        output.setBounds(25,250,350,50);
        output.setLineWrap(true);
        output.setEditable(false);
        f.add(output);

        //RadioButtons
        JRadioButton encode = new JRadioButton("Encode");
        JRadioButton decode = new JRadioButton("Decode");
        encode.setBounds(300,50,75,75);
        decode.setBounds(300,100,75,75);
        ButtonGroup encDecBG = new ButtonGroup();
        encDecBG.add(encode);
        encDecBG.add(decode);
        f.add(encode);
        f.add(decode);

        //ComboBoxes
        JComboBox card1 = new JComboBox(new String[]{"Robocop", "Ewok", "Cosmic", "Punchy"});
        JComboBox card2 = new JComboBox(new String[]{"Cube", "Laser", "Jellybean", "Forty-Two"});
        JComboBox card3 = new JComboBox(new String[]{"Turtle", "Droid", "Meeple", "Sleestak"});
        JComboBox card4 = new JComboBox(new String[]{"Bananarang", "Cupcake", "Venutian Akido", "Porg"});
        JComboBox card5 = new JComboBox(new String[]{"Lightsaber", "Cylon", "Delorean", "Krypton"});
        JComboBox card6 = new JComboBox(new String[]{"Tron", "Ninja", "Chia Pet", "Pon Farr"});

        card1.setBounds(20,75,75,25);
        card2.setBounds(110,75,75,25);
        card3.setBounds(200,75,75,25);
        card4.setBounds(20,125,75,25);
        card5.setBounds(110,125,75,25);
        card6.setBounds(200,125,75,25);

        f.add(card1);
        f.add(card2);
        f.add(card3);
        f.add(card4);
        f.add(card5);
        f.add(card6);

        //Button
        JButton submit = new JButton("leeet's goo!");
        submit.setBounds(250,325, 125, 25);

        submit.addActionListener(actionEvent -> {
            ArrayList<String> chosenCodewords = new ArrayList<>();
            chosenCodewords.add((String)card1.getItemAt(card1.getSelectedIndex()));
            chosenCodewords.add((String)card2.getItemAt(card2.getSelectedIndex()));
            chosenCodewords.add((String)card3.getItemAt(card3.getSelectedIndex()));
            chosenCodewords.add((String)card4.getItemAt(card4.getSelectedIndex()));
            chosenCodewords.add((String)card5.getItemAt(card5.getSelectedIndex()));
            chosenCodewords.add((String)card6.getItemAt(card6.getSelectedIndex()));
            Decoder d = new Decoder(chosenCodewords);
            String outputText = new String();
            if(encode.isSelected()){
                outputText = d.encode(input.getText().toLowerCase());
            }
            if(decode.isSelected()) {
                outputText = d.decode(input.getText());
            }
            output.setText(outputText);
        });

        f.add(submit);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
