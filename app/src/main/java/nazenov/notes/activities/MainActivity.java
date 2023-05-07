package nazenov.notes.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

import nazenov.notes.R;
import nazenov.notes.entities.Note;


public class MainActivity extends Activity {
    public static final int REQUEST_CODE_ADD_NOTE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ImageView imageAddNoteMain = findViewById(R.id.AddMainButton);
        imageAddNoteMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(getApplicationContext(), CreateNote.class),
                        REQUEST_CODE_ADD_NOTE
                );
            }
        });
        getNotes();
    }

    private void getNotes() {
        class GetNotesTask extends AsyncTask<Void,Void, List<Note>>{

            @Override
            protected List<Note> doInBackground(Void... voids) {
                return null;
            }

            @Override
            protected void onPostExecute(List<Note> notes) {
                super.onPostExecute(notes);
            }
        }
    }
}