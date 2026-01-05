# Java-iniciante
Meus exercícios de Java 
# Resoluções de Problemas do Beecrowd (URI Online Judge) 🧩

Repositório com minhas soluções pessoais de problemas do **Beecrowd** (antigo URI Online Judge), resolvidos em **Java**.

O objetivo é:
- Praticar lógica de programação
- Melhorar habilidades em Java
- Guardar as soluções para consulta futura
- Servir como portfólio de código

## Problemas Resolvidos

| Número | Título              | Linguagem | Link do Problema                          |
|--------|---------------------|-----------|-------------------------------------------|
| 1131   | Grenais             | Java      | [Beecrowd 1131](https://www.beecrowd.com.br/judge/pt/problems/view/1131) |
| ...    | (outros problemas)  | Java      | ...                                       |

{
 /**
 * Beecrowd 1131 - Grenais
 * Solução com do-while para ler múltiplos jogos até o usuário escolher parar.
 * Aprendizado: atenção com nome exato das variáveis e acentos na saída!
 */
 
  import java.util.Scanner;

public class Main {  // ou 1131_Grenais.java

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int grenais = 0;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;

        int novo;
        do {
            int golsInter = tec.nextInt();
            int golsGremio = tec.nextInt();

            grenais++;
            if (golsInter > golsGremio) {
                vitoriasInter++; // estava sempre colocando vitoriaInter e dando erro e fui repara que não tinha variavel com esse nome
            } else if (golsGremio > golsInter) {
                vitoriasGremio++;
            } else {
                empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            novo = tec.nextInt();

        } while (novo == 1);

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);

        if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriasGremio > vitoriasInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor"); // Sem acento para passar no Beecrowd
        }

        tec.close();
    }
}
