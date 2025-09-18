//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.nome = "The Phantom of the opera";
        favorito.anoDeLancamento = 2004;
        favorito.duracaoEmMinutos = 160;
        favorito.incluidoNoPlano = true;

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(9);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());
    }
}