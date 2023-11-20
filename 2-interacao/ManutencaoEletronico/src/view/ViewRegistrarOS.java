package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.SQLException;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import controller.Controladora;

import database.ConectException;

import java.sql.Date;

/**
 *
 * @author mendv
 */
public class ViewRegistrarOS extends javax.swing.JFrame {
	
	Controladora control = new Controladora();

    
private void mensagemDeErro(String titulo, String mensagem) {
    JDialog dialog = new JDialog();
    dialog.setTitle(titulo);
    dialog.setModal(true);
    dialog.setPreferredSize(new Dimension(400, 120));

    JPanel panel = new JPanel();
    panel.setBackground(new Color(0xF16C6D));
    panel.setLayout(new BorderLayout());

    JLabel label = new JLabel(mensagem);
    label.setForeground(Color.WHITE);
    label.setHorizontalAlignment(SwingConstants.CENTER); // Centralize o texto horizontalmente
    label.setVerticalAlignment(SwingConstants.CENTER); // Centralize o texto verticalmente
    label.setOpaque(true);
    label.setBackground(new Color(0xf16c6d));

    panel.add(label, BorderLayout.CENTER);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
    buttonPanel.setBackground(new Color(0xF16C6D));

    JButton okButton = new JButton("OK");
    okButton.setBackground(new Color(0x7f1718));
    okButton.setForeground(Color.WHITE);
    okButton.addActionListener(e -> dialog.dispose());
    okButton.setFocusable(false);
    okButton.setBorder(new BevelBorder(BevelBorder.RAISED));
    okButton.setPreferredSize(new Dimension(50, 30));
    
    buttonPanel.add(okButton);

    panel.add(buttonPanel, BorderLayout.SOUTH);

    dialog.add(panel);
    dialog.pack();
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
}

private void mensagemDeSucesso(String titulo, String mensagem) {
    JDialog dialog = new JDialog();
    dialog.setTitle(titulo);
    dialog.setModal(true);
    dialog.setPreferredSize(new Dimension(400, 120));

    JPanel panel = new JPanel();
    panel.setBackground(new Color(0xF16C6D));
    panel.setLayout(new BorderLayout());

    JLabel label = new JLabel(mensagem);
    label.setForeground(Color.WHITE);
    label.setHorizontalAlignment(SwingConstants.CENTER); // Centralize o texto horizontalmente
    label.setVerticalAlignment(SwingConstants.CENTER); // Centralize o texto verticalmente
    label.setOpaque(true);
    label.setBackground(new Color(0x62d47c));

    panel.add(label, BorderLayout.CENTER);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
    buttonPanel.setBackground(new Color(0x62d47c));

    JButton okButton = new JButton("OK");
    okButton.setBackground(new Color(0x009367));
    okButton.setForeground(Color.WHITE);
    okButton.addActionListener(e -> dialog.dispose());
    okButton.setFocusable(false);
    okButton.setBorder(new BevelBorder(BevelBorder.RAISED));
    okButton.setPreferredSize(new Dimension(50, 30));
    
    buttonPanel.add(okButton);

    panel.add(buttonPanel, BorderLayout.SOUTH);

    dialog.add(panel);
    dialog.pack();
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
}
    /**
     * Creates new form viewRegistrarOs
     */
    public ViewRegistrarOS() {
        initComponents();
        
        // Chama função para focar no painelBranco ao iniciar
        setFocusOnPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBranco = new javax.swing.JPanel();
        painelVerde = new javax.swing.JPanel();
        funcao = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        gerenciarEletronico = new javax.swing.JButton();
        gerenciarCliente = new javax.swing.JButton();
        historicoOs = new javax.swing.JButton();
        telefone = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        serie = new javax.swing.JTextField();
        dataInicio = new javax.swing.JTextField();
        reclamacao = new javax.swing.JTextField();
        analiseTecnico = new javax.swing.JTextField();
        tecnico = new javax.swing.JComboBox<>();
        valorManutencao = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        finalizar = new javax.swing.JButton();
        nomeCliente = new javax.swing.JTextField();
        buscaCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manutenção de Eletrônicos");

        painelBranco.setBackground(new java.awt.Color(255, 255, 255));

        painelVerde.setBackground(new java.awt.Color(0, 147, 103));

        funcao.setBackground(new java.awt.Color(0, 106, 68));
        funcao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        funcao.setForeground(new java.awt.Color(255, 255, 255));
        funcao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        funcao.setText("RECEPCIONISTA");
        funcao.setBorder(null);
        funcao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        funcao.setRequestFocusEnabled(false);

        jTextField1.setBackground(new java.awt.Color(0, 106, 68));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("JURACI A. DOS ANJOS");
        jTextField1.setBorder(null);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1.setRequestFocusEnabled(false);

        gerenciarEletronico.setBackground(new java.awt.Color(255, 200, 58));
        gerenciarEletronico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        gerenciarEletronico.setText("GERENCIAR ELETRÔNICO");
        gerenciarEletronico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gerenciarEletronico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerenciarEletronico.setFocusable(false);
        gerenciarEletronico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerenciarEletronicoMouseClicked(evt);
            }
        });

        gerenciarCliente.setBackground(new java.awt.Color(255, 200, 58));
        gerenciarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        gerenciarCliente.setText("GERENCIAR CLIENTE");
        gerenciarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gerenciarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerenciarCliente.setFocusable(false);
        gerenciarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerenciarClienteMouseClicked(evt);
            }
        });

        historicoOs.setBackground(new java.awt.Color(255, 200, 58));
        historicoOs.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        historicoOs.setText("HISTÓRICO DE OS'S");
        historicoOs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        historicoOs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historicoOs.setFocusable(false);
        historicoOs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historicoOsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelVerdeLayout = new javax.swing.GroupLayout(painelVerde);
        painelVerde.setLayout(painelVerdeLayout);
        painelVerdeLayout.setHorizontalGroup(
            painelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(painelVerdeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gerenciarEletronico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(gerenciarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historicoOs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelVerdeLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(funcao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelVerdeLayout.setVerticalGroup(
            painelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVerdeLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(funcao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(gerenciarEletronico, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gerenciarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(historicoOs, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telefone.setBackground(new java.awt.Color(217, 217, 217));
        telefone.setForeground(new java.awt.Color(153, 153, 153));
        telefone.setText("TELEFONE*");
        telefone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        telefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefoneFocusLost(evt);
            }
        });

        id.setEditable(false);
        id.setBackground(new java.awt.Color(194, 213, 236));
        id.setForeground(new java.awt.Color(102, 102, 102));
        id.setText("ID");
        id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        id.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        id.setRequestFocusEnabled(false);

        serie.setBackground(new java.awt.Color(217, 217, 217));
        serie.setForeground(new java.awt.Color(153, 153, 153));
        serie.setText("SÉRIE*");
        serie.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        serie.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                serieFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                serieFocusLost(evt);
            }
        });

        dataInicio.setBackground(new java.awt.Color(217, 217, 217));
        dataInicio.setForeground(new java.awt.Color(153, 153, 153));
        dataInicio.setText("DATA DE INÍCIO*");
        dataInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dataInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataInicioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataInicioFocusLost(evt);
            }
        });

        reclamacao.setBackground(new java.awt.Color(193, 214, 190));
        reclamacao.setForeground(new java.awt.Color(153, 153, 153));
        reclamacao.setText("Reclamação do cliente*");
        reclamacao.setToolTipText("");
        reclamacao.setActionCommand("<Not Set>");
        reclamacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        reclamacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reclamacaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                reclamacaoFocusLost(evt);
            }
        });

        analiseTecnico.setBackground(new java.awt.Color(193, 214, 190));
        analiseTecnico.setForeground(new java.awt.Color(153, 153, 153));
        analiseTecnico.setText("Análise do técnico");
        analiseTecnico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        analiseTecnico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                analiseTecnicoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                analiseTecnicoFocusLost(evt);
            }
        });
        
        tecnico.setBackground(new java.awt.Color(217, 217, 217));
        tecnico.setForeground(new java.awt.Color(153, 153, 153));
        tecnico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TÉCNICO*", "Vinicius Gonçalves", "Catarina Alabim", "Bruno Watanabe" , "asaasas" }));
        tecnico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tecnico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        valorManutencao.setBackground(new java.awt.Color(217, 217, 217));
        valorManutencao.setForeground(new java.awt.Color(153, 153, 153));
        valorManutencao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valorManutencao.setText("VALOR DA MANUTENÇÃO");
        valorManutencao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        valorManutencao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valorManutencaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valorManutencaoFocusLost(evt);
            }
        });

        status.setBackground(new java.awt.Color(255, 200, 58));
        status.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        status.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        status.setText("STATUS");
        status.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        status.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        status.setRequestFocusEnabled(false);

        finalizar.setBackground(new java.awt.Color(116, 201, 114));
        finalizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        finalizar.setForeground(new java.awt.Color(255, 255, 255));
        finalizar.setText("Finalizar");
        finalizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        finalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        finalizar.setFocusable(false);
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
            
           
        });
        
        finalizar.addActionListener(e -> {
            if (valorManutencao.getText().equals("VALOR DA MANUTENÇÃO")) {
                Float manutencaoValor = 0.0f; // Defina manutencaoValor como 0
                try {
                    control.RegistrarOS(0, dataInicio.getText(), reclamacao.getText(), 
                            analiseTecnico.getText(), status.getText(), null, manutencaoValor);
                } catch (SQLException | ConectException e1) {
                    e1.printStackTrace();
                }
            } else {
                Float manutencaoValor = Float.valueOf(valorManutencao.getText());
                try {
                    control.RegistrarOS(0, dataInicio.getText(), reclamacao.getText(), 
                            analiseTecnico.getText(), status.getText(), null, manutencaoValor);
                } catch (SQLException | ConectException e1) {
                    e1.printStackTrace();
                }
            }


        });

        nomeCliente.setBackground(new java.awt.Color(194, 213, 236));
        nomeCliente.setForeground(new java.awt.Color(102, 102, 102));
        nomeCliente.setText("NOME DO CLIENTE");
        nomeCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nomeCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nomeCliente.setRequestFocusEnabled(false);

        buscaCliente.setBackground(new java.awt.Color(229, 229, 229));
        buscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("lupa.png"))); // NOI18N
        buscaCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscaCliente.setFocusPainted(false);
        buscaCliente.setFocusable(false);
        
        buscaCliente.addActionListener( e-> {
        	
        	try {
				nomeCliente.setText(control.buscaCliente(telefone.getText()));
			} catch (ConectException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	 
        });

        javax.swing.GroupLayout painelBrancoLayout = new javax.swing.GroupLayout(painelBranco);
        painelBranco.setLayout(painelBrancoLayout);
        painelBrancoLayout.setHorizontalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addComponent(painelVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addComponent(tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valorManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(finalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelBrancoLayout.createSequentialGroup()
                                .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(serie))
                            .addComponent(nomeCliente))
                        .addGap(18, 18, 18)
                        .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id)
                            .addComponent(dataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addComponent(reclamacao)
                    .addComponent(analiseTecnico))
                .addGap(39, 39, 39))
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id)
                    .addComponent(nomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataInicio)
                    .addComponent(serie, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBrancoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(reclamacao, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(analiseTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tecnico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(valorManutencao)
                    .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(finalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefoneFocusLost
        // TODO add your handling code here:
        if (telefone.getText().equals("")) {
            telefone.setText("TELEFONE*");
            telefone.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_telefoneFocusLost

    private void telefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefoneFocusGained
        // TODO add your handling code here:
        if (telefone.getText().equals("TELEFONE*")) {
            telefone.setText("");
            telefone.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_telefoneFocusGained

    private void serieFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serieFocusGained
        // TODO add your handling code here:
        if (serie.getText().equals("SÉRIE*")) {
            serie.setText("");
            serie.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_serieFocusGained

    private void serieFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serieFocusLost
        // TODO add your handling code here:
        if (serie.getText().equals("")) {
            serie.setText("SÉRIE*");
            serie.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_serieFocusLost

    private void dataInicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataInicioFocusGained
        // TODO add your handling code here:
        if (dataInicio.getText().equals("DATA DE INÍCIO*")) {
            dataInicio.setText("");
            dataInicio.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_dataInicioFocusGained

    private void dataInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataInicioFocusLost
        // TODO add your handling code here:
        if (dataInicio.getText().equals("")) {
            dataInicio.setText("DATA DE INÍCIO*");
            dataInicio.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_dataInicioFocusLost

    private void reclamacaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reclamacaoFocusGained
        // TODO add your handling code here:
        if (reclamacao.getText().equals("Reclamação do cliente*")) {
            reclamacao.setText("");
            reclamacao.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_reclamacaoFocusGained

    private void reclamacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reclamacaoFocusLost
        // TODO add your handling code here:
        if (reclamacao.getText().equals("")) {
            reclamacao.setText("Reclamação do cliente*");
            reclamacao.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_reclamacaoFocusLost

    private void analiseTecnicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_analiseTecnicoFocusGained
        // TODO add your handling code here:
        if (analiseTecnico.getText().equals("Análise do técnico")) {
            analiseTecnico.setText("");
            analiseTecnico.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_analiseTecnicoFocusGained

    private void analiseTecnicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_analiseTecnicoFocusLost
        // TODO add your handling code here:
        if (analiseTecnico.getText().equals("")) {
            analiseTecnico.setText("Análise do técnico");
            analiseTecnico.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_analiseTecnicoFocusLost

    private void valorManutencaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorManutencaoFocusGained
        // TODO add your handling code here:
        if (valorManutencao.getText().equals("VALOR DA MANUTENÇÃO")) {
            valorManutencao.setText("");
            valorManutencao.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_valorManutencaoFocusGained

    private void valorManutencaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorManutencaoFocusLost
        // TODO add your handling code here:
        if (valorManutencao.getText().equals("")) {
            valorManutencao.setText("VALOR DA MANUTENÇÃO");
            valorManutencao.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_valorManutencaoFocusLost

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        // TODO add your handling code here:
        
    	if (telefone.getText().equals("TELEFONE*")) {
        mensagemDeErro("OCORREU UM ERRO", "TELEFONE NÃO PREENCHIDO");
        }
        if (serie.getText().equals("SÉRIE*")) {
        mensagemDeErro("OCORREU UM ERRO", "SÉRIE NÃO PREENCHIDA");
        }
        if (dataInicio.getText().equals("DATA DE INÍCIO*")) {
        mensagemDeErro("OCORREU UM ERRO", "DATA DE INÍCIO NÃO PREENCHIDA");
        }
        if (reclamacao.getText().equals("Reclamação do cliente*")) {
        mensagemDeErro("OCORREU UM ERRO", "RECLAMAÇÃO DO CLIENTE NÃO PREENCHIDA");
        }
        if ("TÉCNICO*".equals(tecnico.getSelectedItem())) {
        mensagemDeErro("OCORREU UM ERRO", "TÉCNICO NÃO SELECIONADO");
        } else {
        // Se todas as validações passarem, altere o status para "EM ANÁLISE"
        status.setText("EM ANÁLISE");
        mensagemDeSucesso("", "OS REGISTRADA COM SUCESSO");
        
        painelBranco.requestFocusInWindow(); // Para não voltar para a tela com foco em qualquer outro elemento
        
        telefone.setText("TELEFONE*");
        telefone.setForeground(new Color(153, 153, 153));
        serie.setText("SÉRIE*");
        serie.setForeground(new Color(153, 153, 153));
        dataInicio.setText("DATA DE INÍCIO*");
        dataInicio.setForeground(new Color(153, 153, 153));
        reclamacao.setText("Reclamação do cliente*");
        reclamacao.setForeground(new Color(153, 153, 153));
        analiseTecnico.setText("Análise do técnico");
        analiseTecnico.setForeground(new Color(153, 153, 153));
        tecnico.setSelectedIndex(0);
        valorManutencao.setText("VALOR DA MANUTENÇÃO");
        valorManutencao.setForeground(new Color(153, 153, 153));
        status.setText("STATUS");
    }
    }//GEN-LAST:event_finalizarActionPerformed

    private void gerenciarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarClienteMouseClicked
        // TODO add your handling code here:
        mensagemDeErro("AVISO", "EM CONSTRUÇÃO");
    }//GEN-LAST:event_gerenciarClienteMouseClicked

    private void historicoOsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historicoOsMouseClicked
        // TODO add your handling code here:
        mensagemDeErro("AVISO", "EM CONSTRUÇÃO");
    }//GEN-LAST:event_historicoOsMouseClicked

    private void gerenciarEletronicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarEletronicoMouseClicked
        // TODO add your handling code here:
        mensagemDeErro("AVISO", "EM CONSTRUÇÃO");
    }//GEN-LAST:event_gerenciarEletronicoMouseClicked

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewRegistrarOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRegistrarOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRegistrarOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRegistrarOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewRegistrarOS().setVisible(true);
        });
    }

    private void setFocusOnPanel() {
        // Define o foco no painel branco em vez da caixa de telefone
        painelBranco.requestFocusInWindow();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField analiseTecnico;
    private javax.swing.JButton buscaCliente;
    private javax.swing.JTextField dataInicio;
    private javax.swing.JButton finalizar;
    private javax.swing.JTextField funcao;
    private javax.swing.JButton gerenciarCliente;
    private javax.swing.JButton gerenciarEletronico;
    private javax.swing.JButton historicoOs;
    private javax.swing.JTextField id;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JPanel painelBranco;
    private javax.swing.JPanel painelVerde;
    private javax.swing.JTextField reclamacao;
    private javax.swing.JTextField serie;
    private javax.swing.JTextField status;
    private javax.swing.JComboBox<String> tecnico;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField valorManutencao;
    // End of variables declaration//GEN-END:variables

    private Color newColor(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
