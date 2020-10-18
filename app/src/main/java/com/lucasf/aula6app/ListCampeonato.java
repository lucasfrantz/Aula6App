package com.lucasf.aula6app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListCampeonato extends ListActivity {

    String[] de = { "imagem","time","pontos" };
    int[] para = {R.id.imgTime, R.id.txtTime, R.id.txtPontos};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SimpleAdapter adapter = new AdaptadorAlternado( this, dadosTimes(), R.layout.line_item, de, para );
        setListAdapter( adapter );
    }

    private List<HashMap<String, Object>> dadosTimes()
    {
        String[] clubes = {"Palmeiras", "Flamengo", "Atlético Mineiro", "Corinthians", "Santos", "Grêmio", "Ponte Preta", "Fluminense", "Atlético Paranaense", "Chapecoense", "Botafogo", "São Paulo", "Sport", "Cruzeiro", "Vitória", "Coritiba", "Internacional", "Figueirense", "Santa Cruz", "América Mineiro"};
        int[] pontos = {43, 40, 39, 37, 36, 36, 34, 34, 33, 30, 29, 28, 27, 26, 26, 26, 24, 24, 19, 13};
        int[] img = {R.drawable.pal, R.drawable.fla, R.drawable.cam, R.drawable.cor, R.drawable.san, R.drawable.gre, R.drawable.pon, R.drawable.flu, R.drawable.cap, R.drawable.cha, R.drawable.bot, R.drawable.sao, R.drawable.spt, R.drawable.cru, R.drawable.vit, R.drawable.cfc, R.drawable.inter, R.drawable.fig, R.drawable.sta, R.drawable.ame};

        List<HashMap<String,Object>> dados = new ArrayList();
        HashMap<String, Object> itens;
        for( int i = 0; i<img.length;i++)
        {
            itens = new HashMap<String, Object>();
            itens.put( "imagem", img[i]);
            itens.put( "time", clubes[i]);
            itens.put( "pontos", pontos[i]);
            dados.add( itens );
        }
        return dados;

    }
}