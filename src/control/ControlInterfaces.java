/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.text.DecimalFormat;
import windows.FrmPrincipal;

/**
 *
 * @author Chrysthian
 */
public class ControlInterfaces {

    private FrmPrincipal frmPrincipal;
    
    private final double pesoAtorSimples = 1;
    private final double pesoAtorMedio = 2;
    private final double pesoAtorComplexo = 3;
    private final double pesoCasoUsoSimples = 1;
    private final double pesoCasoUsoMedio = 2;
    private final double pesoCasoUsoComplexo = 3;
    private final double pesoSistemaDistribuido = 2;
    private final double pesoTempoResposta = 2;
    private final double pesoEficiencia = 1;
    private final double pesoProcessamentoComplexo = 1;
    private final double pesoCodigoReusavel = 1;
    private final double pesoFacilidadeInstalacao = 0.5;
    private final double pesoFacilidadeUso = 0.5;
    private final double pesoPortabilidade = 2;
    private final double pesoFacilidadeMudanca = 1;
    private final double pesoConcorrencia = 1;
    private final double pesoRecursosSeguranca = 1;
    private final double pesoAcessivelTerceiros = 1;
    private final double pesoRequerTreinamento = 1;
    private final double pesoFamiliaridadeRup = 1.5;
    private final double pesoExperienciaAplicacao = 0.5;
    private final double pesoExperienciaOO = 1;
    private final double pesoAnalistaExperiente = 0.5;
    private final double pesoMotivacao = 1;
    private final double pesoRequisitosEstaveis = 2;
    private final double pesoDesenvolvedoresExpediente = -1;
    private final double pesoLinguagemDificil = 2;
    
    public ControlInterfaces() {
        this.iniciarSistema(this);
    }
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }   
        }catch(Exception e){}
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlInterfaces();
            }   
        });
    }
    
    public void iniciarSistema(ControlInterfaces controlInterfaces) {
         frmPrincipal = new FrmPrincipal(controlInterfaces);
         frmPrincipal.setVisible(true);
    }
     
    public double calcularAtores(int atorSimples, int atorMedio, int atorComplexo){
        double totalAtores = 0;
        
        totalAtores = totalAtores + (atorSimples * pesoAtorSimples);
        totalAtores = totalAtores + (atorMedio * pesoAtorMedio);
        totalAtores = totalAtores + (atorComplexo * pesoAtorComplexo);
        
        return totalAtores;
    }
    
    public double calcularCasoUso(int simples, int medio, int complexo){
        double totalCasoUso = 0;
        
        totalCasoUso = totalCasoUso + (simples * pesoCasoUsoSimples);
        totalCasoUso = totalCasoUso + (medio * pesoCasoUsoMedio);
        totalCasoUso = totalCasoUso + (complexo * pesoCasoUsoComplexo);

        return totalCasoUso;    
    }
    
    public double calcularFatoresTecnicos(int sistema, int tempo, int eficiencia, int processamento, int codigo, int instalacao, int uso, int portabilidade, int mudanca, int concorrencia, int seguranca, int terceiros, int treinamento){
        double totalFatoresTecnicos = 0;
        
        totalFatoresTecnicos = totalFatoresTecnicos + (sistema * pesoSistemaDistribuido);
        totalFatoresTecnicos = totalFatoresTecnicos + (tempo * pesoTempoResposta);
        totalFatoresTecnicos = totalFatoresTecnicos + (eficiencia * pesoEficiencia);
        totalFatoresTecnicos = totalFatoresTecnicos + (processamento * pesoProcessamentoComplexo);
        totalFatoresTecnicos = totalFatoresTecnicos + (codigo * pesoCodigoReusavel);
        totalFatoresTecnicos = totalFatoresTecnicos + (instalacao * pesoFacilidadeInstalacao);
        totalFatoresTecnicos = totalFatoresTecnicos + (uso * pesoFacilidadeUso);
        totalFatoresTecnicos = totalFatoresTecnicos + (portabilidade * pesoPortabilidade);
        totalFatoresTecnicos = totalFatoresTecnicos + (mudanca * pesoFacilidadeMudanca);
        totalFatoresTecnicos = totalFatoresTecnicos + (concorrencia * pesoConcorrencia);
        totalFatoresTecnicos = totalFatoresTecnicos + (seguranca * pesoRecursosSeguranca);
        totalFatoresTecnicos = totalFatoresTecnicos + (terceiros * pesoAcessivelTerceiros);
        totalFatoresTecnicos = totalFatoresTecnicos + (treinamento * pesoRequerTreinamento);
        
        return 0.6 + (0.01 * totalFatoresTecnicos);
    }
    
    public double calcularFatoresAmbientais(int rup, int aplicacao, int objetos, int analista, int motivacao, int requisitos, int desenvolvedores, int linguagem){
        double totalFatoresAmbientais = 0;
        
        totalFatoresAmbientais = totalFatoresAmbientais + (rup * pesoFamiliaridadeRup);
        totalFatoresAmbientais = totalFatoresAmbientais + (aplicacao * pesoExperienciaAplicacao);
        totalFatoresAmbientais = totalFatoresAmbientais + (objetos * pesoExperienciaOO);
        totalFatoresAmbientais = totalFatoresAmbientais + (analista * pesoAnalistaExperiente);
        totalFatoresAmbientais = totalFatoresAmbientais + (motivacao * pesoMotivacao);
        totalFatoresAmbientais = totalFatoresAmbientais + (requisitos * pesoRequisitosEstaveis);
        totalFatoresAmbientais = totalFatoresAmbientais + (desenvolvedores * pesoDesenvolvedoresExpediente);
        totalFatoresAmbientais = totalFatoresAmbientais + (linguagem * pesoLinguagemDificil);
        
       return 1.4 + (-0.03 * totalFatoresAmbientais);
    }
    
    public double calcularPorteSistema(double ucp, double totalFatoresTecnicos, double totalFatoresAmbientais){
        double totalPorteSistema = 0;
    
        totalPorteSistema = (ucp * totalFatoresTecnicos * totalFatoresAmbientais);
        
        return totalPorteSistema;
    }
    
    public String formatarDouble(double numero){
        String num = "";
    DecimalFormat formatter = new DecimalFormat("0.00");
       num = (formatter.format(numero));
       return num;
    }  
}
