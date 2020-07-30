package Steps;

import Pages.ShoesPage;
import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class TrabalhoStep {

	ShoesPage m = new ShoesPage();

	@Dado("^que eu esteja no site$")
	public void que_eu_esteja_no_site() throws Throwable {
		m.abrirSite("https://www.shoestock.com.br/");
	}

	@Quando("^pesquisar produto$")
	public void pesquisar_produto() throws Throwable {
		m.pesquisaProduto("botas");
	}

	@Quando("^escolho um produto$")
	public void escolho_um_produto() throws Throwable {
		m.escolherProduto();
	}

	@Quando("^meu produto vai para o carrinho$")
	public void meu_produto_vai_para_o_carrinho() throws Throwable {
		m.adicionarCarrinho("4");
	}

	@Quando("^clico no icone de lixeira$")
	public void clico_no_icone_de_lixeira() throws Throwable {
		m.excluindoProduto();
	}

	@Então("^o produto será excluido da sacola automaticamente$")
	public void o_produto_será_excluido_da_sacola_automaticamente() throws Throwable {
		m.carrinhoVazio();
	}

	@Dado("^que eu queira ver os lançamentos$")
	public void que_eu_queira_ver_os_lançamentos() throws Throwable {
		m.abrirSite("https://www.shoestock.com.br/");
	}

	@Quando("^clicar em \"([^\"]*)\"$")
	public void clicar_em(String arg1) throws Throwable {
		m.clickLancamento();
	}

	@Então("^abrirá um submenu com diversas categorias de produtos$")
	public void abrirá_um_submenu_com_diversas_categorias_de_produtos() throws Throwable {
		m.validandoLancamento();
	}

	@Dado("^que eu queira ver a página de sapatos$")
	public void que_eu_queira_ver_a_página_de_sapatos() throws Throwable {
		m.abrirSite("https://www.shoestock.com.br/");
	}

	@Quando("^clicar no menu \"([^\"]*)\"$")
	public void clicar_no_menu(String arg1) throws Throwable {
		m.clickSapatos();
	}

	@Então("^irei para a página de catálogo virtual$")
	public void irei_para_a_página_de_catálogo_virtual() throws Throwable {
		m.validandoSapatos();
	}

	@Dado("^que eu queira ver a página de bolsas$")
	public void que_eu_queira_ver_a_página_de_bolsas() throws Throwable {
		m.abrirSite("https://www.shoestock.com.br/");
	}

	@Quando("^clicar \"([^\"]*)\"$")
	public void clicar(String arg1) throws Throwable {
		m.clickBolsas();
	}

	@Então("^irei para a página de Bolsas$")
	public void irei_para_a_página_de_Bolsas() throws Throwable {
		m.validandoBolsas();
	}

}