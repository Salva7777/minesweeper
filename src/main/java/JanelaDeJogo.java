import javax.swing.*;
import java.awt.*;

public class JanelaDeJogo extends JFrame{
    private BotaoCampoMinado[][] botoes; // array de botões. O nome é definido no modo Design, em "field name"
    private CampoMinado campoMinado; // campo minado. O nome é definido no modo Design, em "field name"
    private JPanel painelJogo; // painel do jogo. O nome é definido no modo Design, em "field name"
    public JanelaDeJogo(CampoMinado campoMinado) {
        this.campoMinado = campoMinado;
        var nrLinhas = campoMinado.getNrLinhas();
        var nrColunas = campoMinado.getNrColunas();
        this.botoes = new BotaoCampoMinado[nrLinhas][nrColunas];
        painelJogo.setLayout(new GridLayout(nrLinhas, nrColunas));

        //criar e adicionar os botoes a janela
        for (int linha = 0; linha < nrLinhas; ++linha){
            for (int coluna = 0; coluna < nrColunas; ++coluna){
                botoes[linha][coluna] = new BotaoCampoMinado();
                painelJogo.add(botoes[linha][coluna]);
                //teste
            }
        }
        setContentPane(painelJogo);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true); // opcional. Pode optar por fazer depois.
    }
}
