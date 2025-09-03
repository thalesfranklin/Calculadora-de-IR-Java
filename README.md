# Calculadora de Imposto de Renda (Java)

Este projeto é uma **calculadora simples de salário líquido feita em Java**.  
O programa pede ao usuário o **salário bruto** e os **benefícios**, aplica a **faixa de imposto** correta e retorna o **salário líquido**.

---

## 📂 Estrutura do Projeto

```

Calculadora-de-IR-Java/
├── src/
│   └── Main.java        # Código-fonte principal
├── .gitignore           # Arquivos a serem ignorados no Git
└── README.md            # Este arquivo

````

> ⚠️ Pastas de IDE (`.idea/`, `out/`) e arquivos `*.iml` ou `*.class` não devem ir para o repositório.  
> Isso já está configurado no `.gitignore`.

---

## ▶️ Como Executar

### Compilar
No terminal, dentro da pasta do projeto:

**Windows (PowerShell/CMD)**
```bat
javac -d out src\Main.java
````

**Linux/Mac**

```bash
javac -d out src/Main.java
```

### Rodar

```bash
java -cp out Main
```

---

## 🧮 Exemplo de Uso

```
Qual seu salário bruto ? 
5000
Quanto ganha de beneficios ? 
500
Salário Líquido: 4123.45
```

*(valores fictícios, apenas exemplo)*

---

## 📌 Observações

* As **faixas e alíquotas** de imposto estão definidas no `Main.java` com `if/else if`.
* Se quiser alterar, basta mudar as porcentagens:

  * **7,5%** → `0.075F`
  * **22,5%** → `0.225F`
  * **27,5%** → `0.275F`

---

## 📜 Licença

Este projeto é de uso livre.
