package lesson22;

public class Chelovek {
    final String pol;

    public Chelovek(String pol) {
        this.pol = pol;
    }

    private boolean clever;

    public boolean isClever() {
        return clever;
    }

    public void setClever(boolean b) {
        this.clever = b;
    }

    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder s) {
        this.name = s;
    }

    private int vozrast;

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i > 0) {
            this.vozrast = i;
        }
    }


    private int ves;

    public int getVes() {
        return ves;
    }

    public void setVes(int v) {
        if (v > 0) {
            this.ves = v;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName(new StringBuilder("Kolya"));
//        c.setVozrast(15);
//        c.setVes(50);
//        System.out.println(c.getName());
//        System.out.println(c.getVozrast());
//        System.out.println(c.getVes());
//        c.setClever(true);
//        System.out.println(c.isClever());
        c.getName().append("!!!!");
        System.out.println(c.getName());

    }
}
