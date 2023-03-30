package com.example.ac1_p2.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ac1_p2.R;
import com.example.ac1_p2.model.Album;

import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumHolder> {

    private List<Album> albuns;
    public AlbumAdapter(List<Album> album){
        this.albuns = album;
    }

    @NonNull
    @Override
    public AlbumHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AlbumHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.albuns, parent,
                                false));
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumHolder holder, int position) {
        Album album = albuns.get(position);
        holder.getTxtBanda().setText(album.getBanda());
        holder.getImageView().setImageResource(album.getImage());
        holder.getTxtFotografo().setText(album.getFotografo());
        holder.getTxtAnoAlbun().setText(album.getAno() + "");
        holder.getSaibaMais().setOnClickListener(view -> Toast.makeText(view.getContext(), album.getSaibaMais(), Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return albuns == null ? 0 : albuns.size();
    }
}
    /*

    private void removerItem(int position) {
        pessoas.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position,pessoas.size());
    }
    public void adicionarItem(Pessoa pessoa){
        PessoaDataset.addPessoa(pessoa);
        notifyItemInserted(getItemCount());
    }

    @Override
    public int getItemCount() {
        return pessoas == null ? 0 : pessoas.size();
    }
}*/
