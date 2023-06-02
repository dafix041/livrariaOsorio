package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class Salvar {
    //Define uma variável que recebe um objeto do Tipo File que contém o caminho do arquivo
    private static File arquivo = new File("livrariaOsorio/src/log/livraria");
    //Este método recebe um Objeto genérico, podendo receber qualquer tipo de objeto
    public static void salvarArquivo(Object obj){
        try {
            //Esta linha é responsável por verificar se o caminho do arquivo existe, e caso não exista ela cria o caminho
            arquivo.getParentFile().mkdirs();
            //Cria um objeto que vai escrever o dados no arquivo, para o caminho definido
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
            //Se não ocorrer nenhum erro esta linha grava de fato o objeto no arquivo
            out.writeObject(obj);
        } catch (Exception e) {
            //Se houver alguma falha ela será capturada e a mensagem abaixo será exibida
            System.out.println("Falha ao salvar arquivo");
        }
    }
    //Este método lê um arquivo e retorna um Objeto genérico, sem tipo definido
    public static Object lerArquivo() {
        try {
            //Esta linha verifica se já existe um arquivo no caminho específico
            if(arquivo.exists() && arquivo.isFile()){
                //Cria um objeto que vai ler os dados no arquivo do caminho definido
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
                //esta transforma o arquivo em um objeto genérico e retorna ele
                return in.readObject();
            }
        } catch (Exception e) {
            //Se houver alguma falha ela será capturada e a mensagem abaixo será exibida
            System.out.println("Erro ao ler arquivo");
        }
        //Caso o arquivo não exista, retorna nulo.
        return null;
    }
    
}
