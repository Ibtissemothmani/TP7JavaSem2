public class Vecteur {
    private double[] composantes;

    public Vecteur(double[] composantes) {
        this.composantes = composantes;
    }

    public double prod_scal(Vecteur v) {
        if (this.composantes.length != v.composantes.length) return 0;
        double produit = 0;
        for (int i = 0; i < composantes.length; i++) {
            produit += this.composantes[i] * v.composantes[i];
        }
        return produit;
    }

    public static Vecteur produit(Vecteur v1, Vecteur v2) {
        if (v1.composantes.length != v2.composantes.length) return null;
        double[] res = new double[v1.composantes.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = v1.composantes[i] * v2.composantes[i];
        }
        return new Vecteur(res);
    }

    public static Vecteur somme(Vecteur v1, Vecteur v2) {
        if (v1.composantes.length != v2.composantes.length) return null;
        double[] res = new double[v1.composantes.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = v1.composantes[i] + v2.composantes[i];
        }
        return new Vecteur(res);
    }

    public void affiche() {
        System.out.print("(");
        for (int i = 0; i < composantes.length; i++) {
            System.out.print(composantes[i]);
            if (i < composantes.length - 1) System.out.print(", ");
        }
        System.out.println(")");
    }

    public static void main(String[] args) {
        Vecteur v1 = new Vecteur(new double[]{1.0, 2.0, 3.0});
        Vecteur v2 = new Vecteur(new double[]{4.0, 5.0, 6.0});

        System.out.print("v1 = "); v1.affiche();
        System.out.print("v2 = "); v2.affiche();

        System.out.println("Produit scalaire : " + v1.prod_scal(v2));

        Vecteur produit = Vecteur.produit(v1, v2);
        System.out.print("Produit composante par composante : ");
        if (produit != null) produit.affiche();
        else System.out.println("null");

        Vecteur somme = Vecteur.somme(v1, v2);
        System.out.print("Somme des vecteurs : ");
        if (somme != null) somme.affiche();
        else System.out.println("null");
    }
}