package com.example.demo24;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT p From Book p WHERE CONCAT(p.name, '', p.date, '', p.moderator, '', p.speaker) LIKE %?1%")
    List<Book> search(String keyword);

}
