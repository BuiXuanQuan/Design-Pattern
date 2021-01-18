package Chef;

import java.util.ArrayList;
import java.util.Random;

public class ManagerChef {
    //list of chef manage
    ArrayList<Chef> listChef = new ArrayList<Chef>();
    public ManagerChef() {

    }
    //add chef when have new chef
    public void addChef(Chef chef) {
        this.listChef.add(chef);
    }
    //
    public ArrayList<Chef> getlistChefCanMake(int index) {
        ArrayList<Chef> listChefCanMake = new ArrayList<>();
        for(Chef chef: listChef) {
            if(chef.getCanMake().contains(index)) {
                listChefCanMake.add(chef);
            }
        }
        return listChefCanMake;
    }
    public Chef getRandomChefCanMake(int index){
        Random random = new Random();
        ArrayList<Chef> listChefCanMake = getlistChefCanMake(index);
        int x = random.nextInt(listChefCanMake.size());
        return listChefCanMake.get(x);
    }
}
