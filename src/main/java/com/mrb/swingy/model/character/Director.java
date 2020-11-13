package com.mrb.swingy.model.character;

public class Director {

    private static HeroBuilder buildNew(String name) {
        HeroBuilder builder = new HeroBuilder();
        builder.setName(name);
        builder.setLevel(0);
        builder.setExperience(0);
        return builder;
    }

    public static Hero createZlatan(String name) {
        HeroBuilder builder = buildNew(name);
        builder.setAttack(40);
        builder.setDefense(20);
        builder.setHitPoints(100);
        builder.setHeroClass("Zlatan");
        return builder.getHero();
    }

    public static Hero createAguero(String name) {
        HeroBuilder builder = buildNew(name);
        builder.setAttack(30);
        builder.setDefense(15);
        builder.setHitPoints(90);
        builder.setHeroClass("Aguero");
        return builder.getHero();
    }

    public static Hero createCR(String name) {
        HeroBuilder builder = buildNew(name);
        builder.setAttack(25);
        builder.setDefense(25);
        builder.setHitPoints(90);
        builder.setHeroClass("CR");
        return builder.getHero();
    }

    public static Hero createRamos(String name) {
        HeroBuilder builder = buildNew(name);
        builder.setAttack(40);
        builder.setDefense(30);
        builder.setHitPoints(120);
        builder.setHeroClass("Ramos");
        return builder.getHero();
    }

    public static Hero createJesus(String name) {
        HeroBuilder builder = buildNew(name);
        builder.setAttack(45);
        builder.setDefense(10);
        builder.setHitPoints(80);
        builder.setHeroClass("Jesus");
        return builder.getHero();
    }

    public static Hero createPep(String name) {
        HeroBuilder builder = buildNew(name);
        builder.setAttack(25);
        builder.setDefense(20);
        builder.setHitPoints(110);
        builder.setHeroClass("Pep");
        return builder.getHero();
    }
}
