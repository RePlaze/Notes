package nazenov.notes.listeners;

import nazenov.notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);

}
