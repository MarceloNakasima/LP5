package bean;
// Generated 07/12/2023 11:31:50 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VendasMyn generated by hbm2java
 */
@Entity
@Table(name="vendas_myn"
    ,catalog="db_marcelo_nakasima"
)
public class VendasMyn  implements java.io.Serializable {


     private int idVendasMyn;
     private ClienteMyn clienteMyn;
     private FuncionarioMyn funcionarioMyn;
     private String tempoEntregaMyn;
     private double valorMyn;
     private Date dataMyn;

    public VendasMyn() {
    }

	
    public VendasMyn(int idVendasMyn, String tempoEntregaMyn, double valorMyn, Date dataMyn) {
        this.idVendasMyn = idVendasMyn;
        this.tempoEntregaMyn = tempoEntregaMyn;
        this.valorMyn = valorMyn;
        this.dataMyn = dataMyn;
    }
    public VendasMyn(int idVendasMyn, ClienteMyn clienteMyn, FuncionarioMyn funcionarioMyn, String tempoEntregaMyn, double valorMyn, Date dataMyn) {
       this.idVendasMyn = idVendasMyn;
       this.clienteMyn = clienteMyn;
       this.funcionarioMyn = funcionarioMyn;
       this.tempoEntregaMyn = tempoEntregaMyn;
       this.valorMyn = valorMyn;
       this.dataMyn = dataMyn;
    }
   
     @Id 

    
    @Column(name="idVendas_myn", unique=true, nullable=false)
    public int getIdVendasMyn() {
        return this.idVendasMyn;
    }
    
    public void setIdVendasMyn(int idVendasMyn) {
        this.idVendasMyn = idVendasMyn;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="fk_Cliente_myn")
    public ClienteMyn getClienteMyn() {
        return this.clienteMyn;
    }
    
    public void setClienteMyn(ClienteMyn clienteMyn) {
        this.clienteMyn = clienteMyn;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="fk_Funcionario_myn")
    public FuncionarioMyn getFuncionarioMyn() {
        return this.funcionarioMyn;
    }
    
    public void setFuncionarioMyn(FuncionarioMyn funcionarioMyn) {
        this.funcionarioMyn = funcionarioMyn;
    }

    
    @Column(name="tempoEntrega_myn", nullable=false, length=45)
    public String getTempoEntregaMyn() {
        return this.tempoEntregaMyn;
    }
    
    public void setTempoEntregaMyn(String tempoEntregaMyn) {
        this.tempoEntregaMyn = tempoEntregaMyn;
    }

    
    @Column(name="valor_myn", nullable=false, precision=22, scale=0)
    public double getValorMyn() {
        return this.valorMyn;
    }
    
    public void setValorMyn(double valorMyn) {
        this.valorMyn = valorMyn;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_myn", nullable=false, length=10)
    public Date getDataMyn() {
        return this.dataMyn;
    }
    
    public void setDataMyn(Date dataMyn) {
        this.dataMyn = dataMyn;
    }

}


