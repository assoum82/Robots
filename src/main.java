/**
 * Created by HP on 20/11/2016.
 */import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<Robot> liste = new ArrayList<>();


        Robot robot1 = new Robot("ibtissem",0,1,"nord");
        Robot robot2= new Robot("ibtissem", 1,1, "Sud");
        RobotNG robot3=(RobotNG)new RobotNG("ibtissem",1,0,"est",true);
        RobotNG robot4=(RobotNG)new RobotNG("ibtissem",-1,0,"ouest",false);





        liste.add(robot1);
        liste.add(robot2);
        liste.add(robot3);
        liste.add(robot4);



        robot1.Avance();
        robot1.Affiche();
        robot2.Droite();
        robot2.Affiche();

        robot3.ModeTurb();
        robot3.Avance(2);
        robot3.Gauche2();
        robot3.DemiTour2();
        robot3.Affiche();


        robot4.Avance(2);
        robot4.Gauche2();
        robot4.DemiTour2();
        robot4.Affiche();











}}
