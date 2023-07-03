package one.digitalinnovation;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    private ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz,novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> noNovo) {
        if (atual == null) {
            return noNovo;
        } else if (noNovo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), noNovo));
        }else {
            atual.setNoDir(inserir(atual.getNoDir(), noNovo));

        }
        return atual;
    }

}
