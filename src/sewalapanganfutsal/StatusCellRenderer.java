/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sewalapanganfutsal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class StatusCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Panggil implementasi default dari parent class terlebih dahulu
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Jika nilai sel tidak kosong (null)
        if (value != null) {
            // Jika nilai sel adalah "TERSEDIA"
            if (value.toString().equalsIgnoreCase("TERSEDIA")) {
                c.setBackground(new Color(204, 255, 204)); // Latar hijau muda
                c.setForeground(new Color(0, 102, 0));     // Teks hijau tua
            } else { // Jika nilainya "SEDANG DIGUNAKAN" atau lainnya
                c.setBackground(new Color(255, 204, 204)); // Latar merah muda
                c.setForeground(new Color(153, 0, 0));      // Teks merah tua
            }
        }
        
        // Atur font agar tebal
        c.setFont(c.getFont().deriveFont(Font.BOLD));
        
        // Atur agar teks di tengah
        setHorizontalAlignment(CENTER);

        // Kembalikan komponen yang sudah diubah tampilannya
        return c;
    }
}
/**
 *
 * @author Danzeld
 */
