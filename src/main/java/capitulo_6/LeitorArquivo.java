package capitulo_6;

import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeitorArquivo {

    /**
     * O método recebe o caminho completo. Ex. "C:\\arquivos\\texto.txt"
     *
     * @param caminho: o caminho completo do arquivo
     * @return As linhas do arquivo em uma única string.
     */
    public String lerArquivo(String caminho) {
        String retorno = "";
        try {
            Path p = Paths.get(caminho);
            List<String> linhasArquivo =  Files.readAllLines(p);

            for (String s : linhasArquivo) {
                retorno += s;
            }
        } catch (NoSuchFileException ns) {
            System.out.println("Arquivo não existe " + ns.toString());
        } catch (MalformedInputException mf) {
            System.out.println("Erro na codificação: " + mf.toString());
        } catch (IOException io) {
            System.out.println("Erro de leitura " + io.toString());
        } catch (Exception e) {
            System.out.println("Erro não identificado " + e.toString());
        }

        return retorno;
    }

}
