/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

/**
 *
 * @author mendv
 */
public class viewCancelarOS extends javax.swing.JFrame {
    
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
    okButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    okButton.setBackground(new Color(0x7f1718));
    okButton.setForeground(Color.WHITE);
    okButton.addActionListener(e -> dialog.dispose());
    okButton.setFocusable(false);
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
    okButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    okButton.setBackground(new Color(0x009367));
    okButton.setForeground(Color.WHITE);
    okButton.addActionListener(e -> dialog.dispose());
    okButton.setFocusable(false);
    okButton.setPreferredSize(new Dimension(50, 30));
    
    buttonPanel.add(okButton);

    panel.add(buttonPanel, BorderLayout.SOUTH);

    dialog.add(panel);
    dialog.pack();
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
}

private int mensagemDeConfirmacao(String titulo, String mensagem) {
    JDialog dialog = new JDialog();
    dialog.setTitle(titulo);
    dialog.setModal(true);
    dialog.setPreferredSize(new Dimension(400, 120));

    JPanel panel = new JPanel();
    panel.setBackground(new Color(0xFBB93A)); // Amarelo #fbb93a
    panel.setLayout(new BorderLayout());

    JLabel label = new JLabel(mensagem);
    label.setForeground(Color.BLACK); // Texto em preto
    label.setHorizontalAlignment(SwingConstants.CENTER); // Centralize o texto horizontalmente
    label.setVerticalAlignment(SwingConstants.CENTER); // Centralize o texto verticalmente
    label.setOpaque(true);
    label.setBackground(new Color(0xFBB93A)); // Amarelo #fbb93a

    panel.add(label, BorderLayout.CENTER);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    buttonPanel.setBackground(new Color(0xFBB93A)); // Amarelo #fbb93a
    JButton simButton = new JButton("SIM");
    simButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    simButton.setBackground(new Color(0x80270C));
    simButton.setForeground(Color.WHITE);
    simButton.addActionListener(e -> {
        dialog.dispose();
        // Adicione a lógica específica para o botão "Sim" aqui
        onSimButtonClicked();
    });
    simButton.setFocusable(false);

    simButton.setPreferredSize(new Dimension(80, 30));

    JButton naoButton = new JButton("NÃO");
    naoButton.setBackground(new Color(0x35723C));
    naoButton.setForeground(Color.WHITE);
    naoButton.addActionListener(e -> {
        dialog.dispose();
        // Adicione a lógica específica para o botão "Não" aqui
        onNaoButtonClicked();
    });
    naoButton.setFocusable(false);
    naoButton.setPreferredSize(new Dimension(80, 30));
    naoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    buttonPanel.add(naoButton); // Adiciona o botão "Não" à esquerda
    buttonPanel.add(Box.createHorizontalStrut(205));
    buttonPanel.add(simButton); // Adiciona o botão "Sim" à direita

    panel.add(buttonPanel, BorderLayout.SOUTH);

    dialog.add(panel);
    dialog.pack();
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
        return 0;
}

private void onSimButtonClicked() {
    mensagemDeSucesso("CONFIRMAÇÃO", "OS CANCELADA COM SUCESSO");
    painelAmarelo.setVisible(false);
    painelBranco.requestFocusInWindow();
    id.setText("ID OS*");
    id.setForeground(new Color(153, 153, 153));
}

private void onNaoButtonClicked() {
    // Adicione a lógica específica para o botão "Não" aqui
    painelAmarelo.setVisible(false);
    painelBranco.requestFocusInWindow();
    id.setText("ID OS*");
    id.setForeground(new Color(153, 153, 153));
    
}



    private void setFocusOnPanel() {
        // Define o foco no painel branco em vez da caixa de telefone
        painelBranco.requestFocusInWindow();
    }
    /**
     * Creates new form viewCancelarOS
     */
    public viewCancelarOS() {
        initComponents();
        
        setFocusOnPanel();
        painelAmarelo.setVisible(false);
        
    }
      
       
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        painelBranco = new javax.swing.JPanel();
        painelVerde = new javax.swing.JPanel();
        nomeFunc = new javax.swing.JTextField();
        funcao = new javax.swing.JTextField();
        gerenciarEletronico = new javax.swing.JButton();
        gerenciarCliente = new javax.swing.JButton();
        historicoOs = new javax.swing.JButton();
        cancelarOS = new javax.swing.JButton();
        registrarOS = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        buscaOS = new javax.swing.JButton();
        painelAmarelo = new javax.swing.JPanel();
        nomeCliente = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        serie = new javax.swing.JTextField();
        dataInicio = new javax.swing.JTextField();
        reclamacao = new javax.swing.JTextField();
        analiseTecnico = new javax.swing.JTextField();
        tecnico = new javax.swing.JTextField();
        confirmaCancelarOS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manutenção de Eletrônicos");

        painelBranco.setBackground(new java.awt.Color(255, 255, 255));

        painelVerde.setBackground(new java.awt.Color(0, 147, 103));
        painelVerde.setPreferredSize(new java.awt.Dimension(197, 322));

        nomeFunc.setBackground(new java.awt.Color(0, 106, 68));
        nomeFunc.setForeground(new java.awt.Color(255, 255, 255));
        nomeFunc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeFunc.setText("JURACI A. DOS ANJOS");
        nomeFunc.setBorder(null);
        nomeFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nomeFunc.setFocusable(false);
        nomeFunc.setRequestFocusEnabled(false);

        funcao.setBackground(new java.awt.Color(0, 106, 68));
        funcao.setForeground(new java.awt.Color(255, 255, 255));
        funcao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        funcao.setText("RECEPCIONISTA");
        funcao.setBorder(null);
        funcao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        funcao.setFocusable(false);
        funcao.setRequestFocusEnabled(false);

        gerenciarEletronico.setBackground(new java.awt.Color(255, 200, 58));
        gerenciarEletronico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        gerenciarEletronico.setText("GERENCIAR ELETRÔNICO");
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
        historicoOs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historicoOs.setFocusable(false);
        historicoOs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historicoOsMouseClicked(evt);
            }
        });

        cancelarOS.setBackground(new java.awt.Color(255, 200, 58));
        cancelarOS.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cancelarOS.setText("CANCELAR OS");
        cancelarOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarOS.setFocusable(false);
        cancelarOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarOSMouseClicked(evt);
            }
        });
        cancelarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarOSActionPerformed(evt);
            }
        });

        registrarOS.setBackground(new java.awt.Color(255, 200, 58));
        registrarOS.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        registrarOS.setText("REGISTRAR OS");
        registrarOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarOS.setFocusable(false);
        registrarOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarOSMouseClicked(evt);
            }
        });
        registrarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarOSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelVerdeLayout = new javax.swing.GroupLayout(painelVerde);
        painelVerde.setLayout(painelVerdeLayout);
        painelVerdeLayout.setHorizontalGroup(
            painelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVerdeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(funcao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(painelVerdeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeFunc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gerenciarEletronico, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(gerenciarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historicoOs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelarOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registrarOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelVerdeLayout.setVerticalGroup(
            painelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVerdeLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(funcao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(nomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gerenciarEletronico, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gerenciarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(historicoOs, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registrarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(cancelarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        id.setBackground(new java.awt.Color(217, 217, 217));
        id.setForeground(new java.awt.Color(153, 153, 153));
        id.setText("ID OS*");
        id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFocusLost(evt);
            }
        });
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        buscaOS.setBackground(new java.awt.Color(229, 229, 229));
        buscaOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("lupa1.png"))); // NOI18N
        buscaOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscaOS.setFocusable(false);
        buscaOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscaOSMouseClicked(evt);
            }
        });
        buscaOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaOSActionPerformed(evt);
            }
        });

        painelAmarelo.setBackground(new java.awt.Color(255, 244, 216));

        nomeCliente.setBackground(new java.awt.Color(217, 217, 217));
        nomeCliente.setForeground(new java.awt.Color(153, 153, 153));
        nomeCliente.setText("NOME DO CLIENTE");
        nomeCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nomeCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nomeCliente.setRequestFocusEnabled(false);

        telefone.setBackground(new java.awt.Color(217, 217, 217));
        telefone.setForeground(new java.awt.Color(153, 153, 153));
        telefone.setText("TELEFONE");
        telefone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        telefone.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telefone.setRequestFocusEnabled(false);
        telefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefoneFocusLost(evt);
            }
        });

        serie.setBackground(new java.awt.Color(217, 217, 217));
        serie.setForeground(new java.awt.Color(153, 153, 153));
        serie.setText("SÉRIE");
        serie.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        serie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        serie.setRequestFocusEnabled(false);
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
        dataInicio.setText("DATA DE INÍCIO");
        dataInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dataInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dataInicio.setRequestFocusEnabled(false);
        dataInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataInicioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataInicioFocusLost(evt);
            }
        });

        reclamacao.setEditable(false);
        reclamacao.setBackground(new java.awt.Color(217, 217, 217));
        reclamacao.setForeground(new java.awt.Color(153, 153, 153));
        reclamacao.setText("Reclamação do cliente");
        reclamacao.setToolTipText("");
        reclamacao.setActionCommand("<Not Set>");
        reclamacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        reclamacao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reclamacao.setRequestFocusEnabled(false);
        reclamacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reclamacaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                reclamacaoFocusLost(evt);
            }
        });

        analiseTecnico.setBackground(new java.awt.Color(217, 217, 217));
        analiseTecnico.setForeground(new java.awt.Color(153, 153, 153));
        analiseTecnico.setText("Análise do técnico");
        analiseTecnico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        analiseTecnico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        analiseTecnico.setRequestFocusEnabled(false);
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
        tecnico.setText("TECNICO");
        tecnico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tecnico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tecnico.setRequestFocusEnabled(false);
        tecnico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tecnicoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tecnicoFocusLost(evt);
            }
        });
        tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tecnicoActionPerformed(evt);
            }
        });

        confirmaCancelarOS.setBackground(new java.awt.Color(255, 32, 32));
        confirmaCancelarOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmaCancelarOS.setForeground(new java.awt.Color(255, 255, 255));
        confirmaCancelarOS.setText("CANCELAR OS");
        confirmaCancelarOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmaCancelarOS.setFocusable(false);
        confirmaCancelarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaCancelarOSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAmareloLayout = new javax.swing.GroupLayout(painelAmarelo);
        painelAmarelo.setLayout(painelAmareloLayout);
        painelAmareloLayout.setHorizontalGroup(
            painelAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAmareloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(reclamacao)
                        .addComponent(nomeCliente)
                        .addGroup(painelAmareloLayout.createSequentialGroup()
                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(serie, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(painelAmareloLayout.createSequentialGroup()
                            .addComponent(tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confirmaCancelarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(analiseTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelAmareloLayout.setVerticalGroup(
            painelAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAmareloLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reclamacao, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(analiseTecnico, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tecnico, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(confirmaCancelarOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout painelBrancoLayout = new javax.swing.GroupLayout(painelBranco);
        painelBranco.setLayout(painelBrancoLayout);
        painelBrancoLayout.setHorizontalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addComponent(painelVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelVerde, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void gerenciarEletronicoMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        // TODO add your handling code here:
        mensagemDeErro("AVISO", "EM CONSTRUÇÃO");
    }                                                

    private void gerenciarClienteMouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
        mensagemDeErro("AVISO", "EM CONSTRUÇÃO");
    }                                             

    private void historicoOsMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        mensagemDeErro("AVISO", "EM CONSTRUÇÃO");
    }                                        

    private void cancelarOSMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void cancelarOSActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void idFocusGained(java.awt.event.FocusEvent evt) {                               
        // TODO add your handling code here:
        if (id.getText().equals("ID OS*")) {
            id.setText("");
            id.setForeground(Color.BLACK);
        }
    }                              

    private void idFocusLost(java.awt.event.FocusEvent evt) {                             
        // TODO add your handling code here:
        if (id.getText().equals("")) {
            id.setText("ID OS*");
            id.setForeground(new Color(153, 153, 153));
        }
    }                            

    private void idActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void buscaOSActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void telefoneFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
        if (telefone.getText().equals("TELEFONE*")) {
            telefone.setText("");
            telefone.setForeground(Color.BLACK);
        }
    }                                    

    private void telefoneFocusLost(java.awt.event.FocusEvent evt) {                                   
        // TODO add your handling code here:
        if (telefone.getText().equals("")) {
            telefone.setText("TELEFONE*");
            telefone.setForeground(new Color(153, 153, 153));
        }
    }                                  

    private void serieFocusGained(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        if (serie.getText().equals("SÉRIE*")) {
            serie.setText("");
            serie.setForeground(Color.BLACK);
        }
    }                                 

    private void serieFocusLost(java.awt.event.FocusEvent evt) {                                
        // TODO add your handling code here:
        if (serie.getText().equals("")) {
            serie.setText("SÉRIE*");
            serie.setForeground(new Color(153, 153, 153));
        }
    }                               

    private void dataInicioFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if (dataInicio.getText().equals("DATA DE INÍCIO*")) {
            dataInicio.setText("");
            dataInicio.setForeground(Color.BLACK);
        }
    }                                      

    private void dataInicioFocusLost(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
        if (dataInicio.getText().equals("")) {
            dataInicio.setText("DATA DE INÍCIO*");
            dataInicio.setForeground(new Color(153, 153, 153));
        }
    }                                    

    private void reclamacaoFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if (reclamacao.getText().equals("Reclamação do cliente*")) {
            reclamacao.setText("");
            reclamacao.setForeground(Color.BLACK);
        }
    }                                      

    private void reclamacaoFocusLost(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
        if (reclamacao.getText().equals("")) {
            reclamacao.setText("Reclamação do cliente*");
            reclamacao.setForeground(new Color(153, 153, 153));
        }
    }                                    

    private void analiseTecnicoFocusGained(java.awt.event.FocusEvent evt) {                                           
        // TODO add your handling code here:
        if (analiseTecnico.getText().equals("Análise do técnico")) {
            analiseTecnico.setText("");
            analiseTecnico.setForeground(Color.BLACK);
        }
    }                                          

    private void analiseTecnicoFocusLost(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
        if (analiseTecnico.getText().equals("")) {
            analiseTecnico.setText("Análise do técnico");
            analiseTecnico.setForeground(new Color(153, 153, 153));
        }
    }                                        

    private void tecnicoFocusGained(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void tecnicoFocusLost(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
    }                                 

    private void tecnicoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void registrarOSActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void registrarOSMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(() -> {
            // Torna a janela atual invisível
            this.setVisible(false);
            
            // Cria uma instância da ViewRegistrarOS
            ViewRegistrarOS registrarOS = new ViewRegistrarOS();
            
            // Torna a nova janela visível
            registrarOS.setVisible(true);
            
            // Certifique-se de fechar a janela atual quando a nova janela for fechada
            registrarOS.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    // Torna a janela atual visível novamente
                    setVisible(true);
                }
            });
        });
    }             
    }                                        

    private void confirmaCancelarOSActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        mensagemDeConfirmacao("CONFIRMAÇÃO", "VOCÊ TEM CERTEZA QUE QUER CANCELAR A OS?");
        


    }                                                  

    private void buscaOSMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
            if (id.getText().isEmpty() || id.getText().equals("ID OS*")) {
                mensagemDeErro("OCORREU UM ERRO", "ID NÃO PREENCHIDO");
                painelBranco.requestFocusInWindow();
            } else{
                painelAmarelo.setVisible(true);
            }
    }                                    

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCancelarOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new viewCancelarOS().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField analiseTecnico;
    private javax.swing.JButton buscaOS;
    private javax.swing.JButton cancelarOS;
    private javax.swing.JButton confirmaCancelarOS;
    private javax.swing.JTextField dataInicio;
    private javax.swing.JTextField funcao;
    private javax.swing.JButton gerenciarCliente;
    private javax.swing.JButton gerenciarEletronico;
    private javax.swing.JButton historicoOs;
    private javax.swing.JTextField id;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JTextField nomeFunc;
    private javax.swing.JPanel painelAmarelo;
    private javax.swing.JPanel painelBranco;
    private javax.swing.JPanel painelVerde;
    private javax.swing.JTextField reclamacao;
    private javax.swing.JButton registrarOS;
    private javax.swing.JTextField serie;
    private javax.swing.JTextField tecnico;
    private javax.swing.JTextField telefone;
    // End of variables declaration                   
}
