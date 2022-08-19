package ifsp.pdm.havagas;

import java.util.Objects;

public class Formulario {
    private String nome;
    private String email;
    private String receberEmailOp;
    private String telefone;
    private String telefoneComercialResidencial;
    private String celularOp;
    private String celular;
    private String sexo;
    private String dataNascimento;
    private String formacao;
    private String anoFormacao;
    private String anoConclusao;
    private String instituicaoFormacao;
    private String tituloMonografiaFormacao;
    private String orientadorMonografiaFormacao;
    private String vagasInteresse;



    public Formulario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReceberEmailOp() {
        return receberEmailOp;
    }

    public void setReceberEmailOp(String receberEmailOp) {
        this.receberEmailOp = receberEmailOp;
    }

    public String getTelefone(String s) {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefoneComercialResidencial() {
        return telefoneComercialResidencial;
    }

    public void setTelefoneComercialResidencial(String telefoneComercialResidencial) {
        this.telefoneComercialResidencial = telefoneComercialResidencial;
    }

    public String getCelularOp() {
        return celularOp;
    }

    public void setCelularOp(String celularOp) {
        this.celularOp = celularOp;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFormação() {
        return formacao;
    }

    public void setFormação(String formacao) {
        this.formacao = formacao;
    }

    public String getAnoFormacao() {
        return anoFormacao;
    }

    public void setAnoFormacao(String anoFormacao) {
        this.anoFormacao = anoFormacao;
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getInstituicaoFormacao() {
        return instituicaoFormacao;
    }

    public void setInstituicaoFormacao(String instituicaoFormacao) {
        this.instituicaoFormacao = instituicaoFormacao;
    }

    public String getTituloMonografiaFormacao() {
        return tituloMonografiaFormacao;
    }

    public void setTituloMonografiaFormacao(String tituloMonografiaFormacao) {
        this.tituloMonografiaFormacao = tituloMonografiaFormacao;
    }

    public String getOrientadorMonografiaFormacao() {
        return orientadorMonografiaFormacao;
    }

    public void setOrientadorMonografiaFormacao(String orientadorMonografiaFormacao) {
        this.orientadorMonografiaFormacao = orientadorMonografiaFormacao;
    }

    public String getVagasInteresse() {
        return vagasInteresse;
    }

    public void setVagasInteresse(String vagasInteresse) {
        this.vagasInteresse = vagasInteresse;
    }

    public Formulario(String nome, String email, String receberEmailOp, String telefone, String telefoneComercialResidencial, String celularOp, String celular, String sexo, String dataNascimento, String formacao, String anoFormacao, String anoConclusao, String instituicaoFormacao, String tituloMonografiaFormacao, String orientadorMonografiaFormacao, String vagasInteresse) {
        this.nome = nome;
        this.email = email;
        this.receberEmailOp = receberEmailOp;
        this.telefone = telefone;
        this.telefoneComercialResidencial = telefoneComercialResidencial;
        this.celularOp = celularOp;
        this.celular = celular;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.formacao = formacao;
        this.anoFormacao = anoFormacao;
        this.anoConclusao = anoConclusao;
        this.instituicaoFormacao = instituicaoFormacao;
        this.tituloMonografiaFormacao = tituloMonografiaFormacao;
        this.orientadorMonografiaFormacao = orientadorMonografiaFormacao;
        this.vagasInteresse = vagasInteresse;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", receberEmailOp='" + receberEmailOp + '\'' +
                ", telefone='" + telefone + '\'' +
                ", telefoneComercialResidencial='" + telefoneComercialResidencial + '\'' +
                ", celularOp='" + celularOp + '\'' +
                ", celular='" + celular + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", formacao='" + formacao + '\'' +
                ", anoFormacao='" + anoFormacao + '\'' +
                ", anoConclusao='" + anoConclusao + '\'' +
                ", instituicaoFormacao='" + instituicaoFormacao + '\'' +
                ", tituloMonografiaFormacao='" + tituloMonografiaFormacao + '\'' +
                ", orientadorMonografiaFormacao='" + orientadorMonografiaFormacao + '\'' +
                ", vagasInteresse='" + vagasInteresse + '\'' +
                '}';
    }
}
