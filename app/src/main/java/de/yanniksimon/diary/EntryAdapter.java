package de.yanniksimon.diary;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class EntryAdapter extends ArrayAdapter<Entry> {

    private Context mContext;
    private ArrayList<Entry> entryArrayList;

    public EntryAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Entry> objects) {
        super(context, resource, objects);
        mContext = context;
        entryArrayList = objects;
    }






    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item_diary,parent,false);
        }

        final Entry currentEntry = entryArrayList.get(position);

        TextView overallTextView = convertView.findViewById(R.id.overall_text_view);
        overallTextView.setText(String.valueOf(currentEntry.getOverall()));

        TextView productivityTextView = convertView.findViewById(R.id.productivity_text_view);
        productivityTextView.setText(String.valueOf(currentEntry.getProductivity()));

        TextView moodTextView = convertView.findViewById(R.id.mood_text_view);
        moodTextView.setText(String.valueOf(currentEntry.getMood()));

        TextView headlineTextView = convertView.findViewById(R.id.headline_text_view);
        headlineTextView.setText(String.valueOf(currentEntry.getTitle()));

        TextView descriptionTextView = convertView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(String.valueOf(currentEntry.getDescription()));

        ImageView backgroundImageView = convertView.findViewById(R.id.background_image_view);

        Glide.with(mContext)
                .load(mContext.getDrawable(R.drawable.background))
                .into(backgroundImageView);

        final String title = currentEntry.getTitle();

        backgroundImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Clcked" + title, Toast.LENGTH_LONG).show();
                Intent viewEntryIntent = new Intent(mContext,ViewEntryActivity.class);
                viewEntryIntent.putExtra("title", currentEntry.getTitle());
                viewEntryIntent.putExtra("description", currentEntry.getDescription());
                viewEntryIntent.putExtra("mood", currentEntry.getMood());
                viewEntryIntent.putExtra("overall", currentEntry.getOverall());
                viewEntryIntent.putExtra("productivity", currentEntry.getProductivity());
                mContext.startActivity(viewEntryIntent);
            }
        });


        return convertView;
    }
}
