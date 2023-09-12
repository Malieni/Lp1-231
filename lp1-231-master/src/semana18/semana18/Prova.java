package semana18;
public class Prova {
    private Questao[] questoes;
    private int pontuacao;

    public Prova(Questao[] questoes2) {
        this.questoes = questoes2;
        this.pontuacao = questoes2.length;
    }

    public Questao[] getQuestoes() {
        return questoes;
    }

    public int calcularPontuacao(Object[] respostasAluno) {
        if (respostasAluno.length != questoes.length) {
            return -1; // Código de erro indicando que as respostas estão incompletas
        }

        int pontuacaoAtual = 0;
        for (int i = 0; i < questoes.length; i++) {
            if (questoes[i].verificarResposta(respostasAluno[i])) {
                pontuacaoAtual++;
            }
        }
        return pontuacaoAtual;
    }
}