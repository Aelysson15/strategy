
public class GratificacaoDBA implements Gratificacao{
	@Override
    public double calcularGratificacao(Funcionario umDBA) {
          if (umFuncionario.getNivel() >= 2) {
              return umFuncionario.getSalarioBase() * 1.30;
          }
          return umFuncionario.getSalarioBase() * 1.20;
    }
}

