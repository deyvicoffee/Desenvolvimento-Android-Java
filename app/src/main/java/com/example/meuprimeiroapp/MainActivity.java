package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Atributos
    private Random random;
    private TextView tv_numSorteado;

    //Método executado na inicialização na classe
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Altera o titulo da página
        getSupportActionBar().setTitle("Aplicativo de Sorteio");

        //Pega o elemento que exibirá o número sorteado
        tv_numSorteado = findViewById(R.id.tv_numSorteado);

        //Cria um objeto da classe Random
        random = new Random();
    }

    //Função chamada sempre que o botão de jogar é pressionado
    public void sortear(View view) {
        //Variável que armazena um número inteiro randômico de 0 a 9
        int num_randomico = random.nextInt(9);

        //A linha abaixo converte o número randomico que foi gerado em String e
        //o adiciona ao componente de texto da interface.
        tv_numSorteado.setText(Integer.toString(num_randomico));
    }
}