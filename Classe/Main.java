import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);

    // ---------- métodos auxiliares de leitura (evitam erro se o usuário digitar errado) ----------
    static int lerInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(s.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número inteiro.");
            }
        }
    }

    static double lerDouble(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Double.parseDouble(s.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número (ex.: 2.5).");
            }
        }
    }

    static String lerTexto(String msg) {
        System.out.print(msg);
        return s.nextLine().trim();
    }

    // ---------- submenu: Manequim ----------
    static void menuManequim(Manequim o) {
        int op;
        do {
            System.out.println();
            System.out.println("--- Manequim ---");
            System.out.println("1 - Executar escolher");
            System.out.println("2 - Executar comprar");
            System.out.println("3 - Executar posar");
            System.out.println("4 - Alterar cor (atual: " + o.getCor() + ")");
            System.out.println("5 - Alterar marca (atual: " + o.getMarca() + ")");
            System.out.println("6 - Alterar modelo (atual: " + o.getModelo() + ")");
            System.out.println("7 - Ver todos os dados");
            System.out.println("0 - Voltar");
            op = lerInt("Escolha: ");
            switch (op) {
                case 1:
                    o.escolher(lerTexto("Novo modelo: "));
                    break;
                case 2:
                    o.comprar();
                    break;
                case 3:
                    o.posar(lerTexto("Pose: "));
                    break;
                case 4:
                    o.setCor(lerTexto("Novo valor de cor: "));
                    System.out.println("Cor alterado(a) para: " + o.getCor());
                    break;
                case 5:
                    o.setMarca(lerTexto("Novo valor de marca: "));
                    System.out.println("Marca alterado(a) para: " + o.getMarca());
                    break;
                case 6:
                    o.setModelo(lerTexto("Novo valor de modelo: "));
                    System.out.println("Modelo alterado(a) para: " + o.getModelo());
                    break;
                case 7:
                    System.out.println("cor: " + o.getCor());
                    System.out.println("marca: " + o.getMarca());
                    System.out.println("modelo: " + o.getModelo());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    // ---------- submenu: Arara ----------
    static void menuArara(Arara o) {
        int op;
        do {
            System.out.println();
            System.out.println("--- Arara ---");
            System.out.println("1 - Executar pendurar");
            System.out.println("2 - Executar organizar");
            System.out.println("3 - Executar limpar");
            System.out.println("4 - Alterar cabides (atual: " + o.getCabides() + ")");
            System.out.println("5 - Alterar comprimento (atual: " + o.getComprimento() + ")");
            System.out.println("6 - Alterar material (atual: " + o.getMaterial() + ")");
            System.out.println("7 - Ver todos os dados");
            System.out.println("0 - Voltar");
            op = lerInt("Escolha: ");
            switch (op) {
                case 1:
                    o.pendurar();
                    break;
                case 2:
                    o.organizar();
                    break;
                case 3:
                    o.limpar();
                    break;
                case 4:
                    o.setCabides(lerInt("Novo valor de cabides: "));
                    System.out.println("Cabides alterado(a) para: " + o.getCabides());
                    break;
                case 5:
                    o.setComprimento(lerDouble("Novo valor de comprimento: "));
                    System.out.println("Comprimento alterado(a) para: " + o.getComprimento());
                    break;
                case 6:
                    o.setMaterial(lerTexto("Novo valor de material: "));
                    System.out.println("Material alterado(a) para: " + o.getMaterial());
                    break;
                case 7:
                    System.out.println("cabides: " + o.getCabides());
                    System.out.println("comprimento: " + o.getComprimento());
                    System.out.println("material: " + o.getMaterial());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    // ---------- submenu: Estante ----------
    static void menuEstante(Estante o) {
        int op;
        do {
            System.out.println();
            System.out.println("--- Estante ---");
            System.out.println("1 - Executar ajustar");
            System.out.println("2 - Executar separar roupas");
            System.out.println("3 - Executar reparar");
            System.out.println("4 - Alterar tamanho (atual: " + o.getTamanho() + ")");
            System.out.println("5 - Alterar divisorias (atual: " + o.getDivisorias() + ")");
            System.out.println("6 - Alterar danos (atual: " + o.getDanos() + ")");
            System.out.println("7 - Ver todos os dados");
            System.out.println("0 - Voltar");
            op = lerInt("Escolha: ");
            switch (op) {
                case 1:
                    o.ajustar(lerInt("Novas divisorias: "));
                    break;
                case 2:
                    o.separarRoupas();
                    break;
                case 3:
                    o.reparar();
                    break;
                case 4:
                    o.setTamanho(lerDouble("Novo valor de tamanho: "));
                    System.out.println("Tamanho alterado(a) para: " + o.getTamanho());
                    break;
                case 5:
                    o.setDivisorias(lerInt("Novo valor de divisorias: "));
                    System.out.println("Divisorias alterado(a) para: " + o.getDivisorias());
                    break;
                case 6:
                    o.setDanos(lerTexto("Novo valor de danos: "));
                    System.out.println("Danos alterado(a) para: " + o.getDanos());
                    break;
                case 7:
                    System.out.println("tamanho: " + o.getTamanho());
                    System.out.println("divisorias: " + o.getDivisorias());
                    System.out.println("danos: " + o.getDanos());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    // ---------- submenu: Trilha ----------
    static void menuTrilha(Trilha o) {
        int op;
        do {
            System.out.println();
            System.out.println("--- Trilha ---");
            System.out.println("1 - Executar medir");
            System.out.println("2 - Executar andar");
            System.out.println("3 - Executar acampar");
            System.out.println("4 - Alterar largura (atual: " + o.getLargura() + ")");
            System.out.println("5 - Alterar distancia (atual: " + o.getDistancia() + ")");
            System.out.println("6 - Alterar regras (atual: " + o.getRegras() + ")");
            System.out.println("7 - Ver todos os dados");
            System.out.println("0 - Voltar");
            op = lerInt("Escolha: ");
            switch (op) {
                case 1:
                    o.medir();
                    break;
                case 2:
                    o.andar(lerDouble("Km: "));
                    break;
                case 3:
                    o.acampar();
                    break;
                case 4:
                    o.setLargura(lerDouble("Novo valor de largura: "));
                    System.out.println("Largura alterado(a) para: " + o.getLargura());
                    break;
                case 5:
                    o.setDistancia(lerDouble("Novo valor de distancia: "));
                    System.out.println("Distancia alterado(a) para: " + o.getDistancia());
                    break;
                case 6:
                    o.setRegras(lerTexto("Novo valor de regras: "));
                    System.out.println("Regras alterado(a) para: " + o.getRegras());
                    break;
                case 7:
                    System.out.println("largura: " + o.getLargura());
                    System.out.println("distancia: " + o.getDistancia());
                    System.out.println("regras: " + o.getRegras());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    // ---------- submenu: Bicicleta ----------
    static void menuBicicleta(Bicicleta o) {
        int op;
        do {
            System.out.println();
            System.out.println("--- Bicicleta ---");
            System.out.println("1 - Executar pintar");
            System.out.println("2 - Executar personalizar");
            System.out.println("3 - Executar trocar");
            System.out.println("4 - Alterar cor (atual: " + o.getCor() + ")");
            System.out.println("5 - Alterar tamanho (atual: " + o.getTamanho() + ")");
            System.out.println("6 - Alterar marca (atual: " + o.getMarca() + ")");
            System.out.println("7 - Ver todos os dados");
            System.out.println("0 - Voltar");
            op = lerInt("Escolha: ");
            switch (op) {
                case 1:
                    o.pintar(lerTexto("Nova cor: "));
                    break;
                case 2:
                    o.personalizar(lerTexto("Acessorio: "));
                    break;
                case 3:
                    o.trocar(lerTexto("Peca: "));
                    break;
                case 4:
                    o.setCor(lerTexto("Novo valor de cor: "));
                    System.out.println("Cor alterado(a) para: " + o.getCor());
                    break;
                case 5:
                    o.setTamanho(lerInt("Novo valor de tamanho: "));
                    System.out.println("Tamanho alterado(a) para: " + o.getTamanho());
                    break;
                case 6:
                    o.setMarca(lerTexto("Novo valor de marca: "));
                    System.out.println("Marca alterado(a) para: " + o.getMarca());
                    break;
                case 7:
                    System.out.println("cor: " + o.getCor());
                    System.out.println("tamanho: " + o.getTamanho());
                    System.out.println("marca: " + o.getMarca());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    // ---------- submenu: Arvore ----------
    static void menuArvore(Arvore o) {
        int op;
        do {
            System.out.println();
            System.out.println("--- Arvore ---");
            System.out.println("1 - Executar envelhecer");
            System.out.println("2 - Executar crescer");
            System.out.println("3 - Executar analisar");
            System.out.println("4 - Alterar idade (atual: " + o.getIdade() + ")");
            System.out.println("5 - Alterar altura (atual: " + o.getAltura() + ")");
            System.out.println("6 - Alterar especie (atual: " + o.getEspecie() + ")");
            System.out.println("7 - Ver todos os dados");
            System.out.println("0 - Voltar");
            op = lerInt("Escolha: ");
            switch (op) {
                case 1:
                    o.envelhecer();
                    break;
                case 2:
                    o.crescer();
                    break;
                case 3:
                    o.analisar();
                    break;
                case 4:
                    o.setIdade(lerInt("Novo valor de idade: "));
                    System.out.println("Idade alterado(a) para: " + o.getIdade());
                    break;
                case 5:
                    o.setAltura(lerDouble("Novo valor de altura: "));
                    System.out.println("Altura alterado(a) para: " + o.getAltura());
                    break;
                case 6:
                    o.setEspecie(lerTexto("Novo valor de especie: "));
                    System.out.println("Especie alterado(a) para: " + o.getEspecie());
                    break;
                case 7:
                    System.out.println("idade: " + o.getIdade());
                    System.out.println("altura: " + o.getAltura());
                    System.out.println("especie: " + o.getEspecie());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    // ---------- submenu: Mascara ----------
    static void menuMascara(Mascara o) {
        int op;
        do {
            System.out.println();
            System.out.println("--- Mascara ---");
            System.out.println("1 - Executar personalizar");
            System.out.println("2 - Executar talhar");
            System.out.println("3 - Executar representar");
            System.out.println("4 - Alterar cor (atual: " + o.getCor() + ")");
            System.out.println("5 - Alterar modelo (atual: " + o.getModelo() + ")");
            System.out.println("6 - Alterar cultura (atual: " + o.getCultura() + ")");
            System.out.println("7 - Ver todos os dados");
            System.out.println("0 - Voltar");
            op = lerInt("Escolha: ");
            switch (op) {
                case 1:
                    o.personalizar(lerTexto("Nova cor: "));
                    break;
                case 2:
                    o.talhar();
                    break;
                case 3:
                    o.representar();
                    break;
                case 4:
                    o.setCor(lerTexto("Novo valor de cor: "));
                    System.out.println("Cor alterado(a) para: " + o.getCor());
                    break;
                case 5:
                    o.setModelo(lerTexto("Novo valor de modelo: "));
                    System.out.println("Modelo alterado(a) para: " + o.getModelo());
                    break;
                case 6:
                    o.setCultura(lerTexto("Novo valor de cultura: "));
                    System.out.println("Cultura alterado(a) para: " + o.getCultura());
                    break;
                case 7:
                    System.out.println("cor: " + o.getCor());
                    System.out.println("modelo: " + o.getModelo());
                    System.out.println("cultura: " + o.getCultura());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    // ---------- submenu: Parede ----------
    static void menuParede(Parede o) {
        int op;
        do {
            System.out.println();
            System.out.println("--- Parede ---");
            System.out.println("1 - Executar definir");
            System.out.println("2 - Executar escolher");
            System.out.println("3 - Executar moldar");
            System.out.println("4 - Alterar altura (atual: " + o.getAltura() + ")");
            System.out.println("5 - Alterar material (atual: " + o.getMaterial() + ")");
            System.out.println("6 - Alterar textura (atual: " + o.getTextura() + ")");
            System.out.println("7 - Ver todos os dados");
            System.out.println("0 - Voltar");
            op = lerInt("Escolha: ");
            switch (op) {
                case 1:
                    o.definir(lerDouble("Nova altura: "));
                    break;
                case 2:
                    o.escolher(lerTexto("Novo material: "));
                    break;
                case 3:
                    o.moldar();
                    break;
                case 4:
                    o.setAltura(lerDouble("Novo valor de altura: "));
                    System.out.println("Altura alterado(a) para: " + o.getAltura());
                    break;
                case 5:
                    o.setMaterial(lerTexto("Novo valor de material: "));
                    System.out.println("Material alterado(a) para: " + o.getMaterial());
                    break;
                case 6:
                    o.setTextura(lerTexto("Novo valor de textura: "));
                    System.out.println("Textura alterado(a) para: " + o.getTextura());
                    break;
                case 7:
                    System.out.println("altura: " + o.getAltura());
                    System.out.println("material: " + o.getMaterial());
                    System.out.println("textura: " + o.getTextura());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    // ---------- submenu: Estatua ----------
    static void menuEstatua(Estatua o) {
        int op;
        do {
            System.out.println();
            System.out.println("--- Estatua ---");
            System.out.println("1 - Executar exportar");
            System.out.println("2 - Executar analisar");
            System.out.println("3 - Executar pesar");
            System.out.println("4 - Alterar origem (atual: " + o.getOrigem() + ")");
            System.out.println("5 - Alterar idade (atual: " + o.getIdade() + ")");
            System.out.println("6 - Alterar peso (atual: " + o.getPeso() + ")");
            System.out.println("7 - Ver todos os dados");
            System.out.println("0 - Voltar");
            op = lerInt("Escolha: ");
            switch (op) {
                case 1:
                    o.exportar(lerTexto("Destino: "));
                    break;
                case 2:
                    o.analisar();
                    break;
                case 3:
                    o.pesar();
                    break;
                case 4:
                    o.setOrigem(lerTexto("Novo valor de origem: "));
                    System.out.println("Origem alterado(a) para: " + o.getOrigem());
                    break;
                case 5:
                    o.setIdade(lerInt("Novo valor de idade: "));
                    System.out.println("Idade alterado(a) para: " + o.getIdade());
                    break;
                case 6:
                    o.setPeso(lerDouble("Novo valor de peso: "));
                    System.out.println("Peso alterado(a) para: " + o.getPeso());
                    break;
                case 7:
                    System.out.println("origem: " + o.getOrigem());
                    System.out.println("idade: " + o.getIdade());
                    System.out.println("peso: " + o.getPeso());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    // ---------- submenu: Cabelo ----------
    static void menuCabelo(Cabelo o) {
        int op;
        do {
            System.out.println();
            System.out.println("--- Cabelo ---");
            System.out.println("1 - Executar pintar");
            System.out.println("2 - Executar cortar");
            System.out.println("3 - Executar modelar");
            System.out.println("4 - Alterar cor (atual: " + o.getCor() + ")");
            System.out.println("5 - Alterar tamanho (atual: " + o.getTamanho() + ")");
            System.out.println("6 - Alterar curvatura (atual: " + o.getCurvatura() + ")");
            System.out.println("7 - Ver todos os dados");
            System.out.println("0 - Voltar");
            op = lerInt("Escolha: ");
            switch (op) {
                case 1:
                    o.pintar(lerTexto("Nova cor: "));
                    break;
                case 2:
                    o.cortar(lerDouble("Cm: "));
                    break;
                case 3:
                    o.modelar(lerTexto("Nova curvatura: "));
                    break;
                case 4:
                    o.setCor(lerTexto("Novo valor de cor: "));
                    System.out.println("Cor alterado(a) para: " + o.getCor());
                    break;
                case 5:
                    o.setTamanho(lerDouble("Novo valor de tamanho: "));
                    System.out.println("Tamanho alterado(a) para: " + o.getTamanho());
                    break;
                case 6:
                    o.setCurvatura(lerTexto("Novo valor de curvatura: "));
                    System.out.println("Curvatura alterado(a) para: " + o.getCurvatura());
                    break;
                case 7:
                    System.out.println("cor: " + o.getCor());
                    System.out.println("tamanho: " + o.getTamanho());
                    System.out.println("curvatura: " + o.getCurvatura());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    // ---------- submenu: Rosto ----------
    static void menuRosto(Rosto o) {
        int op;
        do {
            System.out.println();
            System.out.println("--- Rosto ---");
            System.out.println("1 - Executar definir");
            System.out.println("2 - Executar posar");
            System.out.println("3 - Executar escolher");
            System.out.println("4 - Alterar formato (atual: " + o.getFormato() + ")");
            System.out.println("5 - Alterar pose (atual: " + o.getPose() + ")");
            System.out.println("6 - Alterar expressao (atual: " + o.getExpressao() + ")");
            System.out.println("7 - Ver todos os dados");
            System.out.println("0 - Voltar");
            op = lerInt("Escolha: ");
            switch (op) {
                case 1:
                    o.definir(lerTexto("Novo formato: "));
                    break;
                case 2:
                    o.posar(lerTexto("Nova pose: "));
                    break;
                case 3:
                    o.escolher(lerTexto("Nova expressao: "));
                    break;
                case 4:
                    o.setFormato(lerTexto("Novo valor de formato: "));
                    System.out.println("Formato alterado(a) para: " + o.getFormato());
                    break;
                case 5:
                    o.setPose(lerTexto("Novo valor de pose: "));
                    System.out.println("Pose alterado(a) para: " + o.getPose());
                    break;
                case 6:
                    o.setExpressao(lerTexto("Novo valor de expressao: "));
                    System.out.println("Expressao alterado(a) para: " + o.getExpressao());
                    break;
                case 7:
                    System.out.println("formato: " + o.getFormato());
                    System.out.println("pose: " + o.getPose());
                    System.out.println("expressao: " + o.getExpressao());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    // ---------- submenu: Desenho ----------
    static void menuDesenho(Desenho o) {
        int op;
        do {
            System.out.println();
            System.out.println("--- Desenho ---");
            System.out.println("1 - Executar aplicar");
            System.out.println("2 - Executar alternar");
            System.out.println("3 - Executar referenciar");
            System.out.println("4 - Alterar textura (atual: " + o.getTextura() + ")");
            System.out.println("5 - Alterar material (atual: " + o.getMaterial() + ")");
            System.out.println("6 - Alterar modelo (atual: " + o.getModelo() + ")");
            System.out.println("7 - Ver todos os dados");
            System.out.println("0 - Voltar");
            op = lerInt("Escolha: ");
            switch (op) {
                case 1:
                    o.aplicar(lerTexto("Nova textura: "));
                    break;
                case 2:
                    o.alternar(lerTexto("Novo material: "));
                    break;
                case 3:
                    o.referenciar();
                    break;
                case 4:
                    o.setTextura(lerTexto("Novo valor de textura: "));
                    System.out.println("Textura alterado(a) para: " + o.getTextura());
                    break;
                case 5:
                    o.setMaterial(lerTexto("Novo valor de material: "));
                    System.out.println("Material alterado(a) para: " + o.getMaterial());
                    break;
                case 6:
                    o.setModelo(lerTexto("Novo valor de modelo: "));
                    System.out.println("Modelo alterado(a) para: " + o.getModelo());
                    break;
                case 7:
                    System.out.println("textura: " + o.getTextura());
                    System.out.println("material: " + o.getMaterial());
                    System.out.println("modelo: " + o.getModelo());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    // ---------- programa principal ----------
    public static void main(String[] args) {

        // Instanciação dos 12 objetos
        Manequim manequim = new Manequim("branco", "Zara", "Clássico");
        Arara arara = new Arara(2, 1.5, "metal");
        Estante estante = new Estante(1.8, 4, "prateleira solta");
        Trilha trilha = new Trilha(2.5, 8.0, "não deixar lixo e respeitar a sinalização");
        Bicicleta bicicleta = new Bicicleta("vermelha", 29, "Caloi");
        Arvore arvore = new Arvore(30, 12.0, "Ipê-amarelo");
        Mascara mascara = new Mascara("marrom", "Ritual", "Iorubá");
        Parede parede = new Parede(2.7, "madeira", "rugosa");
        Estatua estatua = new Estatua("Benin", 120, 45.5);
        Cabelo cabelo = new Cabelo("preto", 30.0, "liso");
        Rosto rosto = new Rosto("oval", "de frente", "sorrindo");
        Desenho desenho = new Desenho("lisa", "papel", "mangá clássico");

        int grupo;
        do {
            System.out.println();
            System.out.println("===== Qual imagem você deseja explorar? =====");
            System.out.println("1 - Imagem 1 (Manequim, Arara, Estante)");
            System.out.println("2 - Imagem 2 (Trilha, Bicicleta, Arvore)");
            System.out.println("3 - Imagem 3 (Mascara, Parede, Estatua)");
            System.out.println("4 - Imagem 4 (Cabelo, Rosto, Desenho)");
            System.out.println("0 - Sair");
            grupo = lerInt("Escolha: ");

            switch (grupo) {
                case 1:
                    int c1;
                    do {
                        System.out.println();
                        System.out.println("--- Imagem 1: escolha o objeto ---");
                        System.out.println("1 - Manequim");
                        System.out.println("2 - Arara");
                        System.out.println("3 - Estante");
                        System.out.println("0 - Voltar");
                        c1 = lerInt("Escolha: ");
                        switch (c1) {
                            case 1:
                                menuManequim(manequim);
                                break;
                            case 2:
                                menuArara(arara);
                                break;
                            case 3:
                                menuEstante(estante);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } while (c1 != 0);
                    break;
                case 2:
                    int c2;
                    do {
                        System.out.println();
                        System.out.println("--- Imagem 2: escolha o objeto ---");
                        System.out.println("1 - Trilha");
                        System.out.println("2 - Bicicleta");
                        System.out.println("3 - Arvore");
                        System.out.println("0 - Voltar");
                        c2 = lerInt("Escolha: ");
                        switch (c2) {
                            case 1:
                                menuTrilha(trilha);
                                break;
                            case 2:
                                menuBicicleta(bicicleta);
                                break;
                            case 3:
                                menuArvore(arvore);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } while (c2 != 0);
                    break;
                case 3:
                    int c3;
                    do {
                        System.out.println();
                        System.out.println("--- Imagem 3: escolha o objeto ---");
                        System.out.println("1 - Mascara");
                        System.out.println("2 - Parede");
                        System.out.println("3 - Estatua");
                        System.out.println("0 - Voltar");
                        c3 = lerInt("Escolha: ");
                        switch (c3) {
                            case 1:
                                menuMascara(mascara);
                                break;
                            case 2:
                                menuParede(parede);
                                break;
                            case 3:
                                menuEstatua(estatua);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } while (c3 != 0);
                    break;
                case 4:
                    int c4;
                    do {
                        System.out.println();
                        System.out.println("--- Imagem 4: escolha o objeto ---");
                        System.out.println("1 - Cabelo");
                        System.out.println("2 - Rosto");
                        System.out.println("3 - Desenho");
                        System.out.println("0 - Voltar");
                        c4 = lerInt("Escolha: ");
                        switch (c4) {
                            case 1:
                                menuCabelo(cabelo);
                                break;
                            case 2:
                                menuRosto(rosto);
                                break;
                            case 3:
                                menuDesenho(desenho);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } while (c4 != 0);
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (grupo != 0);
    }
}
