package top.livrariapoo;

import java.util.*;
import javax.swing.JOptionPane;
import models.*;

public class LivrariaPOO {

    public static void main(String[] args) {
        int cond = 0;
        List<Cliente> clientes = new ArrayList<Cliente>();
        List<Livro> livros = new ArrayList<Livro>();
        List<ItemVenda> itens = new ArrayList<ItemVenda>();
        List<TipoPagamento> tpPag = new ArrayList<TipoPagamento>();
        List<Autor> autores = new ArrayList<Autor>();
        List<Genero> generos = new ArrayList<Genero>();
        List<Editora> editoras = new ArrayList<Editora>();
        List<Pagamento> pagamentos = new ArrayList<Pagamento>();
        
        //Lista de Autores dos Livros Cadastrados
        List<Autor> autLogica = new ArrayList<Autor>();
        List<Autor> autPython = new ArrayList<Autor>();
        List<Autor> autAlgoritmo = new ArrayList<Autor>();
        
        //Lista de Generos dos Livros Cadastrados
        List<Genero> genProgComp = new ArrayList<Genero>();

        //Cadastro Endereço
        Endereco endNovatec = new Endereco("R. Luís Antônio dos Santos",
                "110", "Santa Terezinha", "São Paulo", "São Paulo", "Brasil");
        Endereco endPearson = new Endereco("Av. Francisco Matarazzo",
                "1400", "Água Branca", "São Paulo", "São Paulo", "Brasil");
        Endereco endPriCliente = new Endereco("Quadra SGAN 610 Módulo A",
                "400", "Asa Norte", "Brasília", "Distrito Federal", "Brasil");
        Endereco endSegCliente = new Endereco("Rua Querida", "529",
                "Leblon (Venda Nova)", "Belo Horizonte", "Minas Gerais",
                "Brasil");
        Endereco endTerCliente = new Endereco("1ª Subida Jardim Progresso",
                "515", "Macaxeira", "Recife", "Pernambuco", "Brasil");

        //Cadastro Editora
        Editora pearson = new Editora("Pearson Universidades", endPearson);
        editoras.add(pearson);
        Editora novatec = new Editora("Novatec Editora", endNovatec);
        editoras.add(novatec);

        //Cadastro Autores
        Autor primeiroAutor = new Autor("Andre Luis Forbellone");
        Autor segundoAutor = new Autor("Henri Eberspächer");
        Autor terceiroAutor = new Autor("Nilo Ney Coutinho Menezes");
        Autor quartoAutor = new Autor("Aditya Y. Bhargava");
        autores.add(primeiroAutor);
        autores.add(segundoAutor);
        autores.add(terceiroAutor);
        autores.add(quartoAutor);

        //Cadastro Generos
        Genero progComp = new Genero("Programação de Computadores");
        Genero romance = new Genero("Romance");
        generos.add(progComp);
        generos.add(romance);
        genProgComp.add(progComp);

        //Cadastro Livros - Editoras/Autores/Generos ao Imprimir o item aparece
        //todos       
        Livro logica = new Livro("Lógica de Programação: A Construção "
                + "de Algoritmos e Estruturas de Dados", pearson,
                autLogica, "2005", genProgComp, 232, 5, 115.99);
        autLogica.add(primeiroAutor);
        livros.add(logica);

        Livro python = new Livro("Introdução à Programação com Python: "
                + "Algoritmos e Lógica de Programação Para Iniciantes",
                novatec, autPython, "1926", genProgComp,
                328, 10, 62.10);
        autPython.add(segundoAutor);
        autPython.add(terceiroAutor);
        livros.add(python);

        Livro algoritmo = new Livro("Entendendo Algoritmos: Um Guia "
                + "Ilustrado Para Programadores e Outros Curiosos",
                novatec, autAlgoritmo, "1236", genProgComp, 264, 3, 48.00);
        autAlgoritmo.add(quartoAutor);
        livros.add(algoritmo);

        //Cadastro Cliente - Documentos Gerados no Site 4Devs
        Cliente primeiroCliente = new Cliente();
        primeiroCliente.setNome("Diogo Rodrigo Assis");
        primeiroCliente.setCpf("886.031.294-95");
        primeiroCliente.setEndereco(endPriCliente);
        clientes.add(primeiroCliente);

        Cliente segundoCliente = new Cliente();
        segundoCliente.setNome("João Bruno Thiago Teixeira");
        segundoCliente.setCpf("228.791.150-27");
        segundoCliente.setEndereco(endSegCliente);
        clientes.add(segundoCliente);

        Cliente terceiroCliente = new Cliente();
        terceiroCliente.setNome("Rita Camila Castro");
        terceiroCliente.setCpf("321.343.620-81");
        terceiroCliente.setEndereco(endTerCliente);
        clientes.add(terceiroCliente);

        //Cadastrando Forma de Pagamento
        TipoPagamento pix = new TipoPagamento();
        pix.setNomePagamento("Pix");
        tpPag.add(pix);

        TipoPagamento cc = new TipoPagamento();
        cc.setNomePagamento("Cartão Crédito");
        tpPag.add(cc);

        TipoPagamento cd = new TipoPagamento();
        cd.setNomePagamento("Cartão Débito");
        tpPag.add(cd);

        //MENU
        do {
            cond = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Qual operação deseja realizar?\n"
                    + "1 - Cadastrar Cliente\n"
                    + "2 - Atualizar Cliente\n"
                    + "3 - Realizar Venda\n"
                    + "4 - Cadastrar Livro\n"
                    + "0 - Sair"));

            if (cond == 1) {
                cadastrarCliente(clientes);

            } else if (cond == 2) {
                atualizarCliente(clientes);

            } else if (cond == 3) {
                realizarVenda(clientes, livros, itens, tpPag);

            } else if (cond == 4) {
                cadastrarLivro(livros, autores, editoras, generos);
            } else if (cond == 0) {
                break;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Numero invalido! Informe uma opcao valida.");

            }

        } while (cond != 0);

    }

    public static void cadastrarCliente(List<Cliente> clientes) {
        String nome = JOptionPane.showInputDialog(null,
                "Informe o Nome do cliente:");

        String cpf = JOptionPane.showInputDialog(null,
                "Informe o CPF do cliente:");

        String endRua = JOptionPane.showInputDialog(null,
                "Informe a Rua do cliente:");

        String endNumero = JOptionPane.showInputDialog(null,
                "Informe o Número do cliente:");

        String endBairro = JOptionPane.showInputDialog(null,
                "Informe o Bairro do cliente:");

        String endCidade = JOptionPane.showInputDialog(null,
                "Informe o Cidade do cliente:");

        String endEstado = JOptionPane.showInputDialog(null,
                "Informe o Estado do cliente:");

        String endPais = JOptionPane.showInputDialog(null,
                "Informe o Pais do cliente:");

        Endereco endereco = new Endereco(endRua, endNumero,
                endBairro, endCidade, endEstado, endPais);
        Cliente cliente = new Cliente(nome, cpf, endereco);
        clientes.add(cliente);

    }

    public static void atualizarCliente(List<Cliente> clientes) {
        String msg = "Selecione qual cliente deseja modificar:\n";
        boolean valid = false;
        int clienteSelecionado;

        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            msg += (i + 1) + " - " + cliente.getNome() + "\n";
        }

        do {
            clienteSelecionado = Integer.parseInt(
                    JOptionPane.showInputDialog(msg));

            if (clienteSelecionado < 0 || clienteSelecionado > clientes.size()) {
                JOptionPane.showMessageDialog(null,
                        "Número Inválido!");

            } else if (clienteSelecionado == 0) {
                JOptionPane.showMessageDialog(null, "Operação Cancelada!");
            } else {
                valid = true;
            }

        } while (valid == false);

        clienteSelecionado--;
        Cliente cliente = clientes.get(clienteSelecionado);

        String nome = JOptionPane.showInputDialog("Digite o nome do cliente ("
                + cliente.getNome() + "):");
        if (!nome.isEmpty()) {
            cliente.setNome(nome);
        }

        String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente ("
                + cliente.getCpf() + "):");
        if (!cpf.isEmpty()) {
            cliente.setCpf(cpf);
        }

        Endereco endereco = cliente.getEndereco();

        String rua = JOptionPane.showInputDialog("Digite a Rua do cliente ("
                + endereco.getRua() + "):");
        if (!rua.isEmpty()) {
            endereco.setRua(rua);
        }

        String numero = JOptionPane.showInputDialog(
                "Digite o Número do cliente (" + endereco.getNumero() + "):");
        if (!numero.isEmpty()) {
            endereco.setNumero(numero);
        }

        String bairro = JOptionPane.showInputDialog(
                "Digite o Bairro do cliente (" + endereco.getBairro() + "):");
        if (!bairro.isEmpty()) {
            endereco.setBairro(bairro);
        }

        String cidade = JOptionPane.showInputDialog(
                "Digita a Cidade do cliente (" + endereco.getCidade() + "):");
        if (!cidade.isEmpty()) {
            endereco.setCidade(cidade);
        }

        String estado = JOptionPane.showInputDialog(
                "Digite o Estado do cliente (" + endereco.getEstado() + "):");
        if (!estado.isEmpty()) {
            endereco.setEstado(estado);
        }

        String pais = JOptionPane.showInputDialog(
                "Digite o País do cliente (" + endereco.getPais() + "):");
        if (!pais.isEmpty()) {
            endereco.setPais(pais);
        }

    }

    public static void cadastrarLivro(List<Livro> livros, List<Autor> autores,
            List<Editora> editoras,
            List<Genero> generos) {
        
        //Objeto Livro
        Livro livro = new Livro();
        
        //Mensagens
        String msgAutor = "Escolha o Autor do Livro: \n"
                + "0 - Continuar Operação\n";
        String msgEditora = "Escolha a Editora do Livro \n"
                + "0 - Cancelar Operação\n";
        String msgGenero = "Escolha o Genero do Livro \n"
                + "0 - Cancelar Operação\n";

        //ArrayList's
        List<Autor> autoresSelecionados = new ArrayList<Autor>();
        List<Genero> generosSelecionados = new ArrayList<Genero>();

        //Cadastrando Titulo do Livro
        String titulo = JOptionPane.showInputDialog(null, "Informe o Titulo do "
                + "Livro: ");
        livro.setTitulo(titulo);

        //Cadastrando Ano de Lançamento do Livro
        String anoLancamento = JOptionPane.showInputDialog(null, "Informe a "
                + "Data de Lançamento do Livro: ");
        livro.setAnoLancamento(anoLancamento);

        //Cadastrando Número de Páginas do Livro
        int numPaginas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número"
                + " de Páginas do Livro:"));
        livro.setNumPaginas(numPaginas);

        //Cadastrando Quantidade em Estoque do Livro
        int quantidadeEstoque = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Informe a Quantidade de Livros no Estoque: "));
        livro.setQuantidadeEstoque(quantidadeEstoque);

        //Cadastrando o Preço de Venda do Livro
        double precoVenda = Double.parseDouble(JOptionPane.showInputDialog(
                null, "Informe o Preço de Venda: "));
        livro.setPrecoVenda(precoVenda);
        
        //Cadastando Editora do Livro
        for (int i = 0; i < editoras.size(); i++) {
            Editora editora = editoras.get(i);
            msgEditora += (i + 1) + " - " + editora.getNome() + "\n";

        }
        int editoraSelecionada = Integer.parseInt(JOptionPane.showInputDialog(null, msgEditora));
        editoraSelecionada--;
        
        livro.setEditora(editoras.get(editoraSelecionada));
        

        //Cadastrando Autores do Livro
        for (int i = 0; i < autores.size(); i++) {
            Autor autor = autores.get(i);
            msgAutor += (i + 1) + " - " + autor.getNome() + "\n";
        }

        int autorSelecionado = Integer.parseInt(JOptionPane.showInputDialog(null, msgAutor));
        autorSelecionado--; 
            
        do {
            Autor autor = autores.get(autorSelecionado);
            autoresSelecionados.add(autor);

            autorSelecionado = Integer.parseInt(JOptionPane.showInputDialog(null, msgAutor));
            autorSelecionado--;
        } while (autorSelecionado != -1);
        
        livro.setAutores(autoresSelecionados);
        
        //Cadastrando Generos do Livro    
        for (int i = 0; i < generos.size(); i++) {
            Genero genero = generos.get(i);
            msgGenero += (i + 1) + " - " + genero.getNomeGenero() + "\n";
        }

        int generoSelecionado = Integer.parseInt(JOptionPane.showInputDialog(null, msgGenero));
        generoSelecionado--;

        do {
            Genero genero = generos.get(generoSelecionado);
            generosSelecionados.add(genero);

            generoSelecionado = Integer.parseInt(JOptionPane.showInputDialog(null, msgGenero));
            generoSelecionado--;

        } while (generoSelecionado != -1);
        
        livro.setGeneros(generosSelecionados);
        
        livros.add(livro);

    }

    public static void realizarVenda(List<Cliente> clientes, List<Livro> livros,
            List<ItemVenda> itens,
            List<TipoPagamento> tpPag) {

        //Variáveis
        int clienteSelecionado = 0;
        int livroSelecionado = 0;
        int qtdSelecionada = 0;
        int tpPagSelecionado = 0;
        double vlTotal = 0.0;
        double valorPag = 0.0;
        double pagamentoVenda = 0.0;

        List<Livro> livrosSelecionados = new ArrayList<Livro>();
        List<TipoPagamento> pagSelecionados = new ArrayList<TipoPagamento>();
        List<Double> vlPagamentos = new ArrayList<Double>();

        boolean valid = false;

        //Mensagens
        String msgCliente = "Selecione o Cliente: \n";
        String msgLivro = "Selecione o Livro: \n"
                + "0 - Continuar Operação \n";
        String msgPag = "Selecione a Forma de Pagamento: \n";

        //Criando Objetos Venda, ItemVenda e pagamentosVenda
        Venda venda = new Venda();
        ItemVenda itemVenda = new ItemVenda();

        //Selecionado o Cliente
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            msgCliente += (i + 1) + "-" + cliente.getNome() + "\n";

        }

        clienteSelecionado = Integer.parseInt(JOptionPane.showInputDialog(null,
                msgCliente));
        clienteSelecionado--;

        if (clienteSelecionado < 0 || clienteSelecionado > clientes.size()) {
            JOptionPane.showMessageDialog(null,
                    "Numero invalido!");
        } else {
            valid = true;
        }

        venda.setCliente(clientes.get(clienteSelecionado));

        //Selecionado Livro
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            msgLivro += (i + 1) + "-" + livro.getTitulo() + "\n";

        }
            do {
                livroSelecionado = Integer.parseInt(JOptionPane.showInputDialog(
                    null, msgLivro));
                livroSelecionado--;
                
                if (livroSelecionado < 0 || livroSelecionado > livros.size()) {
                    break;
                }
                itemVenda.setLivro(livros.get(livroSelecionado));
                
                double valorItemVenda = 0.0;

                //Adicionando Livro na ArrayList dos Livros Selecionados
                Livro livro = livros.get(livroSelecionado);
                livrosSelecionados.add(livro);
                
                int decEstoque;
                decEstoque = livro.getQuantidadeEstoque();

                //Escolhendo a Quantidade do Titulo
                
                do{
                qtdSelecionada = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "Informe a Quantidade de Exemplares: \n"
                                + "Quantidade Disponível: "+decEstoque));
                
                    if(decEstoque < qtdSelecionada){
                        JOptionPane.showMessageDialog(null, "Quantidade "
                                + "Informada, Superior a Quantidade em Estoque");
                    }else{
                        decEstoque = decEstoque - qtdSelecionada;
                        livro.setQuantidadeEstoque(decEstoque);
                        itemVenda.setQuantidade(qtdSelecionada);
                        break;
                    }           
                
                    
                }while(decEstoque < qtdSelecionada);
                

                //Escolhendo o Valor Unitario de Desconto
                itemVenda.setValorUnitarioDesconto(Double.parseDouble(
                        JOptionPane.showInputDialog(null,
                               "Informe o Valor do Unitário do Desconto(R$): \n"
                               + "Valor Unitário do Livro: R$" 
                               + livro.getPrecoVenda())));

                //Calculando o valor de um Item Venda(Titulo)
                valorItemVenda = (livro.getPrecoVenda()
                        - itemVenda.getValorUnitarioDesconto())
                        * itemVenda.getQuantidade();

                itemVenda.setValorTotal(valorItemVenda);

                //Calculando o Valor total da Venda
                vlTotal += valorItemVenda;

                itens.add(itemVenda);

            } while (livroSelecionado != 0);

        //Item Venda  
        venda.setItens(itens);
        venda.setValorTotal(vlTotal);

        //Selecionado Forma de Pagamento
        for (int i = 0; i < tpPag.size(); i++) {
            TipoPagamento pagamento = tpPag.get(i);
            msgPag += (i + 1) + " - " + pagamento.getNomePagamento() + "\n";
        }
        
        do{
                       
            tpPagSelecionado = Integer.parseInt(JOptionPane.showInputDialog(
                null, msgPag));
            tpPagSelecionado--;
            
            if(tpPagSelecionado <= 0 || tpPagSelecionado > tpPag.size()){
                JOptionPane.showMessageDialog(null, "Metodo Invalido");
            } else {
               pagSelecionados.add(tpPag.get(tpPagSelecionado)); 
            }
            
            valorPag = Double.parseDouble(JOptionPane.showInputDialog
                    (null, "Informe o Valor do Pagamento:\n"
                            + "Valor restante: R$" + (venda.getValorTotal() - pagamentoVenda)));
            
            if(valorPag > 0 && valorPag <= venda.getValorTotal() - pagamentoVenda) {
                vlPagamentos.add(valorPag);
                pagamentoVenda += valorPag;
            } else {
                JOptionPane.showMessageDialog(null, "Valor Invalido!");
            }
            

        }while(pagamentoVenda < venda.getValorTotal());
            
        Pagamento pagamento = new Pagamento();
        
        pagamento.setTipo(pagSelecionados);
        pagamento.setValor(vlPagamentos);
        
        venda.setPagamento(pagamento);
        
        
            //Impressão da Venda
            JOptionPane.showMessageDialog(null, "Venda Realizada! \n"
                            + venda.toString());
            
            
        }
    }
