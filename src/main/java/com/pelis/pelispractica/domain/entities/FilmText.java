// package com.pelis.pelispractica.domain.entities;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "filmtexts")
// public class FilmText {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Short film_id;

//     @Column(columnDefinition = "VARCHAR(255)", nullable = false)
//     private String title;
    
//     @Column(columnDefinition = "text", nullable = false)
//     private String description;

//     public FilmText() {
//     }

//     public FilmText(Short film_id, String title, String description) {
//         this.film_id = film_id;
//         this.title = title;
//         this.description = description;
//     }

//     public Short getFilm_id() {
//         return film_id;
//     }

//     public void setFilm_id(Short film_id) {
//         this.film_id = film_id;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     public String getDescription() {
//         return description;
//     }

//     public void setDescription(String description) {
//         this.description = description;
//     }


// }
