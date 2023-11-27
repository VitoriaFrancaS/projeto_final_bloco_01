package projeto.controller;

import java.util.ArrayList;

import obra.model.livro;
import obra.model.projeto;
import obra.repository.obraRepository;

public class obraController implements obraRepository {

    private ArrayList<projeto> listarTitulos = new ArrayList<projeto>();

    @Override
    public void adicionarTitulo(String titulo) {
        projeto novoProjeto = new projeto(titulo);
        listarTitulos.add(novoProjeto);
        System.out.println("O título " + titulo + " foi adicionado com sucesso");
    }

    @Override
    public void listarTitulos() {
        for (var projeto : listarTitulos) {
            projeto.visualizar();
        }
    }

    @Override
    public void procurarPorTitulo(String titulo) {
        projeto projetoEncontrado = buscarNaColecao(titulo);

        if (projetoEncontrado != null)
            projetoEncontrado.visualizar();
        else
            System.out.println("O título " + titulo + " não foi encontrado");
    }

    @Override
    public void deletarTitulo(String titulo) {
        projeto projetoEncontrado = buscarNaColecao(titulo);

        if (projetoEncontrado != null) {
            if (listarTitulos.remove(projetoEncontrado))
                System.out.println("O título " + titulo + " foi removido");
        } else
            System.out.println("O título " + titulo + " não foi encontrado");
    }

    private projeto buscarNaColecao(String titulo) {
        for (var projeto : listarTitulos) {
            if (projeto.getTitulo().equals(titulo)) {
                return projeto;
            }
        }
        return null;
    }
}



