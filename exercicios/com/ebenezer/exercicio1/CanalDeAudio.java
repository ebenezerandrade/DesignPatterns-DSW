package com.ebenezer.exercicio1;

public class CanalDeAudio {
	
	private static CanalDeAudio instancia;
	
	private CanalDeAudio(){
	}
	
	public static synchronized CanalDeAudio getInstancia(){
		if (instancia == null){
			instancia = new CanalDeAudio();
		}
		return instancia;
	}
	
	public CanalDeAudio abrirCanal(){
		System.out.println("ConexãoDeAudioAberta");
		return instancia;
	}
	
	public CanalDeAudio fecharCanal(){
		System.out.println("ConexaoDeAudioFechada");
		return instancia;
	}
}