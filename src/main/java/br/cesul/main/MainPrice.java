package br.cesul.main;

import br.cesul.collection.*;

public class MainPrice {

    public static void main(String[] args) {

        ActionFigure item = new ActionFigure();
        item.setPrice(100);
        item.setRarity(RarityLevel.MEDIUM);
        item.setConservationState(ConservationState.PRISTINE);
        item.setAutographed(true);
        item.setArticulated(true);

        System.out.println("Preço de venda: " + item.getSellPrice());
    }
}
