/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import control.ControlInterfaces;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;


public class FrmPrincipal extends javax.swing.JFrame {
    
    private ControlInterfaces controlInterfaces;
    
    public FrmPrincipal(ControlInterfaces controlInterfaces) {
        this.controlInterfaces = controlInterfaces;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCasoUso = new javax.swing.ButtonGroup();
        panelAtores = new javax.swing.JPanel();
        checkAtorSimples = new javax.swing.JCheckBox();
        checkAtorMedio = new javax.swing.JCheckBox();
        checkAtorComplexo = new javax.swing.JCheckBox();
        spnAtorSimples = new javax.swing.JSpinner();
        spnAtorMedio = new javax.swing.JSpinner();
        spnAtorComplexo = new javax.swing.JSpinner();
        panelCasoUso = new javax.swing.JPanel();
        radioTransacoes = new javax.swing.JRadioButton();
        radioEntidades = new javax.swing.JRadioButton();
        panelTransacao = new javax.swing.JPanel();
        checkTransacaoSimples = new javax.swing.JCheckBox();
        checkTransacaoMedia = new javax.swing.JCheckBox();
        checkTransacaoComplexa = new javax.swing.JCheckBox();
        spnTransacaoSimples = new javax.swing.JSpinner();
        spnTransacaoMedia = new javax.swing.JSpinner();
        spnTransacaoComplexa = new javax.swing.JSpinner();
        panelEntidade = new javax.swing.JPanel();
        checkEntidadeSimples = new javax.swing.JCheckBox();
        checkEntidadeMedia = new javax.swing.JCheckBox();
        checkEntidadeComplexa = new javax.swing.JCheckBox();
        spnEntidadeSimples = new javax.swing.JSpinner();
        spnEntidadeMedia = new javax.swing.JSpinner();
        spnEntidadeComplexa = new javax.swing.JSpinner();
        panelFatoresTecnicos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spnSistemaDistribuido = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        spnTempoResposta = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spnEficiencia = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spnProcessamentoComplexo = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spnCodigoReusavel = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spnFacilidadeInstalacao = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        spnFacilidadeUso = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        spnPortabilidade = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        spnFacilidadeMudanca = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        spnConcorrencia = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        spnRecursosSeguranca = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        spnAcessivelTerceiros = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        spnRequerTreinamento = new javax.swing.JSpinner();
        panelFatoresAmbientais = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        spnRup = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        spnExperienciaAplicacao = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        spnExperienciaOO = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        spnAnalistaExperiente = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        spnMotivacao = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        spnRequisitosEstaveis = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        spnDesenvolvedoresExpediente = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        spnLinguagemDificil = new javax.swing.JSpinner();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        textPorteSistema = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estimativa de Sistema");
        setResizable(false);

        panelAtores.setBorder(javax.swing.BorderFactory.createTitledBorder("Atores"));

        checkAtorSimples.setText("Ator Simples");
        checkAtorSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAtorSimplesActionPerformed(evt);
            }
        });

        checkAtorMedio.setText("Ator Médio");
        checkAtorMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAtorMedioActionPerformed(evt);
            }
        });

        checkAtorComplexo.setText("Ator Complexo");
        checkAtorComplexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAtorComplexoActionPerformed(evt);
            }
        });

        spnAtorSimples.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnAtorSimples.setEnabled(false);

        spnAtorMedio.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnAtorMedio.setEnabled(false);

        spnAtorComplexo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnAtorComplexo.setEnabled(false);

        javax.swing.GroupLayout panelAtoresLayout = new javax.swing.GroupLayout(panelAtores);
        panelAtores.setLayout(panelAtoresLayout);
        panelAtoresLayout.setHorizontalGroup(
            panelAtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAtoresLayout.createSequentialGroup()
                        .addComponent(checkAtorComplexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnAtorComplexo, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                    .addGroup(panelAtoresLayout.createSequentialGroup()
                        .addGroup(panelAtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkAtorSimples)
                            .addComponent(checkAtorMedio))
                        .addGap(18, 18, 18)
                        .addGroup(panelAtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnAtorSimples, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(spnAtorMedio))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAtoresLayout.setVerticalGroup(
            panelAtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAtorSimples)
                    .addComponent(spnAtorSimples, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAtorMedio)
                    .addComponent(spnAtorMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAtorComplexo)
                    .addComponent(spnAtorComplexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        panelCasoUso.setBorder(javax.swing.BorderFactory.createTitledBorder("Casos de Uso"));

        grupoCasoUso.add(radioTransacoes);
        radioTransacoes.setText("Transações");
        radioTransacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTransacoesActionPerformed(evt);
            }
        });

        grupoCasoUso.add(radioEntidades);
        radioEntidades.setText("Entidades");
        radioEntidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEntidadesActionPerformed(evt);
            }
        });

        panelTransacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelTransacao.setEnabled(false);

        checkTransacaoSimples.setText("Simples");
        checkTransacaoSimples.setEnabled(false);
        checkTransacaoSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTransacaoSimplesActionPerformed(evt);
            }
        });

        checkTransacaoMedia.setText("Média");
        checkTransacaoMedia.setEnabled(false);
        checkTransacaoMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTransacaoMediaActionPerformed(evt);
            }
        });

        checkTransacaoComplexa.setText("Complexa");
        checkTransacaoComplexa.setEnabled(false);
        checkTransacaoComplexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTransacaoComplexaActionPerformed(evt);
            }
        });

        spnTransacaoSimples.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnTransacaoSimples.setEnabled(false);

        spnTransacaoMedia.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnTransacaoMedia.setEnabled(false);

        spnTransacaoComplexa.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnTransacaoComplexa.setEnabled(false);

        javax.swing.GroupLayout panelTransacaoLayout = new javax.swing.GroupLayout(panelTransacao);
        panelTransacao.setLayout(panelTransacaoLayout);
        panelTransacaoLayout.setHorizontalGroup(
            panelTransacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkTransacaoSimples)
                    .addComponent(checkTransacaoMedia)
                    .addComponent(checkTransacaoComplexa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTransacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(spnTransacaoSimples, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(spnTransacaoMedia)
                    .addComponent(spnTransacaoComplexa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTransacaoLayout.setVerticalGroup(
            panelTransacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkTransacaoSimples)
                    .addComponent(spnTransacaoSimples, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTransacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkTransacaoMedia)
                    .addComponent(spnTransacaoMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTransacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnTransacaoComplexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkTransacaoComplexa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEntidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEntidade.setEnabled(false);

        checkEntidadeSimples.setText("Simples");
        checkEntidadeSimples.setEnabled(false);
        checkEntidadeSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEntidadeSimplesActionPerformed(evt);
            }
        });

        checkEntidadeMedia.setText("Média");
        checkEntidadeMedia.setEnabled(false);
        checkEntidadeMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEntidadeMediaActionPerformed(evt);
            }
        });

        checkEntidadeComplexa.setText("Complexa");
        checkEntidadeComplexa.setEnabled(false);
        checkEntidadeComplexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEntidadeComplexaActionPerformed(evt);
            }
        });

        spnEntidadeSimples.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnEntidadeSimples.setEnabled(false);

        spnEntidadeMedia.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnEntidadeMedia.setEnabled(false);

        spnEntidadeComplexa.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnEntidadeComplexa.setEnabled(false);

        javax.swing.GroupLayout panelEntidadeLayout = new javax.swing.GroupLayout(panelEntidade);
        panelEntidade.setLayout(panelEntidadeLayout);
        panelEntidadeLayout.setHorizontalGroup(
            panelEntidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkEntidadeMedia)
                    .addComponent(checkEntidadeComplexa)
                    .addComponent(checkEntidadeSimples))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEntidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnEntidadeSimples, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(spnEntidadeComplexa)
                    .addComponent(spnEntidadeMedia, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEntidadeLayout.setVerticalGroup(
            panelEntidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkEntidadeSimples)
                    .addComponent(spnEntidadeSimples, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkEntidadeMedia)
                    .addComponent(spnEntidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnEntidadeComplexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkEntidadeComplexa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCasoUsoLayout = new javax.swing.GroupLayout(panelCasoUso);
        panelCasoUso.setLayout(panelCasoUsoLayout);
        panelCasoUsoLayout.setHorizontalGroup(
            panelCasoUsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCasoUsoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCasoUsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioTransacoes)
                    .addComponent(panelTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCasoUsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioEntidades)
                    .addComponent(panelEntidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCasoUsoLayout.setVerticalGroup(
            panelCasoUsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCasoUsoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCasoUsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTransacoes)
                    .addComponent(radioEntidades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCasoUsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEntidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFatoresTecnicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Fatores Técnicos"));

        jLabel1.setText("Sistema Distribuído");

        spnSistemaDistribuido.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel2.setText("Tempo de Resposta");

        spnTempoResposta.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel3.setText("Eficiência");

        spnEficiencia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel4.setText("Processamento Complexo");

        spnProcessamentoComplexo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel5.setText("Código Reusável");

        spnCodigoReusavel.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel6.setText("Facilidade de Instalação");

        spnFacilidadeInstalacao.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel7.setText("Facilidade de Uso");

        spnFacilidadeUso.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel8.setText("Portabilidade");

        spnPortabilidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel9.setText("Facilidade de Mudança");

        spnFacilidadeMudanca.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel10.setText("Concorrência");

        spnConcorrencia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel11.setText("Recursos de Segurança");

        spnRecursosSeguranca.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel12.setText("Acessível por Terceiros");

        spnAcessivelTerceiros.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel13.setText("Requer Treinamento");

        spnRequerTreinamento.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        javax.swing.GroupLayout panelFatoresTecnicosLayout = new javax.swing.GroupLayout(panelFatoresTecnicos);
        panelFatoresTecnicos.setLayout(panelFatoresTecnicosLayout);
        panelFatoresTecnicosLayout.setHorizontalGroup(
            panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFatoresTecnicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFatoresTecnicosLayout.createSequentialGroup()
                        .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(54, 54, 54)
                        .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnTempoResposta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spnEficiencia)
                            .addComponent(spnSistemaDistribuido, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                    .addGroup(panelFatoresTecnicosLayout.createSequentialGroup()
                        .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(26, 26, 26)
                        .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnProcessamentoComplexo)
                            .addComponent(spnCodigoReusavel)
                            .addComponent(spnFacilidadeInstalacao)
                            .addComponent(spnFacilidadeUso)
                            .addComponent(spnPortabilidade)
                            .addComponent(spnFacilidadeMudanca)
                            .addComponent(spnConcorrencia)
                            .addComponent(spnRecursosSeguranca)
                            .addComponent(spnAcessivelTerceiros)
                            .addComponent(spnRequerTreinamento))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFatoresTecnicosLayout.setVerticalGroup(
            panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFatoresTecnicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spnSistemaDistribuido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnTempoResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnEficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(spnProcessamentoComplexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(spnCodigoReusavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spnFacilidadeInstalacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spnFacilidadeUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spnPortabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(spnFacilidadeMudanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(spnConcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(spnRecursosSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(spnAcessivelTerceiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(spnRequerTreinamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFatoresAmbientais.setBorder(javax.swing.BorderFactory.createTitledBorder("Fatores Ambientais"));

        jLabel14.setText("Familiaridade com RUP ou outro processo formal");

        spnRup.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel15.setText("Experiência com a Aplicação em desenvolvimento");

        spnExperienciaAplicacao.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel16.setText("Experiência em Orientação a Objetos");

        spnExperienciaOO.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel17.setText("Presença de analista experiente");

        spnAnalistaExperiente.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel18.setText("Motivação");

        spnMotivacao.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel19.setText("Requisitos estáveis");

        spnRequisitosEstaveis.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel20.setText("Desenvolvedores em meio-expediente");

        spnDesenvolvedoresExpediente.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel21.setText("Linguagem de programação difícil");

        spnLinguagemDificil.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        javax.swing.GroupLayout panelFatoresAmbientaisLayout = new javax.swing.GroupLayout(panelFatoresAmbientais);
        panelFatoresAmbientais.setLayout(panelFatoresAmbientaisLayout);
        panelFatoresAmbientaisLayout.setHorizontalGroup(
            panelFatoresAmbientaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFatoresAmbientaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFatoresAmbientaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelFatoresAmbientaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnRup, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(spnExperienciaAplicacao)
                    .addComponent(spnExperienciaOO)
                    .addComponent(spnAnalistaExperiente)
                    .addComponent(spnMotivacao)
                    .addComponent(spnRequisitosEstaveis)
                    .addComponent(spnDesenvolvedoresExpediente)
                    .addComponent(spnLinguagemDificil))
                .addGap(44, 44, 44))
        );
        panelFatoresAmbientaisLayout.setVerticalGroup(
            panelFatoresAmbientaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFatoresAmbientaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFatoresAmbientaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(spnRup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresAmbientaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(spnExperienciaAplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresAmbientaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(spnExperienciaOO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresAmbientaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(spnAnalistaExperiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresAmbientaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(spnMotivacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresAmbientaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(spnRequisitosEstaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresAmbientaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(spnDesenvolvedoresExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFatoresAmbientaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(spnLinguagemDificil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Porte do Sistema:");

        textPorteSistema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelFatoresTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(panelFatoresAmbientais, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(18, 18, 18)
                                        .addComponent(textPorteSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnCalcular)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelAtores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelCasoUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCasoUso, javax.swing.GroupLayout.PREFERRED_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(panelAtores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelFatoresTecnicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelFatoresAmbientais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(textPorteSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcular)
                            .addComponent(btnLimpar))
                        .addGap(31, 31, 31))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkAtorMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAtorMedioActionPerformed
        habilitarSpinner(checkAtorMedio, spnAtorMedio);
    }//GEN-LAST:event_checkAtorMedioActionPerformed

    private void checkAtorSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAtorSimplesActionPerformed
        habilitarSpinner(checkAtorSimples, spnAtorSimples);
    }//GEN-LAST:event_checkAtorSimplesActionPerformed

    private void checkAtorComplexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAtorComplexoActionPerformed
        habilitarSpinner(checkAtorComplexo, spnAtorComplexo);
    }//GEN-LAST:event_checkAtorComplexoActionPerformed

    private void checkTransacaoSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTransacaoSimplesActionPerformed
        habilitarSpinner(checkTransacaoSimples, spnTransacaoSimples);
    }//GEN-LAST:event_checkTransacaoSimplesActionPerformed

    private void checkTransacaoMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTransacaoMediaActionPerformed
        habilitarSpinner(checkTransacaoMedia, spnTransacaoMedia);
    }//GEN-LAST:event_checkTransacaoMediaActionPerformed

    private void checkTransacaoComplexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTransacaoComplexaActionPerformed
        habilitarSpinner(checkTransacaoComplexa, spnTransacaoComplexa);
    }//GEN-LAST:event_checkTransacaoComplexaActionPerformed

    private void checkEntidadeSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEntidadeSimplesActionPerformed
        habilitarSpinner(checkEntidadeSimples, spnEntidadeSimples);
    }//GEN-LAST:event_checkEntidadeSimplesActionPerformed

    private void checkEntidadeMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEntidadeMediaActionPerformed
        habilitarSpinner(checkEntidadeMedia, spnEntidadeMedia);
    }//GEN-LAST:event_checkEntidadeMediaActionPerformed

    private void checkEntidadeComplexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEntidadeComplexaActionPerformed
        habilitarSpinner(checkEntidadeComplexa, spnEntidadeComplexa);
    }//GEN-LAST:event_checkEntidadeComplexaActionPerformed

    private void radioTransacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTransacoesActionPerformed
        if(radioTransacoes.isSelected()){
            
            checkEntidadeSimples.setSelected(false);
            checkEntidadeMedia.setSelected(false);
            checkEntidadeComplexa.setSelected(false);
            checkEntidadeSimples.setEnabled(false);
            checkEntidadeMedia.setEnabled(false);
            checkEntidadeComplexa.setEnabled(false);
            
            spnEntidadeSimples.setValue(0);
            spnEntidadeMedia.setValue(0);
            spnEntidadeComplexa.setValue(0);
            spnEntidadeSimples.setEnabled(false);
            spnEntidadeMedia.setEnabled(false);
            spnEntidadeComplexa.setEnabled(false);
            
            
            checkTransacaoSimples.setSelected(false);
            checkTransacaoMedia.setSelected(false);
            checkTransacaoComplexa.setSelected(false);
            checkTransacaoSimples.setEnabled(true);
            checkTransacaoMedia.setEnabled(true);
            checkTransacaoComplexa.setEnabled(true);
        }
    }//GEN-LAST:event_radioTransacoesActionPerformed

    private void radioEntidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEntidadesActionPerformed
        if(radioEntidades.isSelected()){
            
            checkTransacaoSimples.setSelected(false);
            checkTransacaoMedia.setSelected(false);
            checkTransacaoComplexa.setSelected(false);
            checkTransacaoSimples.setEnabled(false);
            checkTransacaoMedia.setEnabled(false);
            checkTransacaoComplexa.setEnabled(false);
            
            spnTransacaoSimples.setValue(0);
            spnTransacaoMedia.setValue(0);
            spnTransacaoComplexa.setValue(0);
            spnTransacaoSimples.setEnabled(false);
            spnTransacaoMedia.setEnabled(false);
            spnTransacaoComplexa.setEnabled(false);
           
            checkEntidadeSimples.setEnabled(true);
            checkEntidadeMedia.setEnabled(true);
            checkEntidadeComplexa.setEnabled(true);
            checkTransacaoSimples.setEnabled(false);
            checkTransacaoMedia.setEnabled(false);
            checkTransacaoComplexa.setEnabled(false);
        }
    }//GEN-LAST:event_radioEntidadesActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        controlInterfaces.iniciarSistema(controlInterfaces);
        this.dispose();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        double totalAtores = 0;     
        double totalCasoUso = 0;
        double totalPorteSistema = 0;
        double totalFatoresTecnicos = 0;
        double totalFatoresAmbientais = 0;
        double ucp = 0;
        
        totalAtores = controlInterfaces.calcularAtores((int)spnAtorSimples.getValue(), (int)spnAtorMedio.getValue(), (int)spnAtorComplexo.getValue());
        
        if(radioTransacoes.isSelected()){           
            totalCasoUso = controlInterfaces.calcularCasoUso((int)spnTransacaoSimples.getValue(), (int)spnTransacaoMedia.getValue(), (int)spnTransacaoComplexa.getValue());    
        }else if(radioEntidades.isSelected()){
            totalCasoUso = controlInterfaces.calcularCasoUso((int)spnEntidadeSimples.getValue(), (int)spnEntidadeMedia.getValue(), (int)spnEntidadeComplexa.getValue());
        }
        
        ucp = totalAtores + totalCasoUso; //TOTAL DE ATORES + CASO DE USO
        
        int sistema = (int)spnSistemaDistribuido.getValue();
        int tempo = (int) spnTempoResposta.getValue();
        int eficiencia = (int)spnEficiencia.getValue();
        int processamento = (int)spnProcessamentoComplexo.getValue();
        int codigo = (int)spnCodigoReusavel.getValue();
        int instalacao = (int)spnFacilidadeInstalacao.getValue();
        int uso = (int)spnFacilidadeUso.getValue();
        int portabilidade = (int)spnPortabilidade.getValue();
        int mudanca = (int)spnFacilidadeMudanca.getValue();
        int concorrencia = (int)spnConcorrencia.getValue();
        int seguranca = (int)spnRecursosSeguranca.getValue();
        int terceiros = (int)spnAcessivelTerceiros.getValue();
        int treinamento = (int)spnRequerTreinamento.getValue();
        String totalGeral = "";
  
        totalFatoresTecnicos = controlInterfaces.calcularFatoresTecnicos(sistema, tempo, eficiencia, processamento, codigo, instalacao, uso, portabilidade, mudanca, concorrencia, seguranca, terceiros, treinamento);
        
        int rup = (int)spnRup.getValue();
        int aplicacao = (int)spnExperienciaAplicacao.getValue();
        int objetos = (int)spnExperienciaOO.getValue();
        int analista = (int)spnAnalistaExperiente.getValue();
        int motivacao = (int)spnMotivacao.getValue();
        int requisitos = (int)spnRequisitosEstaveis.getValue();
        int desenvolvedores = (int)spnDesenvolvedoresExpediente.getValue();
        int linguagem = (int)spnLinguagemDificil.getValue();
        
        totalFatoresAmbientais = controlInterfaces.calcularFatoresAmbientais(rup, aplicacao, objetos, analista, motivacao, requisitos, desenvolvedores, linguagem);
        
        totalPorteSistema = controlInterfaces.calcularPorteSistema(ucp, totalFatoresTecnicos, totalFatoresAmbientais);
        totalGeral = controlInterfaces.formatarDouble(totalPorteSistema);
        //System.out.println(totalPorteSistema);
        textPorteSistema.setText(totalGeral);
   
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void habilitarSpinner(JCheckBox chk, JSpinner spn){
        
        spn.setEnabled(chk.isSelected());
        
        if(!spn.isEnabled()){
            spn.setValue(0);
        }  
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JCheckBox checkAtorComplexo;
    private javax.swing.JCheckBox checkAtorMedio;
    private javax.swing.JCheckBox checkAtorSimples;
    private javax.swing.JCheckBox checkEntidadeComplexa;
    private javax.swing.JCheckBox checkEntidadeMedia;
    private javax.swing.JCheckBox checkEntidadeSimples;
    private javax.swing.JCheckBox checkTransacaoComplexa;
    private javax.swing.JCheckBox checkTransacaoMedia;
    private javax.swing.JCheckBox checkTransacaoSimples;
    private javax.swing.ButtonGroup grupoCasoUso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelAtores;
    private javax.swing.JPanel panelCasoUso;
    private javax.swing.JPanel panelEntidade;
    private javax.swing.JPanel panelFatoresAmbientais;
    private javax.swing.JPanel panelFatoresTecnicos;
    private javax.swing.JPanel panelTransacao;
    private javax.swing.JRadioButton radioEntidades;
    private javax.swing.JRadioButton radioTransacoes;
    private javax.swing.JSpinner spnAcessivelTerceiros;
    private javax.swing.JSpinner spnAnalistaExperiente;
    private javax.swing.JSpinner spnAtorComplexo;
    private javax.swing.JSpinner spnAtorMedio;
    private javax.swing.JSpinner spnAtorSimples;
    private javax.swing.JSpinner spnCodigoReusavel;
    private javax.swing.JSpinner spnConcorrencia;
    private javax.swing.JSpinner spnDesenvolvedoresExpediente;
    private javax.swing.JSpinner spnEficiencia;
    private javax.swing.JSpinner spnEntidadeComplexa;
    private javax.swing.JSpinner spnEntidadeMedia;
    private javax.swing.JSpinner spnEntidadeSimples;
    private javax.swing.JSpinner spnExperienciaAplicacao;
    private javax.swing.JSpinner spnExperienciaOO;
    private javax.swing.JSpinner spnFacilidadeInstalacao;
    private javax.swing.JSpinner spnFacilidadeMudanca;
    private javax.swing.JSpinner spnFacilidadeUso;
    private javax.swing.JSpinner spnLinguagemDificil;
    private javax.swing.JSpinner spnMotivacao;
    private javax.swing.JSpinner spnPortabilidade;
    private javax.swing.JSpinner spnProcessamentoComplexo;
    private javax.swing.JSpinner spnRecursosSeguranca;
    private javax.swing.JSpinner spnRequerTreinamento;
    private javax.swing.JSpinner spnRequisitosEstaveis;
    private javax.swing.JSpinner spnRup;
    private javax.swing.JSpinner spnSistemaDistribuido;
    private javax.swing.JSpinner spnTempoResposta;
    private javax.swing.JSpinner spnTransacaoComplexa;
    private javax.swing.JSpinner spnTransacaoMedia;
    private javax.swing.JSpinner spnTransacaoSimples;
    private javax.swing.JTextField textPorteSistema;
    // End of variables declaration//GEN-END:variables
}
