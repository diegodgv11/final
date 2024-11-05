/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.machine.pfinal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Properties;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/** @author diegodgv11 */
public class JPanelDatePicker extends JPanel {

  private JDatePickerImpl datePicker;

  public JPanelDatePicker() {
    this.setLayout(new BorderLayout());
    Locale.setDefault(new Locale("es", "ES"));

    var model = new UtilDateModel();
    Properties p = new Properties();
    p.put("text.today", "Hoy");
    p.put("text.month", "Mes");
    p.put("text.year", "Año");
    var datePanel = new JDatePanelImpl(model, p);
    datePicker =
        new JDatePickerImpl(
            datePanel,
            new JFormattedTextField.AbstractFormatter() {
              private final String datePattern = "yyyy-MM-dd";
              private final SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

              @Override
              public Object stringToValue(String text) throws ParseException {
                return dateFormatter.parse(text);
              }

              @Override
              public String valueToString(Object value) throws ParseException {
                if (value == null) return "";

                Calendar cal = (Calendar) value;
                return dateFormatter.format(cal.getTime());
              }
            });

    datePicker.setPreferredSize(new Dimension(200, 32));

    JFormattedTextField textField = datePicker.getJFormattedTextField();
    textField.setFont(new java.awt.Font("sansserif", 0, 18));
    textField.setBackground(new Color(70, 73, 75));

    datePicker.getComponent(0).setPreferredSize(new Dimension(200, 32));
    datePicker.getComponent(1).setPreferredSize(new Dimension(32, 32)); // boton

    this.add(datePicker);
  }

  public void setText(String text) {
    JFormattedTextField textField = datePicker.getJFormattedTextField();
    textField.setText(text);
  }

  public String getText() {
    JFormattedTextField textField = datePicker.getJFormattedTextField();
    return textField.getText();
  }
}
