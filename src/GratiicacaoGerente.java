
public class GratiicacaoGerente implements Gratificacao{
	@Override
    public double calcularGratificacao(Funcionario umGerente) {
          if (umFuncionario.getNivel() >= 2) {
              return umFuncionario.getSalarioBase() * 1.45;
          }
          return umFuncionario.getSalarioBase() * 1.30;
    }
}
