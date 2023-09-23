package bean;
// Generated 21/09/2023 18:10:17 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ClienteMyn generated by hbm2java
 */
@Entity
@Table(name="cliente_myn"
    ,catalog="db_marcelo_nakasima"
)
public class ClienteMyn  implements java.io.Serializable {


     private int idClienteMyn;
     private String nomeMyn;
     private String apelidoMyn;
     private String emailMyn;
     private String senhaMyn;
     private int sexoMyn;
     private String celularMyn;
     private String telefoneFixoMyn;
     private String cpfMyn;
     private String rgMyn;
     private String cepMyn;
     private String paisMyn;
     private String estadoMyn;
     private String cidadeMyn;
     private String bairroMyn;
     private String numeroCasaMyn;
     

    public ClienteMyn() {
    }

	
    public ClienteMyn(int idClienteMyn, String nomeMyn, String emailMyn, String senhaMyn, int sexoMyn, String cpfMyn, String rgMyn, String cepMyn) {
        this.idClienteMyn = idClienteMyn;
        this.nomeMyn = nomeMyn;
        this.emailMyn = emailMyn;
        this.senhaMyn = senhaMyn;
        this.sexoMyn = sexoMyn;
        this.cpfMyn = cpfMyn;
        this.rgMyn = rgMyn;
        this.cepMyn = cepMyn;
    }
    public ClienteMyn(int idClienteMyn, String nomeMyn, String apelidoMyn, String emailMyn, String senhaMyn, int sexoMyn, String celularMyn, String telefoneFixoMyn, String cpfMyn, String rgMyn, String cepMyn, String paisMyn, String estadoMyn, String cidadeMyn, String bairroMyn, String numeroCasaMyn, Set vendasMyns) {
       this.idClienteMyn = idClienteMyn;
       this.nomeMyn = nomeMyn;
       this.apelidoMyn = apelidoMyn;
       this.emailMyn = emailMyn;
       this.senhaMyn = senhaMyn;
       this.sexoMyn = sexoMyn;
       this.celularMyn = celularMyn;
       this.telefoneFixoMyn = telefoneFixoMyn;
       this.cpfMyn = cpfMyn;
       this.rgMyn = rgMyn;
       this.cepMyn = cepMyn;
       this.paisMyn = paisMyn;
       this.estadoMyn = estadoMyn;
       this.cidadeMyn = cidadeMyn;
       this.bairroMyn = bairroMyn;
       this.numeroCasaMyn = numeroCasaMyn; 
    }
   
     @Id 

    
    @Column(name="idCliente_myn", unique=true, nullable=false)
    public int getIdClienteMyn() {
        return this.idClienteMyn;
    }
    
    public void setIdClienteMyn(int idClienteMyn) {
        this.idClienteMyn = idClienteMyn;
    }

    
    @Column(name="nome_myn", nullable=false, length=45)
    public String getNomeMyn() {
        return this.nomeMyn;
    }
    
    public void setNomeMyn(String nomeMyn) {
        this.nomeMyn = nomeMyn;
    }

    
    @Column(name="apelido_myn", length=45)
    public String getApelidoMyn() {
        return this.apelidoMyn;
    }
    
    public void setApelidoMyn(String apelidoMyn) {
        this.apelidoMyn = apelidoMyn;
    }

    
    @Column(name="email_myn", nullable=false, length=45)
    public String getEmailMyn() {
        return this.emailMyn;
    }
    
    public void setEmailMyn(String emailMyn) {
        this.emailMyn = emailMyn;
    }

    
    @Column(name="senha_myn", nullable=false, length=45)
    public String getSenhaMyn() {
        return this.senhaMyn;
    }
    
    public void setSenhaMyn(String senhaMyn) {
        this.senhaMyn = senhaMyn;
    }

    
    @Column(name="sexo_myn", nullable=false)
    public int getSexoMyn() {
        return this.sexoMyn;
    }
    
    public void setSexoMyn(int sexoMyn) {
        this.sexoMyn = sexoMyn;
    }

    
    @Column(name="celular_myn", length=45)
    public String getCelularMyn() {
        return this.celularMyn;
    }
    
    public void setCelularMyn(String celularMyn) {
        this.celularMyn = celularMyn;
    }

    
    @Column(name="telefoneFixo_myn", length=45)
    public String getTelefoneFixoMyn() {
        return this.telefoneFixoMyn;
    }
    
    public void setTelefoneFixoMyn(String telefoneFixoMyn) {
        this.telefoneFixoMyn = telefoneFixoMyn;
    }

    
    @Column(name="cpf_myn", nullable=false, length=45)
    public String getCpfMyn() {
        return this.cpfMyn;
    }
    
    public void setCpfMyn(String cpfMyn) {
        this.cpfMyn = cpfMyn;
    }

    
    @Column(name="rg_myn", nullable=false, length=45)
    public String getRgMyn() {
        return this.rgMyn;
    }
    
    public void setRgMyn(String rgMyn) {
        this.rgMyn = rgMyn;
    }

    
    @Column(name="cep_myn", nullable=false, length=45)
    public String getCepMyn() {
        return this.cepMyn;
    }
    
    public void setCepMyn(String cepMyn) {
        this.cepMyn = cepMyn;
    }

    
    @Column(name="pais_myn", length=45)
    public String getPaisMyn() {
        return this.paisMyn;
    }
    
    public void setPaisMyn(String paisMyn) {
        this.paisMyn = paisMyn;
    }

    
    @Column(name="estado_myn", length=45)
    public String getEstadoMyn() {
        return this.estadoMyn;
    }
    
    public void setEstadoMyn(String estadoMyn) {
        this.estadoMyn = estadoMyn;
    }

    
    @Column(name="cidade_myn", length=45)
    public String getCidadeMyn() {
        return this.cidadeMyn;
    }
    
    public void setCidadeMyn(String cidadeMyn) {
        this.cidadeMyn = cidadeMyn;
    }

    
    @Column(name="bairro_myn", length=45)
    public String getBairroMyn() {
        return this.bairroMyn;
    }
    
    public void setBairroMyn(String bairroMyn) {
        this.bairroMyn = bairroMyn;
    }

    
    @Column(name="numeroCasa_myn", length=45)
    public String getNumeroCasaMyn() {
        return this.numeroCasaMyn;
    }
    
    public void setNumeroCasaMyn(String numeroCasaMyn) {
        this.numeroCasaMyn = numeroCasaMyn;
    }

}


