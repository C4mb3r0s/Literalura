package com.Literalura.model;

import java.util.OptionalDouble;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    @ManyToOne
    private Autor autor;
    @Enumerated(EnumType.STRING)
    private Idiomas idioma;
    private Double numeroDescargas;

    public Libro(){}

    public Libro(DatosLibros datosLibros) {
         this.titulo = datosLibros.titulo();
        this.autor = new Autor(datosLibros.autor().get(0));
        this.idioma = Idiomas.fromString(datosLibros.idioma().get(0));
        this.numeroDescargas = OptionalDouble.of(datosLibros.numeroDescargas()).orElse(0);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Idiomas getIdioma() {
        return idioma;
    }

    public void setIdioma(Idiomas idioma) {
        this.idioma = idioma;
    }

    public Double getNumeroDescargas() {
        return numeroDescargas;
    }

    public void setNumeroDescargas(Double numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }

    @Override
    public String toString() {
        return "++++++Libro++++++" + "\n" +
                "Titulo: " + titulo + "\n" +
                "Autor: " + autor +"\n" +
                "Idioma: " + idioma + "\n" + 
                "Descargas: " + numeroDescargas + "\n" +
                "++++++++++++++++++" + "\n";
    }
}
