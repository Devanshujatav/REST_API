package org.devanshu;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
    List<Alien> aliens;

    public AlienRepository(){
        aliens = new ArrayList<>();

        Alien a1 = new Alien();
        a1.setName("Devanshu");
        a1.setPoints(100);

        Alien a2 = new Alien();
        a2.setName("Neha");
        a2.setPoints(60);

        aliens.add(a1);
        aliens.add(a2);
    }

    public List<Alien> getAliens(){
        return this.aliens;
    }

    public Alien getAlien(int id){
        for (Alien a : aliens){
            if (a.getId() == id){
                return a;
            }
        }
        return null;
    }

    public void create(Alien a){
        aliens.add(a);
    }
}
