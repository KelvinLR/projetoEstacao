import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Date dataTrem = new Date();
        Locomotiva locRecurso1 = new Locomotiva();
        Locomotiva locRecurso2 = new Locomotiva();
        Locomotiva loc2 = new Locomotiva();
        Vagao vag2 = new Vagao();
        Vagao vagRecurso = new Vagao();
        Trem tremRecurso = new Trem(locRecurso1, vagRecurso);

        LinhaFerroviaria linha1 = new LinhaFerroviaria();
        LinhaFerroviaria linha2 = new LinhaFerroviaria();
        LinhaFerroviaria linha3 = new LinhaFerroviaria();
        RecursoFerroviario recurso1 = new RecursoFerroviario(locRecurso1);
        RecursoFerroviario recurso2 = new RecursoFerroviario(vagRecurso);
        RecursoFerroviario recurso3 = new RecursoFerroviario(tremRecurso);
        RecursoFerroviario recurso4 = new RecursoFerroviario(locRecurso2);

        loc2.setNumSerie("87UUME1");
        vag2.setNumSerie("2004FV26");

        linha1.setNumeroLinha(1);
        linha2.setNumeroLinha(2);
        linha3.setNumeroLinha(3);

        System.out.println("========= recurso1 =========");
        recurso1.setLinha(linha1);
        System.out.println(recurso1.toString());
        System.out.println("========= recurso2 =========");
        recurso2.setLinha(linha2);
        System.out.println(recurso2.toString());
        System.out.println("========= recurso3 =========");
        recurso3.setLinha(linha2);
        System.out.println(recurso3.toString());
        System.out.println("========= recurso4 =========");
        recurso4.setLinha(linha3);
        System.out.println(recurso4.toString());
        System.out.println("===========================");

        System.out.println("========= linha1 =========");
        linha1.setExtensao(21.65);
        linha1.setDescricao("Sentido Fortaleza");
        linha1.adicionarRecursos(recurso1);
        System.out.println(linha1.toString());
        linha1.mostraRecursos();
        System.out.println("========= linha2 =========");
        
        linha2.setExtensao(675.44);
        linha2.setDescricao("Sentido Juazeiro do Norte");
        linha2.adicionarRecursos(recurso2);
        linha2.adicionarRecursos(recurso3);
        System.out.println(linha2.toString());
        linha2.mostraRecursos();
        System.out.println("========= linha3 =========");
        
        linha3.setExtensao(0.800);
        linha3.setDescricao("Reservada para locomotivas");
        linha3.adicionarRecursos(recurso4);
        System.out.println(linha3.toString());
        linha3.mostraRecursos();
        System.out.println("==========================");

        Estacao estacao1 = new Estacao();
        estacao1.setSigla("FOR");
        estacao1.setDescricao("Estação inicial");
        System.out.println("========= estacao1 =========");
        estacao1.addLinhas(linha1);
        estacao1.addLinhas(linha2);
        System.out.println(estacao1.toString());
        estacao1.mostraLinhas();

        Estacao estacao2 = new Estacao();
        estacao2.setSigla("JDO");
        estacao2.setDescricao("Estação final");
        System.out.println("========= estacao2 =========");
        estacao2.addLinhas(linha1);
        estacao2.addLinhas(linha2);
        estacao2.addLinhas(linha3);
        System.out.println(estacao2.toString());
        estacao2.mostraLinhas();
        System.out.println("============================");

        Locomotiva locPrincipal = new Locomotiva();
        locPrincipal.setNumSerie("13RM32");
        locPrincipal.setComprimento(5.0);
        locPrincipal.setCapacidadeTracao(15700.600);

        Vagao vagPrincipal = new Vagao();
        vagPrincipal.setNumSerie("1N4100");
        vagPrincipal.setTipo("Carga");
        vagPrincipal.setCapacidadeCarga(2000.920);
        vagPrincipal.setComprimentoEngates(90);
        vagPrincipal.setComprimentoTesteiras(45);

        Trem tremTeste = new Trem(locPrincipal, vagPrincipal);
        tremTeste.setPrefixo("SMB1985");
        tremTeste.setDataFormacao(dataTrem);

        System.out.println("======== tremTeste ========");
        tremTeste.definirEstacoes(estacao1, estacao2);
        tremTeste.adicionarLocomotiva(loc2);
        tremTeste.adicionarVagao(vag2);
        System.out.println(tremTeste.toString());
        tremTeste.mostraNumElementos();
        tremTeste.mostraQtdLocomotivas();
        tremTeste.mostraQtdVagoes();
        System.out.println("===========================");
    }
}
