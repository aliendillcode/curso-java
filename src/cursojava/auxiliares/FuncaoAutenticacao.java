package cursojava.auxiliares;

import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

    private final PermitirAcesso permitirAcesso;
    public boolean autenticar(){
        return permitirAcesso.autenticar();
    }

    public FuncaoAutenticacao(PermitirAcesso acesso){
        this.permitirAcesso = acesso;
    }


}
