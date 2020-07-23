package Sharpie;

import java.util.ArrayList;

public class SharpieSet {

    private ArrayList<Sharpie> sharpies = new ArrayList<>();

    public int countUsable(){
        int usableSharpies = 0;
        for (int i = 0; i < this.sharpies.size(); i++) {
            Sharpie currentSharpie = this.sharpies.get(i);
            if (currentSharpie.getInkAmount() != 0){
                usableSharpies += 1;
            }
        }
        return usableSharpies;
    }

    public void removeTrash(){
        if (this.sharpies.size() != 0){
            for (int i = 0; i < this.sharpies.size(); i++) {
                Sharpie currentSharpie = this.sharpies.get(i);
                if (currentSharpie.getInkAmount() == 0){
                    this.sharpies.remove(currentSharpie);
                }
            }
        } else {
            System.out.println("There are no sharpies!");
        }

    }

}
