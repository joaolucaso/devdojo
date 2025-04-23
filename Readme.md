### Devdojo aula 183.

📌 O que são Generics?
Generics permitem que você crie classes, interfaces e métodos que funcionam com diferentes tipos de dados — de forma segura e reutilizável.

Sem Generics, você teria que usar Object, o que pode causar erros em tempo de execução. Com Generics, os erros são detectados em tempo de compilação!


------
### Devdojo aula 184.

O que é Wildcard (?) em Java?
Imagina que você tem uma mochila mágica 🎒
Nessa mochila, você pode guardar qualquer coisa:

livros 📚

roupas 👕

snacks 🍫

Você não sabe exatamente o que vai estar lá dentro, mas sabe que tem alguma coisa.
````
public void mostrarItens(List<?> lista) {
    for (Object item : lista) {
        System.out.println(item);
    }
}

````
⚡ Tipos de Wildcard
1. <?> – Qualquer tipo
Não sei o que é, mas quero olhar.
Exemplo: lista de qualquer coisa

2. <? extends Tipo> – Algo que vem de um tipo
Tipo: “Quero qualquer coisa que seja uma filha de uma classe”.
Exemplo: <? extends Number> pega Integer, Double...

Bom pra ler os dados, mas não dá pra colocar coisa nova na lista.

3. <? super Tipo> – Algo que aceita esse tipo e seus pais
Tipo: “Pode ser esse tipo ou algo mais genérico”.
Exemplo: <? super Integer> pode ser Object, Number, Integer

Bom pra colocar coisa na lista, mas quando pega o item, você só sabe que é um Object.

---

### Devdojo aula 185.

Wildcard pt2

---

### Devdojo aula 186.

Generics pt 04 - Classes Genéricas pt 01


---

### Devdojo aula 187.

Generics pt 05 - Classes Genéricas pt 02

---

### Devdojo aula 188.

Métodos Genéricos
O que são métodos genéricos?
Um método genérico é um método que pode trabalhar com qualquer tipo de dado, assim como as classes genéricas.

Mas ao invés de tornar a classe inteira genérica, você faz isso somente com o método

---

### Devdojo 189.

Classes Internas pt 01 - Introdução
🧠 O que são classes internas?
São classes dentro de outras classes.

É tipo assim:

Você tem uma classe principal, e dentro dela você cria outra classe que só faz sentido existir ali.

| Tipo                   | O que é                                                                 |
|------------------------|-------------------------------------------------------------------------|
| Classe interna normal  | Uma classe criada dentro de outra.                                     |
| Classe interna estática| Igual à normal, mas não depende de uma instância da externa.           |
| Classe local           | Criada dentro de um método.                                            |
| Classe anônima         | Uma classe sem nome, usada rapidinho, geralmente com interfaces.       |

---

### Devdojo 190.

Classes Internas pt 02 - Classes Locais

---

### Devdojo 191.
Classes Internas pt 03 - Classes Anônimas

---

### Devdojo 192.
Classes Internas pt 04 - Classes aninhadas estáticas

---

### Devdojo 193.

🧠 O que é parametrizar comportamento?
É quando você passa o que deve ser feito como parâmetro para um método ou função.

Tipo assim:

Em vez de dizer "faça isso", você diz "aqui está o que você deve fazer" 💡

Isso é muito útil quando você quer que um método seja flexível e funcione de várias formas diferentes, dependendo do "comportamento" que você passou.

💡 Como fazer isso em Java?
1. Com interfaces (ou classes anônimas)
2. Com Lambdas (versão moderna e mais curtinha)💡 Como fazer isso em Java?
1. Com interfaces (ou classes anônimas)
2. Com Lambdas (versão moderna e mais curtinha)

---
### Devdojo 194.
Parametrizando comportamentos pt 02

É como se você tivesse um boneco de LEGO 🤖
Esse boneco tem um espaço vazio nas mãos, e você pode colocar uma ferramenta diferente ali:

🔧 Às vezes ele segura um martelo
✏️ Outras vezes ele segura um lápis
🍦 E até pode segurar um sorvete!

Agora imagina que você tem um método no Java (tipo uma função) que pode fazer várias coisas diferentes dependendo da ferramenta que você dá pra ele.

Em vez de ele sempre fazer a mesma coisa, você diz:

“Olha, método, aqui está o que eu quero que você faça agora!”

Isso é parametrizar comportamento!

````
interface Ação {
    void fazer();
}

public class Brincadeira {
    public static void executarAção(Ação acao) {
        acao.fazer();
    }

    public static void main(String[] args) {
        // Dando um comportamento diferente para o bonequinho
        executarAção(() -> System.out.println("Pular corda!"));
        executarAção(() -> System.out.println("Brincar de esconde-esconde!"));
    }
}



````

---

### Devdojo 195.
 Lambdas pt 01 - Predicate

🧠 O que é um Predicate?
Pensa assim:

Um Predicate é como uma pergunta que só tem "sim" ou "não" como resposta.

Exemplos de perguntas:

Esse número é maior que 10? ✅ ou ❌

Essa palavra começa com a letra A? ✅ ou ❌

O nome é “Maria”? ✅ ou ❌
````

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> ehPar = numero -> numero % 2 == 0;

        System.out.println(ehPar.test(4)); // true
        System.out.println(ehPar.test(7)); // false
    }
}

🧠 O que aconteceu aqui?

Criamos um Predicate<Integer> chamado ehPar

Ele testa se o número é par usando % 2 == 0

A gente usa test(numero) pra fazer a pergunta!
````

✨ Lembra disso:

Palavra	     |O que é
Predicate	 |Uma pergunta que retorna true ou false
Lambda	     | Uma forma curtinha de escrever um comportamento

---

### Devdojo 196.
Lambdas pt 02 - Consumer

🧠 O que é um Consumer?
Pensa no nome: Consumer = consumidor.

Ele recebe alguma coisa e faz algo com ela...
Mas não devolve nada! (Não tem return)

👉 Exemplo real:
Você entrega um presente pra alguém.

A pessoa abre, sorri, brinca com ele...

Mas não te devolve nada. Só usa.

````
import java.util.*;
import java.util.function.Consumer;

public class ListaDeNomes {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bia", "Caio");

        Consumer<String> mostrar = nome -> System.out.println("Nome: " + nome);

        nomes.forEach(mostrar);
    }
}
🧠 Aqui:

Temos uma lista de nomes

Criamos um Consumer que imprime o nome

Usamos forEach() pra aplicar o Consumer em cada item

````

---

### Devdojo 197.
Lambdas pt 03 - Function

🧠 O que é uma Function?
Pensa numa máquina mágica 🪄

Você coloca uma coisa dentro dela...
E ela transforma em outra coisa e devolve!

Ela recebe um valor, faz alguma coisa com ele, e retorna outro valor.

````
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Cria uma função que dobra o número
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        System.out.println(dobrar.apply(5));  // 10
        System.out.println(dobrar.apply(8));  // 16
    }
}

🧠 Aqui:

A função recebe um número (Integer)

Ela retorna o número multiplicado por 2

Usamos apply() para chamar a função
````

---

### Devdojo 198.
Method Reference pt 01 - Referência a métodos estáticos

🧠 O que é Method Reference?
Imagina que você tem um método prontinho em algum lugar, e quer usá-lo sem reescrever.

````
⚡ Exemplo completo com método estático
📁 Classe com método estático:

public class Utilitarios {
    public static void mostrarNome(String nome) {
        System.out.println("Nome: " + nome);
    }
}

````

````
🚀 Usando Method Reference:

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bia", "Carlos");

        // Usando Method Reference para chamar método estático
        nomes.forEach(Utilitarios::mostrarNome);
    }
}
 
````

----

### Devdojo 199.
Method Reference pt 02 - Referência a métodos não estáticos

---

### Devdojo 200.
Method Reference pt 03 - Referência a construtor