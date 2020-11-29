package cafe_menu;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cafe_Menu extends javax.swing.JFrame {
    
    // Setup the sides items and prices into arrays.
    String[] sides = {
    "Sweet Potato Fries (Bowl) $6.5",
    "Sweet Potato Fries (Bowl) NM $9.5",
    "Chips (Bowl) $5.0",
    "Chips (Bowl) NM $8.0",
    "Wedges (Bowl) $6.5",
    "Wedges (Bowl) NM $9.5",
    "Side Salad $5.0",
    "Side Salad NM $8.0"};
    String[] sides_description = {
    "\nServed with tomato relish.\n",
    "\nServed with tomato relish.\n",
    "\nServed with aioli, tomato sauce and barbeque sause.\n",
    "\nServed with aioli, tomato sauce and barbeque sause.\n",
    "\nServe with sweet chilli sauce and sauce cream.\n",
    "\nServe with sweet chilli sauce and sauce cream.\n",
    "",
    ""};
    double[] sides_prices = {6.5, 9.5, 5.0, 8.0, 6.5, 9.5, 5.0, 8.0};
    
    // Setup the Pizza items and prices into arrays.
    String[] pizza = {
    "Tropicana Pizza $10.0",
    "Tropicana Pizza NM $13.0",
    "BBQ Meat Lovers Pizza $16.0",
    "BBQ Meat Lovers Pizza NM $19.0",
    "Pepperoni Pizza $9.0",
    "Pepperoni Pizza NM $12.0",
    "Chicken Mushroom & Brie Pizza $14.0",
    "Chicken Mushroom & Brie Pizza NM $17.0",
    "Garlic Pizza $8.0",
    "Garlic PizzaNM $11.0",
    "Slow-Roasted Lamb Pizza $12.0",
    "Slow-Roasted Lamb Pizza NM $15.0",
    "Green Pizza $12.0",
    "Green Pizza NM $15.0"};
    
    String[] pizza_description = {
    "\nHam and pieapple served on a tomato base with mozzerella cheese.\n",
    "\nHam and pieapple served on a tomato base with mozzerella cheese.\n",
    "\nBeef, bacon, ham, pepperoni, spanish onion, cherry tomatoes and mozzerella cheese.\n",
    "\nBeef, bacon, ham, pepperoni, spanish onion, cherry tomatoes and mozzerella cheese.\n",
    "\nTomato base, chilli flakes, pepperoni, spinach and mezzerella cheese.\n",
    "\nTomato base, chilli flakes, pepperoni, spinach and mezzerella cheese.\n",
    "\nTomato base, chicken, mushroom, spinach, brie and mozzerella cheese.\n",
    "\nTomato base, chicken, mushroom, spinach, brie and mozzerella cheese.\n",
    "\nConfit garlic, mozzerella cheese, rosemary topped woth smoked salt.\n",
    "\nConfit garlic, mozzerella cheese, rosemary topped woth smoked salt.\n",
    "\nTomato base with slow-roated lamb, rocket, sumac, tzatzki and mozzerella cheese.\n",
    "\nTomato base with slow-roated lamb, rocket, sumac, tzatziki and mozzerella cheese.\n",
    "\nBasil pesto base topped woth rocket, broccoli, green olives and bocconcini.\n",
    "\nBasil pesto base topped woth rocket, broccoli, green olives and bocconcini.\n"};
    double[] pizza_prices = {10.0, 13.0, 16.0, 19.0, 9.0, 12.0, 14.0, 17.0, 8.0, 11.0, 12.0, 15.0, 12.0, 15.0};
    
    // Setup the Pizza items and prices into arrays.
    String[] burger = {
    "Wagyu Burger $16.5",
    "Wagyu Burger NM $19.5",
    "Cheese Burger $10.0",
    "Cheese Burger NM $13.0",
    "Halloumi Burger $10.0",
    "Halloumi Burger NM $13.0",
    "Steak Sandwich $18.5",
    "Steak Sandwich NM $21.5",
    "Chicken Wrap $9.9",
    "Chicken Wrap $12.9"};
    
    String[] burger_description = {
    "\nWagyu beef, bacon, tomato mesculin, beetroot and aioli on a lightly toasted brioche bun, served with chips.\n",
    "\nWagyu beef, bacon, tomato mesculin, beetroot and aioli on a lightly toasted brioche bun, served with chips.\n",
    "\nMilk bun topped with a beef patty, cheese, tomato and mustard served with chips.\n",
    "Milk bun topped with a beef patty, cheese, tomato and mustard served with chips.\n",
    "\nMilk bun topped with rocket, halloumi, egg and tomato relish served with chips.\n",
    "\nMilk bun topped with rocket, halloumi, egg and tomato relish served with chips.\n",
    "\n120g rib fillet steck with caramelised onion, lettuce, cheese, tomato,\nbeetroot and barbeque sauce on a toasted sandwich ciabatta, served with chips.\n",
    "\n120g rib fillet steck with caramelised onion, lettuce, cheese, tomato,\nbeetroot and barbeque sauce on a toasted sandwich ciabatta, served with chips.\n",
    "\nCouthern chicken tenders wrapped in soft tortilla with sweet chilli aioli lettuce, cheese,\ntomato and carrot, served with chips.\n",
    "\nCouthern chicken tenders wrapped in soft tortilla with sweet chilli aioli lettuce, cheese,\ntomato and carrot, served with chips.\n"};
    double[] burger_prices = {16.5, 19.5, 10.0, 13.0, 10.0, 13.0, 18.5, 21.5, 9.9, 12.9};
    
    double total_price = 0.0;
    ArrayList<String> order_items = new ArrayList<>();// ArrayList used to hold the items added by the custemer
    String category = "pizza";
    
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();// To center the frame take screen dimentions

    public Cafe_Menu() {
        initComponents();
        //Center the Jframe into the midle of the screen
        this.setLocation((dim.width/2 - this.getSize().width/2), (dim.height/2 - this.getSize().height/2));
        quatity_combo.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }
        ));
        t_number_combo.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }
        ));
        set_item_menu("pizza"); // initialize the item combo with pizza items
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_name_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        add_btn = new javax.swing.JButton();
        pizza_btn = new javax.swing.JButton();
        burger_btn = new javax.swing.JButton();
        sides_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        description_txt_area = new javax.swing.JTextArea();
        quatity_combo = new javax.swing.JComboBox<>();
        items_combo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        order_text_area = new javax.swing.JTextArea();
        submit_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        t_number_combo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setText("Customer Name:");

        jLabel2.setText("Table ID:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Welcome to Cafe Menu");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));

        jLabel4.setText("Category:");

        jLabel5.setText("Item:");

        jLabel6.setText("Description:");

        jLabel7.setText("Quantity:");

        add_btn.setBackground(new java.awt.Color(153, 0, 0));
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        pizza_btn.setBackground(new java.awt.Color(153, 0, 0));
        pizza_btn.setForeground(new java.awt.Color(255, 255, 255));
        pizza_btn.setText("Pizza");
        pizza_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizza_btnActionPerformed(evt);
            }
        });

        burger_btn.setBackground(new java.awt.Color(153, 0, 0));
        burger_btn.setForeground(new java.awt.Color(255, 255, 255));
        burger_btn.setText("Burgers");
        burger_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burger_btnActionPerformed(evt);
            }
        });

        sides_btn.setBackground(new java.awt.Color(153, 0, 0));
        sides_btn.setForeground(new java.awt.Color(255, 255, 255));
        sides_btn.setText("Sides");
        sides_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sides_btnActionPerformed(evt);
            }
        });

        description_txt_area.setColumns(20);
        description_txt_area.setRows(5);
        jScrollPane1.setViewportView(description_txt_area);

        quatity_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        items_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Your Order:");

        order_text_area.setColumns(20);
        order_text_area.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        order_text_area.setRows(5);
        jScrollPane2.setViewportView(order_text_area);

        submit_btn.setBackground(new java.awt.Color(153, 0, 0));
        submit_btn.setForeground(new java.awt.Color(255, 255, 255));
        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        reset_btn.setBackground(new java.awt.Color(153, 0, 0));
        reset_btn.setForeground(new java.awt.Color(255, 255, 255));
        reset_btn.setText("Reset");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });

        t_number_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel3)))
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sides_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(burger_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pizza_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(t_number_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(items_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quatity_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(45, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(t_number_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pizza_btn)
                                    .addComponent(items_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(burger_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sides_btn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quatity_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(add_btn)))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_btn)
                    .addComponent(reset_btn))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Handle the add button click
    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        //Find the selected item and price of the item
        double price_of_item = 0.0;
        String description_of_item = "";
        if( "pizza".equals(category)){
            price_of_item = pizza_prices[items_combo.getSelectedIndex()];
            description_of_item = pizza_description[items_combo.getSelectedIndex()];
        } else if ("burger".equals(category)){
            price_of_item = burger_prices[items_combo.getSelectedIndex()];
            description_of_item = burger_description[items_combo.getSelectedIndex()];
        } else {
            price_of_item = sides_prices[items_combo.getSelectedIndex()];
            description_of_item = sides_description[items_combo.getSelectedIndex()];
        }
        double price_dish = Integer.parseInt(quatity_combo.getSelectedItem().toString()) * price_of_item;
        String dish = items_combo.getSelectedItem().toString() + " Quantity: " + 
                quatity_combo.getSelectedItem().toString() + " = " +"$"+ price_dish + " "+ description_txt_area.getText() + description_of_item +"\n";
        
        order_items.add(dish);
        total_price += price_dish;
        /*Reset to the default values after adding the dish*/
        set_item_menu("pizza"); // Set the menu item combo values with pizza items
        quatity_combo.setSelectedIndex(0);// Reset the quantity combo
        description_txt_area.setText("");// Reset the description text
        category = "pizza";// Update Category variable
        set_order_text();
        
    }//GEN-LAST:event_add_btnActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        //Validate the data before submit.
        //Check whether users entered the name and select items to the order.       
        if("".equals(c_name_txt.getText())){
            JOptionPane.showMessageDialog(null,
            "You must enter your name", "Try again...",
            JOptionPane.WARNING_MESSAGE);
        } else if("".equals(order_text_area.getText())){
            JOptionPane.showMessageDialog(null,
            "You must choose at least one dish", "Try again...",
            JOptionPane.WARNING_MESSAGE);           
        } else {
            
            try {
                FileWriter customerWriter = new FileWriter( "Orders/"+ c_name_txt.getText() + "_" + t_number_combo.getSelectedItem() + ".txt");
                customerWriter.write("\nName: " + c_name_txt.getText() + "\t\tTable ID: " + t_number_combo.getSelectedItem() + "\n\n");
                customerWriter.write(order_text_area.getText());
                customerWriter.close();
                JOptionPane.showMessageDialog(null,
                    "Your order has been completed", "Success...",
                    JOptionPane.DEFAULT_OPTION);
                reset_fields("success");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }           
        }
                
    }//GEN-LAST:event_submit_btnActionPerformed

    private void pizza_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizza_btnActionPerformed
        set_item_menu("pizza"); // Set the menu item combo values with pizza items
        quatity_combo.setSelectedIndex(0);// Reset the quantity combo
        description_txt_area.setText("");// Reset the description text
        category = "pizza";// Update Category variable
    }//GEN-LAST:event_pizza_btnActionPerformed

    private void burger_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burger_btnActionPerformed
        set_item_menu("burger"); // Set the menu item combo values with burger items
        quatity_combo.setSelectedIndex(0);// Reset the quantity combo
        description_txt_area.setText("");// Reset the description text
        category = "burger";// Update Category variable
    }//GEN-LAST:event_burger_btnActionPerformed

    private void sides_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sides_btnActionPerformed
        set_item_menu("sides"); // Set the menu item combo values with sides items
        quatity_combo.setSelectedIndex(0); // Reset the quantity combo
        description_txt_area.setText("");// Reset the description text
        category = "sides";// Update Category variable
    }//GEN-LAST:event_sides_btnActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        reset_fields("clicked");
    }//GEN-LAST:event_reset_btnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cafe_Menu().setVisible(true);
                System.out.println("Heshan");
            }
        });
    }
    
    // Functions that set the menu items accordig to the button click
    public void set_item_menu(String items){
        
        if("burger".equals(items)){
            items_combo.setModel(new javax.swing.DefaultComboBoxModel<>(
                burger
            ));
        } else if("pizza".equals(items)){
            items_combo.setModel(new javax.swing.DefaultComboBoxModel<>(
                pizza
            ));
        } else {
            items_combo.setModel(new javax.swing.DefaultComboBoxModel<>(
                sides
            ));
        }
    }
    
    //The function that set the order text and total price of the system.
    public void set_order_text(){
        String order_text = "";
        for(String s : order_items){
            order_text += s;
        }
        
        order_text += "-----------------------\n";
        order_text += "Total Price: $" + total_price;
        order_text += "\n-----------------------";
        order_text_area.setText(order_text); // Set the order string to the order text area
        
    }
    
    public void reset_fields(String clickedOrSuccess){
        set_item_menu("pizza");
        order_text_area.setText("");
        order_items.clear();//Clear the Existing order items
        quatity_combo.setSelectedIndex(0); // Reset the quantity combo
        description_txt_area.setText("");// Reset the description text
        //If the order is completed do this part as well
        if(clickedOrSuccess.equals("success")){
            c_name_txt.setText("");
            t_number_combo.setSelectedIndex(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton burger_btn;
    private javax.swing.JTextField c_name_txt;
    private javax.swing.JTextArea description_txt_area;
    private javax.swing.JComboBox<String> items_combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea order_text_area;
    private javax.swing.JButton pizza_btn;
    private javax.swing.JComboBox<String> quatity_combo;
    private javax.swing.JButton reset_btn;
    private javax.swing.JButton sides_btn;
    private javax.swing.JButton submit_btn;
    private javax.swing.JComboBox<String> t_number_combo;
    // End of variables declaration//GEN-END:variables
}
