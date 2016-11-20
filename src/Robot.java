/**
 * Created by HP on 20/11/2016.
 */
public class Robot {
    private String nom;
    private int x;
    private int y;
    private String direction;


    public Robot(String nom ){
        this.nom=nom;
        this.x=0;
        this.y=0;
        this.direction= "est";  }

    // constructeur
    public Robot(String nom ,int x,int y, String direction){
        this.nom=nom;
        this.x=x;
        this.y=y;
        this.direction=direction;  }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void Avance (){

     switch (direction){
         case "nord": y++;
             break;
         case"sud": y--;
             break;
         case"est": x++;
             break;
         case"ouest":x--;
             break;


     }}
    public void Droite() {


            switch (direction) {
                case  "nord":
                    direction="est";
                    break;
                case "sud":
                    direction="ouest";
                    break;
                case "est":
                    direction="sud";
                    break;
                case "ouest":
                    direction="nord";
                     break;


            }
        }
        public void Affiche(){
            System.out.println( "le nom est" +" " +  "  "+ nom + "la position est"+" "+ "("+ "  " +x+","+"  "+y+ ")"+ " " +"la direction"+"  "+direction);
        }


    }
