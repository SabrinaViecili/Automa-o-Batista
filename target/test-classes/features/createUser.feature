Feature: Criar Usuário

  Background:
    Given que acesso o site Automacao com Bastista
    And clico no menu Formulário
    And clico no submenu Criar Usuários

    Scenario: Criar Usuário
      And informo o campo Nome como ""
      And informo o campo Último Nome como ""
      And informo o campo Email como ""
      And informo o campo Endereco como ""
      And informo o campo Universidade como ""
      And informo o campo Profissão como ""
      And informo o campo Genero como ""
      And informo o campo Idade como ""
      When clico no botao Criar
      Then sou direcionado para a tela de usuario criado com sucesso