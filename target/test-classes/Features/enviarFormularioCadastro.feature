#Author: e2etreinamentos@treinamentos.com.br

@regressivos @enviarformulario
Feature: Enviar formulario de abertura de conta
  Eu como usuario quero enviar o formulario de abertura de conta para abrir uma nova conta

  Background: Acessar aplicacao
    Given que acesso o site "https://www.original.com.br"
    And acessar o formulario de abertura de conta

  Scenario: Enviar formulario de abertura de conta
    And preencher o campo nome "Teste Nome"
    And preencher o campo celular "(11) 95212-1021"
    And preencher o campo email "teste@teste.com.br"
    And preencher o campo CPF "933.501.700-05"
    When clicar no botao avancar
    Then formulario enviado com sucesso
