package com.example.ac1_p2.dataset;

import com.example.ac1_p2.R;
import com.example.ac1_p2.model.Album;

import java.util.ArrayList;
import java.util.List;

public class AlbumDataset {
    private static List<Album> lista;

    public static List<Album> getLista(){
        lista = new ArrayList<>();
        lista.add(new Album("System of Down",1998,"System of a Down","Samuel Jonthan", R.mipmap.img));
        lista.add(new Album("System of Down",2005,"Hypnotize","American Recordings", R.mipmap.img_1));
        lista.add(new Album("System of Down",2006,"Mezmerize","Columbia Records", R.mipmap.img_2));
        lista.add(new Album("System of Down",2020,"Steal This Album","Rick Rubin", R.mipmap.img_3));
        return lista;
    }
    public static void addPessoa(Album album){
        lista.add(album);
    }
}
