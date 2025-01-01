package com.Literalura.model;

public enum Idiomas {
    en("en"), es("es"), fr("fr"), hu("hu"), fi("fi"), pt("pt");

    private String idiomasInGutendex;

    Idiomas(String idiomasInGutendex) {
        this.idiomasInGutendex = idiomasInGutendex;
    }

    public static Idiomas fromString(String idioma) {
        for (Idiomas idiomas : Idiomas.values()) {
            if (idiomas.idiomasInGutendex.equalsIgnoreCase(idioma)) {
                return idiomas;
            }
        }
        return null;
    }
}
