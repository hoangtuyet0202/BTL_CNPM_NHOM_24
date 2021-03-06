/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.thongke;

import com.dao.IDongGopDAO;
import com.dao.IHoKhauDAO;
import com.dao.ITheLoaiDongGopDAO;
import com.dao.IThuPhiDAO;
import com.dao.impl.DongGopDAO;
import com.dao.impl.HoKhauDAO;
import com.dao.impl.TheLoaiDongGopDAO;
import com.dao.impl.ThuPhiDAO;
import com.model.DongGopModel;
import com.model.TheLoaiDongGopModel;
import com.model.ThuPhiModel;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VITQUAY
 */
public class jpThongKe extends javax.swing.JPanel {

    ITheLoaiDongGopDAO tldao = new TheLoaiDongGopDAO();
    IDongGopDAO dgdao = new DongGopDAO();
    IThuPhiDAO tpdao = new ThuPhiDAO();
    IHoKhauDAO hkdao = new HoKhauDAO();
    DefaultTableModel tableModel;
    List<DongGopModel> dgList = new ArrayList<>();
    DefaultTableModel tableModel2;
    List<ThuPhiModel> tpList = new ArrayList<>();
    Vector<TheLoaiDongGopModel> vcbb =  tldao.findTL((ArrayList<TheLoaiDongGopModel>) tldao.findAll());
    
    /**
     * Creates new form jpThongKe
     */
    NumberFormat chuyentien = new DecimalFormat("#,###,###");
    SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
    public jpThongKe() {
        initComponents();
        fillCbb();
        tableModel = (DefaultTableModel) tblDG.getModel();
        tableModel2 = (DefaultTableModel) tblTP.getModel();
        fillTableDongGop(0);
        fillTableThuPhi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void fillCbb() {
        //tldao = new TheLoaiDongGopDAO();
        //Vector vcbb = tldao.findAll();
        if (vcbb != null) {
            DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel(vcbb);
            cbbTheloaiDG.setModel(cbbmodel);
        } else {
            JOptionPane.showMessageDialog(null, "Không có thể loại đóng góp nào !");
        }
    }
    public void fillTableDongGop(int ma) {
        if(ma == 0) dgList = dgdao.findAll();
        else dgList = dgdao.findByTheLoai(ma);
        tableModel.setRowCount(0);
        int tongtien =0;
        int tonghodadong =0;
        for(DongGopModel dg:dgList) {
            String tenHK = hkdao.findByMa(dg.getMaHoKhau()).getTenHK();
            String tenTL = tldao.findByMa(dg.getMaTheLoaiDG()).getTenTheLoaiDG();
            tongtien+= dg.getSoTienDG();
            tonghodadong++;
            //tonghodadong += dg.ge
            tableModel.addRow(new Object[]{dg.getMaDongGop(), tenHK, chuyentien.format(dg.getSoTienDG()), tenTL, sf.format(dg.getNgayDG()), dg.getGhiChu()});
        }
        lblTienDG.setText(chuyentien.format(tongtien)+" VNĐ");
        lblHoDG.setText(String.valueOf(tonghodadong));
    }
    
    public void fillTableThuPhi() {
        tpList = tpdao.findAll();
        tableModel2.setRowCount(0);
        int tongtien =0;
        int tonghothuphi =0;
        for(ThuPhiModel tp: tpList) {
            String tenHK = hkdao.findByMa(tp.getMaHoKhau()).getTenHK();
            tongtien += tp.getSoTien();
            tonghothuphi++;
            tableModel2.addRow(new Object[] {tp.getMaThuPhi(), tenHK, chuyentien.format(tp.getSoTien()),sf.format(tp.getNgayThuPhi())});
        }
        lblTienTP.setText(chuyentien.format(tongtien)+" VNĐ");
        lblHoTP.setText(String.valueOf(tonghothuphi));
    }
    
    public void fillByDate() {
        Date d1 = dateChooser1.getSelectedDate().getTime();
        Date d2 = dateChooser2.getSelectedDate().getTime();
        String s1 = String.format("%1$tY-%1$tm-%1$td", d1);
        String s2 = String.format("%1$tY-%1$tm-%1$td", d2);  
        tpList = tpdao.findByDate(s1, s2);
        tableModel2.setRowCount(0);
        int tongtien =0;
        int tonghothuphi =0;
        for(ThuPhiModel tp: tpList) {
            String tenHK = hkdao.findByMa(tp.getMaHoKhau()).getTenHK();
            tongtien += tp.getSoTien();
            tonghothuphi++;
            tableModel2.addRow(new Object[] {tp.getMaThuPhi(), tenHK, chuyentien.format(tp.getSoTien()),sf.format(tp.getNgayThuPhi())});
        }
        lblTienTP.setText(chuyentien.format(tongtien)+" VNĐ");
        lblHoTP.setText(String.valueOf(tonghothuphi));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbbTheloaiDG = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTKTP = new javax.swing.JButton();
        dateChooser1 = new datechooser.beans.DateChooserCombo();
        dateChooser2 = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDG = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTP = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTienDG = new javax.swing.JLabel();
        lblHoDG = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblTienTP = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblHoTP = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        setPreferredSize(new java.awt.Dimension(1200, 450));

        jLabel1.setText("Thống kê tiền đóng góp");

        cbbTheloaiDG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbTheloaiDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTheloaiDGActionPerformed(evt);
            }
        });

        jLabel2.setText("Thống kê tiền thu phí");

        jLabel3.setText("Từ ngày");

        jLabel4.setText("Đến ngày");

        btnTKTP.setBackground(new java.awt.Color(204, 255, 204));
        btnTKTP.setText("Thống kê");
        btnTKTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKTPActionPerformed(evt);
            }
        });

        dateChooser1.setCurrentView(new datechooser.view.appearance.AppearancesList("custom",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 11),
                    new java.awt.Color(0, 51, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooser1.setCalendarBackground(new java.awt.Color(133, 140, 148));
    dateChooser1.setLocale(new java.util.Locale("vi", "VN", ""));
    dateChooser1.setNavigateFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11));
    dateChooser1.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_PERIOD);

    dateChooser2.setCurrentView(new datechooser.view.appearance.AppearancesList("custom",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 11),
                new java.awt.Color(0, 51, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
dateChooser2.setCalendarBackground(new java.awt.Color(133, 140, 148));
dateChooser2.setLocale(new java.util.Locale("vi", "VN", ""));
dateChooser2.setNavigateFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11));
dateChooser2.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_PERIOD);

tblDG.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
    },
    new String [] {
        "Mã Đóng Góp", "Tên Hộ Khẩu", "Số Tiền", "Tên Thể Loại ĐG", "Ngày Đóng Góp", "Ghi Chú"
    }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane1.setViewportView(tblDG);

    tblTP.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Mã Thu Phí", "Tên Hộ Khẩu", "Số Tiền ", "Ngày Thu"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane2.setViewportView(tblTP);

    jLabel5.setText("Tổng Số Tiền Đóng Góp: ");

    jLabel6.setText("Số Hộ Đóng Góp: ");

    lblTienDG.setText("...");

    lblHoDG.setText("...");

    jLabel12.setText("Tổng Số Tiền Thu Phí: ");

    lblTienTP.setText("...");

    jLabel14.setText("Số Hộ Đã Đóng: ");

    lblHoTP.setText("...");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(cbbTheloaiDG, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(312, 312, 312)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnTKTP)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTienDG, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                .addComponent(lblHoDG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(0, 440, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel14))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTienTP, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(lblHoTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(19, 19, 19))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbbTheloaiDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTKTP, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(25, 25, 25)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGap(28, 28, 28)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(lblTienDG)
                .addComponent(jLabel12)
                .addComponent(lblTienTP))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(lblHoDG)
                .addComponent(jLabel14)
                .addComponent(lblHoTP))
            .addGap(58, 58, 58))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void cbbTheloaiDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTheloaiDGActionPerformed
        TheLoaiDongGopModel selected = (TheLoaiDongGopModel) cbbTheloaiDG.getSelectedItem();
        fillTableDongGop(selected.getMaTheLoaiDG());
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTheloaiDGActionPerformed

    private void btnTKTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKTPActionPerformed
        if(dateChooser1.getText().isEmpty() || dateChooser2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Bạn cần chọn ngày để thống kê !");
            return;
        }
        fillByDate();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTKTPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTKTP;
    private javax.swing.JComboBox<String> cbbTheloaiDG;
    private datechooser.beans.DateChooserCombo dateChooser1;
    private datechooser.beans.DateChooserCombo dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHoDG;
    private javax.swing.JLabel lblHoTP;
    private javax.swing.JLabel lblTienDG;
    private javax.swing.JLabel lblTienTP;
    private javax.swing.JTable tblDG;
    private javax.swing.JTable tblTP;
    // End of variables declaration//GEN-END:variables
}
