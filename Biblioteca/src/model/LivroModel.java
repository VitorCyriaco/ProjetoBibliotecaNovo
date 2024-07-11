package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class LivroModel extends AbstractTableModel {

    public List<LivroCad> dados = new ArrayList<>();
    private final String[] colunas = {"Titulo", "Autor", "ISBN", "Data da Publicacao"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getTitulo();
            case 1:
                return dados.get(linha).getAutor();
            case 2:
                return dados.get(linha).getIsbn();
            case 3:
                return dados.get(linha).getPubli();
        }
        return null;
    }
    public LivroCad getLivro(int linha){
        return dados.get(linha);
    }
    public void getData(int linha){
        while (linha < dados.size()){
            dados.get(linha).getTitulo();
            dados.get(linha).getAutor();
        }
    }

    public void addRow(LivroCad dados) {
        this.dados.add(dados);
        this.fireTableDataChanged();
    }
    public void removeRow(LivroCad dados){
        this.dados.remove(dados);
        this.fireTableDataChanged();
    }

}
