package com.song.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Optional;

@Getter
@Setter
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
}
