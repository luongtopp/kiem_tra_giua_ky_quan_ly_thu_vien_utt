/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import DAO.UserDAO;
import Model.Sach;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luongtopp
 */
public class QuanLy extends javax.swing.JPanel {

    public QuanLy() {
        initComponents();
        hienThiBangSach();

    }

    private void hienThiBangSach() {
        DefaultTableModel model = (DefaultTableModel) tblSach.getModel();
        model.setRowCount(0);
        for (Sach item : new UserDAO().timSach()) {
            model.addRow(new Object[]{
                item.getMaSach(),
                item.getTenSach(),
                item.getTenTheLoai(),
                item.getTenNhaXuatBan(),
                item.getNgayNhap(),
                item.getGiaTien()});
        }
             
    }




@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dateChooser2 = new com.raven.datechooser.DateChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlQuanLySach = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        cboTheLoai = new javax.swing.JComboBox<>();
        lblTenSach = new javax.swing.JLabel();
        lblTheLoai = new javax.swing.JLabel();
        lblNgayNhap = new javax.swing.JLabel();
        lblGiaTien = new javax.swing.JLabel();
        lblGiaTien1 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        txtNgayNhap = new javax.swing.JTextField();
        cboNhaXuatBan = new javax.swing.JComboBox<>();
        txtGiaTien = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnThemSach = new javax.swing.JButton();
        btnHuySach = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        pnlTheLoai = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblTenSach1 = new javax.swing.JLabel();
        txtTenTheLoai = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnThemTheLoai = new javax.swing.JButton();
        btnHuyTheLoai = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTheLoai = new javax.swing.JTable();
        pnlNhaXuatBan = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lblTenSach2 = new javax.swing.JLabel();
        txtTenNhaXuatBan = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        btnThemNhaXuatBan = new javax.swing.JButton();
        btnHuyNhaXuatBan = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNhaXuatBan = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        dateChooser2.setTextRefernce(txtNgayNhap);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        cboTheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel5.add(cboTheLoai, gridBagConstraints);

        lblTenSach.setText("Tên sách");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel5.add(lblTenSach, gridBagConstraints);

        lblTheLoai.setText("Ngày nhập");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel5.add(lblTheLoai, gridBagConstraints);

        lblNgayNhap.setText("Thể loại");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel5.add(lblNgayNhap, gridBagConstraints);

        lblGiaTien.setText("Giá tiền");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel5.add(lblGiaTien, gridBagConstraints);

        lblGiaTien1.setText("Nhà xuất bản");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel5.add(lblGiaTien1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel5.add(txtTenSach, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel5.add(txtNgayNhap, gridBagConstraints);

        cboNhaXuatBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel5.add(cboNhaXuatBan, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel5.add(txtGiaTien, gridBagConstraints);

        btnThemSach.setText("Thêm");

        btnHuySach.setText("Hủy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnHuySach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnThemSach))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemSach)
                    .addComponent(btnHuySach)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        jPanel5.add(jPanel1, gridBagConstraints);

        jPanel7.setLayout(new java.awt.BorderLayout());

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Thể loại", "Nhà xuất bản", "Ngày nhập", "Giá"
            }
        ));
        jScrollPane1.setViewportView(tblSach);

        jPanel7.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnlQuanLySachLayout = new javax.swing.GroupLayout(pnlQuanLySach);
        pnlQuanLySach.setLayout(pnlQuanLySachLayout);
        pnlQuanLySachLayout.setHorizontalGroup(
            pnlQuanLySachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuanLySachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuanLySachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlQuanLySachLayout.setVerticalGroup(
            pnlQuanLySachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuanLySachLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý sách", pnlQuanLySach);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        lblTenSach1.setText("Tên thể loại");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel6.add(lblTenSach1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel6.add(txtTenTheLoai, gridBagConstraints);

        btnThemTheLoai.setText("Thêm");

        btnHuyTheLoai.setText("Hủy");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 317, Short.MAX_VALUE)
                .addComponent(btnHuyTheLoai)
                .addGap(18, 18, 18)
                .addComponent(btnThemTheLoai))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemTheLoai)
                    .addComponent(btnHuyTheLoai)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel6.add(jPanel8, gridBagConstraints);

        jPanel9.setLayout(new java.awt.BorderLayout());

        tblTheLoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã thể loại", "Tên thể loại"
            }
        ));
        jScrollPane2.setViewportView(tblTheLoai);

        jPanel9.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnlTheLoaiLayout = new javax.swing.GroupLayout(pnlTheLoai);
        pnlTheLoai.setLayout(pnlTheLoaiLayout);
        pnlTheLoaiLayout.setHorizontalGroup(
            pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTheLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTheLoaiLayout.setVerticalGroup(
            pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTheLoaiLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Thể loại", pnlTheLoai);

        jPanel10.setLayout(new java.awt.GridBagLayout());

        lblTenSach2.setText("Nhà xuất bản");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel10.add(lblTenSach2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel10.add(txtTenNhaXuatBan, gridBagConstraints);

        btnThemNhaXuatBan.setText("Thêm");

        btnHuyNhaXuatBan.setText("Hủy");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 317, Short.MAX_VALUE)
                .addComponent(btnHuyNhaXuatBan)
                .addGap(18, 18, 18)
                .addComponent(btnThemNhaXuatBan))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNhaXuatBan)
                    .addComponent(btnHuyNhaXuatBan)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        jPanel10.add(jPanel11, gridBagConstraints);

        jPanel12.setLayout(new java.awt.BorderLayout());

        tblNhaXuatBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã nhà xuất bản", "Tên nhà xuất bản"
            }
        ));
        jScrollPane3.setViewportView(tblNhaXuatBan);

        jPanel12.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnlNhaXuatBanLayout = new javax.swing.GroupLayout(pnlNhaXuatBan);
        pnlNhaXuatBan.setLayout(pnlNhaXuatBanLayout);
        pnlNhaXuatBanLayout.setHorizontalGroup(
            pnlNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhaXuatBanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlNhaXuatBanLayout.setVerticalGroup(
            pnlNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhaXuatBanLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nhà xuất bản", pnlNhaXuatBan);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 873, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý tài khoản", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyNhaXuatBan;
    private javax.swing.JButton btnHuySach;
    private javax.swing.JButton btnHuyTheLoai;
    private javax.swing.JButton btnThemNhaXuatBan;
    private javax.swing.JButton btnThemSach;
    private javax.swing.JButton btnThemTheLoai;
    private javax.swing.JComboBox<String> cboNhaXuatBan;
    private javax.swing.JComboBox<String> cboTheLoai;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblGiaTien;
    private javax.swing.JLabel lblGiaTien1;
    private javax.swing.JLabel lblNgayNhap;
    private javax.swing.JLabel lblTenSach;
    private javax.swing.JLabel lblTenSach1;
    private javax.swing.JLabel lblTenSach2;
    private javax.swing.JLabel lblTheLoai;
    private javax.swing.JPanel pnlNhaXuatBan;
    private javax.swing.JPanel pnlQuanLySach;
    private javax.swing.JPanel pnlTheLoai;
    private javax.swing.JTable tblNhaXuatBan;
    private javax.swing.JTable tblSach;
    private javax.swing.JTable tblTheLoai;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtTenNhaXuatBan;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTenTheLoai;
    // End of variables declaration//GEN-END:variables
}
