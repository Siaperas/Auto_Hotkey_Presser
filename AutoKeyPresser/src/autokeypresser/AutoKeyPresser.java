package autokeypresser;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import lc.kra.system.keyboard.GlobalKeyboardHook;
import lc.kra.system.keyboard.event.GlobalKeyAdapter;
import lc.kra.system.keyboard.event.GlobalKeyEvent;
import java.util.concurrent.TimeUnit;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Copyright 2017 Pavlos Siaperas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class AutoKeyPresser extends javax.swing.JFrame {

    //varibales instantiation and initialization
    private static boolean running = false;
    private static int between = 300;
    private static int between2 = 300;
    private static int pick = 112;
    private static int pick2 = 112;
    private static int index;
    private static boolean sequence = false;
    private static int count = 0;
    private static Thread t2;
    public static GlobalKeyboardHook keyboardHook;
    private static KeyboardMap km = new KeyboardMap();
    private static Map<Integer, String> map = km.mapmethod();
    private static Robot r;
    private static int times = 1;
    private static int times2 = 1;
    private static Object[][] tableData;
    private static int nRow;
    private static int nCol;

    /**
     * Creates new form NewJFrame
     */
    public AutoKeyPresser() {
        initComponents();

    }

    //initialize GUI components
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClickGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        KeybordSetButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        StartSequenceButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        MouseClickButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LeftClick = new javax.swing.JRadioButton();
        MiddleClick = new javax.swing.JRadioButton();
        RightClick = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AutoKey Presser");
        setIconImage(img.getImage());
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dtm = new DefaultTableModel(0, 0);
        String header[] = new String[] { "#", "Key Pressed"};

        // add header in table model
        dtm.setColumnIdentifiers(header);
        jTable1.setModel(dtm);
        jTable1.setToolTipText("");
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Time between presses");

        jLabel4.setText("milliseconds");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(300, 10, 1316134911, 1));
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner1.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinner1, ""));
        jSpinner1.setFocusable(false);
        jSpinner1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(65, 65, 65))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        JFormattedTextField txt = ((JSpinner.NumberEditor) jSpinner1.getEditor()).getTextField();
        ((NumberFormatter) txt.getFormatter()).setAllowsInvalid(false);
        NumberFormatter formatter = (NumberFormatter) txt.getFormatter();
        DecimalFormat decimalFormat = new DecimalFormat("0"); formatter.setFormat(decimalFormat);
        formatter.setAllowsInvalid(false);
        jSpinner1.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                between = (int) ((JSpinner) e.getSource()).getValue();

            }
        });

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setToolTipText("");
        jPanel3.setPreferredSize(new java.awt.Dimension(126, 82));

        jLabel2.setText("Play Sequence");
        jLabel2.setAlignmentX(0.5F);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        KeybordSetButton.setText("Set");
        KeybordSetButton.setFocusable(false);
        KeybordSetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeybordSetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KeybordSetButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KeybordSetButton))
                .addGap(26, 26, 26))
        );

        jComboBox1.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(126, 82));

        jLabel1.setText("Create Sequence");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        StartSequenceButton.setText("Start");
        StartSequenceButton.setDefaultCapable(false);
        StartSequenceButton.setFocusable(false);
        StartSequenceButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StartSequenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartSequenceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StartSequenceButton)
                    .addComponent(jLabel1))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartSequenceButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1410065407, 1));
        jSpinner2.setFocusable(false);
        jSpinner2.setRequestFocusEnabled(false);

        jLabel5.setText("times");

        jLabel11.setText("Repeat");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(8, 8, 8)))
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33))
        );

        JFormattedTextField txt2 = ((JSpinner.NumberEditor) jSpinner2.getEditor()).getTextField();
        ((NumberFormatter) txt2.getFormatter()).setAllowsInvalid(false);
        NumberFormatter formatter2 = (NumberFormatter) txt2.getFormatter();
        formatter2.setFormat(decimalFormat);
        formatter2.setAllowsInvalid(false);
        jSpinner2.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                times = (int) ((JSpinner) e.getSource()).getValue();

            }
        });

        ClearButton.setText("Clear");
        ClearButton.setDefaultCapable(false);
        ClearButton.setFocusable(false);
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );

        jPanel3.setLayout(new GridBagLayout());
        GridBagConstraints gBC2 = new GridBagConstraints();

        gBC2.weightx = 0.5;
        gBC2.gridwidth = 2;

        gBC2.gridx = 0;
        gBC2.gridy = 0;

        jPanel3.add(jLabel2, gBC2);

        gBC2.weightx = 0.5;
        gBC2.gridwidth = 1;
        gBC2.gridx = 0;
        gBC2.gridy = 1;
        jPanel3.add(jComboBox1, gBC2);
        gBC2.weightx = 0.5;
        gBC2.gridwidth = 1;
        gBC2.gridx = 1;
        gBC2.gridy = 1;
        jPanel3.add(KeybordSetButton, gBC2);
        jPanel2.setLayout(new GridBagLayout());
        GridBagConstraints gBC = new GridBagConstraints();

        gBC.weightx = 0.5;
        gBC.gridx = 0;
        gBC.gridy = 0;

        jPanel2.add(jLabel1, gBC);

        gBC.weightx = 0.0;
        gBC.gridwidth = 3;
        gBC.gridx = 0;
        gBC.gridy = 1;
        jPanel2.add(StartSequenceButton, gBC);

        jTabbedPane1.addTab("Keyboard", jPanel1);

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Time between presses");

        jLabel7.setText("milliseconds");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(300, 10, 1316134911, 1));
        jSpinner3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner3.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinner3, ""));
        jSpinner3.setFocusable(false);
        jSpinner3.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(63, 63, 63))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        JFormattedTextField txt3 = ((JSpinner.NumberEditor) jSpinner3.getEditor()).getTextField();
        ((NumberFormatter) txt3.getFormatter()).setAllowsInvalid(false);
        NumberFormatter formatter3 = (NumberFormatter) txt3.getFormatter();
        formatter3.setAllowsInvalid(false);
        jSpinner3.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                between2 = (int) ((JSpinner) e.getSource()).getValue();

            }
        });

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setToolTipText("");
        jPanel8.setPreferredSize(new java.awt.Dimension(126, 82));

        jLabel8.setText("Play Sequence");
        jLabel8.setAlignmentX(0.5F);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        MouseClickButton.setText("Set");
        MouseClickButton.setFocusable(false);
        MouseClickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MouseClickButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MouseClickButton)
                .addGap(69, 69, 69))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MouseClickButton))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1410065407, 1));
        jSpinner4.setFocusable(false);
        jSpinner4.setRequestFocusEnabled(false);

        jLabel9.setText("times");

        jLabel12.setText("Repeat");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JFormattedTextField txt4 = ((JSpinner.NumberEditor) jSpinner4.getEditor()).getTextField();
        ((NumberFormatter) txt4.getFormatter()).setAllowsInvalid(false);
        NumberFormatter formatter4 = (NumberFormatter) txt4.getFormatter();
        formatter4.setFormat(decimalFormat);
        formatter4.setAllowsInvalid(false);

        jSpinner4.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                times2 = (int) ((JSpinner) e.getSource()).getValue();

            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autokeypresser/mouse.png"))); // NOI18N

        LeftClick.setText("Left Click");

        MiddleClick.setText("Middle Click");

        RightClick.setText("Right Click");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeftClick)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(MiddleClick)
                    .addComponent(RightClick))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(LeftClick)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MiddleClick)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RightClick)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        ClickGroup.add(LeftClick);
        LeftClick.setSelected(true);
        ClickGroup.add(MiddleClick);
        MiddleClick.setSelected(false);
        ClickGroup.add(RightClick);
        RightClick.setSelected(false);

        jTabbedPane1.addTab("Mouse", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ChangeListener changeListener = new ChangeListener() {
            public void stateChanged(ChangeEvent changeEvent) {
                JTabbedPane sourceTabbedPane = (JTabbedPane) changeEvent.getSource();
                index = sourceTabbedPane.getSelectedIndex();
                System.out.println("Tab changed to: " + sourceTabbedPane.getTitleAt(index));
                System.out.println(index);

            }
        };
        jTabbedPane1.addChangeListener(changeListener);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Clear the input of keys
    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        dtm.setRowCount(0);
        count = 0;
    }//GEN-LAST:event_ClearButtonActionPerformed
    //Start and stop the sequence of characters
    private void StartSequenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartSequenceButtonActionPerformed
        if (sequence) {
            sequence = false;
            StartSequenceButton.setText("Start");
        } else {
            sequence = true;
            StartSequenceButton.setText("Stop");

        }
    }//GEN-LAST:event_StartSequenceButtonActionPerformed
    //Set keyboard characters that is needed to be pressed in order to play the keyboard sequence
    private void KeybordSetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeybordSetButtonActionPerformed
        String var = (String) jComboBox1.getSelectedItem();
        switch (var) {
            case "F1":
                pick = 112;
                break;
            case "F2":
                pick = 113;
                break;
            case "F3":
                pick = 114;
                break;
            case "F4":
                pick = 115;
                break;
            case "F5":
                pick = 116;
                break;
            case "F6":
                pick = 117;
                break;
            case "F7":
                pick = 118;
                break;
            case "F8":
                pick = 119;
                break;
            case "F9":
                pick = 120;
                break;
            case "F10":
                pick = 121;
                break;
            case "F11":
                pick = 122;
                break;
            case "F12":
                pick = 123;
                break;
            case "0":
                pick = 48;
                break;
            case "1":
                pick = 49;
                break;
            case "2":
                pick = 50;
                break;
            case "3":
                pick = 51;
                break;
            case "4":
                pick = 52;
                break;
            case "5":
                pick = 53;
                break;
            case "6":
                pick = 54;
                break;
            case "7":
                pick = 55;
                break;
            case "8":
                pick = 56;
                break;
            case "9":
                pick = 57;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_KeybordSetButtonActionPerformed
    //Set keyboard characters that is needed to be pressed in order to play the mouse sequence
    private void MouseClickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MouseClickButtonActionPerformed
        String var = (String) jComboBox2.getSelectedItem();
        switch (var) {
            case "F1":
                pick2 = 112;
                break;
            case "F2":
                pick2 = 113;
                break;
            case "F3":
                pick2 = 114;
                break;
            case "F4":
                pick2 = 115;
                break;
            case "F5":
                pick2 = 116;
                break;
            case "F6":
                pick2 = 117;
                break;
            case "F7":
                pick2 = 118;
                break;
            case "F8":
                pick2 = 119;
                break;
            case "F9":
                pick2 = 120;
                break;
            case "F10":
                pick2 = 121;
                break;
            case "F11":
                pick2 = 122;
                break;
            case "F12":
                pick2 = 123;
                break;
            case "0":
                pick2 = 48;
                break;
            case "1":
                pick2 = 49;
                break;
            case "2":
                pick2 = 50;
                break;
            case "3":
                pick2 = 51;
                break;
            case "4":
                pick2 = 52;
                break;
            case "5":
                pick2 = 53;
                break;
            case "6":
                pick2 = 54;
                break;
            case "7":
                pick2 = 55;
                break;
            case "8":
                pick2 = 56;
                break;
            case "9":
                pick2 = 57;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_MouseClickButtonActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoKeyPresser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //image icons
        img = new ImageIcon("C:\\Users\\123\\Documents\\NetBeansProjects\\AutoKeyPresser\\img\\Keyboard.png");
        img2 = new ImageIcon("C:\\Users\\123\\Documents\\NetBeansProjects\\AutoKeyPresser\\img\\Keyboard.png");
        //create thread running in the background to make GUI visible
        Thread t1 = new Thread() {
            @Override
            public void run() {
                new AutoKeyPresser().setVisible(true);
            }
        };

        t1.start();
        //create a keyboardHook from library "System hook"
        keyboardHook = new GlobalKeyboardHook();
        //get the map that maps key integers to their keyboard representations
        km = new KeyboardMap();
        Map<Integer, String> map = km.mapmethod();
        //add key listener that adds the keys pressed to the sequence
        keyboardHook.addKeyListener(new GlobalKeyAdapter() {
            @Override

            public void keyPressed(GlobalKeyEvent event) {

                if (sequence) {
                    count++;
                    dtm.addRow(new Object[]{count, map.get(event.getVirtualKeyCode())});

                } else if (!sequence && event.getVirtualKeyCode() == pick && index == 0) {

                    nRow = dtm.getRowCount();
                    nCol = dtm.getColumnCount();
                    tableData = new Object[nRow][nCol];
                    for (int i = 0; i < nRow; i++) {
                        for (int j = 0; j < nCol; j++) {
                            tableData[i][j] = dtm.getValueAt(i, j);
                        }
                    }
                    //use class RobotPresses
                    RobotPresses rp = new RobotPresses(tableData, between, pick);
                    int i = 0;
                    while (i < times) {
                        rp.run();
                        i++;
                    }
                    
                    //check if screen is at the mouse index so that a certain amount of mouse clicks is pressed
                } else if (event.getVirtualKeyCode() == pick2 && index == 1) {
                    int i = 0;
                    while (i < times2) {
                        Robot bot = null;
                        try {
                            bot = new Robot();
                        } catch (Exception failed) {
                            System.err.println("Failed instantiating Robot: " + failed);
                        }
                        System.out.println("check");
                        int mask = 0;
                        if(LeftClick.isSelected()){
                            mask = InputEvent.BUTTON1_DOWN_MASK;
                        }
                        else if(RightClick.isSelected()){
                            mask = InputEvent.BUTTON3_DOWN_MASK;
                        }
                        else if(MiddleClick.isSelected()){
                            mask = InputEvent.BUTTON2_DOWN_MASK;
                        }                        
                        bot.mousePress(mask);                       
                        bot.mouseRelease(mask);
                        try {
                            TimeUnit.MILLISECONDS.sleep(between2);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(AutoKeyPresser.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        i++;
                    }
                }
            }

            @Override
            public void keyReleased(GlobalKeyEvent event) {

            }
        });

    }
    //checks if the key matches
    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }
    private static ImageIcon img2;
    private static ImageIcon img;
    private static DefaultTableModel dtm;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.ButtonGroup ClickGroup;
    private javax.swing.JButton KeybordSetButton;
    private static javax.swing.JRadioButton LeftClick;
    private static javax.swing.JRadioButton MiddleClick;
    private javax.swing.JButton MouseClickButton;
    private static javax.swing.JRadioButton RightClick;
    private javax.swing.JButton StartSequenceButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
