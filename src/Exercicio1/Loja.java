package Exercicio1;

class Loja {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];

        produtos[0] = new Livro("123456789", "Livro A", 29.99, "Autor A");
        produtos[1] = new CD("987654321", "CD B", 19.99, 12);
        produtos[2] = new DVD("456789123", "DVD C", 39.99, 120);
        produtos[3] = new Livro("789123456", "Livro D", 24.99, "Autor B");
        produtos[4] = new CD("321654987", "CD E", 14.99, 10);

        for (Produto produto : produtos) {
            produto.mostrarDetalhesDoItem();
            System.out.println("----------------------");
        }

        Produto produtoBuscado = produtos[2];
        buscarProduto(produtoBuscado, produtos);

        Produto produtoIgual = new DVD("456789123", "DVD Cópia", 39.99, 120);
        Produto produtoDiferente = new DVD("999999999", "DVD Diferente", 49.99, 90);

        System.out.println(produtoBuscado.equals(produtoIgual));      // true
        System.out.println(produtoBuscado.equals(produtoDiferente));  // false
    }

    public static void buscarProduto(Produto produto, Produto[] produtos) {
        for (int i = 0; i < produtos.length; i++) {
            if (produto.equals(produtos[i])) {
                System.out.println("O produto foi encontrado na posição " + i + " do vetor.");
                return;
            }
        }
        System.out.println("O produto não foi encontrado.");
    }
}