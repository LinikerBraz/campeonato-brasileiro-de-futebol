class Sumula{
    int cartao;
    String acontecimentos;

   public Sumula(int cartao, String acontecimentos) {
        this.cartao = cartao;
        this.acontecimentos = acontecimentos;
       
  public int getCartao() {
        return cartao;
    }
  public void setCartao(int cartao) {
        this.cartao = cartao;
    }
   public String getAcontecimentos() {
        return acontecimentos;
    }
  public void setAcontecimentos(String acontecimentos) {
        this.acontecimentos = acontecimentos;
    }
  public String toString() {
        return "Cartões: " + cartao + "\nAcontecimentos: " + acontecimentos;
    }
    
    public void adicionarAcontecimento(String novoAcontecimento) {
        this.acontecimentos += "\n- " + novoAcontecimento;
    }   
}
