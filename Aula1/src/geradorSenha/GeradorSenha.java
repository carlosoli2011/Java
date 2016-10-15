package geradorSenha;

import java.util.ArrayList;
import java.util.List;

public class GeradorSenha {
	List<Integer> senhaIdoso = new ArrayList<>();
	List<Integer> senhaPadrao = new ArrayList<>();
	int contadorSenhaIdoso = 0;
	int contadorSenhaPadrao = 0;
	int totalizadorSenhaIdoso = 0;

	public int gerarSenhaIdoso() {
		contadorSenhaIdoso++;
		senhaIdoso.add(contadorSenhaIdoso);
		return contadorSenhaIdoso;
	}

	public int gerarSenhaPadrao() {
		contadorSenhaPadrao++;
		senhaPadrao.add(contadorSenhaPadrao);
		return contadorSenhaPadrao;
	}

	public String proximaSenha() {
		if (!senhaIdoso.isEmpty()) {
			if (totalizadorSenhaIdoso >= 5 && !senhaPadrao.isEmpty()) {
				totalizadorSenhaIdoso = 0;
				return "P" + senhaPadrao.remove(0);
			}
			totalizadorSenhaIdoso++;
			return "I" + senhaIdoso.remove(0);
		} else if (!senhaPadrao.isEmpty()) {
			totalizadorSenhaIdoso = 0;
			return "P" + senhaPadrao.remove(0);
		}
		return null;
	}

}
