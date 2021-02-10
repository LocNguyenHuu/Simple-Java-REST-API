package com.example.easynotes.repository;

import com.example.easynotes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Loc Nguyen.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
