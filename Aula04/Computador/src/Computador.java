import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Computador {
    ///  Montando um computador (Apenas Configuração)
    private String placaMae;
    private String processador;
    private String placaVideo;
    private int ramGB;
    private int romGB;
    private int fonteW;
    private String so;
    private boolean taLigado;
    private String nome;
    private String senha;
    Computador(String placaMae, String processador, String placaVideo, int ramGB, int romGB, int fonteW, String so){
        this.placaMae = placaMae;
        this.processador = processador;
        this.placaVideo = placaVideo;
        this.ramGB = ramGB;
        this.romGB = romGB;
        this.fonteW = fonteW;
        this.so = so;
        this.taLigado = false;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public int getRam() {
        return ramGB;
    }

    public void setRam(int ramGB) {
        this.ramGB = ramGB;
    }

    public int getDisco() {
        return romGB;
    }

    public void setDisco(int romGB) {
        this.romGB = romGB;
    }

    public int getFonte() {
        return fonteW;
    }

    public void setFonte(int fonte) {
        this.fonteW = fonte;
    }

    public String getSystem() {
        return so;
    }

    public void setSystem(String so) {
        this.so = so;
    }

    public void setUser(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public void power(){
        if (taLigado == false) {
            IO.println("Inicializando...");
            taLigado = true;
        }
        else {
            IO.println("Desligando...");
            taLigado = false;
        }
    }

    public void informacoes() {
        IO.println("Placa Mãe: "+placaMae+"\nProcessador: "+processador+"\nPlaca de Vídeo: "+placaVideo+"\nMemória RAM: "+ramGB+"GB\nArmazenamento: "+romGB+"GB\nFonte: "+fonteW+"W\nSistema Operacional: "+so);
    }

    /*public void login(String nome, String senha){
        if (taLigado != true){
            IO.println("O computador está desligado!");
        }
        else {
            if (this.nome == nome && this.senha == senha) {
                IO.println("Logando...");
            }
            else {
                if (this.nome != nome && this.senha == senha) {
                    IO.println("Usuário não indetificado!");
                }
                else if (this.nome == nome && this.senha != senha) {
                    IO.println("Senha está errada!");
                }
                else {
                    IO.println("Usuário e senha estão errados!");
                }
            }
        }
    }*/
    public String login(String nome, String Senha) {
        if (taLigado != true) {
            return "O computador está desligado!";
        }
        else {
            if (this.nome != nome && this.senha != senha){
                return "Usuário e senha estão errados!";
            }
            else if (this.nome != nome) {
                return "Usuário não indetificado!";
            }
            else if (this.senha != senha){
                return "Senha está errada!";
            }
            else {
                return "Logando...";
            }
        }
    }
}
