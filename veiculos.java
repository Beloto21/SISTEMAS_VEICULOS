package Heranca;

// classe do automovel
public class Automovel extends Veiculo {
	
	// atributos do automovel
  private int 	quantidadeMaximaPassageiros;
  private String 	tipoFreio;
  private boolean airbag;

  //Construtor da classe automovel
  public Automovel(String montadora, String modelo, int anoFabricacao, String cor, double quilometragem,
  	int quantidadeMaximaPassageiros, String tipoFreio, boolean airbag) {
      super(montadora, modelo, anoFabricacao, cor, quilometragem);
      this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
      this.tipoFreio = tipoFreio;
      this.airbag = airbag;
  }

  
  @Override
  public String gerarInsert() {
      return String.format("INSERT INTO Automovel (montadora, modelo, ano_fabricacao, cor, quilometragem, " +
                           "quantidade_maxima_passageiros, tipo_freio, airbag) VALUES ('%s', %d, '%s', '%s', %.2f, %d, '%s', %b);",
                           getMontadora(), getModelo(), getAnoFabricacao(), getCor(), getQuilometragem(),
                           quantidadeMaximaPassageiros, tipoFreio, airbag);
  }
}



	// classe bicicleta
	class Bicicleta extends Veiculo {
		
	// atributos da bicicleta
  private String marca;
  private String material;
  private int quantidadeMarchas;
  private boolean amortecedor;
  
  // construtor da bicicleta
  public Bicicleta(String montadora, String modelo, int anoFabricacao, String cor, double quilometragem,
      String marca, String material, int quantidadeMarchas, boolean amortecedor) {
      super(montadora, modelo, anoFabricacao, cor, quilometragem);
      this.marca = marca;
      this.material = material;
      this.quantidadeMarchas = quantidadeMarchas;
      this.amortecedor = amortecedor;
  }

 
  @Override
  public String gerarInsert() {
      return String.format("INSERT INTO Bicicleta (modelo, ano_fabricacao, montadora, cor, quilometragem, " +
                           "marca, material, quantidade_marchas, amortecedor) VALUES ('%s', %d, '%s', '%s', %.2f, '%s', '%s', %d, %b);",
                           getMontadora(), getModelo(), getAnoFabricacao(), getCor(), getQuilometragem(),
                           marca, material, quantidadeMarchas, amortecedor);
  }
}
	
	
	// classe motocicleta
	class Motocicleta extends Veiculo {
		
		// atributos da motocicleta
	    private int cilindrada;
	    private double torque;
	    
	    // construtor da motocicleta
	    public Motocicleta(String montadora, String modelo, int anoFabricacao, String cor, double quilometragem,
	        int cilindrada, double torque) {
	        super(montadora, modelo, anoFabricacao, cor, quilometragem);
	        this.cilindrada = cilindrada;
	        this.torque = torque;
	    }

	    
	   
	    @Override
	    public String gerarInsert() {
	        return String.format("INSERT INTO Motocicleta (montadora, modelo, ano_Fabricacao, cor, quilometragem, " +
	                             "cilindrada, torque) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
	                             getMontadora(), getModelo(), getAnoFabricacao(), getCor(), getQuilometragem(),
	                             cilindrada, torque);
	    }
	}
	
	// classe caminhao
	public class Caminhao extends Veiculo {
		
		// atributos do caminhao
	    private int quantidadeEixos;
	    private double pesoBruto;
	    
	    // construtor do caminhao
	    public Caminhao(String montadora, String modelo, int anoFabricacao, String cor, double quilometragem,
	        int quantidadeEixos, double pesoBruto) {
	        super(montadora, modelo, anoFabricacao, cor, quilometragem);
	        this.quantidadeEixos = quantidadeEixos;
	        this.pesoBruto = pesoBruto;
	    }
	    
	    
	    @Override
	    public String gerarInsert() {
	        return String.format("INSERT INTO Caminhao (montadora, modelo, ano_fabricacao, cor, quilometragem, " +
	                             "quantidade_eixos, peso_bruto) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
	                             getMontadora(), getModelo(), getAnoFabricacao(), getCor(), getQuilometragem(),
	                             quantidadeEixos, pesoBruto);
	    }
	}
	
	
	//  classe Skate
	public class Skate extends Veiculo {
		
		// atributos do skate
	    private String marca;
	    private String tipoRodas;
	    
	    // construtor do skate
	    public Skate(String montadora, String modelo, int anoFabricacao, String cor, double quilometragem,
	        String marca, String tipoRodas) {
	        super(montadora, modelo, anoFabricacao, cor, quilometragem);
	        this.marca = marca;
	        this.tipoRodas = tipoRodas;
	    }

	    
	    @Override
	    public String gerarInsert() {
	        return String.format("INSERT INTO Skate (montadora, modelo, ano_fabricacao, cor, quilometragem, " +
	                             "marca, tipo_rodas) VALUES ('%s', %d, '%s', '%s', %.2f, '%s', '%s');",
	                             getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getQuilometragem(),
	                             marca, tipoRodas);
	    }
	}