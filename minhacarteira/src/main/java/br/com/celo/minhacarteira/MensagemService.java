package br.com.celo.minhacarteira;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MensagemService {
 
	@Value("${application.name}")
	public String appname;
	
}
