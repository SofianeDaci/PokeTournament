package bo;

import java.util.ArrayList;
import java.util.Scanner;

public class Tournament {
    private int nbMax;
    private Trainer trainer1;
    private Trainer trainer2;
    //private ArrayList<Pokemon> listPokemon;

    public Tournament(int nbMax) {
        this.trainer1 = new Trainer("null");
        this.trainer2 = new Trainer("null");
        this.nbMax = nbMax;
        //this.listPokemon = new ArrayList<Pokemon>();

        initTournament();
    }

    public void initTournament()
    {
        Scanner scanner = new Scanner(System.in);

        if (nbMax % 2 != 0)
            nbMax++;
        //System.out.println(nbMax);
        System.out.println("Hello and Welcome to the new 2018 PokemonTournament !");
        System.out.println("Please enter your Trainer name");
        this.trainer1.setName(scanner.nextLine());
        System.out.println("Hi " + this.trainer1.getName() + " take your time and make ur team!");
        System.out.println("Second Trainer what is your name?");
        this.trainer2.setName(scanner.nextLine());
        System.out.println("Ok let's make your team");
        System.out.println(this.trainer1.getName() + " let's enter your pokemon name one by one :");
        firstStep(trainer1);
        System.out.println("Tournament will start soon! " + trainer2.getName() + " let's enter your pokemon name one by one");
        firstStep(trainer2);
        System.out.println("Let's start the Tournament, May the best Win!");
        Fight mainFight = new Fight();
        mainFight.battle(trainer1, trainer2, nbMax);
    }
    public void firstStep(Trainer trainer)
    {
        trainer.createTeam(this.nbMax);
        System.out.println("Your Pokemon team is : ");
        trainer.showList();
        System.out.println("Good luck " + trainer.getName());
    }


}
