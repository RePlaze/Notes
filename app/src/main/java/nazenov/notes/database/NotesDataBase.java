package nazenov.notes.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import nazenov.notes.dao.NoteDao;
import nazenov.notes.entities.Note;

@Database(entities = Note.class , version = 1, exportSchema = false)
public abstract class NotesDataBase extends RoomDatabase {
    private static NotesDataBase notesDatabase;

    public static synchronized NotesDataBase getDatabase(Context context){
        if(notesDatabase == null){
            notesDatabase = Room.databaseBuilder(
                    context , NotesDataBase.class ,
                    "notes_db"
            ).build();
        }
        return notesDatabase;
    }

    public abstract NoteDao noteDao();
}
