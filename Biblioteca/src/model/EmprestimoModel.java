package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class EmprestimoModel extends AbstractTableModel {

    private List<EmprestimoCad> dados = new ArrayList<>();
    private String[] colunas = {"Nome", "CPF", "Titulo", "Data do Emprestimo", "Data da Devolução"};

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
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getCpf();
            case 2:
                return dados.get(linha).getTitulo();
            case 3:
                return dados.get(linha).getDataEmprestimo();
            case 4:
                return dados.get(linha).getDataDevolucao();
        }
        return null;
    }

    public void addRow(EmprestimoCad dados) {
        this.dados.add(dados);
        this.fireTableDataChanged();
    }
}