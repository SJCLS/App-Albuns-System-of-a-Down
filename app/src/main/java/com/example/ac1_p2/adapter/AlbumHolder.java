package com.example.ac1_p2.adapter;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ac1_p2.R;

public class AlbumHolder extends RecyclerView.ViewHolder {
    private TextView txtBanda;
    private ImageView imgBanda;
    private TextView txtFotografo;
    private TextView txtAnoAlbun;
    private Button saibaMais;


    public AlbumHolder(@NonNull View itemView) {
        super(itemView);
        txtAnoAlbun = (TextView) itemView.findViewById(R.id.txtano);
        imgBanda = (ImageView) itemView.findViewById(R.id.imgbanda);
        txtFotografo = (TextView) itemView.findViewById(R.id.txtfotografo);
        txtBanda = (TextView) itemView.findViewById(R.id.txtbanda);
        saibaMais = (Button) itemView.findViewById(R.id.btnsaibamais);
    }
    public TextView getTxtBanda() {
        return txtBanda;
    }
    public ImageView getImageView() {
        return imgBanda;
    }
    public TextView getTxtFotografo(){return txtFotografo;}
    public TextView getTxtAnoAlbun(){return txtAnoAlbun;}
    public Button getSaibaMais(){return saibaMais;}

}
