package Entities.questions;

public class Alternative {

  private int idAlternativa;
  private int valorAlternativa;
  private boolean isRight;
  private int idPergunta;

  public Alternative(int valorAlternativa, boolean isRight) {
    this.valorAlternativa = valorAlternativa;
    this.isRight = isRight;

  }

  public Alternative() {}

  public int getValorAlternativa(){
    return this.valorAlternativa;
  }

  public int getIdPergunta() {
    return this.idPergunta;
  }

  public int getIdAlternativa(){
    return this.idAlternativa;
  }

  public boolean correct() {
    return this.isRight;
  }

  public void setValorAlternativa(int valor) {
    this.valorAlternativa = valor;
  }

  public void setCorreta (boolean right) {
    this.isRight = right;
  }

  public void setIdPergunta (int idPergunta) {
    this.idPergunta = idPergunta;
  }

  public void setIdAlternativa (int idAlternativa) {
    this.idAlternativa = idAlternativa;
  }



}
