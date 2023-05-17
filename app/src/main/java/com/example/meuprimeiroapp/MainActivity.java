package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView conteudo_noticia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conteudo_noticia = findViewById(R.id.conteudo_noticia);

        //setMovementMethod: Fornece funcionalidade de posicionamento do cursor, rolagem e seleção de texto em um arquivo TextView.

        /* CONFIGURAÇÃO DE BARRA DE ROLAGEM EM CAMPO DE TEXTO */
        //ScrollingMovementMethod: Um método de movimento que interpreta as teclas de movimento rolando o buffer de texto.
        conteudo_noticia.setMovementMethod(new ScrollingMovementMethod());

        /* CONFIGURAÇÃO DA INICIALIZAÇÃO DO NAVEGADOR APÓS EVENTO DE CLIQUE NO LINK*/
        //LinkMovementMethod: Permite que o navegador seja inicializado após o clique no hiperlink.
        conteudo_noticia.setMovementMethod(LinkMovementMethod.getInstance());
    }
}