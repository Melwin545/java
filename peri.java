class Area {
    protected double r;

    public void get(int r) {
        this.r = r;
    }

    public void calc() {
        double area = 3.14 * r * r;
        System.out.println("Area=" + area);
    }
}

class Peri extends Area {
    double peri;

    public void calc() {
        peri = 2 * 3.14 * r;
        System.out.println("Perimeter=" + peri);
    }

    public static void main(String[] args) {
        Area obj = new Area();
        obj.get(3);
        obj.calc();

        obj = new Peri();
        obj.get(4);
        obj.calc();
    }
}
