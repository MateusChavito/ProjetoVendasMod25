package br.com.mchaves.dao;

import br.com.mchaves.domain.Cliente;


public class ClienteDAO implements IClienteDAO {


    @Override
    public Boolean salvar(Cliente cliente) {
        return  true;

    }

    @Override
    public Cliente buscarPorCPF(long cpf) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }
}
