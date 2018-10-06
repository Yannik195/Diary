package de.yanniksimon.diary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ViewEntryActivity extends AppCompatActivity {


    String title;
    String description;
    int overall;
    int mood;
    int productivity;

    TextView titleTextView;
    TextView descriptionTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_entry);

        titleTextView = findViewById(R.id.view_title_text_view);
        descriptionTextView = findViewById(R.id.view_description_text_view);
        imageView = findViewById(R.id.view_image_view);

        Bundle extras = getIntent().getExtras();
        title = extras.getString("title");
        description = extras.getString("description");
        overall = extras.getInt("overall");
        mood = extras.getInt("mood");
        productivity = extras.getInt("productivity");

        titleTextView.setText(title);
        descriptionTextView.setText(description);
        Glide.with(getApplicationContext())
                .load(getDrawable(R.drawable.background))
                .into(imageView);




    }
}
