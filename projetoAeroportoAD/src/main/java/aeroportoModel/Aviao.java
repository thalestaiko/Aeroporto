package aeroportoModel;

import java.util.Date;

public class Aviao {
	private String id;
	private String estado;
	private Date dh_cadastro;
	private Date dh_processado;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getDh_cadastro() {
		return dh_cadastro;
	}
	public void setDh_cadastro(Date dh_cadastro) {
		this.dh_cadastro = dh_cadastro;
	}
	public Date getDh_processado() {
		return dh_processado;
	}
	public void setDh_processado(Date dh_processado) {
		this.dh_processado = dh_processado;
	}

	
	
}
