package com.Vehicle;

public class Stand {

    private final int MAXAUTO = 20;
    private Veiculo[] autoList = new Veiculo[MAXAUTO];
    int count = 0;

    public void addAuto(Veiculo veiculo){
        if (count < MAXAUTO){
            autoList[count] = veiculo;
            count +=1;
        } else {
            System.out.println("Max Veiculos!");
        }
    }

    public void removeAuto(int id){
        //int found = 0;
        Veiculo[] tmp = new Veiculo[autoList.length];

        for (int i = 0; i < MAXAUTO; i++){
            if (autoList[i].getId() == id){
                //found++;
                count--;
                continue;
            }
            tmp[i++] = autoList[i];
        }
        autoList = tmp;
    }

    public String toString(){
        String text = "";
        for (int i = 0; i < count; i++){
            text += "Veiculo " + (i + 1) + ":" + "\n" + autoList[i].toString() + "\n";
        }
        return text;
    }
}
