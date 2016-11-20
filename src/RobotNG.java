/**
 * Created by HP on 20/11/2016.
 */
public class RobotNG extends Robot {
    private boolean Turbo;

    public boolean getTurbo() {
        return Turbo;

    }

    public void setTurbo(boolean turbo) {
        Turbo = turbo;
    }

    public RobotNG(String nom, int x, int y, String position , boolean Turbo) {
        super(nom, x, y, position);
        Turbo = false;
    }


    public void Avance(int pas) {
        for (int i = 0; i < pas; i++) {
            Avance();
        }
    }

    public void Gauche() {
        for (int i = 0; i < 3; i++) {
            Droite();
        }
    }

    public void DemiTour() {
        for (int i = 0; i < 2; i++) {
            Droite();
        }
    }

    public void Avancer2(int pas) {
        if (Turbo=true)
            pas=pas*3;

        if (getDirection().equals("nord"))
            setY(getY() + pas);
        else
            setY(getY() - pas);
        if (getDirection().equals("est"))
            setX(getX() + pas);
        else
            setX(getX() + pas);
    }


    public void Gauche2() {
        switch (getDirection()) {

            case "nord":
                setDirection("ouest");
                break;
            case "sud":
                setDirection("est");

                break;
            case "est":
                setDirection("sud");
                break;
            case "ouest":
                setDirection("nord");
                break;


        }
    }

    public void DemiTour2() {
        switch (getDirection()) {

            case "nord":
                setDirection("sud");
                break;
            case "sud":
                setDirection("nord");
                break;
            case "est":
                setDirection("ouest");
                break;
            case "ouest":
                setDirection("est");
                break;


        }
    }
public void ModeTurb (){
    if (Turbo=false)
        Turbo=true;
}


public void Affichage2(){
    if (Turbo = true) {
        super.Affiche();
        System.out.print("/n turbo on");

    }
    else{
        super.Affiche();
        System.out.print("/n turbo off");

    }



}


}




