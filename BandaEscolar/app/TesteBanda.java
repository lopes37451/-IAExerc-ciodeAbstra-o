package model;

public class Bateria extends InstrumentoMusical {
private int quantidadeTambores;


public Bateria(String nome, String material, int quantidadeTambores) {
    super(nome, material);
    this.quantidadeTambores = quantidadeTambores;
}

@Override
public String tocar() {
    return "Som grave de batidas.";
}

public int getQuantidadeTambores() {
    return quantidadeTambores;
}


}

package app;

import java.util.ArrayList;
import java.util.List;

import model.InstrumentoMusical;
import model.Violao;
import model.Bateria;

public class TesteBanda {
public static void main(String[] args) {


    Violao violao = new Violao("Violão", "Madeira", 6);
    Bateria bateria = new Bateria("Bateria", "Metal", 5);

    List<InstrumentoMusical> instrumentos = new ArrayList<>();
    instrumentos.add(violao);
    instrumentos.add(bateria);

    int afinados = 0;

    for (InstrumentoMusical instrumento : instrumentos) {
        instrumento.afinar();
        System.out.println(instrumento.tocar());

        if (instrumento.isAfinado()) {
            afinados++;
        }
    }

    System.out.println("Quantidade de instrumentos afinados: " + afinados);

    // Não compila porque InstrumentoMusical é uma classe abstrata.
    // Não é possível criar diretamente um objeto dessa classe.
    // new InstrumentoMusical("Instrumento", "Material");
}


}