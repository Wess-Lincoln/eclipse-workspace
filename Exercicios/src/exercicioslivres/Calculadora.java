package exercicioslivres;

import java.awt.*;
import java.awt.event.*;



public class Calculadora {

	   Frame frm1 = new Frame("Calculator");
	    
	    Panel pnl1 = new Panel(new GridLayout(5,4));
	   
	    private MenuBar mnb1 = new MenuBar();
	    private Menu mn1 = new Menu("Arquivo");
	    private MenuItem mi1 = new MenuItem("Sair");
	    
	    private Button btn1 = new Button("1");
	    private Button btn2 = new Button("2");
	    private Button btn3 = new Button("3");
	    private Button btn4 = new Button("4");
	    private Button btn5 = new Button("5");
	    private Button btn6 = new Button("6");
	    private Button btn7 = new Button("7");
	    private Button btn8 = new Button("8");
	    private Button btn9 = new Button("9");
	    private Button btn0 = new Button("0");
	    private Button btnLimpar = new Button("Clr");
	    private Button btnSomar = new Button("+");
	    private Button btnDiminuir = new Button("-");
	    private Button btnDividir = new Button("/");
	    private Button btnMultiplicar = new Button("x");
	    private Button btnResultado = new Button("=");
	    private Button btnPonto = new Button(".");
	    private Button btnPorcentagem = new Button("%");
	
	    private int decimal;
	
	    private boolean ponto=true;
	    
	  
	    private TextField textoDisplay = new TextField("");
	  
	    private String valor1 = "";


	    // Variavel de Operacao
	    // 1 � Somar
	    // 2 � Diminuir
	    // 3 � Dividir
	    // 4 � Multiplicar
	    // 5 - Porcentagem
	    
	    private int operacao = 0;
	    public void setValor1() {
		}
	    {
	      this.valor1 = textoDisplay.toString();
	   }
	    public String getValor1()
	    {
	        return valor1;
	    }
	
		    {  	
	        frm1.addWindowListener(new WindowAdapter()
	        {
	            public void windowClosing(WindowEvent a)
	            {
	                System.exit(0);
	            }
	            public void windowOpened(WindowEvent a)
	            {
	                textoDisplay.requestFocus();
	            }
	        });
	      mi1.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                System.exit(0);
	            }
	        });
	        btn1.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a){
	              
	               if(ponto) {
	               decimal/=10;
	 
	               }
	               Float valor = Float.parseFloat(valor1);
	               valor*=10;
	               valor+=1;
	                
	               String valor2 = valor.toString();
	               textoDisplay.setText(valor2);
	            }
	            
	        });
	   
	            
	       
	        
	        btn2.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a) {
	            	
	            Float valor = Float.parseFloat(valor1);
            	valor*=10;
            	valor+=2;
            	
            	String valor2 = valor.toString();
	               textoDisplay.setText(valor2);
	            }
	        });
	        btn3.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {   if(ponto) {
            		decimal/=3;
            	}
            	valor1*=10;
            	valor1+=3;
	                textoDisplay.setText(""+valor1);
	            }
	        });
	        btn4.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {  if(ponto) {
            		decimal/=4;
            	}
            	valor1*=10;
            	valor1+=4;
	                textoDisplay.setText(""+valor1);
	            }
	        });
	        btn5.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {   if(ponto) {
            		decimal/=5;
            	}
            	valor1*=10;
            	valor1+=5;
	                textoDisplay.setText(""+valor1);
	            }
	        });
	        btn6.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {   if(ponto) {
            		decimal/=6;
            	}
            	valor1*=10;
            	valor1+=6;
	                textoDisplay.setText(""+valor1);
	            }
	        });
	        btn7.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {   if(ponto) {
            		decimal/=7;
            	}
            	valor1*=10;
            	valor1+=7;
	                textoDisplay.setText(""+valor1);
	            }
	        });
	        btn8.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {   if(ponto) {
            		decimal/=8;
            	}
            	valor1*=10;
            	valor1+=8;
	                textoDisplay.setText(""+valor1);
	            }
	        });
	        btn9.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {  if(ponto) {
            		decimal/=9;
            	}
            	valor1*=10;
            	valor1+=9;
	                textoDisplay.setText(""+valor1);
	            }
	        });
	        btn0.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                textoDisplay.setText("0");
	            }
	        });
	        btnLimpar.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                valor1 = 0;
	                textoDisplay.setText("");
	            }
	        });
	        btnSomar.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                setValor1();
	                operacao = 1;
	            }
	        });
	        btnDiminuir.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                setValor1();
	                operacao = 2;
	            }
	        });
	        btnDividir.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                setValor1();
	                operacao = 3;
	            }
	        });
	        btnMultiplicar.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                setValor1();
	                operacao = 4;
	            }
	        });
	        btnPorcentagem.addActionListener(new ActionListener()
	        {
	        	public void actionPerformed(ActionEvent a)
	        	{
	        		setValor1();
	        		operacao = 5;
	        	}
	        });
	        btnPonto.addActionListener(new ActionListener()
	        {
	        	public void actionPerformed(ActionEvent a){
	        		if (!ponto) {
	        			textoDisplay.setText(valor1+".");
	        			ponto=(true);
	        		}
	        		
	        	}
	        });
	        btnResultado.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                switch (operacao)
	        {
	                    //somar
	        case 1 :{
	        operacao = 0;
	        textoDisplay.setText
	        
	        (Float.toString
	        (getValor1()+Float.parseFloat(textoDisplay.getText())));
	        
	        break;
	                    }
	                    //diminuir
	        case 2 :{
	        operacao = 0;
	        textoDisplay.setText(Float.toString
	        (getValor1()-Float.parseFloat(textoDisplay.getText())));
	        break;
	        }
	                    //dividir
	        case 3 :{
	        try{
	        operacao = 0;
	        textoDisplay.setText
	        (Float.toString(getValor1() / Float.parseFloat(textoDisplay.getText())));}
	        catch(ArithmeticException ex){
	        textoDisplay.setText("");
	        System.out.println
	        ("� imposs�vel divis�o por zero ! erro : " + ex.getMessage());
	        }
	        break;
	        }
	                    //multipicar
	        case 4 :
	        {
	        operacao = 0;
	        textoDisplay.setText
	        (Float.toString(getValor1() * Float.parseFloat(textoDisplay.getText())));
	        break;
	        }
	        case 5:
	        {	
	        operacao= 5;
	        textoDisplay.setText
	        (Float.toString(getValor1()*100/valor1));
	        }
	        default :
	        System.out.println("Escolha uma opera��o");
	        break;
	                }
	            }

				private float valor2(String text) {
					// TODO Auto-generated method stub
					return 0;
				}
	        });
	        frm1.setSize(150,190); // tamamho do Frame
	        frm1.setLocation(250,300);// posiciona na tela
	        frm1.setBackground(Color.blue);// Muda a Cor de Fundo
	        //criando meu menu!!
	        mn1.add(mi1);
	        mnb1.add(mn1);
	        frm1.setMenuBar(mnb1);
	        // Adicionando o Visor no Frame
	        frm1.add(textoDisplay,BorderLayout.NORTH);
	        // Adicionando os Botoes no Panel
	        pnl1.add(btn7);
	        pnl1.add(btn9);
	        pnl1.add(btn8);
	        pnl1.add(btnMultiplicar);
	        pnl1.add(btn4);
	        pnl1.add(btn5);
	        pnl1.add(btn6);
	        pnl1.add(btnDiminuir);
	        pnl1.add(btn1);
	        pnl1.add(btn2);
	        pnl1.add(btn3);
	        pnl1.add(btnSomar);
	        pnl1.add(btnLimpar);
	        pnl1.add(btn0);
	        pnl1.add(btnResultado);
	        pnl1.add(btnDividir);
	        pnl1.add(btnPonto);
	        pnl1.add(btnPorcentagem);
	        //Adicionando Panel no Frame
	        frm1.add(pnl1);
	        //Habilita mostrar o frame // sempre deixa-la como ultima linha!!
	        frm1.setVisible(true);
	    }
	    public static void main(String [] args)
	    {
	        new Calculadora();
	    }
	}
	// fim classe Calculadora


