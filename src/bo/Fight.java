package bo;

import java.util.concurrent.ThreadLocalRandom;

public class Fight {

    public Fight()
    {

    }

    public void battle(Trainer trainer1, Trainer trainer2, int nbMax)
    {
        int i = 0;
        int randomNum;
        boolean victory;

        do {
            i++;
            System.out.println("Round n°" + i + ":");
            //System.out.println(trainer1.getName() + " your team statement: ");
            //trainer1.showList();
            //System.out.println(trainer2.getName() + " your team statement: ");
            //trainer2.showList();

            //randomNum = ThreadLocalRandom.current().nextInt(0, (nbMax / 2));
            victory = versus(trainer1.getListPokemon().get(trainer1.getListPokemon().size() - 1),
                    trainer2.getListPokemon().get(trainer2.getListPokemon().size() - 1));
            if (victory)
                trainer1.getListPokemon().remove(trainer1.getListPokemon().size() - 1);
            else
                trainer2.getListPokemon().remove(trainer2.getListPokemon().size() - 1);
            nbMax--;
        }while (trainer1.getListPokemon().size() >= 1 && trainer2.getListPokemon().size() >= 1);

        if (trainer1.getListPokemon().size() > trainer2.getListPokemon().size())
            System.out.println("Trainer " + trainer1.getName() + " win!");
        else
            System.out.println("Trainer " + trainer2.getName() + " win!");
    }

    public boolean versus(Pokemon poke1, Pokemon poke2) {
        do {
            System.out.println(poke1.getName() + " shout : " + poke1.getShout() + " and start to attack " + poke2.getName());
            poke2.setHealth(poke2.getHealth() - poke1.getPower());

            System.out.println(poke1.getName() + " does " + poke1.getPower() + " damages to "
                    + poke2.getName() + " so " + poke2.getName() + " has " + poke2.getHealth() + " pv left.");

            if (poke2.getHealth() < 1) {
               System.out.println(poke2.getName() + " is dead! " + poke2.getLooseShout());
                return false;
            }
            System.out.println(poke1.getName()+ " shout : " + poke1.getShout() + " attack on " + poke2.getName());
            poke1.setHealth(poke1.getHealth() - poke2.getPower());

            System.out.println(poke2.getName() + " does " + poke2.getPower() + " damages to "
                    + poke1.getName() + " so " + poke1.getName() + " has " + poke1.getHealth() + " pv left.");
        } while (poke1.getHealth() >= 1 && poke2.getHealth() >= 1);
        if (poke1.getHealth() < 1)
        {
            System.out.println(poke1.getLooseShout());
            System.out.println(poke1.getName() + " has lost the fight!");
            return true;
        }
        else {
            System.out.println(poke2.getLooseShout());
            System.out.println(poke2.getName() + " has lost the fight!");
            return false;
        }
    }
}
