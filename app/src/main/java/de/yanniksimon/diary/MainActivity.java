package de.yanniksimon.diary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView backgroundImageView;

    ArrayList<Entry> entryArrayList;
    EntryAdapter entryAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entryArrayList = new ArrayList<>();

        entryArrayList.add(new Entry("Erster Arbeitstag","Heute war mein erster Arbeitstag",9,5,6));
        entryArrayList.add(new Entry("Das Leben ist schön!","Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum.",9,5,6));
        entryArrayList.add(new Entry("Erster Arbeitstag","Heute war mein erster Arbeitstag",9,5,6));
        entryArrayList.add(new Entry("Erster Arbeitstag","Heute war mein erster Arbeitstag",9,5,6));
        entryArrayList.add(new Entry("Erster Arbeitstag","Heute war mein erster Arbeitstag",9,5,6));
        entryArrayList.add(new Entry("Erster Arbeitstag","Heute war mein erster Arbeitstag",9,5,6));


        listView = findViewById(R.id.list_view);
        entryAdapter = new EntryAdapter(this, R.layout.list_item_diary, entryArrayList);
        listView.setAdapter(entryAdapter);
        
        /*
        backgroundImageView = findViewById(R.id.background_image_view);

        Glide.with(this)
                .load(getDrawable(R.drawable.background))
                .into(backgroundImageView);




    */
    }
}

