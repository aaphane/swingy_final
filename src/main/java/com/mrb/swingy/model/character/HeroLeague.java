package com.mrb.swingy.model.character;

public abstract class HeroLeague {

    public static Hero newHero(String name, String heroClass) {

        if ("ZLATAN".equals(heroClass.toUpperCase())) {
            return Director.createZlatan(name);
        } else if ("AGUERO".equals(heroClass.toUpperCase())) {
            return Director.createAguero(name);
        } else if ("CR".equals(heroClass.toUpperCase())) {
            return Director.createCR(name);
        } else if ("RAMOS".equals(heroClass.toUpperCase())) {
            return Director.createRamos(name);
        } else if ("JESUS".equals(heroClass.toUpperCase())) {
            return Director.createJesus(name);
        } else if ("PEP".equals(heroClass.toUpperCase())) {
            return Director.createPep(name);
        }
        throw new IllegalArgumentException("Invalid hero class: " + heroClass);
    }
}
