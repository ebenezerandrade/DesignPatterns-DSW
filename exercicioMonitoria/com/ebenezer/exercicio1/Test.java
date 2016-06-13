package com.ebenezer.exercicio1;
public class Test {
	
	public static void main(String[] args){
		Radio radio = new Radio();
		radio.conectarRadio(CanalDeAudio.getInstancia().abrirCanal());
		Internet internet = new Internet();
		internet.conectarAudioInternet(CanalDeAudio.getInstancia().abrirCanal());
		radio.conectarRadio(CanalDeAudio.getInstancia().fecharCanal());
	}
}
