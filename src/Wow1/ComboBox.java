package Wow1;//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ComboBox extends JPanel {
    private JComboBox jcomp1;
    private JTextField jTextField1;
    private JTextField jcomp3;
    private JTextField jcomp4;
    private JLabel ingLabel1;
    private JLabel ingLabel2;
    private JLabel ingLabel3;
    private JLabel ingLabel4;
    private JLabel ingLabel5;
    private JTextField jcomp8;
    private JButton jcomp10;
    private JSlider jcomp11;


    public ComboBox() {
        Recipes recipes = new Recipes();
        ArrayList<Recipes> recipeArray = new ArrayList<>();
        HashMap<Integer, String> ingredientMap = new HashMap<>();
        recipes.addStuff(recipeArray, ingredientMap);

        //construct preComponents
        String[] jcomp1Items = {"Item 1", "Item 2", "Item 3"};
        Recipes[] jcompRecipeIngredients = {recipeArray.get(0),recipeArray.get(1)};


        //construct components
        jcomp1 = new JComboBox<Object>(jcompRecipeIngredients);

        jcomp1.addActionListener(e -> {
            JComboBox cb = (JComboBox) e.getSource();
            Object item = cb.getSelectedItem();
            if (item.toString().equals("Spectral Flask of Power")){
                ingLabel1.setText(ingredientMap.get(1));
                ingLabel2.setText(ingredientMap.get(2));
                ingLabel3.setText(ingredientMap.get(3));
                ingLabel4.setText(ingredientMap.get(0));
            }

            if (item.toString().equals("Potion 2")){
                ingLabel1.setText(ingredientMap.get(4));
            }

        });

        jTextField1 = new JTextField(5);
        jcomp3 = new JTextField(5);
        jcomp4 = new JTextField(5);
        jcomp8 = new JTextField(5);
        ingLabel1 = new JLabel("newLabel");
        ingLabel2 = new JLabel("newLabel");
        ingLabel3 = new JLabel("newLabel");
        ingLabel4 = new JLabel("newLabel");
        ingLabel5 = new JLabel("newLabel");
        jcomp10 = new JButton("Calculate");
        jcomp11 = new JSlider(0, 50);

        //set components properties
        jcomp11.setOrientation(JSlider.HORIZONTAL);
        jcomp11.setMinorTickSpacing(50);
        jcomp11.setMajorTickSpacing(10);
        jcomp11.setPaintTicks(true);
        jcomp11.setPaintLabels(true);

        //adjust size and set layout
        setPreferredSize(new Dimension(944, 574));
        setLayout(null);

        //add components
        add(jcomp1);
        add(jTextField1);
        add(jcomp3);
        add(jcomp4);
        add(ingLabel1);
        add(ingLabel2);
        add(ingLabel3);
        add(ingLabel4);
        add(ingLabel5);
        add(jcomp8);
        add(jcomp10);
        add(jcomp11);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds(50, 55, 100, 25);
        jTextField1.setBounds(180, 110, 100, 25);
        jcomp3.setBounds(180, 150, 100, 25);
        jcomp4.setBounds(180, 190, 100, 25);
        ingLabel1.setBounds(55, 110, 100, 25);
        ingLabel2.setBounds(55, 150, 100, 25);
        ingLabel3.setBounds(55, 190, 100, 25);
        ingLabel4.setBounds(55, 230, 100, 25);
        ingLabel5.setBounds(55, 270, 100, 25);
        jcomp8.setBounds(180, 290, 100, 25);
        jcomp10.setBounds(55, 350, 100, 25);
        jcomp11.setBounds(180, 25, 500, 60);
    }


    public void comboBox() {
        JFrame frame = new JFrame("MyPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ComboBox());
        frame.pack();
        frame.setVisible(true);

        System.out.println();
    }

}