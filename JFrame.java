/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author johan
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
        List<Pessoa> lsPessoas = new LinkedList();
        List<SalaEvento> lsEventos = new LinkedList();
        List<SalaEvento> nlsEventos = new LinkedList();
        List<SalaCafe> lsCafe = new LinkedList();
        List<SalaCafe> nlsCafe = new LinkedList();
        
    public JFrame() {
        initComponents();
       
        
        
        
        //vvvvvvvvvvv Descomente a sessão abaixo para fazer a inicialização padrão de elementos e salas
        /*
        
        SalaEvento s1 = new SalaEvento("Sala1", 100);
        SalaEvento s2 = new SalaEvento("Sala2", 100);
        SalaEvento s3 = new SalaEvento("Sala3", 100);
        SalaEvento s4 = new SalaEvento("Sala4", 100);
        lsEventos.add(s1);
        lsEventos.add(s2);
        lsEventos.add(s3);
        lsEventos.add(s4);
        
        SalaCafe c1 =new SalaCafe("cafe1", 100);
        SalaCafe c2 =new SalaCafe("cafe2", 100);
        lsCafe.add(c1);
        lsCafe.add(c2);
        
        Pessoa p1 = new Pessoa("a", "sb1");
        Pessoa p2 = new Pessoa("a", "sb1");
        Pessoa p3 = new Pessoa("aaa", "sb3");
        Pessoa p4 = new Pessoa("aaaa", "sb4");
        Pessoa p5 = new Pessoa("aaaaa", "sb5");
        Pessoa p6 = new Pessoa("ab", "sb6");
        Pessoa p7 = new Pessoa("abb", "sb7");
        Pessoa p8 = new Pessoa("abbb", "sb8");
        Pessoa p9 = new Pessoa("abbbb", "sb9");
        Pessoa p10 = new Pessoa("abbbbb", "sb10");
        Pessoa p11 = new Pessoa("abc", "sb11");
        Pessoa p12 =new Pessoa("abcc", "sb12");
        lsPessoas.add(p1);
        lsPessoas.add(p2);
        lsPessoas.add(p3);
        lsPessoas.add(p4);
        s1.adicionaPessoa(p1);
        s1.adicionaPessoa(p2);
        s1.adicionaPessoa(p3);
        s1.adicionaPessoa(p4);
        c1.Adicionar(p1);
        c1.Adicionar(p2);
        c1.Adicionar(p3);
        c1.Adicionar(p4);
        
        lsPessoas.add(p5);
        lsPessoas.add(p6);
        lsPessoas.add(p7);
        s2.adicionaPessoa(p5);
        s2.adicionaPessoa(p6);
        s2.adicionaPessoa(p7);
        c1.Adicionar(p5);
        c1.Adicionar(p6);
        c1.Adicionar(p7);
        
        
        lsPessoas.add(p8);
        lsPessoas.add(p9);
        s3.adicionaPessoa(p8);
        s3.adicionaPessoa(p9);
        c2.Adicionar(p8);
        c2.Adicionar(p9);
        
        
        lsPessoas.add(p10);
        lsPessoas.add(p11);
        lsPessoas.add(p12);
        s4.adicionaPessoa(p10);
        s4.adicionaPessoa(p11);
        s4.adicionaPessoa(p12);
        c2.Adicionar(p10);
        c2.Adicionar(p11);
        c2.Adicionar(p12);
        
        
        */
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cadastro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Nome");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("Sobrenome");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoas", "Sala de eventos", "Sala de café" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(115, 115, 115))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList2.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(jList2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoas", "Salas de Café", "Salas de Eventos" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pesquisar");
        jButton2.setDefaultCapable(false);
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Definir Lugares ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jList3);

        jScrollPane4.setViewportView(jList4);

        jLabel5.setText("1 Tempo");

        jLabel6.setText("2º Tempo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String[] args) {
        
        JFrame j1 = new JFrame();
        j1.setVisible(true);
          
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String temp;
        String temp2;
        temp = jTextField1.getText();
        temp2 = jTextField2.getText();
        
        if(jComboBox2.getSelectedItem()=="Pessoas"){    //CAso esteja selecionado Pessoas no combo box 2
            Pessoa p = new Pessoa(temp, temp2);    //cria uma nova pessoa com nome e sobrenome
            int indexPessoas = lsPessoas.size();   //Vê a quantidadede pessoas
            lsPessoas.add(p);                      //Põe a pessoa na lsita de pessoas
            int IndexEventos = lsEventos.size();   //Vê a quantidade de salas de eventos
            if(IndexEventos==0){
                System.out.println("Tentativa de criação de pessoas sem salas criadas");
            }else{
                int i = lsEventos.size();
                int i2 = lsCafe.size();
                int cont;
                int Min=100000000;
                SalaEvento SalaeCerta = new SalaEvento();
                SalaCafe SalacCerta = new SalaCafe();
                for(cont=0;cont<i;cont++){
                    SalaEvento tempsala = lsEventos.get(cont);
                
                    if(tempsala.getQpessoas()<Min){
                        Min = tempsala.getQpessoas();
                        SalaeCerta = tempsala;
                    }                
                }
                Min=100000000;
                for(cont=0;cont<i2;cont++){
                    SalaCafe tempsala = lsCafe.get(cont);
                
                    if(tempsala.MostraQPessoas()<Min){
                        Min = tempsala.MostraQPessoas();
                        SalacCerta = tempsala;
                    }                
                }
                
                SalaeCerta.adicionaPessoa(p);
                SalacCerta.Adicionar(p);
                System.out.println("Pessoa criada\n");
            }
            
        }
        
        if(jComboBox2.getSelectedItem()=="Sala de eventos"){
            int lot=0;
            try {
                lot = Integer.parseInt(jTextField2.getText());
                SalaEvento Se = new SalaEvento(temp, lot);
                lsEventos.add(Se);
                System.out.println("Sala de eventos criada");
            } catch (Exception e) {
                System.out.println("Favor digitar uma lotação válida");
            }
        }
        if(jComboBox2.getSelectedItem()=="Sala de café"){
            int lot=0;
            try {
                lot = Integer.parseInt(jTextField2.getText());
                SalaCafe Sc = new SalaCafe(temp,lot);
                lsCafe.add(Sc);
                System.out.println("Sala de cafe criada");
            } catch (Exception e) {
                System.out.println("Favor digitar uma lotação válida");
            }
        }
        
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    //^^^^^^^^^^Botão de criação^^^^^^^^^^^^
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        
        if(jComboBox1.getSelectedItem()=="Pessoas"){
            int i=0;
            i = lsPessoas.size();
            String[] str =new String[i];
            int cont;
            Pessoa p;
            for(cont=0;cont<i;cont++){
                p = lsPessoas.get(cont);
                str[cont] = p.getSobrenome()+", "+p.getNome();
                
            }
            jList2.setListData(str);
            jButton3.setEnabled(true);
        }
        if(jComboBox1.getSelectedItem()=="Salas de Eventos"){
            int i=0;
            i = lsEventos.size();
            String[] str =new String[i];
            int cont;
            SalaEvento p;
            for(cont=0;cont<i;cont++){
                p = lsEventos.get(cont);
                str[cont] = p.getNome();
                
            }
            jList2.setListData(str);
            jButton3.setEnabled(true);
        }
        if(jComboBox1.getSelectedItem()=="Salas de Café"){
            int i=0;
            i = lsCafe.size();
            String[] str =new String[i];
            int cont;
            SalaCafe p;
            for(cont=0;cont<i;cont++){
                p = lsCafe.get(cont);
                str[cont] = p.getNome();
                
            }
            jList2.setListData(str);
            jButton3.setEnabled(true);
        }
        //jButton3.setEnabled(false);
    }//GEN-LAST:event_jComboBox1ActionPerformed
    //^^^^^^^^Limpador da segunda aba^^^^^^^^^^^^
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedItem()=="Pessoas"){
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField1.setText("nome");
            jTextField2.setText("Sobrenome");
        }
        if(jComboBox2.getSelectedItem()=="Sala de eventos"){
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField1.setText("nome");
            jTextField2.setText("Lotação");
        }
        if(jComboBox2.getSelectedItem()=="Sala de café"){
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField1.setText("nome");
            jTextField2.setText("Lotação");
        }
        
        
    }//GEN-LAST:event_jComboBox2ActionPerformed
    //^^^^^^^^Selecionador da criação^^^^^^^^^^^^^^^^^^
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i = jList2.getSelectedIndex();
        
        if(jComboBox1.getSelectedItem()=="Pessoas"){     //
            Pessoa p = lsPessoas.get(i);
            int temp = lsEventos.size();
            int TCafe = lsCafe.size();
            
            int cont;
            int resp=0;
            int nresp=0;
            for(cont=0;cont<temp;cont++){
                int cont2;
                if(!nlsEventos.isEmpty()){
                    SalaEvento nse = nlsEventos.get(cont);
                    List<Pessoa> nlist = new LinkedList();
                    nlist = nse.getLs();
                    int t = nlist.size();
                    for(cont2=0;cont2<t;cont2++){
                        if(nlist.get(cont2)==p){
                           nresp = cont;
                        }
                    }
                    
                }
                SalaEvento se = lsEventos.get(cont);
                List<Pessoa> list = new LinkedList();
                list = se.getLs();
                
                int temp2 = list.size();
                for(cont2=0;cont2<temp2;cont2++){
                    if(list.get(cont2)==p){
                        resp=cont;
                    }
                }
                
            } 
            String[] str = new String[2];
            SalaEvento se = lsEventos.get(resp);
            SalaEvento nse = nlsEventos.get(nresp);
            str[0]= se.getNome();
            str[1]= nse.getNome();
            jList3.setListData(str);
            int respc=0;
            int nrespc=-1;
            for(cont=0;cont<TCafe;cont++){
                int cont2;
                SalaCafe sc = new SalaCafe();
                
                
                sc = lsCafe.get(cont);
                List<Pessoa> ls = new LinkedList();
                ls = sc.getL1();
                int temp2 = ls.size();
                for(cont2=0;cont2<temp2;cont2++){
                    if(ls.get(cont2)==p){
                        respc = cont;
                    }
                }
                
                 
                sc = nlsCafe.get(cont);
                ls = sc.getL1();
                temp2 = ls.size();
                for(cont2=0;cont2<temp2;cont2++){
                    if(ls.get(cont2)==p){
                        nrespc = cont;
                        
                    }
                }
                
                
            }
            String[] nstr = new String[2];
            SalaCafe c = lsCafe.get(respc);
            SalaCafe nc = nlsCafe.get(nrespc);
            nstr[0] =  c.getNome();
            nstr[1] = nc.getNome();
            jList4.setListData(nstr);
            
        }
        //////////////////////////////////////////////////////////////////////////////
        if(jComboBox1.getSelectedItem()=="Salas de Eventos"){
            SalaEvento e = lsEventos.get(i);
            List<Pessoa> list = new LinkedList();
            list = e.getLs();
            int t = e.getQpessoas();
            int t2;
            String[] str = new String[t];
            for(t2=0;t2<t;t2++){
                Pessoa p2 = list.get(t2);
                str[t2] = p2.getSobrenome()+", "+p2.getNome();
            }
            
            int nindx = nlsEventos.size() - 1;
            nindx = nindx - i;
            SalaEvento ne = nlsEventos.get(nindx);
            List<Pessoa> nlist = ne.getLs();
            t = ne.getQpessoas();
            String[] str2 = new String[t];
            for(t2=0;t2<t;t2++){
                Pessoa p2 = nlist.get(t2);
                str2[t2] = p2.getSobrenome()+", "+p2.getNome();
            }
            
            jList3.setListData(str);
            jList4.setListData(str2);
            
        }
        //////////////////////////////////////////////////////////////////////////
        if(jComboBox1.getSelectedItem()=="Salas de Café"){
            SalaCafe e = lsCafe.get(i);
            List<Pessoa> list = new LinkedList();
            list = e.getL1();
            int r = e.MostraQPessoas();
            int r2;
            String[] str = new String[r];
            for(r2=0;r2<r;r2++){
                Pessoa p3 = list.get(r2);
                str[r2] = p3.getSobrenome()+", "+p3.getNome();
            }
            
            int nindx = nlsCafe.size() - 1;
            nindx = nindx - i;
            SalaCafe nc = nlsCafe.get(nindx);
            List<Pessoa> nlist = nc.getL1();
            int t;
            int t2;
            t = nc.MostraQPessoas();
            String[] str2 = new String[t];
            for(t2=0;t2<t;t2++){
                Pessoa p2 = nlist.get(t2);
                str2[t2] = p2.getSobrenome()+", "+p2.getNome();
            }
            
            jList3.setListData(str);
            jList4.setListData(str2);
            
        }
        //////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_jButton2ActionPerformed
    //^^^^^^^^^^^^Botão de Pesquisar^^^^^^
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int i = lsEventos.size();
        int i2 = lsCafe.size();
        int cont;
        for(cont=i-1;cont>=0;cont--){
            SalaEvento temp = lsEventos.get(cont);
            SalaEvento n = new SalaEvento(temp.getNome(), temp.getLotacao());
            nlsEventos.add(n);
        }
        for(cont=i2-1;cont>=0;cont--){
            SalaCafe temp = lsCafe.get(cont);
            SalaCafe n = new SalaCafe(temp.getNome(), temp.getLotação());
            nlsCafe.add(n);
        }
        
        i=lsPessoas.size();
        for(cont=0;cont<i;cont++){
            Pessoa n = lsPessoas.get(cont);
            int temp = nlsEventos.size();
            int temp2 = nlsCafe.size();
            int cont2;
            int min = 100000000;
            int SalaeCerta=0;
            SalaEvento e;
            for(cont2=0;cont2<temp;cont2++){
                e = nlsEventos.get(cont2);
                if(e.getQpessoas()<min){
                    min = e.getQpessoas();
                    SalaeCerta = cont2;
                }
            }
            e = nlsEventos.get(SalaeCerta);
            e.adicionaPessoa(lsPessoas.get(cont));
            
            min = 100000000;
            int SalacCerta=0;
            SalaCafe c;
            for(cont2=0;cont2<temp2;cont2++){
                c = nlsCafe.get(cont2);
                if(c.MostraQPessoas()<min){
                    min = c.MostraQPessoas();
                    SalacCerta = cont2;
                }
            }
            c = nlsCafe.get(SalacCerta);
            c.Adicionar(lsPessoas.get(cont));
        }
        jButton2.setEnabled(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed
    //^^^^^^^^^^^^^Botão para formar as listas de segundo tempo^^^^^^^^^^^^^^^^^^^^
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
