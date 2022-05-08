import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ButtonListener.ButtonListener;

public class MainPanel extends JPanel implements ActionListener, ChangeListener {

        private JLabel fNameLable, lNameLable, genderLable, ageLable, bodyFrameLable, heightLable, weightLable;
        private JTextField fNameText, lNameText, ageText;
        private JButton clearButton, calcButton, exitButton;
        private JRadioButton maleRadioButton, femaleRadioButton, smallBodyFrame, mediumBodyFrame, largeBodyFrame;
        private JSlider ageSlider, heightSlider, weightSlider;
        ButtonListener buttonListener ;

        public MainPanel() {

// Lables
            fNameLable = new JLabel(" First Name : ");
            fNameLable.setFont(new Font("Arial", Font.BOLD,20));
            lNameLable = new JLabel(" Last Name : ");
            lNameLable.setFont(new Font("Arial", Font.BOLD,20));
            weightLable = new JLabel(" Weight : ");
            weightLable.setFont(new Font("Arial", Font.BOLD,15));
            genderLable = new JLabel(" Your Gender ");
            ageLable = new JLabel(" Age : ");
            heightLable = new JLabel(" Height : ");
            bodyFrameLable = new JLabel(" Body Frame ");

// Buttons
            clearButton = new JButton("Clear");
            calcButton = new JButton("Calculate");
            exitButton = new JButton("Exit");
          //  clearButton.setPreferredSize(new Dimension(5, 5));


// Groups - RadioButton
            ButtonGroup genderGroup = new ButtonGroup();
            maleRadioButton = new JRadioButton("Male");
            maleRadioButton.setBackground(Color.yellow);
            femaleRadioButton = new JRadioButton("Female");
            femaleRadioButton.setBackground(Color.yellow);
           // otherGenderRadioButton = new JRadioButton("Other");

            ButtonGroup bodyFrameGroup = new ButtonGroup();
            smallBodyFrame = new JRadioButton("Small");
            smallBodyFrame.setBackground(Color.yellow);
         //   smallBodyFrame.setMargin(new Insets(10, 10, 10, 10));
            mediumBodyFrame = new JRadioButton("Medium");
            mediumBodyFrame.setBackground(Color.yellow);
          //  mediumBodyFrame.setMargin(new Insets(10, 10, 10, 10));
            largeBodyFrame = new JRadioButton("Large");
            largeBodyFrame.setBackground(Color.yellow);
          //  largeBodyFrame.setMargin(new Insets(10, 10, 10, 10));

            bodyFrameGroup.add(smallBodyFrame);
            bodyFrameGroup.add(mediumBodyFrame);
            bodyFrameGroup.add(largeBodyFrame);

            ButtonListener buttonListener = new ButtonListener();
            JPanel buttonsPanel = new JPanel();


            //ActionListener listener = new ActionListener ();

// Sliders

            ageSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);

            ageSlider.setMajorTickSpacing(20);
            ageSlider.setMinorTickSpacing(5);
            ageSlider.setPaintTicks(true);
            ageSlider.setPaintLabels(true);
          //  ageSlider.setAlignmentX(Component.CENTER_ALIGNMENT);

            heightSlider = new JSlider(0, 200, 0);
            heightSlider.setPreferredSize(new Dimension(50, 70));
            heightSlider.setMajorTickSpacing(20);
            heightSlider.setMinorTickSpacing(5);
            heightSlider.setPaintTicks(true);
            heightSlider.setPaintTrack(true);
            heightSlider.setPaintLabels(true);
            heightSlider.setFont(new Font("Arial", Font.PLAIN, 15));
            heightSlider.setAlignmentX(Component.CENTER_ALIGNMENT);
            heightLable.setFont(new Font("Arial", Font.BOLD,15));

            weightSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
            weightSlider.setPreferredSize(new Dimension(50, 70));
            weightSlider.setMajorTickSpacing(10);
            weightSlider.setMinorTickSpacing(0);
            weightSlider.setPaintTicks(true);
            weightSlider.setPaintLabels(true);
            weightSlider.setAlignmentX(Component.CENTER_ALIGNMENT);

//TextField
            fNameText = new JTextField(10);
            fNameText.setFont(new Font("Arial", Font.BOLD,20));
            lNameText = new JTextField(5);
            lNameText.setFont(new Font("Arial", Font.BOLD,20));
            ageText = new JTextField();
            ageText.setFont(new Font("Arial", Font.BOLD,20));



           // JLabel lable = new JLabel();

//mainPanel1
        JPanel mainPanel1 = new JPanel() ;
       // mainPanel1.setLayout(new GridLayout(1,0));
        mainPanel1.setLayout(new BoxLayout(mainPanel1,BoxLayout.Y_AXIS));
       // setPreferredSize(new Dimension(600, 800));
            //setBackground(Color.BLUE);

/*

            JPanel personalDataPanel = new JPanel() ;
            personalDataPanel.setLayout(new BoxLayout(personalDataPanel,BoxLayout.Y_AXIS));
            personalDataPanel.setBackground(Color.red);
            //  personalDataPanel.setLayout(new BorderLayout());
            personalDataPanel.add(fNameLable );
            personalDataPanel.add(fNameText );
            personalDataPanel.add(lNameLable );
            personalDataPanel.add(lNameText );
            mainPanel1.add(personalDataPanel) ;
*/

        JPanel personalDataPanel = new JPanel() ;
        personalDataPanel.setLayout(new BoxLayout(personalDataPanel,BoxLayout.Y_AXIS));
        personalDataPanel.setBackground(Color.LIGHT_GRAY);
      //  personalDataPanel.setLayout(new BorderLayout());
        personalDataPanel.add(fNameLable );
            personalDataPanel.add(fNameText );
      //  personalDataPanel.add(lNameLable );
        mainPanel1.add(personalDataPanel) ;

            JPanel personalDataTextPanel = new JPanel() ;
            personalDataTextPanel.setLayout(new BoxLayout(personalDataTextPanel,BoxLayout.Y_AXIS));
           // personalDataTextPanel.setLayout(new GridLayout(0,2));
            personalDataTextPanel.setBackground(Color.YELLOW);
            //  personalDataPanel.setLayout(new BorderLayout());
           // personalDataTextPanel.add(fNameText );
            personalDataPanel.add(lNameLable );
            personalDataTextPanel.add(lNameText );

            JPanel sliderAgePanel = new JPanel();
           // sliderAgePanel.setLayout(new BorderLayout());
            sliderAgePanel.setLayout(new BoxLayout(sliderAgePanel,BoxLayout.X_AXIS));
           ageLable.setFont(new Font("Arial", Font.BOLD,15));
            ageLable.setPreferredSize(new Dimension(70, 50));
          //  sliderAgePanel.add((ageLable),BorderLayout.NORTH);
           // sliderAgePanel.add((ageLable));
          //  ageLable.setText(" Age : " + ageSlider.getValue());
            ageSlider.addChangeListener(this);
           // sliderAgePanel.add(ageLable);
            sliderAgePanel.add(ageSlider);

            JPanel heightSliderPanel = new JPanel() ;
           // heightSliderPanel.setLayout(new GridLayout(1,1,5,20));
           // heightLable.setText(" Height : " + String.valueOf(heightSlider.getValue()));
            heightSlider.addChangeListener(this);
            heightSliderPanel.add(heightLable);
            heightSliderPanel.add(heightSlider);

            JPanel weightSliderPanel = new JPanel() ;
           // weightLable.setText(" Weight : " + String.valueOf(weightSlider.getValue()));
            weightSlider.addChangeListener(this);
            weightSliderPanel.add(weightLable);
            weightSliderPanel.add(weightSlider);



       mainPanel1.add(personalDataTextPanel) ;
       mainPanel1.add(ageLable);
       mainPanel1.add(sliderAgePanel);
       mainPanel1.add(heightLable);
       mainPanel1.add(heightSlider);
       mainPanel1.add(weightLable);
       mainPanel1.add(weightSlider);

       add(mainPanel1);

//mainPanel2
       JPanel mainPanel2 = new JPanel();
            mainPanel2.setLayout(new GridLayout(2,0));

        JPanel genderPanel = new JPanel();
       // genderPanel.setLayout(new BoxLayout(genderPanel,BoxLayout.Y_AXIS));
     //   genderPanel.setBackground(Color.yellow);
        genderPanel.setAlignmentY(LEFT_ALIGNMENT);
      //  genderPanel.setBorder(new TitledBorder(" Gender ").setTitleFont("Arial",Font.BOLD,20));
        genderPanel.setBorder(new TitledBorder(" Gender "));
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
            genderGroup.add(maleRadioButton);
            genderGroup.add(femaleRadioButton);


           JPanel bodyFrameGroupPanel = new JPanel();
            // bodyFrameGroupPanel.setBackground(Color.blue);
             bodyFrameGroupPanel.setBorder(new TitledBorder(" Body Frame "));
            bodyFrameGroupPanel.add(smallBodyFrame);
            bodyFrameGroupPanel.add(mediumBodyFrame);
            bodyFrameGroupPanel.add(largeBodyFrame);
             bodyFrameGroup.add(smallBodyFrame);
             bodyFrameGroup.add(mediumBodyFrame);
             bodyFrameGroup.add(largeBodyFrame);



            mainPanel2.add (genderPanel) ;
            mainPanel2.add (bodyFrameGroupPanel) ;

        add(mainPanel2);

//mainPanel3
            JPanel mainPanel3 = new JPanel();
            clearButton.addActionListener(buttonListener);
            calcButton.addActionListener(buttonListener);
            exitButton.addActionListener(buttonListener);
            mainPanel3.setLayout(new GridLayout(0, 3, 10, 10));
            mainPanel3.add(clearButton);
            mainPanel3.add(calcButton);
            mainPanel3.add(exitButton) ;

            add(mainPanel3);

        }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == calcButton) {
                // ideal_weight = (height-100+(age/10))*0.9*slimness
                // small=0.9 ; medium=1 ; large=1.1 ;
                // BMI = Weght/ (Heigt)^2
            }
            if (e.getSource() == exitButton)
                System.exit(0);

            if (e.getSource() == clearButton) {
                fNameText.setText(null);
                lNameText.setText(null);
                ageSlider.setValue(0);
                heightSlider.setValue(0);
                weightSlider.setValue(0);
               // maleRadioButton = new JRadioButton("Male" , false);
                maleRadioButton.setSelected(false);
                femaleRadioButton.setSelected(false);
                smallBodyFrame.setSelected(false);
                mediumBodyFrame.setSelected(false);
                largeBodyFrame.setSelected(false);


            }

            if (e.getSource() == calcButton) {
                //calculate();
            }
            //maleRadioButton
            //okButton

        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        heightLable.setText(" Height : " + String.valueOf(heightSlider.getValue()) + " cm");
        weightLable.setText(" Weight : " + String.valueOf(weightSlider.getValue()) + " kg");
        ageLable.setText(" Age : " + ageSlider.getValue() + " years");
    }
}