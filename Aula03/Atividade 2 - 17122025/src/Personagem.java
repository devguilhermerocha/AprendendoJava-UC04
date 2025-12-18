public class Personagem {
    private String name;
    private int lvl;
    private double expmax;
    private double exp;
    private int atk;
    private int hpmax;
    private int hpatual;

    protected Personagem(String nome){
        this.name = nome;
        lvl = 1;
        expmax = 50;
        exp = 0;
        atk = 10;
        hpmax = 100;
        hpatual = hpmax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public int getAtk() {
        return atk;
    }

    public int getHpmax() {
        return hpmax;
    }


    public int getHpatual() {
        return hpatual;
    }

    public double getExpmax() {
        return expmax;
    }

    public double getExp() {
        return exp;
    }

    void receba(int damage) {
        if (damage > 0) {
            hpatual -= damage;
            if (hpatual < 0) {
                hpatual = 0;
            }
        }
        IO.println(name+" recebeu "+damage+" de damage. Vida restante: "+hpatual);
    }

    void tomevida(int curar) {
        if (curar > 0) {
            hpatual += curar;
            if (hpatual > hpmax) {
                hpatual = hpmax;
            }
        }
    }

    void tomelvl(int exp) {
        double memory;
        this.exp += exp;
        while (this.exp > expmax) {
            lvl += 1;
            expmax = (lvl * 2.5) * expmax;
            memory = exp - this.exp;
            this.exp += memory;
            IO.println("Você subiu para level "+lvl);
        }
    }

    void tomedano(Personagem cleitim) {
        if (cleitim.getHpatual() > 0) {
            cleitim.receba(atk);
        }
        else {
            IO.println("Não tem como atacar um defunto!");
        }
    }
}
