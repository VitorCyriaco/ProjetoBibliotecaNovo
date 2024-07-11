package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class LeitorModel extends AbstractTableModel {

    private List<LeitorCad> dados = new ArrayList<>();
    private String[] colunas = {"Nome", "CPF", "Email", "Telefone"};

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
                return dados.get(linha).getEmail();
            case 3:
                return dados.get(linha).getTelefone();
        }
        return null;
    }

    public LeitorCad getLivro(int linha) {
        return dados.get(linha);
    }

    public void addRow(LeitorCad dados) {
        this.dados.add(dados);
        this.fireTableDataChanged();
    }

    public void removeRow(LeitorCad dados) {
        this.dados.remove(dados);
        this.fireTableDataChanged();
    }

}