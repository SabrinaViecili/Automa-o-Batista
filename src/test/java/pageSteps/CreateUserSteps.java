package pageSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageBase.CreateUserPage;
import utils.WebDriverUtil;

public class CreateUserSteps {
    public WebDriver driver = WebDriverUtil.openBrowser();
    CreateUserPage page;

    @Given("que acesso o site Automacao com Bastista")
    public void queAcessoOSiteAutomacaoComBatista() {
        page = new CreateUserPage(driver);
    }

    @Given("clico no menu Formulário")
    public void queClicoNoMenuFormulario() {
        this.page.clickForm();
    }

    @Given("clico no submenu Criar Usuários")
    public void clicoNoSubmenuCriarUsuarios() {
        this.page.clickCreateUserForm();
    }

    @Given("informo o campo Nome como {string}")
    public void informoOCampoNomeComo(String name) {
        this.page.insertName(name);
    }

    @Given("informo o campo Último Nome como {string}")
    public void informoOCampoUltimoNomeComo(String lastName) {
        this.page.insertLastName(lastName);
    }

    @Given("informo o campo Email como {string}")
    public void informoOCampoEmaiComo(String email) {
        this.page.insertUserEmail(email);
    }

    @Given("informo o campo Endereco como {string}")
    public void informoOCampoEnderecoComo(String endereco) {
        this.page.insertAddress(endereco);
    }

    @Given("informo o campo Universidade como {string}")
    public void informoOCampoUniversidadeComo(String universidade) {
        this.page.insertUniversity(universidade);
    }

    @Given("informo o campo Profissão como {string}")
    public void informoOCampoProfissaoComo(String profissao) {
        this.page.insertUserProfile(profissao);
    }

    @Given("informo o campo Genero como {string}")
    public void informoOCampoGeneroComo(String genero) {
        this.page.insertUserGender(genero);
    }

    @Given("informo o campo Idade como {string}")
    public void informoOCampoIdadeComo(String idade) {
        this.page.insertInputUserAge(idade);
    }

    @When("clico no botao Criar")
    public void clicoNoBotaoCriar() {
        this.page.clickCreateUserForm();
    }

    @Then("sou direcionado para a tela de usuario criado com sucesso")
    public void souDirecionadoSucesso(){
        System.out.println("Sucesso");
    }

}
