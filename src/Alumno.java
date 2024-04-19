public class Alumno {
    public static final int CEVA = 3;
    public static final int CEJER = 5;
    private double notas [][];
    private int id;
    private String nom;

    public Alumno(double[][] notas, int id, String nom) {
        this.notas = notas;
        this.id = id;
        this.nom = nom;
    }
}
