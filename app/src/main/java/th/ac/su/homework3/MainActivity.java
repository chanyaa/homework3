package th.ac.su.homework3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import th.ac.su.homework3.model.WordItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter();

        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);

        RecyclerView rv = findViewById(R.id.word_list_recycler_view);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }
}

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private WordItem[] items = {
            new WordItem(R.drawable.a, "Lily", "ดอกไม้เมืองหนาว"),
            new WordItem(R.drawable.b, "Hibiscus", "ดอกไม้เมืองร้อน"),
            new WordItem(R.drawable.c, "Lotus", "ดอกไม้เมืองร้อน"),
            new WordItem(R.drawable.d, "Sakura", "ดอกไม้เมืองหนาว"),
            new WordItem(R.drawable.e, "Tulip", "ดอกไม้เมืองหนาว"),
            new WordItem(R.drawable.f, "Sunflower", "ดอกไม้เมืองร้อน"),
            new WordItem(R.drawable.g, "Rose", "ดอกไม้เมืองหนาว"),
            new WordItem(R.drawable.h, "Daisy", "ดอกไม้เมืองหนาว"),
            new WordItem(R.drawable.i, "Hydrangea", "ดอกไม้เมืองหนาว"),
            new WordItem(R.drawable.j, "Jasmine", "ดอกไม้เมืองร้อน"),
    };

    MyAdapter() {

    }

    @NonNull

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_word_item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }


    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.ImageView.setImageResource(items[position].imageResId);
        holder.wordTextView.setText(items[position].word);
        holder.wordTextView2.setText(items[position].word2);
    }


    public int getItemCount() { return 10; }


    static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView ImageView;
        TextView wordTextView;
        TextView wordTextView2;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageView = itemView.findViewById(R.id.image_vieww);
            wordTextView = itemView.findViewById(R.id.textView);
            wordTextView2 = itemView.findViewById(R.id.textView2);

        }
    }
}