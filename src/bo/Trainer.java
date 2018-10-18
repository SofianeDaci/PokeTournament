package bo;

import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {
    private String name;
    private ArrayList<Pokemon> listPokemon;

    public Trainer(String name)
    {
        this.name = name;
        listPokemon = new ArrayList<Pokemon>();
    }

    public ArrayList<Pokemon> getListPokemon()
    {
        return this.listPokemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createTeam(int nbMax)
    {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nbMax / 2 ; i++)
        {
            Pokemon currentPoke = new Pokemon(100, 10, "null");
            currentPoke.setName(scanner.nextLine());
            listPokemon.add(currentPoke);
        }
    }
    public void showList()
    {
        for (int i = 0; i < listPokemon.size(); i++)
        {
            System.out.println(listPokemon.get(i).getName());
        }
    }

}
