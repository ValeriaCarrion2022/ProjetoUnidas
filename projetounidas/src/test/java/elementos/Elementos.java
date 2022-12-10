package elementos;

import org.openqa.selenium.By;

public class Elementos {

	
public By alugarCarro=By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/span/span/span");
public By comoAlugar=By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/span/div/div[1]/ul[1]/li[4]/a");
public By Atendimento=By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/span/span/span");
public By FaleConosco=By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/span/div/div[1]/ul/li[3]/a");
public By Nome=By.xpath("//input[@id='name']");
public By email=By.xpath("//input[@id='email']");
public By Celular=By.xpath("//input[@id='phone']");
public By reserva=By.xpath("//input[@id='reservationId']");
public By Mensagem=By.xpath("//input[@ id='objective']");
public By texto=By.xpath("//textarea[@ id='message']");


}