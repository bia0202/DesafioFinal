# language: pt
Funcionalidade: Site Shoestock
  Eu como usuario quero validar o site Shoestock

  Cenário: Incluir produto no carrinho
    Dado que eu esteja no site
    Quando pesquisar produto
    E escolho um produto
    Então meu produto vai para o carrinho
      
  Cenário: Apagando produto do carrinho
    Dado que eu esteja no site
    Quando pesquisar produto
    E escolho um produto
    E meu produto vai para o carrinho
    E clico no icone de lixeira
    Então o produto será excluido da sacola automaticamente

  Cenário: Validando menu lançamentos
    Dado que eu queira ver os lançamentos
    Quando clicar em "Lançamentos"
    Então abrirá um submenu com diversas categorias de produtos

  Cenário: Validando menu Sapatos
    Dado que eu queira ver a página de sapatos
    Quando clicar no menu "Sapatos"
    Então irei para a página de catálogo virtual

  Cenário: Validando menu Bolsas
    Dado que eu queira ver a página de bolsas
    Quando clicar "Bolsas"
    Então irei para a página de Bolsas
