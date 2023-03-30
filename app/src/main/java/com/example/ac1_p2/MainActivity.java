package com.example.ac1_p2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.ac1_p2.adapter.AlbumAdapter;
import com.example.ac1_p2.dataset.AlbumDataset;
import com.example.ac1_p2.model.Album;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerAlbum;
    private AlbumAdapter albumAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupRecycler();
    }
    public void setupRecycler(){
        recyclerAlbum = (RecyclerView)findViewById(R.id.rcAlbum);

        //definir o layout como lista vertical
        recyclerAlbum.setLayoutManager(new LinearLayoutManager(this));

        //definir layout como lista horizontal
        recyclerAlbum.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        //definir layout como grid
        // recyclerPessoa.setLayoutManager(new GridLayoutManager(this,2));

        //definir o adapter
        albumAdapter = new AlbumAdapter(AlbumDataset.getLista());recyclerAlbum.setAdapter(albumAdapter);

        //criar linha para separar itens
        recyclerAlbum.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
    public void trocarLayoutClick(View view){
        RecyclerView.LayoutManager layoutManager = recyclerAlbum.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager){
            recyclerAlbum.setLayoutManager(new LinearLayoutManager(this));
        } else if (layoutManager instanceof LinearLayoutManager && ((LinearLayoutManager) layoutManager).getOrientation() == RecyclerView.VERTICAL){
            recyclerAlbum.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        } else {
            recyclerAlbum.setLayoutManager(new GridLayoutManager(this, 2));
        }
    }

}