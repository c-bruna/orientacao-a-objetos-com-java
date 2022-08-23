package org.coursera;

public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra(500);
        Compra compra1 = new Compra(3,40);

        // saída Compra compra à vista
        System.out.println("O valor total é R$"+compra.getValorTotal());
        // saída da Compra compra1 parcelada
        System.out.println("O valor total é R$"+compra1.getValorTotal()+", parcelado em "+compra1.getNumeroParcelas()+"x de R$"+compra1.getValorParcela());

    }
}
