package Creatures;

public class ANIMAL {
    public static final double DEFAULT_DOG_WEIGHT=5.0;
    private static final Double DEFAULT_CAT_WEIGHT = 3.0 ;
    private static final Double DEFAULT_HORSE_WEIGHT = 800.0;
    private static final Double DEFAULT_ANIAML_WEIGHT = 1.0 ;


    public String species;
    public String name;
    public Double weight;
    boolean isAlive;


    public ANIMAL (String species) {
        this.isAlive = true;
        this.species = species;
        switch (species){
            case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "equus" -> this.weight = DEFAULT_HORSE_WEIGHT;
            default -> this.weight = DEFAULT_ANIAML_WEIGHT;



            }

        }
    }


