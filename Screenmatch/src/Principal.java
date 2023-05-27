import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFime = new Filme();

        meuFime.setNome("How to train your dragon");
        meuFime.setAnoDeLancamento(2011);
        meuFime.setDuracaoEmMinutos(90);

        meuFime.exibirFicha();
        meuFime.avaliar(8);
        meuFime.avaliar(6);
        meuFime.avaliar(4);

        System.out.println(meuFime.totalDeAvaliacoes());
        System.out.println(meuFime.obterMediaDasAvaliacoes());

        Serie serie = new Serie();

        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(12);
        serie.setMinutosPorEpisodio(50);

        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        System.out.println(serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFime);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);

        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFime);
    }
}
