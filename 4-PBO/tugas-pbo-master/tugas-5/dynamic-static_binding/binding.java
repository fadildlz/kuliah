class Kendaraan {
    void bergerak(){
        System.out.println("Kendaraan bergerak");
    }
    void berhenti(){
        System.out.println("Kendaraan berhenti");
    }
}

class TestBinding {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan();
        kendaraan1.bergerak();
        kendaraan1.berhenti();
    }
}