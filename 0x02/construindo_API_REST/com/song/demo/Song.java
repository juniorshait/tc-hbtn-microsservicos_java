package com.song.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Optional;


public class Song {

     private Integer id;
     private String nome;
     private String artista;
     private String album;
     private String anoLancamento;

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Song song = (Song) o;
          return id.equals(song.id);
     }
     @Override
     public int hashCode() {
          return Objects.hash(id);
     }

     public Integer getId() {
          return id;
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getArtista() {
          return artista;
     }

     public void setArtista(String artista) {
          this.artista = artista;
     }

     public String getAlbum() {
          return album;
     }

     public void setAlbum(String album) {
          this.album = album;
     }

     public String getAnoLancamento() {
          return anoLancamento;
     }

     public void setAnoLancamento(String anoLancamento) {
          this.anoLancamento = anoLancamento;
     }

     @Override
     public String toString() {
          return "Song{" +
                  "id=" + id +
                  ", nome='" + nome + '\'' +
                  ", artista='" + artista + '\'' +
                  ", album='" + album + '\'' +
                  ", anoLancamento='" + anoLancamento + '\'' +
                  '}';
     }
}
