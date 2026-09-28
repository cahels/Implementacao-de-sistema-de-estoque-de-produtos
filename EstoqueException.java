//$ Classe base da hierarquia de exceções do domínio de estoque; permite tratar
//$ qualquer erro relacionado a produtos ou estoque de forma genérica, quando necessário.
public class EstoqueException extends Exception {

    //v Identificador de versão exigido pela convenção de classes Serializable
    //v (toda Exception é Serializable); evita o warning [serial] do compilador.
    private static final long serialVersionUID = 1L;

    //f Repassa a mensagem para a superclasse Exception, mantendo o comportamento
    //f padrão de uma exceção checada.
    //p mensagem: descrição do que deu errado.
    public EstoqueException(String mensagem) {
        super(mensagem);
    }
}
